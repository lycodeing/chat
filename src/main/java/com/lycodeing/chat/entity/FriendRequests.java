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
 * 好友添加申请表
 * @TableName friend_requests
 */
@TableName(value ="friend_requests")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FriendRequests implements Serializable {
    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * 申请ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Integer requestId;
    /**
     * 申请者ID
     */
    private Integer requesterId;
    /**
     * 接收者ID
     */
    private Integer recipientId;
    /**
     * 申请状态（pending=待确认，accepted=已接受，rejected=已拒绝）
     */
    private Object status;
    /**
     * 申请附加消息
     */
    private String message;
    /**
     * 申请时间
     */
    private Date createdAt;
    /**
     * 是否删除（0=否，1=是）
     */
    private Integer isDeleted;
}