//package com.qy.first_demo.service.serviceImpl;
//
//
//import com.qy.first_demo.dao.base.SqlSessionTemplateDao;
//import com.qy.first_demo.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * @program：first_demo
// * @description：用户实现接口实现类
// * @author：ZhangQi
// * @creation：2019-10-08-16:27
// **/
//@Service("userService")
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private QyUserDAO qyUserDAO;
//
//
//    @Autowired
//    private SqlSessionTemplateDao sqlSessionTemplateDao;
//
//
//    @Override
//    public List<QyUserDO> findUser() {
//        List<QyUserDO> list1= qyUserDAO.selectByExample(null);
//
//        Map<String, Object> param = new HashMap<String, Object>();
//        param.put("user_id", 1);
//        List<QyUserDO> list  =  (List<QyUserDO>)sqlSessionTemplateDao.findList("UserDao.queryUser", param);
//        return list;
//    }
//}
