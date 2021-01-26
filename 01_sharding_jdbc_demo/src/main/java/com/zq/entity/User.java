package com.zq.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/1/19--->22:08
 * @Company: MGL
 */
@Data
@TableName("t_user")
public class User {
    private Long userId;
    private String username;
    private String ustatus;
}
