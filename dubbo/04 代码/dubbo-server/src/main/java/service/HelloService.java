package service;

/**
 * @BelongsProject: dubbo-server
 * @Author: GuoAn.Sun
 * @CreateTime: 2020-07-23 17:22
 * @Description: 服务接口
 */
public interface HelloService {

    String sayHello( String name );
    String sayNo();
}
