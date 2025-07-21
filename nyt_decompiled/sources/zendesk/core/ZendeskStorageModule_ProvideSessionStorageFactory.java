package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import java.io.File;
import okhttp3.Cache;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideSessionStorageFactory implements ba2 {
    private final p76 additionalSdkStorageProvider;
    private final p76 belvedereDirProvider;
    private final p76 cacheDirProvider;
    private final p76 cacheProvider;
    private final p76 dataDirProvider;
    private final p76 identityStorageProvider;
    private final p76 mediaCacheProvider;

    public ZendeskStorageModule_ProvideSessionStorageFactory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7) {
        this.identityStorageProvider = p76Var;
        this.additionalSdkStorageProvider = p76Var2;
        this.mediaCacheProvider = p76Var3;
        this.cacheProvider = p76Var4;
        this.cacheDirProvider = p76Var5;
        this.dataDirProvider = p76Var6;
        this.belvedereDirProvider = p76Var7;
    }

    public static ZendeskStorageModule_ProvideSessionStorageFactory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7) {
        return new ZendeskStorageModule_ProvideSessionStorageFactory(p76Var, p76Var2, p76Var3, p76Var4, p76Var5, p76Var6, p76Var7);
    }

    public static SessionStorage provideSessionStorage(Object obj, BaseStorage baseStorage, BaseStorage baseStorage2, Cache cache, File file, File file2, File file3) {
        return (SessionStorage) g16.c(ZendeskStorageModule.provideSessionStorage((IdentityStorage) obj, baseStorage, baseStorage2, cache, file, file2, file3), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public SessionStorage get() {
        return provideSessionStorage(this.identityStorageProvider.get(), (BaseStorage) this.additionalSdkStorageProvider.get(), (BaseStorage) this.mediaCacheProvider.get(), (Cache) this.cacheProvider.get(), (File) this.cacheDirProvider.get(), (File) this.dataDirProvider.get(), (File) this.belvedereDirProvider.get());
    }
}
