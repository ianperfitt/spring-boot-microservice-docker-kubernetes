package com.example.cloud.gateway;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

@Service
public class FallBackMethodController {

    @CircuitBreaker(name = "userServiceFallBack", fallbackMethod = "fallback")
    public String userServiceFallBackMethod() {
        return "User service is taking longer than expected. Please try again later.";
    }

    @CircuitBreaker(name = "departmentServiceFallBack", fallbackMethod = "fallback")
    public String departmentServiceFallBackMethod() {
        return "Department service is taking longer than expected. Please try again later.";
    }
}
