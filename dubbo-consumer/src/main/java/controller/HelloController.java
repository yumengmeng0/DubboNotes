package controller;

import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.HelloService;

/**
 * @author YuMengMeng
 * @date 2022/10/11
 */

@RestController
public class HelloController {
    /**
     * 引用服务方的的实现类注入进来
     */
//    @Reference // 配置文件使用<dubbo:reference/>配置
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    @ResponseBody
    public String sayHi(String name) {
        System.out.println("sayHi");
        return helloService.sayHello(name);
    }

    @GetMapping("/hello1")
    @ResponseBody
    public void sayHi1() {
        System.out.println("sayHi1");
    }

    @GetMapping("/no")
    public String sayNo() {
        return helloService.sayNo();
    }
}
