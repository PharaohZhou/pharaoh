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
import top.zhoulis.pojo.Type;
import top.zhoulis.service.BlogService;
import top.zhoulis.service.TypeService;

import java.util.List;

/**
 * @ClassName TypeShowController
 * @Description: TODO
 * @Author zhou
 * @Date 2020/1/9
 * @Version V1.0
 **/
@Controller
public class TypeShowController {

    @Autowired
    private TypeService typeService;

    @Autowired
    private BlogService blogService;

    @GetMapping("types/{id}")
    public String types(@PathVariable Long id, @PageableDefault(size = 8, sort = {"updateTime"},
            direction = Sort.Direction.DESC) Pageable pageable, Model model) {
        List<Type> types = typeService.listTypeTop(10000);
        if (id == -1) {
            id = types.get(0).getId();
        }
        BlogDTO blogDTO = new BlogDTO();
        blogDTO.setTypeId(id);
        model.addAttribute("types", types);
        model.addAttribute("page", blogService.listBlog(pageable, blogDTO));
        model.addAttribute("activeTypeId", id);
        return "types";
    }
}
