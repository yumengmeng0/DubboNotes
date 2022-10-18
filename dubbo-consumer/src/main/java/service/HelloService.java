package service;

/**
 * 服务方接口，仅仅是声明，具体实现会远程调用dubbo-server的service实现类
 *
 * @author YuMengMeng
 * @date 2022/10/11
 */

public interface HelloService {
    String sayHello(String name);
    String sayNo();
}
