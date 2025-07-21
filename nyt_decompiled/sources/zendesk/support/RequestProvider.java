package zendesk.support;

import defpackage.tm9;

/* loaded from: classes5.dex */
public interface RequestProvider {
    void createRequest(CreateRequest createRequest, tm9 tm9Var);

    void markRequestAsUnread(String str);
}
