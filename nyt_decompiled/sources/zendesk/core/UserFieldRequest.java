package zendesk.core;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
class UserFieldRequest {
    private final Map<String, Map<String, String>> user;

    UserFieldRequest(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("user_fields", map);
        this.user = hashMap;
    }
}
