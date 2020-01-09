package top.zhoulis.dao;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import top.zhoulis.pojo.Comment;

import java.util.List;

/**
 * @ClassName CommentRepository
 * @Description: TODO
 * @Author zhou
 * @Date 2020/1/5
 * @Version V1.0
 **/
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
