package com.service.impl;



import com.entity.UserMsg;
import com.mapper.AdminMapper;
import com.service.RegisterService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.Mapping;

@Service("registerServiceImpl")

public class RegisterServiceImpl implements RegisterService {





 @Autowired
 @Mapper
    public AdminMapper adminMapper;

    @Override
    public int Register(UserMsg userMsg) {
        int num = 0;
        num = adminMapper.register(userMsg);
        return num;
    }


}
