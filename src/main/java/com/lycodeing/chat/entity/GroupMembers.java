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
 * 群组成员表
 * @TableName chat_group_members
 */
@TableName(value ="chat_group_members")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupMembers implements Serializable {
    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * 群组成员ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    /**
     * 群组ID
     */
    private Integer groupId;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 加入时间
     */
    private Date joinedAt;
    /**
     * 是否删除（0=否，1=是）
     */
    private Integer isDeleted;
}