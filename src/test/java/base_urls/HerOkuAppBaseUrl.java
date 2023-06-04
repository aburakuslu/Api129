package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class HerOkuAppBaseUrl {
    //setUp() method'u ile request işleminde tekrarlı şekilde yapılacak işlemler burada bir kez yapılacak.
    // @Test öncesi çalışması için @Before anotasyonu ekliyoruz.

    protected RequestSpecification spec;

    @Before //Her @Test method'u öncesi çalışır
    public void setUp() {
        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).setBaseUri("https://restful-booker.herokuapp.com/").build();
    }
}
