package zendesk.core;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideMemoryCacheFactory implements ba2 {
    private static final ZendeskStorageModule_ProvideMemoryCacheFactory INSTANCE = new ZendeskStorageModule_ProvideMemoryCacheFactory();

    public static ZendeskStorageModule_ProvideMemoryCacheFactory create() {
        return INSTANCE;
    }

    public static MemoryCache provideMemoryCache() {
        return (MemoryCache) g16.c(ZendeskStorageModule.provideMemoryCache(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public MemoryCache get() {
        return provideMemoryCache();
    }
}
