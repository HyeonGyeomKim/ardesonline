package com.example.ardes.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface GetTokenMapper {

    public Map<String, Object> getUserByToken(String token);
}
