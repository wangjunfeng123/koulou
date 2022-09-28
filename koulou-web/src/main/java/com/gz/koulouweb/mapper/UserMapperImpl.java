package com.gz.koulouweb.mapper;

public class UserMapperImpl implements UserMapper {

    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }
}
