package zendesk.support;

import defpackage.mn0;
import java.util.List;

/* loaded from: classes5.dex */
class ArticlesListResponse {
    private List<Article> articles;
    private List<Category> categories;
    private String nextPage;
    private String previousPage;
    private List<Section> sections;
    private List<zendesk.core.User> users;

    ArticlesListResponse() {
    }

    public List<Article> getArticles() {
        return mn0.b(this.articles);
    }

    public List<Category> getCategories() {
        return mn0.b(this.categories);
    }

    public String getNextPage() {
        return this.nextPage;
    }

    public String getPreviousPage() {
        return this.previousPage;
    }

    public List<Section> getSections() {
        return mn0.b(this.sections);
    }

    public List<zendesk.core.User> getUsers() {
        return mn0.b(this.users);
    }
}
