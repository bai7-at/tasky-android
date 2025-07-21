package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideAccessServiceFactory implements ba2 {
    private final p76 retrofitProvider;

    public ZendeskProvidersModule_ProvideAccessServiceFactory(p76 p76Var) {
        this.retrofitProvider = p76Var;
    }

    public static ZendeskProvidersModule_ProvideAccessServiceFactory create(p76 p76Var) {
        return new ZendeskProvidersModule_ProvideAccessServiceFactory(p76Var);
    }

    public static AccessService provideAccessService(Retrofit retrofit) {
        return (AccessService) g16.c(ZendeskProvidersModule.provideAccessService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public AccessService get() {
        return provideAccessService((Retrofit) this.retrofitProvider.get());
    }
}
