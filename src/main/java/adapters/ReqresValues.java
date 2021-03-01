package adapters;

public class ReqresValues {
    public static final String BASE_URL = "https://reqres.in/api/";
    public static final String GET_USER_LIST_REQUEST_URL = BASE_URL + "users?page=%s";
    public static final String GET_DELAYED_USER_LIST_REQUEST_URL = BASE_URL + "users?delay=%s";
    public static final String GET_USER_REQUEST_URL = BASE_URL + "users/%s";
    public static final String GET_RESOURCE_LIST_REQUEST_URL = BASE_URL + "unknown";
    public static final String GET_RESOURCE_REQUEST_URL = BASE_URL + "unknown/%s";
    public static final String CREATE_USER_REQUEST_URL = BASE_URL + "users";
    public static final String MANIPULATE_USER_REQUEST_URL = BASE_URL + "users/%s";
    public static final String REGISTER_REQUEST_URL = BASE_URL + "register";
    public static final String LOGIN_REQUEST_URL = BASE_URL + "login";

}
