package apiCalls;

import framework.PropertiesUtil;
import framework.ReusableLibrary;
import io.restassured.http.ContentType;
import pojo.PDPRequest;
import pojo.PDPResponse;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;
import static io.restassured.config.EncoderConfig.encoderConfig;

public class PDPEndPoint { //extends ReusableLibrary {

    PropertiesUtil propertiesUtil=new PropertiesUtil();
    public void performAPICallForGivenSkuID(String skuID)
    {
        PDPRequest request=new PDPRequest(Long.parseLong(skuID),7);

        PDPResponse response=given().
        relaxedHTTPSValidation()
                .config(config().encoderConfig(
                        encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                .urlEncodingEnabled(false)
                .contentType(ContentType.JSON)
                .header("X-Header-Token", "guest@stylishop.com")
                .header("sec-ch-ua-platform", "macOS")
                .header("Referer", "https://stylishop.com/")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("X-Source", "msite")
                .header("device-id", "device_1761659483778_o21710hov")
                .header("Accept", "application/json, text/plain, */*")
                .header("X-Client-Version", "v25.10.19")
                .header("Token", "KEY eyJhbGciOiJIUzMiJ9.eyJzdWliOiJndWVzdEBzdHlsaXNob3AuY29tIn0.XYZ123...") // shortened for clarity
                .header("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36")
                .body(request)
                .log().uri()
        .when()
                .post(propertiesUtil.getPDPEndPoint())
        .then()
                .extract().response().as(PDPResponse.class);

        response.getResponse().getConfigProducts().forEach(s-> System.out.println(s.getSku()+"--"+s.getSize()+"--"+s.getQuantity()));

        //System.out.println(response);

    }

    public static void main(String[] args) {
        new PDPEndPoint().performAPICallForGivenSkuID("7011394606");
    }
}
