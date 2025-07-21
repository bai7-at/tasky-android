package zendesk.support;

import java.util.List;

/* loaded from: classes5.dex */
interface RequestMigrator {
    void clearLegacyRequestStorage();

    List<RequestData> getLegacyRequests();
}
