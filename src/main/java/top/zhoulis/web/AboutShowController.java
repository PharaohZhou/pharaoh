package top.zhoulis.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName AboutShowController
 * @Description: TODO
 * @Author zhou
 * @Date 2020/1/9
 * @Version V1.0
 **/
@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
