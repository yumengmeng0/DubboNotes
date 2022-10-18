package service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import service.HelloService;

/**
 * @BelongsProject: dubbo-server
 * @Author: GuoAn.Sun
 * @CreateTime: 2020-07-23 17:23
 * @Description: 服务实现类
 */

@Service
public class HelloServiceImpl01 implements HelloService {
    public String sayHello(String name) {
        System.out.println("---1.0-被调用1次----");
        try {
            Thread.sleep(3000); // 模拟网络延迟
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Hello,"+name+"!!!!!";
    }

    public String sayNo() {
        System.out.println("==1.0=no被调用了1次===");
        try {
            Thread.sleep(3000); // 模拟网络延迟
        }catch (Exception e){
            e.printStackTrace();
        }
        return "no";
    }

}
