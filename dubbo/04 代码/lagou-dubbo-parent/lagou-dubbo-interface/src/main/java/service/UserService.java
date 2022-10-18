package service;

import entity.Users;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: lagou-dubbo
 * @Author: GuoAn.Sun
 * @CreateTime: 2020-07-27 17:56
 * @Description: 用户服务的接口
 */

public interface UserService {
    int register(Users users);
}
