package com.dsy.studentmanager.controller;

import com.dsy.studentmanager.mapper.LoginAccountsMapper;
import com.dsy.studentmanager.model.LoginAccounts;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: dongshuaiyin
 * @Description:
 * @Date: 2024/8/29 23:50
 * @Modified by:
 */
@Controller
public class DsyController {

    @Resource
    private LoginAccountsMapper loginAccountsMapper;

    @ResponseBody
    @GetMapping("/login")
    public LoginAccounts getLoginAccounts(String username, String password){
        LoginAccounts login = loginAccountsMapper.login(username, password);
        return login;
    }
}
