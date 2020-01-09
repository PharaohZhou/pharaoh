package top.zhoulis.dao;

import org.hibernate.cfg.JPAIndexHolder;
import org.hibernate.cfg.annotations.reflection.JPAMetadataProvider;
import org.hibernate.cfg.annotations.reflection.JPAOverriddenAnnotationReader;
import org.hibernate.validator.internal.engine.resolver.JPATraversableResolver;
import org.springframework.data.jpa.repository.JpaRepository;
import top.zhoulis.pojo.User;

/**
 * @ClassName UserRepository
 * @Description: TODO
 * @Author zhou
 * @Date 2019/12/25
 * @Version V1.0
 **/
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String username, String password);
}
