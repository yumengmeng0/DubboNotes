package service;

import entity.User;

/**
 * 用户服务的接口
 *
 * @author YuMengMeng
 * @date 2022/10/17
 */

public interface UserService {
    /**
     * 用户注册
     * @param user
     * @return
     */
    Integer register(User user);
}
