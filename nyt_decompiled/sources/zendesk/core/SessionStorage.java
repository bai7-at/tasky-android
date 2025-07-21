package zendesk.core;

import java.io.File;

/* loaded from: classes5.dex */
public interface SessionStorage {
    void clear();

    BaseStorage getAdditionalSdkStorage();

    File getZendeskCacheDir();

    File getZendeskDataDir();
}
