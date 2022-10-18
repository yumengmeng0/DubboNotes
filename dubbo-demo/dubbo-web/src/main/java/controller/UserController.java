package controller;

import com.alibaba.dubbo.config.annotation.Reference;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author YuMengMeng
 * @date 2022/10/17
 */

@Controller
public class UserController {

    @Reference
    private UserService userService;


    @RequestMapping("/register")
    public String register(User user) {
        System.out.println("注册");
        String createTime = new SimpleDateFormat("yyyy-MM--dd").format(new Date());
        user.setCreatetime(createTime);
        Integer i = userService.register(user);
        if (i != 0) {
            return "注册成功";
        } else {
            return "注册失败";
        }
    }
}
