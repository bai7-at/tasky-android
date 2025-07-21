package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import zendesk.core.AuthenticationProvider;

/* loaded from: classes5.dex */
public final class ProviderModule_ProvideRequestProviderFactory implements ba2 {
    private final p76 authenticationProvider;
    private final p76 blipsProvider;
    private final ProviderModule module;
    private final p76 requestServiceProvider;
    private final p76 requestSessionCacheProvider;
    private final p76 requestStorageProvider;
    private final p76 settingsProvider;
    private final p76 supportSdkMetadataProvider;
    private final p76 zendeskTrackerProvider;

    public ProviderModule_ProvideRequestProviderFactory(ProviderModule providerModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7, p76 p76Var8) {
        this.module = providerModule;
        this.settingsProvider = p76Var;
        this.authenticationProvider = p76Var2;
        this.requestServiceProvider = p76Var3;
        this.requestStorageProvider = p76Var4;
        this.requestSessionCacheProvider = p76Var5;
        this.zendeskTrackerProvider = p76Var6;
        this.supportSdkMetadataProvider = p76Var7;
        this.blipsProvider = p76Var8;
    }

    public static ProviderModule_ProvideRequestProviderFactory create(ProviderModule providerModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7, p76 p76Var8) {
        return new ProviderModule_ProvideRequestProviderFactory(providerModule, p76Var, p76Var2, p76Var3, p76Var4, p76Var5, p76Var6, p76Var7, p76Var8);
    }

    public static RequestProvider provideRequestProvider(ProviderModule providerModule, SupportSettingsProvider supportSettingsProvider, AuthenticationProvider authenticationProvider, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, SupportBlipsProvider supportBlipsProvider) {
        return (RequestProvider) g16.c(providerModule.provideRequestProvider(supportSettingsProvider, authenticationProvider, (ZendeskRequestService) obj, (RequestStorage) obj2, (RequestSessionCache) obj3, (ZendeskTracker) obj4, (SupportSdkMetadata) obj5, supportBlipsProvider), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public RequestProvider get() {
        return provideRequestProvider(this.module, (SupportSettingsProvider) this.settingsProvider.get(), (AuthenticationProvider) this.authenticationProvider.get(), this.requestServiceProvider.get(), this.requestStorageProvider.get(), this.requestSessionCacheProvider.get(), this.zendeskTrackerProvider.get(), this.supportSdkMetadataProvider.get(), (SupportBlipsProvider) this.blipsProvider.get());
    }
}
