package com.baeldung.shedlock.h2db;

//import com.baeldung.scheduling.shedlock.SpringBootShedlockApplication;
import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
//@EnableSchedulerLock(defaultLockAtMostFor = "PT30S")
public class SpringBootShedlockApplicationH2DB {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootShedlockApplicationH2DB.class, args);
        System.out.println("Running H2DB on Port 9999");
    }
}
