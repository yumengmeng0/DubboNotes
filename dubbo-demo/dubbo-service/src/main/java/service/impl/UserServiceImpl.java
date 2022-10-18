package service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import entity.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;

/**
 * 服务实现类
 *
 * @author YuMengMeng
 * @date 2022/10/17
 * <p>
 * 向zookeeper注册服务
 * 实现dubbo-interface的定义的UserService接口
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @Override
    public Integer register(User user) {
        return userMapper.register(user);
    }
}
