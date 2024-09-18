package com.lycodeing.chat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lycodeing.chat.entity.FriendRequests;
import com.lycodeing.chat.mapper.FriendRequestsMapper;
import com.lycodeing.chat.service.FriendRequestsService;
import org.springframework.stereotype.Service;

/**
* @author lycodeing
* @description 针对表【friend_requests(好友添加申请表)】的数据库操作Service实现
* @createDate 2024-09-18 21:16:26
*/
@Service
public class FriendRequestsServiceImpl extends ServiceImpl<FriendRequestsMapper, FriendRequests>
    implements FriendRequestsService{

}




