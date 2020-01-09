package top.zhoulis.dao;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import top.zhoulis.pojo.Type;

import java.util.List;

/**
 * @ClassName TypeRepository
 * @Description: TODO
 * @Author zhou
 * @Date 2019/12/26
 * @Version V1.0
 **/
public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);

    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
