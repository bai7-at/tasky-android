package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import zendesk.core.MemoryCache;
import zendesk.core.SessionStorage;

/* loaded from: classes5.dex */
public final class StorageModule_ProvideRequestStorageFactory implements ba2 {
    private final p76 baseStorageProvider;
    private final p76 memoryCacheProvider;
    private final StorageModule module;
    private final p76 requestMigratorProvider;

    public StorageModule_ProvideRequestStorageFactory(StorageModule storageModule, p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.module = storageModule;
        this.baseStorageProvider = p76Var;
        this.requestMigratorProvider = p76Var2;
        this.memoryCacheProvider = p76Var3;
    }

    public static StorageModule_ProvideRequestStorageFactory create(StorageModule storageModule, p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new StorageModule_ProvideRequestStorageFactory(storageModule, p76Var, p76Var2, p76Var3);
    }

    public static RequestStorage provideRequestStorage(StorageModule storageModule, SessionStorage sessionStorage, Object obj, MemoryCache memoryCache) {
        return (RequestStorage) g16.c(storageModule.provideRequestStorage(sessionStorage, (RequestMigrator) obj, memoryCache), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public RequestStorage get() {
        return provideRequestStorage(this.module, (SessionStorage) this.baseStorageProvider.get(), this.requestMigratorProvider.get(), (MemoryCache) this.memoryCacheProvider.get());
    }
}
