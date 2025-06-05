package org.ttrader.finnhubService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.ttrader.tinkoffService.TinkoffMain;

@SpringBootApplication(scanBasePackages = {
    "org.ttrader.finnhubService",
    "org.ttrader.secondaryServicesUtil",
    "org.ttrader.util",
    "org.ttrader.alwaysRun"
})
@Profile("finnhub-service")
public class FinnhubMain {

    public static void main(String[] args) {
        System.err.println(FinnhubMain.class);
        SpringApplication.run(FinnhubMain.class, args);
    }

}
