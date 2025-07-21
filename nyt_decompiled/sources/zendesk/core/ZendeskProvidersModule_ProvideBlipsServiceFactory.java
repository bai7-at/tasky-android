package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideBlipsServiceFactory implements ba2 {
    private final p76 retrofitProvider;

    public ZendeskProvidersModule_ProvideBlipsServiceFactory(p76 p76Var) {
        this.retrofitProvider = p76Var;
    }

    public static ZendeskProvidersModule_ProvideBlipsServiceFactory create(p76 p76Var) {
        return new ZendeskProvidersModule_ProvideBlipsServiceFactory(p76Var);
    }

    public static BlipsService provideBlipsService(Retrofit retrofit) {
        return (BlipsService) g16.c(ZendeskProvidersModule.provideBlipsService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public BlipsService get() {
        return provideBlipsService((Retrofit) this.retrofitProvider.get());
    }
}
