package zendesk.support;

/* loaded from: classes5.dex */
public class SeeAllArticlesItem {
    private boolean isLoading;
    private SectionItem section;

    public SeeAllArticlesItem(SectionItem sectionItem) {
        this.section = sectionItem;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SeeAllArticlesItem seeAllArticlesItem = (SeeAllArticlesItem) obj;
        SectionItem sectionItem = this.section;
        return sectionItem != null ? sectionItem.equals(seeAllArticlesItem.section) : seeAllArticlesItem.section == null;
    }

    public Long getId() {
        return this.section.getId();
    }

    public String getName() {
        return "";
    }

    public Long getParentId() {
        return this.section.getParentId();
    }

    public SectionItem getSection() {
        return this.section;
    }

    public int getViewType() {
        return 4;
    }

    public int hashCode() {
        SectionItem sectionItem = this.section;
        if (sectionItem != null) {
            return sectionItem.hashCode();
        }
        return 0;
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    public void setLoading(boolean z) {
        this.isLoading = z;
    }
}
