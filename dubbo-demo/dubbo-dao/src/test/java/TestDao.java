import entity.User;
import mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author YuMengMeng
 * @date 2022/10/17
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class TestDao {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void register() {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        User user = new User("ymm", "123456", "13012341234", date);
        userMapper.register(user);
    }
}
