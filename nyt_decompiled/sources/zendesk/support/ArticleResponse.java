package zendesk.support;

import defpackage.mn0;
import java.util.List;

/* loaded from: classes5.dex */
class ArticleResponse {
    private Article article;
    private List<zendesk.core.User> users;

    ArticleResponse() {
    }

    Article getArticle() {
        return this.article;
    }

    List<zendesk.core.User> getUsers() {
        return mn0.b(this.users);
    }
}
