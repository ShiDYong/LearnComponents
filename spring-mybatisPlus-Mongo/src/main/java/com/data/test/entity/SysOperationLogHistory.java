package com.data.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author yongshi
 * @date 2023/3/26 14:10
 * @Description 系统操作日志MongoDB存储起来
 */
@Data
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "sys_operation_log")
public class SysOperationLogHistory implements Serializable {
    @Id
    private Long id;
    @Indexed
    private String userName;
    private String operation;
    private String method;
    private String params;
    private Long time;
    private String ip;
    private String createBy;
    private LocalDateTime createTime;
    private String lastUpdateBy;
    private LocalDateTime lastUpdateTime;

}
