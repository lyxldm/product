package cn.lyx.product1.service.impl;

import cn.lyx.product1.service.TestService1;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Service
@Component
public class TestService1Impl implements TestService1 {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public String test1() {
        stringRedisTemplate.opsForValue().set("nmae","luo");
        return "hello";
    }
}
