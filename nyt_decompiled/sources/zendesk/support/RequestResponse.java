package zendesk.support;

import defpackage.mn0;
import java.util.List;

/* loaded from: classes5.dex */
class RequestResponse {
    private List<User> lastCommentingAgents;
    private Request request;

    RequestResponse() {
    }

    List<User> getLastCommentingAgents() {
        return mn0.b(this.lastCommentingAgents);
    }

    Request getRequest() {
        return this.request;
    }
}
