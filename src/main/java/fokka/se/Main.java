package fokka.se;

import fokka.se.util.ScannerInputService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(fokka.se.data_access.ComponentScanConfig.class);

        //StudentDAO studentDao = context.getBean(StudentDAO.class);
        ScannerInputService scannerInputService = context.getBean(ScannerInputService.class);

        System.out.println("Enter some text:");
        String Stringinput = scannerInputService.getString();
        System.out.println(Stringinput);

        System.out.println("Enter a number:");
        int Numberinput = scannerInputService.getInt();
        System.out.println(Numberinput);

        context.close();







    }

}