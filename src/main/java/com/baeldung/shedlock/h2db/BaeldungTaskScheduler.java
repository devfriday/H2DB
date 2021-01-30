package com.baeldung.shedlock.h2db;

//import net.javacrumbs.shedlock.core.SchedulerLock;
//import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
class BaeldungTaskScheduler {
    //@Scheduled(cron = "0 0/1 * * * ?")
    //@Scheduled(cron = "*/1 * * * * *")
    //@SchedulerLock(name = "TaskScheduler_scheduledTask", lockAtLeastForString = "PT5M", lockAtMostForString = "PT14M")
    public void scheduledTask() {
        System.out.println("Running ShedLock task test "+ Math.random()*10);
    }
}
