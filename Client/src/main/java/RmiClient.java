import org.apache.log4j.Logger;
import org.shirdrn.spring.remote.rmi.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RmiClient {

    private static final Logger log = Logger.getLogger(RmiClient.class);
    //private static org.slf4j.Logger log = LoggerFactory.getLogger(RmiClient.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "springClient.xml");
        AccountService accountService = (AccountService) ctx
                .getBean("mobileAccountService");
        String result = accountService.shoopingPayment("13800138000", (byte) 5);
        log.info(result);

        System.out.println( "====" + result );


    }

}
