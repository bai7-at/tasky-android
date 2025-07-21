package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvidePushRegistrationServiceFactory implements ba2 {
    private final p76 retrofitProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(p76 p76Var) {
        this.retrofitProvider = p76Var;
    }

    public static ZendeskProvidersModule_ProvidePushRegistrationServiceFactory create(p76 p76Var) {
        return new ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(p76Var);
    }

    public static PushRegistrationService providePushRegistrationService(Retrofit retrofit) {
        return (PushRegistrationService) g16.c(ZendeskProvidersModule.providePushRegistrationService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public PushRegistrationService get() {
        return providePushRegistrationService((Retrofit) this.retrofitProvider.get());
    }
}
