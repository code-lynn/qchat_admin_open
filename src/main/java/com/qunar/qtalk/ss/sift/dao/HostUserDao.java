package com.qunar.qtalk.ss.sift.dao;


import com.qunar.qtalk.ss.sift.entity.HostUsers;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HostUserDao {
    List<HostUsers> selectUsersByUserIds(@Param("userIds") List<String> userIds);

}
