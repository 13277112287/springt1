package com.lx;

public class Source_refresh {

    //spring AbstractApplicationContext中的核心方法refresh
    /*public void refresh() throws BeansException, IllegalStateException {
        synchronized (this.startupShutdownMonitor) {
            // Prepare this context for refreshing.
            // 1准备这个上下文以刷新  这个方法创建了初期环境监听的hashMap
            prepareRefresh();

            // Tell the subclass to refresh the internal bean factory.
            //2告诉子类去刷新这个内部的bean工厂
            //obtainFreshBeanFactory这个方法内部 refreshBeanFactory()实现类中
            // 创建bean工厂 DefaultListableBeanFactory beanFactory = createBeanFactory();
            // 加载bean loadBeanDefinitions(beanFactory); //bean都实现了BeanDefinition接口
            ConfigurableListableBeanFactory beanFactory = obtainFreshBeanFactory();

            // Prepare the bean factory for use in this context.
            //3 向bean工厂添加和设置一些信息，忽略哪些接口
            prepareBeanFactory(beanFactory);

            try {
                // Allows post-processing of the bean factory in context subclasses.
                //4 允许在上下文子类中对bean工厂进行后处理
                postProcessBeanFactory(beanFactory);

                // Invoke factory processors registered as beans in the context.
                //5调用上下文环境中注册为bean的工厂处理器
                invokeBeanFactoryPostProcessors(beanFactory);

                // Register bean processors that intercept bean creation.
                //6 注册bean处理器 拦截bean的创建
                //其方法Instantiate and register all BeanPostProcessor beans
                registerBeanPostProcessors(beanFactory);

                // Initialize message source for this context.
                //7国际化处理 为此上下文初始化消息源
                initMessageSource();

                // Initialize event multicaster for this context.
                //8 为此上下文初始化事件多播器(广播器)
                initApplicationEventMulticaster();

                // Initialize other special beans in specific context subclasses.
                //9 留给子类实现的 初始化特定上下文子类中的其他特殊bean
                onRefresh();

                // Check for listener beans and register them.
                //10 检查侦听器bean并注册它们。
                registerListeners();

                // Instantiate all remaining (non-lazy-init) singletons.
                //11 实例化所有剩余的(非延迟-init)单例
                finishBeanFactoryInitialization(beanFactory);

                // Last step: publish corresponding event.
                //12  发布相应的事件
                finishRefresh();
            }

            catch (BeansException ex) {
                if (logger.isWarnEnabled()) {
                    logger.warn("Exception encountered during context initialization - " +
                            "cancelling refresh attempt: " + ex);
                }

                // Destroy already created singletons to avoid dangling resources.
                destroyBeans();

                // Reset 'active' flag.
                cancelRefresh(ex);

                // Propagate exception to caller.
                throw ex;
            }

            finally {
                // Reset common introspection caches in Spring's core, since we
                // might not ever need metadata for singleton beans anymore...
                resetCommonCaches();
            }
        }
    }*/


}
