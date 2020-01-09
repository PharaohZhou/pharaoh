package top.zhoulis.service;

import top.zhoulis.pojo.Comment;

import java.util.List;

/**
 * @ClassName CommentService
 * @Description: TODO
 * @Author zhou
 * @Date 2020/1/5
 * @Version V1.0
 **/
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
