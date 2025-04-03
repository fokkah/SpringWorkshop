package fokka.se.data_access;

import fokka.se.util.ScannerInputService;
import fokka.se.util.UserInputService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = {"fokka.se.data_access", "fokka.se.util"})
public class ComponentScanConfig {


    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}
