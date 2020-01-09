package top.zhoulis.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.zhoulis.dao.TagRepository;
import top.zhoulis.exception.NotFoundException;
import top.zhoulis.pojo.Tag;
import top.zhoulis.service.TagService;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TagServiceImpl
 * @Description: TODO
 * @Author zhou
 * @Date 2019/12/27
 * @Version V1.0
 **/
@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagRepository tagRepository;
    @Transactional
    @Override
    public Tag save(Tag tag) {
        return tagRepository.save(tag);
    }
    @Transactional
    @Override
    public Tag getTag(Long id) {
        return tagRepository.getOne(id);
    }
    @Transactional
    @Override
    public Tag getTagByName(String name) {
        return tagRepository.findByName(name);
    }
    @Transactional
    @Override
    public Page<Tag> listTag(Pageable pageable) {
        return tagRepository.findAll(pageable);
    }
    @Transactional
    @Override
    public Tag updateTag(Long id, Tag tag) {
        Tag tag1 = tagRepository.getOne(id);
        if (tag1 == null) {
            throw new NotFoundException("不存在该标签!");
        }
        BeanUtils.copyProperties(tag, tag1);
        return tagRepository.save(tag1);
    }
    @Transactional
    @Override
    public void deleteTag(Long id) {
        tagRepository.deleteById(id);
    }

    @Override
    public List<Tag> listTag() {
        return tagRepository.findAll();
    }

    @Override
    public List<Tag> listTagTop(Integer size) {
        Sort sort = Sort.by(Sort.Direction.DESC, "blogs.size");
        Pageable pageable = PageRequest.of(0, size, sort);
        return tagRepository.findTop(pageable);
    }

    /**
     * 根据ids获取所有标签
     * @param id
     * @return
     */
    @Override
    public List<Tag> listTag(String id) {
        return tagRepository.findAllById(convertToList(id));
    }

    private List<Long> convertToList(String id) {
        List<Long> list = new ArrayList<>();
        if (!"".equals(id) && id != null) {
            String[] idarray = id.split(",");
            for (int i = 0; i < idarray.length; i++) {
                list.add(new Long(idarray[i]));
            }
        }
        return list;
    }

}
