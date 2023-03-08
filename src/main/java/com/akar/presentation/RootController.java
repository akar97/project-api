package com.akar.presentation;

import com.akar.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RootController {

    @GetMapping("/test")
    public String returnTestString(){
        UserEntity userEntity = UserEntity.builder()
                .name("test")
                .build();

        return userEntity.toString();
    }
}
