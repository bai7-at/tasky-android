package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideCachingInterceptorFactory implements ba2 {
    private final p76 mediaCacheProvider;

    public ZendeskNetworkModule_ProvideCachingInterceptorFactory(p76 p76Var) {
        this.mediaCacheProvider = p76Var;
    }

    public static ZendeskNetworkModule_ProvideCachingInterceptorFactory create(p76 p76Var) {
        return new ZendeskNetworkModule_ProvideCachingInterceptorFactory(p76Var);
    }

    public static CachingInterceptor provideCachingInterceptor(BaseStorage baseStorage) {
        return (CachingInterceptor) g16.c(ZendeskNetworkModule.provideCachingInterceptor(baseStorage), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public CachingInterceptor get() {
        return provideCachingInterceptor((BaseStorage) this.mediaCacheProvider.get());
    }
}
