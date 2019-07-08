package com.gaiqun.cloud.microservice.controller;

import com.gaiqun.cloud.microservice.pojo.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author gaiqun
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${user.userServiceUrl}")
    private String userServiceUrl;

    @Value("${user.appId}")
    private String userAppId;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        ServiceInstance serviceInstance = discoveryClient.getInstances(userAppId).get(0);
        String host = serviceInstance.getHost();
        String port = String.valueOf(serviceInstance.getPort());
        return restTemplate.getForObject(String.format("http://%s:%s/user/%d", host, port, id), User.class);
    }

    @GetMapping("/user-instance")
    public List<ServiceInstance> showInfo() {
        return discoveryClient.getInstances(userAppId);
    }
}
