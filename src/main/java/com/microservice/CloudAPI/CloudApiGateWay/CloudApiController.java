package com.microservice.CloudAPI.CloudApiGateWay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CloudApiController {


    @GetMapping("/productserviceFallBack")
    public String productserviceFallBackMethod()
    {
        return "Product Service is Not Working or Taking Long Time for Process Request";
    }

    @GetMapping("/manufacturerserviceFallBack")
    public String manufacturerserviceFallBackMethod()
    {
        return "Manufacturer Service is Not Working or Taking Long Time for Process Request";
    }



}
