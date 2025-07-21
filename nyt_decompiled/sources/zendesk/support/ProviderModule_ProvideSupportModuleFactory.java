package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import zendesk.core.RestServiceProvider;

/* loaded from: classes5.dex */
public final class ProviderModule_ProvideSupportModuleFactory implements ba2 {
    private final p76 articleVoteStorageProvider;
    private final p76 blipsProvider;
    private final p76 helpCenterProvider;
    private final ProviderModule module;
    private final p76 requestProvider;
    private final p76 restServiceProvider;
    private final p76 settingsProvider;
    private final p76 uploadProvider;
    private final p76 zendeskTrackerProvider;

    public ProviderModule_ProvideSupportModuleFactory(ProviderModule providerModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7, p76 p76Var8) {
        this.module = providerModule;
        this.requestProvider = p76Var;
        this.uploadProvider = p76Var2;
        this.helpCenterProvider = p76Var3;
        this.settingsProvider = p76Var4;
        this.restServiceProvider = p76Var5;
        this.blipsProvider = p76Var6;
        this.zendeskTrackerProvider = p76Var7;
        this.articleVoteStorageProvider = p76Var8;
    }

    public static ProviderModule_ProvideSupportModuleFactory create(ProviderModule providerModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7, p76 p76Var8) {
        return new ProviderModule_ProvideSupportModuleFactory(providerModule, p76Var, p76Var2, p76Var3, p76Var4, p76Var5, p76Var6, p76Var7, p76Var8);
    }

    public static SupportModule provideSupportModule(ProviderModule providerModule, RequestProvider requestProvider, UploadProvider uploadProvider, HelpCenterProvider helpCenterProvider, SupportSettingsProvider supportSettingsProvider, RestServiceProvider restServiceProvider, SupportBlipsProvider supportBlipsProvider, Object obj, ArticleVoteStorage articleVoteStorage) {
        return (SupportModule) g16.c(providerModule.provideSupportModule(requestProvider, uploadProvider, helpCenterProvider, supportSettingsProvider, restServiceProvider, supportBlipsProvider, (ZendeskTracker) obj, articleVoteStorage), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public SupportModule get() {
        return provideSupportModule(this.module, (RequestProvider) this.requestProvider.get(), (UploadProvider) this.uploadProvider.get(), (HelpCenterProvider) this.helpCenterProvider.get(), (SupportSettingsProvider) this.settingsProvider.get(), (RestServiceProvider) this.restServiceProvider.get(), (SupportBlipsProvider) this.blipsProvider.get(), this.zendeskTrackerProvider.get(), (ArticleVoteStorage) this.articleVoteStorageProvider.get());
    }
}
