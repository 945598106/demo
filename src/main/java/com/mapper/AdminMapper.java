package com.mapper;
import com.entity.UserMsg;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;



@Component
@Mapper
public interface AdminMapper {


    public int register(UserMsg userMsg);

}
