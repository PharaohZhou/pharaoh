package top.zhoulis.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.zhoulis.dto.BlogDTO;
import top.zhoulis.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @ClassName BlogService
 * @Description: TODO
 * @Author zhou
 * @Date 2019/12/27
 * @Version V1.0
 **/
public interface BlogService {
    Blog getBlog(Long id);

    Blog getAndConvert(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogDTO blog);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(String query,Pageable pageable);

    Page<Blog> listBlog(Long tagId, Pageable pageable);

    List<Blog> listRecommentBlogTop(Integer size);

    Map<String, List<Blog>> archiveBlog();

    Long countBlog();

    Blog save(Blog blog);

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);
}
