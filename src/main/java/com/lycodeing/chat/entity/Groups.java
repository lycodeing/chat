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
 * 群组表
 * @TableName chat_groups
 */
@TableName(value ="chat_groups")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Groups implements Serializable {
    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * 群组ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Integer groupId;
    /**
     * 群组名称
     */
    private String groupName;
    /**
     * 群组拥有者ID
     */
    private Integer ownerId;
    /**
     * 群组创建时间
     */
    private Date createdAt;
    /**
     * 是否删除（0=否，1=是）
     */
    private Integer isDeleted;
}