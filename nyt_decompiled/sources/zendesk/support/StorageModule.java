package zendesk.support;

import android.content.Context;
import zendesk.core.MemoryCache;
import zendesk.core.SessionStorage;

/* loaded from: classes5.dex */
class StorageModule {
    StorageModule() {
    }

    RequestMigrator provideRequestMigrator(Context context) {
        return new LegacyRequestMigrator(context.getSharedPreferences("zendesk-authorization", 0));
    }

    RequestSessionCache provideRequestSessionCache() {
        return new ZendeskRequestSessionCache();
    }

    RequestStorage provideRequestStorage(SessionStorage sessionStorage, RequestMigrator requestMigrator, MemoryCache memoryCache) {
        return new ZendeskRequestStorage(sessionStorage.getAdditionalSdkStorage(), requestMigrator, memoryCache);
    }
}
