package com.lycodeing.chat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lycodeing.chat.entity.GroupMembers;
import com.lycodeing.chat.mapper.GroupMembersMapper;
import com.lycodeing.chat.service.GroupMembersService;
import org.springframework.stereotype.Service;

/**
* @author lycodeing
* @description 针对表【chat_group_members(群组成员表)】的数据库操作Service实现
* @createDate 2024-09-18 21:16:26
*/
@Service
public class GroupMembersServiceImpl extends ServiceImpl<GroupMembersMapper, GroupMembers>
    implements GroupMembersService{

}




