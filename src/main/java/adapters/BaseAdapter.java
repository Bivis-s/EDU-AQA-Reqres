package adapters;

import com.google.gson.Gson;
import io.restassured.response.Response;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import static io.restassured.RestAssured.given;

@Log4j2
@NoArgsConstructor
public class BaseAdapter {
    protected Gson gson = new Gson();

    /**
     * @param requestUrl url of the get request
     * @return Response object
     */
    public Response get(String requestUrl) {
        return given()
                .when()
                .get(requestUrl)
                .then().log().all()
                .extract().response();
    }

    /**
     * @param requestUrl url of the delete request
     * @return Response object
     */
    public Response delete(String requestUrl) {
        return given()
                .when()
                .get(requestUrl)
                .then().log().all()
                .extract().response();
    }

    /**
     * @param requestUrl url of the post request
     * @param requestBody json String of request body
     * @return Response object
     */
    public Response post(String requestUrl, String requestBody) {
        return given()
                .body(requestBody)
                .when()
                .post(requestUrl)
                .then().log().all()
                .extract().response();
    }

    /**
     * @param requestUrl url of the put request
     * @param requestBody json String of request body
     * @return Response object
     */
    public Response put(String requestUrl, String requestBody) {
        return given()
                .body(requestBody)
                .when()
                .put(requestUrl)
                .then().log().all()
                .extract().response();
    }

    /**
     * @param requestUrl url of the patch request
     * @param requestBody json String of request body
     * @return Response object
     */
    public Response patch(String requestUrl, String requestBody) {
        return given()
                .body(requestBody)
                .when()
                .put(requestUrl)
                .then().log().all()
                .extract().response();
    }
}
