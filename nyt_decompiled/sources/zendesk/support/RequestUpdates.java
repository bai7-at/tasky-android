package zendesk.support;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes5.dex */
public final class RequestUpdates {
    private final Map<String, Integer> requestIds;

    public RequestUpdates(Map<String, Integer> map) {
        if (map == null) {
            this.requestIds = Collections.emptyMap();
        } else {
            this.requestIds = map;
        }
    }
}
