package zendesk.core;

import defpackage.tm9;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface UserProvider {
    void addTags(List<String> list, tm9 tm9Var);

    void deleteTags(List<String> list, tm9 tm9Var);

    void getUser(tm9 tm9Var);

    void getUserFields(tm9 tm9Var);

    void setUserFields(Map<String, String> map, tm9 tm9Var);
}
