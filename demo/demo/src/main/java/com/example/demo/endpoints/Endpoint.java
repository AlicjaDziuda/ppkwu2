package com.example.demo.endpoints;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/restapi/")
public class Endpoint {
    private Service service;

    //wstrzykiwanie obiektu Service
    @Autowired
    public Endpoint(Service service) {
        this.service = service;
    }

}
