package top.ruix.scdemo2;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
    /**
     * 模拟两个账户
     * 1. user/password1，角色user-role
     * 2. admin/password2，角色admin-role
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("user".equals(username)) {
            return new SecurityUser("user", "password1", "user-role");
        } else if ("admin".equals(username)) {
            return new SecurityUser("admin", "password2", "admin-role");
        } else {
            return null;
        }
    }
}