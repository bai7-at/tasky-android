package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideSdkStorageFactory implements ba2 {
    private final p76 memoryCacheProvider;
    private final p76 sdkBaseStorageProvider;
    private final p76 sessionStorageProvider;
    private final p76 settingsStorageProvider;

    public ZendeskStorageModule_ProvideSdkStorageFactory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        this.settingsStorageProvider = p76Var;
        this.sessionStorageProvider = p76Var2;
        this.sdkBaseStorageProvider = p76Var3;
        this.memoryCacheProvider = p76Var4;
    }

    public static ZendeskStorageModule_ProvideSdkStorageFactory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        return new ZendeskStorageModule_ProvideSdkStorageFactory(p76Var, p76Var2, p76Var3, p76Var4);
    }

    public static Storage provideSdkStorage(Object obj, SessionStorage sessionStorage, BaseStorage baseStorage, MemoryCache memoryCache) {
        return (Storage) g16.c(ZendeskStorageModule.provideSdkStorage((SettingsStorage) obj, sessionStorage, baseStorage, memoryCache), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public Storage get() {
        return provideSdkStorage(this.settingsStorageProvider.get(), (SessionStorage) this.sessionStorageProvider.get(), (BaseStorage) this.sdkBaseStorageProvider.get(), (MemoryCache) this.memoryCacheProvider.get());
    }
}
