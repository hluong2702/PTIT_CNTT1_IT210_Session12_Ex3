package org.example.ptit_cntt1_it210_session12_ex3;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HospitalInfo {

    @Value("${hospital.name}")
    private String name;
    @Value("${hospital.hotline}")
    private String hotline;

    @PostConstruct
    public void init() {
        System.out.println("Hospital name is " + name);
        System.out.println("Hospital hotline is " + hotline);
    }
}
