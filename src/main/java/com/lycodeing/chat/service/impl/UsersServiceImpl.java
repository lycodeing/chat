package com.lycodeing.chat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lycodeing.chat.entity.Users;
import com.lycodeing.chat.mapper.UsersMapper;
import com.lycodeing.chat.service.UsersService;
import org.springframework.stereotype.Service;

/**
* @author lycodeing
* @description 针对表【chat_users(用户表)】的数据库操作Service实现
* @createDate 2024-09-18 21:16:26
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




