package adapters;

import com.google.gson.reflect.TypeToken;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;
import objects.responses.ResponseData;
import objects.responses.data_containing.DataListResponse;
import objects.responses.data_containing.SingleDataResponse;
import objects.responses.data_containing.data.Resource;
import objects.responses.data_containing.data.User;
import objects.responses.no_data.CreateResponse;
import objects.requests.CreateUpdateRequest;
import objects.responses.no_data.UpdateResponse;
import objects.requests.EmailPasswordRequest;
import objects.responses.no_data.RegisterLoginResponse;
import objects.responses.ResponseContainer;

import static adapters.ReqresValues.*;
import static objects.ObjectFactory.createDataUserList;

@Log4j2
public class ReqresAdapter extends BaseAdapter {

    /**
     * Returns ResponseContainer of 'get user list' request
     *
     * @param page requested page number
     * @return ResponseContainer containing response status code and DataListResponse&lt;User&gt; object
     */
    @Step("Get user list, page: '{page}'")
    public ResponseContainer<DataListResponse<User>> getUserList(int page) {
        log.info("Get user list, page: " + page);
        Response response = super.get(String.format(GET_USER_LIST_REQUEST_URL, page));
        return new ResponseContainer<>(response.statusCode(), createDataUserList(response.body().asString()));
    }

    /**
     * Returns ResponseContainer of 'get single user' request
     *
     * @param userId requested user id
     * @return ResponseContainer containing response status code and SingleDataResponse&lt;User&gt; object
     */
    @Step("Get user, id: '{userId}'")
    public ResponseContainer<SingleDataResponse<User>> getUser(int userId) {
        log.info("Get user, id: " + userId);
        Response response = super.get(String.format(GET_USER_REQUEST_URL, userId));
        return new ResponseContainer<>(response.statusCode(), gson.fromJson(response.body().asString(),
                (new TypeToken<SingleDataResponse<User>>(){}).getType()));
    }

    /**
     * Returns ResponseContainer of 'get resource list' request
     *
     * @return ResponseContainer containing response status code and DataListResponse&lt;Resource&gt; object
     */
    @Step("Get resource list")
    public ResponseContainer<DataListResponse<Resource>> getResourceList() {
        log.info("Get resource list");
        Response response = super.get(GET_RESOURCE_LIST_REQUEST_URL);
        return new ResponseContainer<>(response.statusCode(), gson.fromJson(response.body().asString(),
                (new TypeToken<DataListResponse<Resource>>(){}).getType()));
    }

    /**
     * Returns ResponseContainer of 'get single resource' request
     *
     * @param resourceId requested resource id
     * @return ResponseContainer containing response status code and SingleDataResponse&lt;Resource&gt; object
     */
    @Step("Get resource, id: '{resourceId}'")
    public ResponseContainer<SingleDataResponse<Resource>> getResource(int resourceId) {
        log.info("Get resource, id: " + resourceId);
        Response response = super.get(String.format(GET_RESOURCE_REQUEST_URL, resourceId));
        return new ResponseContainer<>(response.statusCode(), gson.fromJson(response.body().asString(),
                (new TypeToken<SingleDataResponse<Resource>>(){}).getType()));
    }

    /**
     * Returns ResponseContainer of 'post create user' request
     *
     * @param request CreateUpdateRequest object
     * @return ResponseContainer containing response status code and CreateResponse object
     */
    @Step("Create user")
    public ResponseContainer<CreateResponse> postCreateUser(CreateUpdateRequest request) {
        log.info("Create user, request: " + request);
        Response response = super.post(CREATE_USER_REQUEST_URL, gson.toJson(request));
        return new ResponseContainer<>(response.statusCode(), gson.fromJson(response.body().asString(),
                CreateResponse.class));
    }

    /**
     * Returns ResponseContainer of 'put update user' request
     *
     * @param request CreateUpdateRequest object
     * @param userId updated user id
     * @return ResponseContainer containing response status code and UpdateResponse object
     */
    @Step("Update user, id: '{userId}'")
    public ResponseContainer<UpdateResponse> putUpdateUser(CreateUpdateRequest request, int userId) {
        log.info("Update user using put request, id: " + userId + ", request: " + request);
        Response response = super.put(String.format(MANIPULATE_USER_REQUEST_URL, userId), gson.toJson(request));
        return new ResponseContainer<>(response.statusCode(), gson.fromJson(response.body().asString(),
                UpdateResponse.class));
    }

    /**
     * Returns ResponseContainer of 'patch update user' request
     *
     * @param request CreateUpdateRequest object
     * @param userId patched user id
     * @return ResponseContainer containing response status code and UpdateResponse object
     */
    @Step("Update user, id: '{userId}'")
    public ResponseContainer<UpdateResponse> patchUpdateUser(CreateUpdateRequest request, int userId) {
        log.info("Update user using patch request, id: " + userId + ", request: " + request);
        Response response = super.patch(String.format(MANIPULATE_USER_REQUEST_URL, userId), gson.toJson(request));
        return new ResponseContainer<>(response.statusCode(), gson.fromJson(response.body().asString(),
                UpdateResponse.class));
    }

    /**
     * Returns ResponseContainer of 'delete user' request
     *
     * @param userId deleted user id
     * @return ResponseContainer containing only response status code (data field is always null)
     */
    @Step("Delete user, id: '{userId}'")
    public ResponseContainer<ResponseData> deleteUser(int userId) {
        log.info("Delete user, id: " + userId);
        Response response = super.delete(String.format(MANIPULATE_USER_REQUEST_URL, userId));
        return new ResponseContainer<>(response.getStatusCode(), null);
    }

    /**
     * Returns ResponseContainer of 'post register' request
     *
     * @param request EmailPasswordRequest object
     * @return ResponseContainer containing response status code and RegisterLoginResponse object
     */
    @Step("Register using '{request}'")
    public ResponseContainer<RegisterLoginResponse> postRegister(EmailPasswordRequest request) {
        log.info("Register using post request: " + request);
        Response response = super.post(REGISTER_REQUEST_URL, gson.toJson(request));
        return new ResponseContainer<>(response.statusCode(), gson.fromJson(response.body().asString(), RegisterLoginResponse.class));
    }

    /**
     * Returns ResponseContainer of 'post login' request
     *
     * @param request EmailPasswordRequest object
     * @return ResponseContainer containing response status code and RegisterLoginResponse object
     */
    @Step("Login using '{request}'")
    public ResponseContainer<RegisterLoginResponse> postLogin(EmailPasswordRequest request) {
        log.info("Login using post request: " + request);
        Response response = super.post(LOGIN_REQUEST_URL, gson.toJson(request));
        return new ResponseContainer<>(response.statusCode(), gson.fromJson(response.body().asString(), RegisterLoginResponse.class));
    }
}
