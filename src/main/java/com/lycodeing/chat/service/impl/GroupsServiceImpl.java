package com.lycodeing.chat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lycodeing.chat.entity.Groups;
import com.lycodeing.chat.mapper.GroupsMapper;
import com.lycodeing.chat.service.GroupsService;
import org.springframework.stereotype.Service;

/**
* @author lycodeing
* @description 针对表【chat_groups(群组表)】的数据库操作Service实现
* @createDate 2024-09-18 21:16:26
*/
@Service
public class GroupsServiceImpl extends ServiceImpl<GroupsMapper, Groups>
    implements GroupsService{

}




