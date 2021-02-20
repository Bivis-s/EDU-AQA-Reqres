package adapters;

import com.google.gson.reflect.TypeToken;
import io.restassured.response.Response;
import objects.create_update.CreateResponse;
import objects.create_update.CreateUpdateRequest;
import objects.create_update.UpdateResponse;
import objects.register_login.EmailPasswordRequest;
import objects.register_login.RegisterLoginResponse;
import objects.resources.Resource;
import objects.responses.DataListResponse;
import objects.response_container.ResponseContainer;
import objects.responses.SingleDataResponse;
import objects.users.User;

import static adapters.ReqresValues.*;

public class ReqresAdapter extends BaseAdapter {

    /**
     *  Returns ResponseContainer of 'get user list' request
     *
     * @param page requested page number
     * @return ResponseContainer containing response status code and DataListResponse&lt;User&gt; object
     */
    public ResponseContainer<DataListResponse<User>> getUserList(int page) {
        Response response = super.get(String.format(GET_USER_LIST_REQUEST_URL, page));
        return new ResponseContainer<>(response.statusCode(), gson.fromJson(response.body().asString(),
                (new TypeToken<DataListResponse<User>>(){}).getType()));
    }

    /**
     * Returns ResponseContainer of 'get single user' request
     *
     * @param userId requested user id
     * @return ResponseContainer containing response status code and SingleDataResponse&lt;User&gt; object
     */
    public ResponseContainer<SingleDataResponse<User>> getUser(int userId) {
        Response response = super.get(String.format(GET_USER_REQUEST_URL, userId));
        return new ResponseContainer<>(response.statusCode(), gson.fromJson(response.body().asString(),
                (new TypeToken<SingleDataResponse<User>>(){}).getType()));
    }

    /**
     * Returns ResponseContainer of 'get resource list' request
     *
     * @return ResponseContainer containing response status code and DataListResponse&lt;Resource&gt; object
     */
    public ResponseContainer<DataListResponse<Resource>> getResourceList() {
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
    public ResponseContainer<SingleDataResponse<Resource>> getResource(int resourceId) {
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
    public ResponseContainer<CreateResponse> postCreateUser(CreateUpdateRequest request) {
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
    public ResponseContainer<UpdateResponse> putUpdateUser(CreateUpdateRequest request, int userId) {
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
    public ResponseContainer<UpdateResponse> patchUpdateUser(CreateUpdateRequest request, int userId) {
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
    public ResponseContainer<Object> deleteUser(int userId) {
        Response response = super.delete(String.format(MANIPULATE_USER_REQUEST_URL, userId));
        return new ResponseContainer<>(response.getStatusCode(), null);
    }

    /**
     * Returns ResponseContainer of 'post register' request
     *
     * @param request EmailPasswordRequest object
     * @return ResponseContainer containing response status code and RegisterLoginResponse object
     */
    public ResponseContainer<RegisterLoginResponse> postRegister(EmailPasswordRequest request) {
        Response response = super.post(REGISTER_REQUEST_URL, gson.toJson(request));
        return new ResponseContainer<>(response.statusCode(), gson.fromJson(response.body().asString(), RegisterLoginResponse.class));
    }

    /**
     * Returns ResponseContainer of 'post login' request
     *
     * @param request EmailPasswordRequest object
     * @return ResponseContainer containing response status code and RegisterLoginResponse object
     */
    public ResponseContainer<RegisterLoginResponse> postLogin(EmailPasswordRequest request) {
        Response response = super.post(LOGIN_REQUEST_URL, gson.toJson(request));
        return new ResponseContainer<>(response.statusCode(), gson.fromJson(response.body().asString(), RegisterLoginResponse.class));
    }
}
