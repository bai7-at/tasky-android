package zendesk.support;

import defpackage.mn0;
import java.util.List;

/* loaded from: classes5.dex */
class RequestsResponse extends ResponseWrapper {
    private List<User> lastCommentingAgents;
    private List<Request> requests;

    RequestsResponse() {
    }

    List<User> getLastCommentingAgents() {
        return mn0.b(this.lastCommentingAgents);
    }

    List<Request> getRequests() {
        return mn0.b(this.requests);
    }
}
