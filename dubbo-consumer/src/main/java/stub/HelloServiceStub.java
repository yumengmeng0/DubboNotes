package stub;

import com.alibaba.dubbo.config.annotation.Reference;
import org.jboss.netty.util.internal.StringUtil;
import org.springframework.util.StringUtils;
import service.HelloService;

/**
 * 本地存根
 *
 * @author YuMengMeng
 * @date 2022/10/12
 */

public class HelloServiceStub implements HelloService {

    private HelloService helloService;

    /**
     * @param helloService 本地存根必须以构造方式注入
     */
    public HelloServiceStub(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public String sayHello(String name) {
        if (!StringUtils.isEmpty(name)) {
            return helloService.sayHello(name);
        }
        return "no name";
    }

    @Override
    public String sayNo() {
        return null;
    }
}
