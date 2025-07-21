package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvidePushInterceptorFactory implements ba2 {
    private final p76 identityStorageProvider;
    private final p76 pushDeviceIdStorageProvider;
    private final p76 pushProvider;

    public ZendeskNetworkModule_ProvidePushInterceptorFactory(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.pushProvider = p76Var;
        this.pushDeviceIdStorageProvider = p76Var2;
        this.identityStorageProvider = p76Var3;
    }

    public static ZendeskNetworkModule_ProvidePushInterceptorFactory create(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new ZendeskNetworkModule_ProvidePushInterceptorFactory(p76Var, p76Var2, p76Var3);
    }

    public static ZendeskPushInterceptor providePushInterceptor(Object obj, Object obj2, Object obj3) {
        return (ZendeskPushInterceptor) g16.c(ZendeskNetworkModule.providePushInterceptor((PushRegistrationProviderInternal) obj, (PushDeviceIdStorage) obj2, (IdentityStorage) obj3), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskPushInterceptor get() {
        return providePushInterceptor(this.pushProvider.get(), this.pushDeviceIdStorageProvider.get(), this.identityStorageProvider.get());
    }
}
