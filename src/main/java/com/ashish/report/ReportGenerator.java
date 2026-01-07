package com.ashish.report;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ReportGenerator {

   // @Scheduled(fixedDelay = 3000)
  //  @Scheduled(fixedRate = 5000,fixedDelay = 5000)
    @Scheduled(cron = "10 * * * * *")

    public void generateReport() {

        System.out.println("Seles Report on ::"+ LocalDateTime.now()+"Start()");
        System.out.println("This is testing for Scheduling Report");

        System.out.println("End of sale Report "+LocalDateTime.now());
    }
}
