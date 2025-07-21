package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideUserServiceFactory implements ba2 {
    private final p76 retrofitProvider;

    public ZendeskProvidersModule_ProvideUserServiceFactory(p76 p76Var) {
        this.retrofitProvider = p76Var;
    }

    public static ZendeskProvidersModule_ProvideUserServiceFactory create(p76 p76Var) {
        return new ZendeskProvidersModule_ProvideUserServiceFactory(p76Var);
    }

    public static UserService provideUserService(Retrofit retrofit) {
        return (UserService) g16.c(ZendeskProvidersModule.provideUserService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public UserService get() {
        return provideUserService((Retrofit) this.retrofitProvider.get());
    }
}
