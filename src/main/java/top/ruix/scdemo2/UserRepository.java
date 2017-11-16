package top.ruix.scdemo2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ruixian
 * @date 2017/11/14
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
