package test;

import entity.Users;
import mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @BelongsProject: lagou-dubbo
 * @Author: GuoAn.Sun
 * @CreateTime: 2020-07-27 17:46
 * @Description: 测试dao层
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class TestDao {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void register(){
        String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        Users user = new Users("a1","1","11",time);
        userMapper.register(user);
        System.out.println("注册成功！");
    }
}
