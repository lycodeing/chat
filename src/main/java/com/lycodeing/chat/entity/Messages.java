package com.lycodeing.chat.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 聊天记录表
 * @TableName chat_messages
 */
@TableName(value ="chat_messages")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Messages implements Serializable {
    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * 消息ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Integer messageId;
    /**
     * 发送者ID
     */
    private Integer senderId;
    /**
     * 接收者ID（如果是群聊则为NULL）
     */
    private Integer receiverId;
    /**
     * 群组ID（如果是一对一聊天则为NULL）
     */
    private Integer groupId;
    /**
     * 消息内容
     */
    private String messageText;
    /**
     * 消息创建时间
     */
    private Date createdAt;
    /**
     * 是否删除（0=否，1=是）
     */
    private Integer isDeleted;
}