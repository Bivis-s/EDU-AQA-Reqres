package tests;

import adapters.ReqresAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static objects.ObjectFactory.*;
import static utilities.assertionUtilities.*;
import static values.Values.*;

public class ReqresTest {
    private ReqresAdapter adapter;

    @BeforeMethod
    public void initAdapter() {
        adapter = new ReqresAdapter();
    }

    @AfterMethod
    public void waitAfterMethod() throws InterruptedException {
        Thread.sleep(350);
    }

    @Test(description = "Get user list on page 2 response status code test", groups = "positive")
    public void getUserListResponseStatusCodeTest() {
        assertResponseStatusCode(adapter.getUserList(2), EXPECTED_LIST_USER_STATUS_CODE);
    }

    @Test(description = "Get user list on page 2 response body test", groups = "positive")
    public void getUserListResponseBodyTest() throws FileNotFoundException {
        assertResponseBodyData(adapter.getUserList(2).getData(),
                createDataUserList(EXPECTED_LIST_USERS_RESPONSE_JSON));
    }

    @Test(description = "Get single user with id = 2 response status code test", groups = "positive")
    public void getSingleUserResponseStatusCodeTest() {
        assertResponseStatusCode(adapter.getUser(2), EXPECTED_SINGLE_USERS_STATUS_CODE);
    }

    @Test(description = "Get single user with id = 2 response body test", groups = "positive")
    public void getSingleUserResponseBodyTest() throws FileNotFoundException {
        assertResponseBodyData(adapter.getUser(2).getData(),
                createSingleDataUser(EXPECTED_SINGLE_USER_RESPONSE_JSON));
    }

    @Test(description = "Get single user with no existing id = 23", groups = "negative")
    public void getSingleUserWithNoExistingIdResponseStatusCodeTest() {
        assertResponseStatusCode(adapter.getUser(23), EXPECTED_SINGLE_USER_NOT_FOUND_STATUS_CODE);
    }

    @Test(description = "Get resource list response status code test", groups = "positive")
    public void getResourceListResponseStatusCodeTest() {
        assertResponseStatusCode(adapter.getResourceList(), EXPECTED_LIST_RESOURCE_STATUS_CODE);
    }

    @Test(description = "Get resource list response body test", groups = "positive")
    public void getResourceListResponseBodyTest() throws FileNotFoundException {
        assertResponseBodyData(adapter.getResourceList().getData(),
                createDataResourceList(EXPECTED_LIST_RESOURCE_RESPONSE_JSON));
    }

    @Test(description = "Get single resource with id = 2 response status code test", groups = "positive")
    public void getSingleResourceResponseStatusCodeTest() {
        assertResponseStatusCode(adapter.getResource(2), EXPECTED_SINGLE_RESOURCE_STATUS_CODE);
    }

    @Test(description = "Get single resource with id = 2 response body test", groups = "positive")
    public void getSingleResourceResponseBodyTest() throws FileNotFoundException {
        assertResponseBodyData(adapter.getResource(2).getData(),
                createSingleDataResource(EXPECTED_SINGLE_RESOURCE_RESPONSE_JSON));
    }

    @Test(description = "Get single resource with no existing id = 23", groups = "negative")
    public void getSingleResourceWithNoExistingIdResponseStatusCodeTest() {
        assertResponseStatusCode(adapter.getResource(23), EXPECTED_SINGLE_RESOURCE_NOT_FOUND_STATUS_CODE);
    }
}
