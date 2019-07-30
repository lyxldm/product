package cn.lyx.product1.service;

import cn.lyx.product1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @Autowired
    UserService userService;
@RequestMapping("test")
    User aa(Integer id){
    System.out.println (1 );
    System.out.println (3 );
    System.out.println (2 );
    System.out.println (4 );
    System.out.println (5 );
    System.out.println (6 );
    System.out.println (7 );
    System.out.println (8 );
    System.out.println (10 );
    return  userService.getUserById(id);
}
}
