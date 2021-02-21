package adapters;

import com.google.gson.Gson;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import static io.restassured.RestAssured.given;

@Log4j2
@NoArgsConstructor
public class BaseAdapter {

    /**
     * Create gson object for convert objects to json
     */
    protected Gson gson = new Gson();

    /**
     * @param requestUrl url of the get request
     * @return Response object
     */
    @Step("Receive HTTP GET request to URL: '{requestUrl}' and get response")
    public Response get(String requestUrl) {
        log.info("Send get request to URL: " + requestUrl);
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
    @Step("Receive HTTP DELETE request to URL: '{requestUrl}' and get response")
    public Response delete(String requestUrl) {
        log.info("Send delete request to URL: " + requestUrl);
        return given()
                .when()
                .delete(requestUrl)
                .then().log().all()
                .extract().response();
    }

    /**
     * @param requestUrl url of the post request
     * @param requestBody json String of request body
     * @return Response object
     */
    @Step("Receive HTTP POST request with body: '{requestBody}' to URL: '{requestUrl}' and get response")
    public Response post(String requestUrl, String requestBody) {
        log.info("Send post request with body '" + requestBody + "' to URL: " + requestUrl);
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
    @Step("Receive HTTP PUT request contains body: '{requestBody}' to URL: '{requestUrl}' and get response")
    public Response put(String requestUrl, String requestBody) {
        log.info("Send put request with body '" + requestBody + "' to URL: " + requestUrl);
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
    @Step("Receive HTTP PUT request contains body: '{requestBody}' to URL: '{requestUrl}' and get response")
    public Response patch(String requestUrl, String requestBody) {
        log.info("Send patch request with body '" + requestBody + "' to URL: " + requestUrl);
        return given()
                .body(requestBody)
                .when()
                .patch(requestUrl)
                .then().log().all()
                .extract().response();
    }
}
