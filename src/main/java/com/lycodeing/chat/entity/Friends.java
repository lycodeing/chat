package com.lycodeing.chat.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 好友关系表
 * @TableName chat_friends
 */
@TableName(value ="chat_friends")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Friends implements Serializable {
    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * 关系ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 好友ID
     */
    private Integer friendId;
    /**
     * 建立好友关系的时间
     */
    private Date createdAt;
    /**
     * 是否删除（0=否，1=是）
     */
    @TableLogic
    private Integer isDeleted;
}