package com.zqq.web.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

@Data
@TableName("sys_user")
public class User implements UserDetails, Serializable {
    //设置主键自增
    @TableId(type= IdType.AUTO)
    private Long userId;
    //登录名
    private String loginName;

    //电话
    private String phone;
    //性别 0：女 1：男
    private String sex;
    //身份证
    private String idCard;
    //是否是管理员 0：不是 1：是
    private String isAdmin;
    //0：在职 1：离职
    private String status;
    //0：启用 1：禁用
    private String isUsed;
    //下面的字段，属于spring security的UserDetails的字段
    //登录账户
    private String username;
    //登录密码
    private String password;
    //帐户是否过期(1 未过期，0已过期)
    private boolean isAccountNonExpired = true;
    //帐户是否被锁定(1 未锁定，0已锁定)
    private boolean isAccountNonLocked = true;
    //密码是否过期(1 未过期，0已过期)
    private boolean isCredentialsNonExpired = true;
    //帐户是否可用(1 可用，0 删除用户)
    private boolean isEnabled = true;
    @TableField(exist = false)
    //用户权限字段的集合
    Collection<? extends GrantedAuthority> authorities;

}