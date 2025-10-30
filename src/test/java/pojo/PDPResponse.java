package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PDPResponse {

    @JsonProperty("status")
    Boolean status;

    @JsonProperty("statusCode")
    String statusCode;

    @JsonProperty("statusMsg")
    String statusMsg;

    @JsonProperty("response")
    Response response;

    @JsonProperty("error")
    Object error;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Response {

        @JsonProperty("id")                       String id;
        @JsonProperty("sku")                      String sku;
        @JsonProperty("wishListItemId")           String wishListItemId;
        @JsonProperty("name")                     String name;
        @JsonProperty("url")                      String url;
        @JsonProperty("productType")              String productType;
        @JsonProperty("isVisibleProduct")         Boolean isVisibleProduct;
        @JsonProperty("brand")                    String brand;
        @JsonProperty("brandId")                  Double brandId;
        @JsonProperty("systemGenerate")           SystemGenerate systemGenerate;
        @JsonProperty("categoryIds")              List<Double> categoryIds;
        @JsonProperty("isBeautyProduct")          Boolean isBeautyProduct;
        @JsonProperty("metaTitle")                String metaTitle;
        @JsonProperty("metaDescription")          String metaDescription;
        @JsonProperty("soldBy")                   String soldBy;
        @JsonProperty("typeId")                   String typeId;
        @JsonProperty("imageOverlayAttr")         List<Object> imageOverlayAttr;
        @JsonProperty("orderedQty")               Double orderedQty;
        @JsonProperty("thumbnailUrl")             String thumbnailUrl;
        @JsonProperty("imageUrl")                 String imageUrl;
        @JsonProperty("images")                   Images images;
        @JsonProperty("discount")                 Double discount;
        @JsonProperty("flashSale")                FlashSale flashSale;
        @JsonProperty("prices")                   Prices prices;
        @JsonProperty("categories")               Categories categories;
        @JsonProperty("styliId")                  String styliId;
        @JsonProperty("relatedProducts")          RelatedProducts relatedProducts;
        @JsonProperty("hideBrandName")            Boolean hideBrandName;
        @JsonProperty("isGiftProduct")            Boolean isGiftProduct;
        @JsonProperty("configProducts")           List<ConfigProduct> configProducts;
        @JsonProperty("productFilterAttributes")  ProductFilterAttributes productFilterAttributes;
        @JsonProperty("currency")                 String currency;
        @JsonProperty("returnCategoryRestriction") Boolean returnCategoryRestriction;
        @JsonProperty("priceSource")              String priceSource;
        @JsonProperty("pdpBanner")                String pdpBanner;
        @JsonProperty("videoGallery")             List<Object> videoGallery;
        @JsonProperty("brandPlp")                 String brandPlp;
        @JsonProperty("kidsGender")               List<Object> kidsGender;
        @JsonProperty("plpCalloutTag")            String plpCalloutTag;
        @JsonProperty("convertedMediaGallery")    List<Object> convertedMediaGallery;
        @JsonProperty("color")                    String color;
        @JsonProperty("inStockNew")               Double inStockNew;
        @JsonProperty("qtySold")                  Double qtySold;
        @JsonProperty("cartNudge")                Double cartNudge;
        @JsonProperty("totalQuantity")            Double totalQuantity;
        @JsonProperty("freeDeliveryBadgeThreshold") Double freeDeliveryBadgeThreshold;
        @JsonProperty("skus")                     List<Object> skus;
        @JsonProperty("shukranCoins")             Double shukranCoins;
        @JsonProperty("shukranBonusPoint")        ShukranBonusPoint shukranBonusPoint;
        @JsonProperty("shukranBonus")             ShukranBonus shukranBonus;
        @JsonProperty("isShukranEnable")          Boolean isShukranEnable;

        @Data
        @NoArgsConstructor
        @FieldDefaults(level = AccessLevel.PRIVATE)
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class SystemGenerate { }

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @FieldDefaults(level = AccessLevel.PRIVATE)
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Images {
            @JsonProperty("image")            String image;
            @JsonProperty("smallImage")       Object smallImage;
            @JsonProperty("thumbnail")        Object thumbnail;
            @JsonProperty("image2")           Object image2;
            @JsonProperty("smallImage2")      Object smallImage2;
            @JsonProperty("thumbnail2")       Object thumbnail2;
            @JsonProperty("mediaGallery")     List<String> mediaGallery;
            @JsonProperty("mediaGalleryWEBP") List<Object> mediaGalleryWEBP;
            @JsonProperty("mediaGalleryAVIF") List<Object> mediaGalleryAVIF;
        }

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @FieldDefaults(level = AccessLevel.PRIVATE)
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class FlashSale {
            @JsonProperty("active")     Object active;
            @JsonProperty("color")      Object color;
            @JsonProperty("start")      Object start;
            @JsonProperty("end")        Object end;
            @JsonProperty("capPerUser") Object capPerUser;
        }

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @FieldDefaults(level = AccessLevel.PRIVATE)
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Prices {
            @JsonProperty("price")        String price;
            @JsonProperty("specialPrice") String specialPrice;
        }

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @FieldDefaults(level = AccessLevel.PRIVATE)
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Categories {
            @JsonProperty("level0") List<String> level0;
            @JsonProperty("level2") List<String> level2;
            @JsonProperty("level1") List<String> level1;
            @JsonProperty("level3") List<String> level3;
        }

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @FieldDefaults(level = AccessLevel.PRIVATE)
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class RelatedProducts {
            @JsonProperty("products")     List<Product> products;
            @JsonProperty("style_id")     String styleId;
            @JsonProperty("isSwatchType") Boolean isSwatchType;

            @Data
            @NoArgsConstructor
            @AllArgsConstructor
            @FieldDefaults(level = AccessLevel.PRIVATE)
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Product {
                @JsonProperty("parentProductId") String parentProductId;
                @JsonProperty("sku")             String sku;
                @JsonProperty("name")            String name;
                @JsonProperty("price")           String price;
                @JsonProperty("special_price")   String specialPrice;
                @JsonProperty("imageUrl")        String imageUrl;
                @JsonProperty("mainImage")       String mainImage;
                @JsonProperty("currency")        String currency;
                @JsonProperty("colorAttribute")  String colorAttribute;
                @JsonProperty("isInstock")       Boolean isInstock;
            }
        }

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @FieldDefaults(level = AccessLevel.PRIVATE)
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class ConfigProduct {
            @JsonProperty("superAttributeId") String superAttributeId;
            @JsonProperty("sizeOptionId")     String sizeOptionId;
            @JsonProperty("size")             String size;
            @JsonProperty("id")               String id;
            @JsonProperty("sku")              String sku;
            @JsonProperty("so")               Double so;
            @JsonProperty("prices")           Prices prices;
            @JsonProperty("isVisibleProduct") Boolean isVisibleProduct;
            @JsonProperty("giftProduct")      Boolean giftProduct;
            @JsonProperty("discount")         Double discount;
            @JsonProperty("quantity")         String quantity;

            @Data
            @NoArgsConstructor
            @AllArgsConstructor
            @FieldDefaults(level = AccessLevel.PRIVATE)
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Prices {
                @JsonProperty("price")        String price;
                @JsonProperty("specialPrice") String specialPrice;
            }
        }

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @FieldDefaults(level = AccessLevel.PRIVATE)
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class ProductFilterAttributes {
            @JsonProperty("Material Composition") List<Material_Composition> material_Composition;
            @JsonProperty("Fit")                  List<Fit> fit;
            @JsonProperty("Fabric")               List<Fabric> fabric;
            @JsonProperty("Sleeve Length")        List<Sleeve_Length> sleeve_Length;
            @JsonProperty("Color")                List<Color> color;
            @JsonProperty("Pattern Type")         List<Pattern_Type> pattern_Type;
            @JsonProperty("Model Wearing Size")   List<Model_Wearing_Size> model_Wearing_Size;
            @JsonProperty("Occasion")             List<Occasion> occasion;
            @JsonProperty("Neck")                 List<Neck> neck;
            @JsonProperty("Product Type")         List<Product_Type> product_Type;
            @JsonProperty("Length")               List<Length> length;

            @Data @NoArgsConstructor @AllArgsConstructor @FieldDefaults(level = AccessLevel.PRIVATE) @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Material_Composition { @JsonProperty("name") String name; @JsonProperty("attributeCode") String attributeCode; }

            @Data @NoArgsConstructor @AllArgsConstructor @FieldDefaults(level = AccessLevel.PRIVATE) @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Fit { @JsonProperty("name") String name; @JsonProperty("attributeCode") String attributeCode; }

            @Data @NoArgsConstructor @AllArgsConstructor @FieldDefaults(level = AccessLevel.PRIVATE) @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Fabric { @JsonProperty("name") String name; @JsonProperty("attributeCode") String attributeCode; }

            @Data @NoArgsConstructor @AllArgsConstructor @FieldDefaults(level = AccessLevel.PRIVATE) @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Sleeve_Length { @JsonProperty("name") String name; @JsonProperty("attributeCode") String attributeCode; }

            @Data @NoArgsConstructor @AllArgsConstructor @FieldDefaults(level = AccessLevel.PRIVATE) @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Color { @JsonProperty("name") String name; @JsonProperty("attributeCode") String attributeCode; }

            @Data @NoArgsConstructor @AllArgsConstructor @FieldDefaults(level = AccessLevel.PRIVATE) @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Pattern_Type { @JsonProperty("name") String name; @JsonProperty("attributeCode") String attributeCode; }

            @Data @NoArgsConstructor @AllArgsConstructor @FieldDefaults(level = AccessLevel.PRIVATE) @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Model_Wearing_Size { @JsonProperty("name") String name; @JsonProperty("attributeCode") String attributeCode; }

            @Data @NoArgsConstructor @AllArgsConstructor @FieldDefaults(level = AccessLevel.PRIVATE) @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Occasion { @JsonProperty("name") String name; @JsonProperty("attributeCode") String attributeCode; }

            @Data @NoArgsConstructor @AllArgsConstructor @FieldDefaults(level = AccessLevel.PRIVATE) @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Neck { @JsonProperty("name") String name; @JsonProperty("attributeCode") String attributeCode; }

            @Data @NoArgsConstructor @AllArgsConstructor @FieldDefaults(level = AccessLevel.PRIVATE) @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Product_Type { @JsonProperty("name") String name; @JsonProperty("attributeCode") String attributeCode; }

            @Data @NoArgsConstructor @AllArgsConstructor @FieldDefaults(level = AccessLevel.PRIVATE) @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Length { @JsonProperty("name") String name; @JsonProperty("attributeCode") String attributeCode; }
        }

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @FieldDefaults(level = AccessLevel.PRIVATE)
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class ShukranBonusPoint {
            @JsonProperty("silver")   Double silver;
            @JsonProperty("gold")     Double gold;
            @JsonProperty("platinum") Double platinum;
        }

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @FieldDefaults(level = AccessLevel.PRIVATE)
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class ShukranBonus {
            @JsonProperty("silver")   Double silver;
            @JsonProperty("gold")     Double gold;
            @JsonProperty("platinum") Double platinum;
        }
    }
}
