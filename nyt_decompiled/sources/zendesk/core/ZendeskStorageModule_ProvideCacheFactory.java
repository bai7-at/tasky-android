package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import java.io.File;
import okhttp3.Cache;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideCacheFactory implements ba2 {
    private final p76 fileProvider;

    public ZendeskStorageModule_ProvideCacheFactory(p76 p76Var) {
        this.fileProvider = p76Var;
    }

    public static ZendeskStorageModule_ProvideCacheFactory create(p76 p76Var) {
        return new ZendeskStorageModule_ProvideCacheFactory(p76Var);
    }

    public static Cache provideCache(File file) {
        return (Cache) g16.c(ZendeskStorageModule.provideCache(file), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public Cache get() {
        return provideCache((File) this.fileProvider.get());
    }
}
