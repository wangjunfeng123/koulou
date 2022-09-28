package com.gz.koulouweb.service;

import com.gz.koulouweb.mapper.UserMapper;
import com.gz.koulouweb.mapper.UserMapperImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserExtendService {

    public static void main(String[] args) {
        UserMapper userMapper = new UserMapperImpl();

        ClassLoader classLoader = UserMapperImpl.class.getClassLoader();

        Class<?>[] interfaces = UserMapperImpl.class.getInterfaces();

        JDKProxy jdkProxy = new JDKProxy(userMapper);
        UserMapper newProxyInstance = (UserMapper)Proxy.newProxyInstance(classLoader, interfaces, jdkProxy);
        newProxyInstance.addUser();
    }





    public static class JDKProxy implements InvocationHandler {

        Object target;

        public JDKProxy(Object target) {
            this.target = target;
        }


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("调用动态代理前执行的部分");
            Object ret = method.invoke(target, args);
            return ret;
        }

    }

}
