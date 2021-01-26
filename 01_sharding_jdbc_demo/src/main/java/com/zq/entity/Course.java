package com.zq.entity;

import lombok.Data;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/1/19--->19:58
 * @Company: MGL
 */
@Data
public class Course {
    private Long cid;
    private String cname;
    private Long userId;
    private String cstatus;
}
