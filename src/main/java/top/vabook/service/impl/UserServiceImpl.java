package top.vabook.service.impl;

import top.vabook.entity.User;
import top.vabook.mapper.UserMapper;
import top.vabook.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author vabook
 * @since 2019-07-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
