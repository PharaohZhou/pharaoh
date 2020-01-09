package top.zhoulis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.zhoulis.dto.BlogDTO;
import top.zhoulis.pojo.Tag;
import top.zhoulis.service.BlogService;
import top.zhoulis.service.TagService;

import java.util.List;

/**
 * @ClassName TagShowController
 * @Description: TODO
 * @Author zhou
 * @Date 2020/1/9
 * @Version V1.0
 **/
@Controller
public class TagShowController {

    @Autowired
    private TagService tagService;

    @Autowired
    private BlogService blogService;

    @GetMapping("tags/{id}")
    public String Tags(@PathVariable Long id, @PageableDefault(size = 8, sort = {"updateTime"},
            direction = Sort.Direction.DESC) Pageable pageable, Model model){
        List<Tag> tags = tagService.listTag();
        if (id == -1){
            id = tags.get(0).getId();
        }
        model.addAttribute("tags", tags);
        model.addAttribute("page", blogService.listBlog(id,pageable));
        model.addAttribute("activeTagId", id);
        return "tags";
    }
}
