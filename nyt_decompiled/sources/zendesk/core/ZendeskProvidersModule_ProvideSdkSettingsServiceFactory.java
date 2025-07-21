package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProvideSdkSettingsServiceFactory implements ba2 {
    private final p76 retrofitProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(p76 p76Var) {
        this.retrofitProvider = p76Var;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsServiceFactory create(p76 p76Var) {
        return new ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(p76Var);
    }

    public static SdkSettingsService provideSdkSettingsService(Retrofit retrofit) {
        return (SdkSettingsService) g16.c(ZendeskProvidersModule.provideSdkSettingsService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public SdkSettingsService get() {
        return provideSdkSettingsService((Retrofit) this.retrofitProvider.get());
    }
}
