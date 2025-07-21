package zendesk.support;

import defpackage.mn0;
import java.util.List;

/* loaded from: classes5.dex */
public class CommentsResponse extends ResponseWrapper {
    private List<CommentResponse> comments;
    private List<Object> organizations;
    private List<User> users;

    public List<CommentResponse> getComments() {
        return mn0.b(this.comments);
    }

    public List<Object> getOrganizations() {
        return mn0.b(this.organizations);
    }

    public List<User> getUsers() {
        return mn0.b(this.users);
    }
}
