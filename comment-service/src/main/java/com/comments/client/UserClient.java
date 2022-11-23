package com.comments.client;

import com.comments.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name = "USER-SERVICE")
public interface UserClient {

    @GetMapping("/users")
    List<UserDTO> getAll();

    @GetMapping("/users/{id}")
    UserDTO get(@PathVariable(value = "id") Long id);
}
