package utilities;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import objects.responses.ResponseContainer;
import objects.responses.ResponseData;

import static org.testng.Assert.assertEquals;

@Log4j2
public class AssertionUtilities {
    @Step("Assert response status code")
    public static void assertResponseStatusCode(ResponseContainer<? extends ResponseData> actualResponse,
                                                int expectedStatusCode) {
        int actualStatusCode = actualResponse.getStatusCode();
        log.info("Assert equals actual status code '" + actualStatusCode + "' and expected '" +
                expectedStatusCode + "'");
        assertEquals(actualStatusCode, expectedStatusCode);
    }

    @Step("Assert response body data")
    public static void assertResponseBodyData(ResponseData actualResponse, ResponseData expectedResponse) {
        log.info("Assert equals actual response: '" + actualResponse.toString() + "' and expected response: '" +
                expectedResponse.toString() + "'");
        assertEquals(actualResponse, expectedResponse);
    }
}
