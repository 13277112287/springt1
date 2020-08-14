package com.lx;

//自定义注解 必须有4个源注解
//当前注解生效范围
// SOURCE   编译时被丢弃，不包含在.class文件中
// CLASS    JVM加载时候被丢弃 包含在.class文件中 默认
// RUNTIME  由JVM 加载，包含在类文件中，在运行时可以被获取到

//@Retention(RetentionPolicy.RUNTIME)

//可以应用的java元素类型 TYPE应用类、接口 FIELD属性  METHOD方法
//@Target(ElementType.FIELD)

//@Inherited
//@Documented  //是否写到文档注释上面
public @interface Autowired {



}
