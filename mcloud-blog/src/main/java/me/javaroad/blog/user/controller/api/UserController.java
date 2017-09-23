package me.javaroad.blog.user.controller.api;

import java.security.Principal;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heyx
 */
@RestController
@RequestMapping("users/me")
public class UserController {

    @GetMapping
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public Principal me(Principal principal) {
        return principal;
    }
}
