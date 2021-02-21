package values;

import java.io.File;

public class Values {
    private static final String EXPECTED_RESPONSES_PATH = "src/test/resources/jsons/expected_responses/";
    public static final File EXPECTED_LIST_USERS_RESPONSE_JSON = new File(EXPECTED_RESPONSES_PATH + "list_users.json");
    public static final File EXPECTED_SINGLE_USER_RESPONSE_JSON = new File(EXPECTED_RESPONSES_PATH + "single_user.json");
    public static final File EXPECTED_LIST_RESOURCE_RESPONSE_JSON = new File(EXPECTED_RESPONSES_PATH + "list_resource.json");
    public static final File EXPECTED_SINGLE_RESOURCE_RESPONSE_JSON = new File(EXPECTED_RESPONSES_PATH + "single_resource.json");
    public static final File EXPECTED_REGISTER_RESPONSE_JSON = new File(EXPECTED_RESPONSES_PATH + "register.json");
    public static final File EXPECTED_LOGIN_RESPONSE_JSON = new File(EXPECTED_RESPONSES_PATH + "login.json");

    private static final String REQUESTS_PATH = "src/test/resources/jsons/requests/";
    public static final File CREATE_REQUEST_JSON = new File(REQUESTS_PATH + "create.json");
    public static final File UPDATE_REQUEST_JSON = new File(REQUESTS_PATH + "update.json");
    public static final File REGISTER_SUCCESSFUL_REQUEST_JSON = new File(REQUESTS_PATH + "register_successful.json");
    public static final File REGISTER_UNSUCCESSFUL_REQUEST_JSON = new File(REQUESTS_PATH + "register_unsuccessful.json");
    public static final File LOGIN_SUCCESSFUL_REQUEST_JSON = new File(REQUESTS_PATH + "login_successful.json");
    public static final File LOGIN_UNSUCCESSFUL_REQUEST_JSON = new File(REQUESTS_PATH + "login_unsuccessful.json");

    public static final int EXPECTED_LIST_USER_STATUS_CODE = 200;
    public static final int EXPECTED_SINGLE_USERS_STATUS_CODE = 200;
    public static final int EXPECTED_SINGLE_USER_NOT_FOUND_STATUS_CODE = 404;
    public static final int EXPECTED_LIST_RESOURCE_STATUS_CODE = 200;
    public static final int EXPECTED_SINGLE_RESOURCE_STATUS_CODE = 200;
    public static final int EXPECTED_SINGLE_RESOURCE_NOT_FOUND_STATUS_CODE = 404;
    public static final int EXPECTED_CREATE_STATUS_CODE = 201;
    public static final int EXPECTED_UPDATE_STATUS_CODE = 200;
    public static final int EXPECTED_DELETE_STATUS_CODE = 204;
    public static final int EXPECTED_REGISTER_SUCCESSFUL_STATUS_CODE = 200;
    public static final int EXPECTED_REGISTER_UNSUCCESSFUL_STATUS_CODE = 400;
    public static final int EXPECTED_LOGIN_SUCCESSFUL_STATUS_CODE = 200;
    public static final int EXPECTED_LOGIN_UNSUCCESSFUL_STATUS_CODE = 400;
}
