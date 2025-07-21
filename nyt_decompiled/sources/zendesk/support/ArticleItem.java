package zendesk.support;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
public class ArticleItem {
    private Long id;
    private String name;

    @SerializedName("section_id")
    private Long sectionId;

    public ArticleItem(Long l, Long l2, String str) {
        this.id = l;
        this.sectionId = l2;
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArticleItem articleItem = (ArticleItem) obj;
        Long l = this.id;
        if (l == null ? articleItem.id != null : !l.equals(articleItem.id)) {
            return false;
        }
        Long l2 = this.sectionId;
        return l2 != null ? l2.equals(articleItem.sectionId) : articleItem.sectionId == null;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public Long getParentId() {
        return this.sectionId;
    }

    public int getViewType() {
        return 3;
    }

    public int hashCode() {
        Long l = this.id;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.sectionId;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
