package com.ams.microservices.limitsService;

import com.ams.microservices.limitsService.bean.Limits;
import com.ams.microservices.limitsService.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        //return new Limits(1, 1000);
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
