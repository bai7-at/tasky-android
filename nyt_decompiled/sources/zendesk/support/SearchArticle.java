package zendesk.support;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class SearchArticle implements Serializable {
    private final Article article;
    private final Category category;
    private final Section section;

    public SearchArticle(Article article, Section section, Category category) {
        this.article = article;
        this.section = section;
        this.category = category;
    }

    public Article getArticle() {
        return this.article;
    }

    public Category getCategory() {
        return this.category;
    }

    public Section getSection() {
        return this.section;
    }
}
