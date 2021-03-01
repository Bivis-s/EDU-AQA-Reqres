package objects;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import objects.requests.CreateUpdateRequest;
import objects.requests.EmailPasswordRequest;
import objects.responses.data_containing.DataListResponse;
import objects.responses.data_containing.data.Resource;
import objects.responses.data_containing.SingleDataResponse;
import objects.responses.data_containing.data.User;
import objects.responses.no_data.CreateResponse;
import objects.responses.no_data.RegisterLoginResponse;
import objects.responses.no_data.UpdateResponse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ObjectFactory {
    private static final Gson gson = new Gson();

    /**
     * Create data user list data list response.
     *
     * @param body the body
     * @return the data list response
     */
    public static DataListResponse<User> createDataUserList(String body) {
        return gson.fromJson(body, (new TypeToken<DataListResponse<User>>(){}).getType());
    }

    /**
     * Create data user list data list response.
     *
     * @param body the body
     * @return the data list response
     * @throws FileNotFoundException the file not found exception
     */
    public static DataListResponse<User> createDataUserList(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), (new TypeToken<DataListResponse<User>>(){}).getType());
    }

    /**
     * Create data resource list data list response.
     *
     * @param body the body
     * @return the data list response
     */
    public static DataListResponse<Resource> createDataResourceList(String body) {
        return gson.fromJson(body, (new TypeToken<DataListResponse<Resource>>(){}).getType());
    }

    /**
     * Create data resource list data list response.
     *
     * @param body the body
     * @return the data list response
     * @throws FileNotFoundException the file not found exception
     */
    public static DataListResponse<Resource> createDataResourceList(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), (new TypeToken<DataListResponse<Resource>>(){}).getType());
    }

    /**
     * Create single data user single data response.
     *
     * @param body the body
     * @return the single data response
     */
    public static SingleDataResponse<User> createSingleDataUser(String body) {
        return gson.fromJson(body, (new TypeToken<SingleDataResponse<User>>(){}).getType());
    }

    /**
     * Create single data user single data response.
     *
     * @param body the body
     * @return the single data response
     * @throws FileNotFoundException the file not found exception
     */
    public static SingleDataResponse<User> createSingleDataUser(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), (new TypeToken<SingleDataResponse<User>>(){}).getType());
    }

    /**
     * Create single data resource single data response.
     *
     * @param body the body
     * @return the single data response
     */
    public static SingleDataResponse<Resource> createSingleDataResource(String body) {
        return gson.fromJson(body, (new TypeToken<SingleDataResponse<Resource>>(){}).getType());
    }

    /**
     * Create single data resource single data response.
     *
     * @param body the body
     * @return the single data response
     * @throws FileNotFoundException the file not found exception
     */
    public static SingleDataResponse<Resource> createSingleDataResource(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), (new TypeToken<SingleDataResponse<Resource>>(){}).getType());
    }

    /**
     * Create email password request email password request.
     *
     * @param body the body
     * @return the email password request
     */
    public static EmailPasswordRequest createEmailPasswordRequest(String body) {
        return gson.fromJson(body, EmailPasswordRequest.class);
    }

    /**
     * Create email password request email password request.
     *
     * @param body the body
     * @return the email password request
     * @throws FileNotFoundException the file not found exception
     */
    public static EmailPasswordRequest createEmailPasswordRequest(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), EmailPasswordRequest.class);
    }

    /**
     * Create register login response register login response.
     *
     * @param body the body
     * @return the register login response
     */
    public static RegisterLoginResponse createRegisterLoginResponse(String body) {
        return gson.fromJson(body, RegisterLoginResponse.class);
    }

    /**
     * Create register login response register login response.
     *
     * @param body the body
     * @return the register login response
     * @throws FileNotFoundException the file not found exception
     */
    public static RegisterLoginResponse createRegisterLoginResponse(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), RegisterLoginResponse.class);
    }

    /**
     * Create create response create response.
     *
     * @param body the body
     * @return the create response
     */
    public static CreateResponse createCreateResponse(String body) {
        return gson.fromJson(body, CreateResponse.class);
    }

    /**
     * Create create response create response.
     *
     * @param body the body
     * @return the create response
     * @throws FileNotFoundException the file not found exception
     */
    public static CreateResponse createCreateResponse(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), CreateResponse.class);
    }

    /**
     * Create create update request create update request.
     *
     * @param body the body
     * @return the create update request
     */
    public static CreateUpdateRequest createCreateUpdateRequest(String body) {
        return gson.fromJson(body, CreateUpdateRequest.class);
    }

    /**
     * Create create update request create update request.
     *
     * @param body the body
     * @return the create update request
     * @throws FileNotFoundException the file not found exception
     */
    public static CreateUpdateRequest createCreateUpdateRequest(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), CreateUpdateRequest.class);
    }

    /**
     * Create update response update response.
     *
     * @param body the body
     * @return the update response
     */
    public static UpdateResponse createUpdateResponse(String body) {
        return gson.fromJson(body, UpdateResponse.class);
    }

    /**
     * Create update response update response.
     *
     * @param body the body
     * @return the update response
     * @throws FileNotFoundException the file not found exception
     */
    public static UpdateResponse createUpdateResponse(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), UpdateResponse.class);
    }
}
