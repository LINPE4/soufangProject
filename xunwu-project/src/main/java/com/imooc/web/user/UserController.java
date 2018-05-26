package com.imooc.web.user;

import com.imooc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * Created by 瓦力.
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/user/login")
    public String loginPage() {
        return "user/login";
    }

    @GetMapping("/user/center")
    public String centerPage() {
        return "user/center";
    }


}
