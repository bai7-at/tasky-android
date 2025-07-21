package zendesk.support;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class StorageModule_ProvideRequestSessionCacheFactory implements ba2 {
    private final StorageModule module;

    public StorageModule_ProvideRequestSessionCacheFactory(StorageModule storageModule) {
        this.module = storageModule;
    }

    public static StorageModule_ProvideRequestSessionCacheFactory create(StorageModule storageModule) {
        return new StorageModule_ProvideRequestSessionCacheFactory(storageModule);
    }

    public static RequestSessionCache provideRequestSessionCache(StorageModule storageModule) {
        return (RequestSessionCache) g16.c(storageModule.provideRequestSessionCache(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public RequestSessionCache get() {
        return provideRequestSessionCache(this.module);
    }
}
