package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideAccessInterceptorFactory implements ba2 {
    private final p76 accessProvider;
    private final p76 coreSettingsStorageProvider;
    private final p76 identityManagerProvider;
    private final p76 storageProvider;

    public ZendeskNetworkModule_ProvideAccessInterceptorFactory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        this.identityManagerProvider = p76Var;
        this.accessProvider = p76Var2;
        this.storageProvider = p76Var3;
        this.coreSettingsStorageProvider = p76Var4;
    }

    public static ZendeskNetworkModule_ProvideAccessInterceptorFactory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        return new ZendeskNetworkModule_ProvideAccessInterceptorFactory(p76Var, p76Var2, p76Var3, p76Var4);
    }

    public static ZendeskAccessInterceptor provideAccessInterceptor(Object obj, Object obj2, Object obj3, Object obj4) {
        return (ZendeskAccessInterceptor) g16.c(ZendeskNetworkModule.provideAccessInterceptor((IdentityManager) obj, (AccessProvider) obj2, (Storage) obj3, (CoreSettingsStorage) obj4), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskAccessInterceptor get() {
        return provideAccessInterceptor(this.identityManagerProvider.get(), this.accessProvider.get(), this.storageProvider.get(), this.coreSettingsStorageProvider.get());
    }
}
