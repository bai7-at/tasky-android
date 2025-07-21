package zendesk.support;

import defpackage.r48;
import java.util.HashMap;
import java.util.Map;
import zendesk.core.BlipsGroup;
import zendesk.core.BlipsProvider;
import zendesk.core.UserAction;

/* loaded from: classes5.dex */
class ZendeskSupportBlipsProvider implements SupportBlipsProvider {
    private BlipsProvider blipsProvider;

    ZendeskSupportBlipsProvider(BlipsProvider blipsProvider) {
        this.blipsProvider = blipsProvider;
    }

    private void sendUserAction(BlipsGroup blipsGroup, String str, Map<String, Object> map) {
        this.blipsProvider.sendBlip(new UserAction("5.0.4", "support_sdk", "SupportSDK", str, null, map), blipsGroup);
    }

    @Override // zendesk.support.SupportBlipsProvider
    public void requestCreated(String str) {
        if (r48.d(str)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("requestId", str);
        sendUserAction(BlipsGroup.BEHAVIOURAL, "requestCreated", hashMap);
    }

    @Override // zendesk.support.SupportBlipsProvider
    public void requestUpdated(String str) {
        if (r48.d(str)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("requestId", str);
        sendUserAction(BlipsGroup.BEHAVIOURAL, "requestUpdated", hashMap);
    }
}
