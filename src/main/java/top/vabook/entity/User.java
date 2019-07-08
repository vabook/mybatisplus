package top.vabook.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author vabook
 * @since 2019-07-08
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String mobile;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" +
        ", id=" + id +
        ", mobile=" + mobile +
        "}";
    }
}
