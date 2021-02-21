package objects;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import objects.create_update.CreateResponse;
import objects.create_update.CreateUpdateRequest;
import objects.create_update.UpdateResponse;
import objects.register_login.EmailPasswordRequest;
import objects.register_login.RegisterLoginResponse;
import objects.resources.Resource;
import objects.responses.DataListResponse;
import objects.responses.SingleDataResponse;
import objects.users.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ObjectFactory {
    private static final Gson gson = new Gson();

    public static DataListResponse<User> createDataUserList(String body) {
        return gson.fromJson(body, (new TypeToken<DataListResponse<User>>(){}).getType());
    }

    public static DataListResponse<User> createDataUserList(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), (new TypeToken<DataListResponse<User>>(){}).getType());
    }

    public static DataListResponse<Resource> createDataResourceList(String body) {
        return gson.fromJson(body, (new TypeToken<DataListResponse<Resource>>(){}).getType());
    }

    public static DataListResponse<Resource> createDataResourceList(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), (new TypeToken<DataListResponse<Resource>>(){}).getType());
    }

    public static SingleDataResponse<User> createSingleDataUser(String body) {
        return gson.fromJson(body, (new TypeToken<SingleDataResponse<User>>(){}).getType());
    }

    public static SingleDataResponse<User> createSingleDataUser(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), (new TypeToken<SingleDataResponse<User>>(){}).getType());
    }

    public static SingleDataResponse<Resource> createSingleDataResource(String body) {
        return gson.fromJson(body, (new TypeToken<SingleDataResponse<Resource>>(){}).getType());
    }

    public static SingleDataResponse<Resource> createSingleDataResource(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), (new TypeToken<SingleDataResponse<Resource>>(){}).getType());
    }

    public static EmailPasswordRequest createEmailPasswordRequest(String body) {
        return gson.fromJson(body, EmailPasswordRequest.class);
    }

    public static EmailPasswordRequest createEmailPasswordRequest(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), EmailPasswordRequest.class);
    }

    public static RegisterLoginResponse createRegisterLoginResponse(String body) {
        return gson.fromJson(body, RegisterLoginResponse.class);
    }

    public static RegisterLoginResponse createRegisterLoginResponse(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), RegisterLoginResponse.class);
    }

    public static CreateResponse createCreateResponse(String body) {
        return gson.fromJson(body, CreateResponse.class);
    }

    public static CreateResponse createCreateResponse(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), CreateResponse.class);
    }

    public static CreateUpdateRequest createCreateUpdateRequest(String body) {
        return gson.fromJson(body, CreateUpdateRequest.class);
    }

    public static CreateUpdateRequest createCreateUpdateRequest(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), CreateUpdateRequest.class);
    }

    public static UpdateResponse createUpdateResponse(String body) {
        return gson.fromJson(body, UpdateResponse.class);
    }

    public static UpdateResponse createUpdateResponse(File body) throws FileNotFoundException {
        return gson.fromJson(new FileReader(body), UpdateResponse.class);
    }
}
