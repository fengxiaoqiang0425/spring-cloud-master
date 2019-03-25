package com.fangjia.sharding;

import com.fangjia.sharding.po.User;
import com.fangjia.sharding.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingTableApplication.class)
public class UserControllerTest {

    @Autowired
    private UserService userService;

    @org.junit.Test
    public void list(){
        User user = new User();
        user.setId((long)1);
        user.setCity("深圳");
        user.setName("李四");
        userService.add(user);
    }

}


