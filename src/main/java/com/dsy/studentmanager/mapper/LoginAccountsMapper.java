package com.dsy.studentmanager.mapper;

import com.dsy.studentmanager.model.LoginAccounts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: dongshuaiyin
 * @Description:  用来写访问数据的方法
 * @Date: 2024/8/29 23:34
 * @Modified by:
 */
@Mapper
public interface LoginAccountsMapper {

    LoginAccounts login(@Param("username") String username, @Param("password")String password);
}
