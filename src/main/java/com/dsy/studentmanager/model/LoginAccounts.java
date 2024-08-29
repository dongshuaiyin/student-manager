package com.dsy.studentmanager.model;

import lombok.Data;

/**
 * @Author: dongshuaiyin
 * @Description:
 * @Date: 2024/8/29 23:36
 * @Modified by:
 */
@Data
public class LoginAccounts {

    private Integer accountId;

    private String username;

    private String password;

    private String role;

    private Integer relatedId;


}
