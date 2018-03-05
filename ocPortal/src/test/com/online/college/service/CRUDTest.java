package com.online.college.service;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.online.college.common.page.TailPage;
import com.online.college.common.web.SpringBeanFactory;
import com.online.college.core.auth.domain.AuthUser;


public class CRUDTest extends TestCase {
    Logger log = Logger.getLogger(CRUDTest.class);

    /**
     * 测试创建
     */
//    public void testCreate() {
//
//    IAuthUserService authUserService = (IAuthUserService) SpringBeanFactory.getBean("authUserServiceImpl");
//    log.info("-------------------create start");
//        AuthUser authUser = new AuthUser();
//        authUser.setUsername("test111");
//        authUser.setPassword("111111");
//        authUser.setRealname("用户111");
//        authUserService.createSelectivity(authUser);
//        System.out.println("id="+authUser.getId());
//        log.info("============= create end");
//    }
//
//    /**
//     * 测试id获取
//     */
//    public void testGet() {
//        log.info("-------------------create start");
//        IAuthUserService authUserService = (IAuthUserService) SpringBeanFactory.getBean("authUserServiceImpl");
//        AuthUser authUser=authUserService.getById(34L);
//        if (authUser != null) {
//            System.out.println("authUser.username=" + authUser.getUsername());
//
//        }
//
//        log.info("============= create end");
//        }
//
//    /**
//     * 测试更新
//     */
//    public void testUpdate() {
//        log.info("-------------------create start");
//        IAuthUserService authUserService = (IAuthUserService) SpringBeanFactory.getBean("authUserServiceImpl");
//        AuthUser authUser=authUserService.getById(34L);
//       authUser.setRealname("新的用户1111");
//       authUserService.updateSelectivity(authUser);
//        log.info("============= create end");
//    }
//
//    public void testquery() {
//        log.info("-------------------create start");
//        IAuthUserService authUserService = (IAuthUserService) SpringBeanFactory.getBean("authUserServiceImpl");
//       TailPage<AuthUser> page=new TailPage<AuthUser>();
//        page = authUserService.queryPage(new AuthUser(), page);
//
//        System.out.println("page.size"+page.getItems().size());
//        for (AuthUser item : page.getItems()) {
//            System.out.println(item.getUsername());
//        }
//        log.info("============= create end");
//    }



}
