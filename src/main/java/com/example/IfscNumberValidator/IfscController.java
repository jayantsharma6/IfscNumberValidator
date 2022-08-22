package com.example.IfscNumberValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Controller
public class IfscController {

    @GetMapping("/customer")
    public String showForm(Model model){
        model.addAttribute("customer", new Customer());
        return "customer";
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @PostMapping("/validate-ifsc")
    public String getIfscDetails(@ModelAttribute Customer customer, Model model){

        String ifscCode = customer.getIfscCode();
        String url = new String("https://ifsc.razorpay.com/");
        url += ifscCode;

        RestTemplate restTemplate = new RestTemplate();
        BankDetails responseEntity = restTemplate.getForObject(url, BankDetails.class);

        System.out.println(responseEntity.toString());
        model.addAttribute("bankDetails", responseEntity);

        return "BankResult";
    }

    @GetMapping("/thankyou")
    public String showForm(){
        return "thankyou";
    }

}
