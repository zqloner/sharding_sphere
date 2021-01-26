package com.zq.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/1/19--->22:49
 * @Company: MGL
 */
@Data
@TableName(value = "t_udict") public class Udict {
    private Long dictid;
    private String ustatus;
    private String uvalue;
}