package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

/**
 * @author Admin-han
 */
public interface UserService {
    /**
     * 注册用户
     * @param user
     * @return
     */
    boolean regist(User user);
}
