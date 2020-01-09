package top.zhoulis.dto;

/**
 * @ClassName BlogDTO
 * @Description: TODO
 * @Author zhou
 * @Date 2019/12/28
 * @Version V1.0
 **/
public class BlogDTO {
    private String title;
    private Long typeId;
    private boolean recomment;

    public BlogDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public boolean isRecomment() {
        return recomment;
    }

    public void setRecomment(boolean recommend) {
        this.recomment = recomment;
    }
}
