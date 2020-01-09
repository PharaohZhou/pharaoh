package top.zhoulis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import top.zhoulis.pojo.Comment;
import top.zhoulis.service.BlogService;
import top.zhoulis.service.CommentService;

import java.util.List;

/**
 * @ClassName CommentController
 * @Description: TODO
 * @Author zhou
 * @Date 2020/1/5
 * @Version V1.0
 **/
@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private BlogService blogService;

    @GetMapping("/comments/{blogId}")
    public String comments(@PathVariable Long blogId, Model model) {
        model.addAttribute("comments", commentService.listCommentByBlogId(blogId));
        return "blog :: commentList";
    }

    @PostMapping("/comments")
    public String post(Comment comment) {
        Long blogId = comment.getBlog().getId();
        comment.setBlog(blogService.getBlog(blogId));
        comment.setAvatar(blogService.getBlog(blogId).getUser().getAvatar());
        commentService.saveComment(comment);
        return "redirect:/comments/" + blogId;
    }


}
