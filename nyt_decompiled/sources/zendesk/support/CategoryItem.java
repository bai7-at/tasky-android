package zendesk.support;

import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;
import defpackage.mn0;
import java.util.List;

/* loaded from: classes5.dex */
public class CategoryItem {
    private boolean expanded = true;

    @SerializedName("id")
    private Long id;

    @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
    private String name;

    @SerializedName("section_count")
    private int sectionCount;
    private List<SectionItem> sections;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CategoryItem categoryItem = (CategoryItem) obj;
        Long l = this.id;
        return l != null ? l.equals(categoryItem.id) : categoryItem.id == null;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public Long getParentId() {
        return null;
    }

    public List<SectionItem> getSections() {
        return mn0.b(this.sections);
    }

    public int getViewType() {
        return 1;
    }

    public int hashCode() {
        Long l = this.id;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean setExpanded(boolean z) {
        this.expanded = z;
        return z;
    }

    public void setSections(List<SectionItem> list) {
        this.sections = mn0.b(list);
    }
}
