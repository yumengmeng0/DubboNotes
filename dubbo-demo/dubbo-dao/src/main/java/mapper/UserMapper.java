package mapper;

import entity.User;
import org.springframework.stereotype.Service;

/**
 * @author YuMengMeng
 * @date 2022/10/17
 */
@Service
public interface UserMapper {
    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    Integer register(User user);
}
