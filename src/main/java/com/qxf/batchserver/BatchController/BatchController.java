package com.qxf.batchserver.BatchController;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BatchController {

    @Scheduled(cron = "${batchTime}")
    public void batct(){
        System.out.println("Start:");
        System.out.println("==========================================");
        System.out.println(":End");
    }
}
