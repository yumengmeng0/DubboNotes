package service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import service.HelloService;

/**
 * 服务实现类
 *
 * @author YuMengMeng
 * @date 2022/10/11
 */

/**
 * com.alibaba.dubbo.config.annotation.Service 不是Spring中的Service
 */
@Service
public class HelloServiceImpl01 implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("HelloServiceImpl01 被调用1次");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        return "Hello " + name;
    }

    @Override
    public String sayNo() {
        System.out.println("HelloServiceImpl01 sayNo()被调用一次");
        return "no";
    }
}
