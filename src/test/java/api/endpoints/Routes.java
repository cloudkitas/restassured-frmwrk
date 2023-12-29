package api.endpoints;

public class Routes {

    public static String ce_base_url = "http://localhost:8000";
    public static String cc_base_url = "http://localhost:8100";
    // USER MODEL
    public static String post_url = ce_base_url+"/user";
    public static String get_url = ce_base_url+"/user/{username}";
    public static String update_url = ce_base_url+"/user/{username}";
    public static String delete_url = ce_base_url+"/user/{username}";


    // CURRENCY EXCHANGE MODEL
    public static String getCeRate = ce_base_url;
    //currency-exchange/from/EUR/to/INR


    public static String getCcRate = cc_base_url+"/currency-conversion/from/EUR/to/INR/quantity/10";
    // CURRENCY CONVERTER MODEL

    //currency-conversion/from/EUR/to/INR/quantity/10

}
