package cn.lyx.product1.service.impl;


import cn.lyx.product1.dao.UserMapper;
import cn.lyx.product1.entity.User;
import cn.lyx.product1.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public User getUserById(Integer id) {
        User user =  userMapper.selectByPrimaryKey(id);
        stringRedisTemplate.opsForValue().set(user.getName(),user.toString(),60*5, TimeUnit.SECONDS);
        return user;
    }
}
