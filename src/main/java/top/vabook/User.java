package top.vabook;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

/**
 * @Author: vabook
 * @Date: 2019/7/8 9:13
 */

@Data
public class User {

    @TableId(value="id",type =  IdType.INPUT)
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
