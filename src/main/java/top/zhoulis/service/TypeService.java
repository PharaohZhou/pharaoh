package top.zhoulis.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.zhoulis.pojo.Type;

import java.util.List;

/**
 * @ClassName TypeService
 * @Description: TODO
 * @Author zhou
 * @Date 2019/12/26
 * @Version V1.0
 **/
public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);

    Type updateType(Long id, Type type);

    void deleteType(Long id);

    List<Type> listType();

    List<Type> listTypeTop(Integer size);
}
