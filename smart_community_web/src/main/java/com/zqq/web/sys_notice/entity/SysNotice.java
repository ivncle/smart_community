package com.zqq.web.sys_notice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("sys_notice")
public class SysNotice implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long noticeId;
    private Long userId;
    //标题
    private String title;
    //内容
    private String noticeContent;
    private Date createTime;
}
