package com.zq;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zq.entity.User;
import com.zq.mapper.CourseMapper;
import com.zq.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class ApplicationTests {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private UserMapper userMapper;


    //添加操作
    @Test
    public void addUserDb() {
        User user = new User();
        user.setUsername("testCopy");
        user.setUstatus("testCopyStatus");
        userMapper.insert(user);
    }

    //查询操作
    @Test
    public void findUserDb() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //设置 userid 值
        wrapper.eq("user_id",558771285513994241L);
        User user = userMapper.selectOne(wrapper);
        System.out.println(user);
    }



}
