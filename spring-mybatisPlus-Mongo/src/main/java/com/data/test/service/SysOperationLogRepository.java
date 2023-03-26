package com.data.test.service;

import com.data.test.entity.SysOperationLogHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author yongshi
 * @date 2023/3/26 14:17
 * @Description 系统用户登录日志
 */
public interface SysOperationLogRepository extends MongoRepository<SysOperationLogHistory,String> {
    /**
     * 通过用户id按时间倒序获取登录记录
     * @param userId
     * @return
     */
    List<SysOperationLogHistory> findByUserIdByCreateTimeDesc(Long userId);
}
