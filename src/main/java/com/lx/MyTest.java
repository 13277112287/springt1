package com.lx;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyTest {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //现在有一个UserController 和一个UserService
        //controller依赖service 有一个成员属性，给成员属性get set方法

        UserController userController=new UserController();

        UserService userService=new UserService();

        //完成注入  1通过反射获得UserController的Class对象，
        //2通过Class对象获得其属性userClass.getDeclaredField("userService")
        //3由于这个Field属性是私有的，所以要设置setAccessible(true)可访问性;
        //4获取set方法

        //1
        Class<? extends UserController> userClass=userController.getClass();
        //2 获得userService的属性
        Field userServiceField = userClass.getDeclaredField("userService");

        //3 因为field属性是私有的，所以要设置为可访问的
        userServiceField.setAccessible(true);

        //4 获取对应的set方法
        String name = userServiceField.getName();
        name=name.substring(0,1).toUpperCase()+name.substring(1,name.length());//UserService
        String methodName="s et"+name;

        System.out.println("方法名称"+methodName);

        //通过class对象 ，根据方法名，参数类型获得方法对象
        Method method=userClass.getMethod(methodName,UserService.class);
        method.invoke(userController,userService);

        System.out.println(userController.getUserService());
        System.out.println(userService);
    }
}
