package zendesk.support;

import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class SectionItem {
    private List<ArticleItem> articles;

    @SerializedName("category_id")
    private Long categoryId;

    @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
    private String name;

    @SerializedName("id")
    private Long sectionId;

    @SerializedName("article_count")
    private int totalArticlesCount;

    public void addArticle(ArticleItem articleItem) {
        if (this.articles == null) {
            this.articles = new ArrayList();
        }
        this.articles.add(articleItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SectionItem sectionItem = (SectionItem) obj;
        Long l = this.sectionId;
        if (l == null ? sectionItem.sectionId != null : !l.equals(sectionItem.sectionId)) {
            return false;
        }
        Long l2 = this.categoryId;
        return l2 != null ? l2.equals(sectionItem.categoryId) : sectionItem.categoryId == null;
    }

    public List<Object> getChildren() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.articles);
        if (this.articles.size() < this.totalArticlesCount) {
            arrayList.add(new SeeAllArticlesItem(this));
        }
        return arrayList;
    }

    public Long getId() {
        return this.sectionId;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public Long getParentId() {
        return this.categoryId;
    }

    public int getTotalArticlesCount() {
        return this.totalArticlesCount;
    }

    public int getViewType() {
        return 2;
    }

    public int hashCode() {
        Long l = this.sectionId;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.categoryId;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
