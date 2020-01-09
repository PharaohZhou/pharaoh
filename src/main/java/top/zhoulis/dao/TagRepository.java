package top.zhoulis.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import top.zhoulis.pojo.Blog;
import top.zhoulis.pojo.Tag;

import java.util.List;

/**
 * @ClassName TagRepository
 * @Description: TODO
 * @Author zhou
 * @Date 2019/12/27
 * @Version V1.0
 **/
public interface TagRepository extends JpaRepository<Tag,Long> {
    Tag findByName(String name);

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);

}
