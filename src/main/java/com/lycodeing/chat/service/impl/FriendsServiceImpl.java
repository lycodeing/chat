package com.lycodeing.chat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lycodeing.chat.entity.Friends;
import com.lycodeing.chat.mapper.FriendsMapper;
import com.lycodeing.chat.service.FriendsService;
import org.springframework.stereotype.Service;

/**
* @author lycodeing
* @description 针对表【chat_friends(好友关系表)】的数据库操作Service实现
* @createDate 2024-09-18 21:16:26
*/
@Service
public class FriendsServiceImpl extends ServiceImpl<FriendsMapper, Friends>
    implements FriendsService{

}




