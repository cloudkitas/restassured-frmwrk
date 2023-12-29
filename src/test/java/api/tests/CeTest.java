package api.tests;

import api.endpoints.CcEndpoints;
import api.endpoints.CeEndpoints;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CeTest {


    public Logger logger;

    @BeforeClass
    public void setUpLogs() {
        //logs

        logger = LogManager.getLogger(this.getClass());
    }

    @Test(priority = 0)
    public void testGetFxRate() {
        logger.info("***** Calling Endpoint");
        Response response = CeEndpoints.getRate();
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    //Currency Converter Test
    @Test(priority = 1)
    public void testGetConvertRate() {
        Response response = CcEndpoints.getCcRate();
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
