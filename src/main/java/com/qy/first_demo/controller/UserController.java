//package com.qy.first_demo.controller;
//
//import com.qy.first_demo.common.Result;
//import com.qy.first_demo.common.StatusCode;
//import com.qy.first_demo.service.UserService;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletResponse;
//import java.util.List;
//
///**
// * @program：first_demo
// * @description：用户控制层
// * @author：ZhangQi
// * @creation：2019-10-08-16:23
// **/
//@Controller
//@RequestMapping(value = "user")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @ResponseBody
//    @RequestMapping(value ="" , method = RequestMethod.GET)
//    @ApiOperation(value="新增用户" , notes ="同时加入默认密码123456" ,  response = Result.class)
//    public Result addUser(HttpServletResponse response) {
//        List<QyUserDO> list = userService.findUser();
//        return new Result("添加用户成功", list, StatusCode.SUCCESS);
//    }
//
//}
