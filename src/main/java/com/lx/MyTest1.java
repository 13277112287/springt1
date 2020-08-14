package com.lx;

import java.util.stream.Stream;

public class MyTest1 {
    public static void main(String[] args) {
        UserController userController=new UserController();

        //获得class对象
        Class<? extends UserController> userControllerClass=userController.getClass();

        Stream.of(userControllerClass.getDeclaredFields()).forEach(filed -> {
            //查看属性是否有注解
            Autowired annotation=filed.getAnnotation(Autowired.class);
            if(annotation!=null){
                filed.setAccessible(true);
                //获取属性类型，有类型后可以创建具体对象
                Class<?> type = filed.getType();
                try {
                    Object o=type.newInstance();//通过Class对象，可以获取一个实例。
                    filed.set(userController,o);//通过Filed对象的set方法，参数1 为哪个对象赋值 参数2 值
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        });
    }
}
