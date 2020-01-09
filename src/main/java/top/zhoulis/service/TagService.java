package top.zhoulis.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.zhoulis.pojo.Tag;

import java.util.List;

/**
 * @ClassName TagService
 * @Description: TODO
 * @Author zhou
 * @Date 2019/12/27
 * @Version V1.0
 **/
public interface TagService {
    Tag save(Tag tag);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    Tag updateTag(Long id, Tag tag);

    void deleteTag(Long id);

    List<Tag> listTag();

    List<Tag> listTag(String id);

    List<Tag> listTagTop(Integer size);
}
