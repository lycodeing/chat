package com.lycodeing.chat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lycodeing.chat.entity.Messages;
import com.lycodeing.chat.mapper.MessagesMapper;
import com.lycodeing.chat.service.MessagesService;
import org.springframework.stereotype.Service;

/**
* @author lycodeing
* @description 针对表【chat_messages(聊天记录表)】的数据库操作Service实现
* @createDate 2024-09-18 21:16:26
*/
@Service
public class MessagesServiceImpl extends ServiceImpl<MessagesMapper, Messages>
    implements MessagesService{

}




