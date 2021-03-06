package Object;

import java.util.Arrays;

public class Pet {
    private Long id;
    private Category category = new Category();
    private String name;
    private String[] photoUrls;
    private Tag[] tag ;
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(String[] photoUrls) {
        this.photoUrls = photoUrls;
    }

    public Tag[] getTag() {
        return tag;
    }

    public void setTag(Tag[] tag) {
        this.tag = tag;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        if (status == Status.sold || status == Status.available || status == Status.pending){
            this.status = status;
        }
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", photoUrls='" + Arrays.toString(photoUrls) + '\'' +
                ", tag=" + Arrays.toString(tag) +
                ", status='" + status + '\'' +
                '}';
    }
}
