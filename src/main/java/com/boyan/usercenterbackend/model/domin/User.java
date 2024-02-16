package com.boyan.usercenterbackend.model.domin;

/*public class User {
}*/

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("user")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}

