package listeners;

import io.qameta.allure.Attachment;
import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LogListener implements ITestListener {
    private final ByteArrayOutputStream request = new ByteArrayOutputStream();
    private final ByteArrayOutputStream response = new ByteArrayOutputStream();

    private final PrintStream requestVar = new PrintStream(request, true);
    private final PrintStream responseVar = new PrintStream(response, true);

    public void onStart(ITestContext iTestContext) {
        RestAssured.filters(new ResponseLoggingFilter(LogDetail.ALL, responseVar),
                new RequestLoggingFilter(LogDetail.ALL, requestVar));
    }

    public byte[] attach(ByteArrayOutputStream log) {
        byte[] array = log.toByteArray();
        log.reset();
        return array;
    }

    @Attachment(value = "Request")
    public byte[] logRequest(ByteArrayOutputStream stream) {
        return attach(stream);
    }

    @Attachment(value = "Response")
    public byte[] logResponse(ByteArrayOutputStream stream) {
        return attach(stream);
    }

    private void logResponseAndRequest() {
        logRequest(request);
        logResponse(response);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logResponseAndRequest();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logResponseAndRequest();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logResponseAndRequest();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        logResponseAndRequest();
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        logResponseAndRequest();
    }
}