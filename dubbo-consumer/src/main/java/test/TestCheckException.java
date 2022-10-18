package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 启动时检查
 *
 * @author YuMengMeng
 * @date 2022/10/12
 */

public class TestCheckException {

    public static void main(String[] args) throws IOException {
        // 初始化spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring.xml");
        System.in.read();
    }
}
