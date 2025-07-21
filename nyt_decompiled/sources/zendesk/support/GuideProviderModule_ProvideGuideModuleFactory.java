package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import zendesk.core.RestServiceProvider;

/* loaded from: classes5.dex */
public final class GuideProviderModule_ProvideGuideModuleFactory implements ba2 {
    private final p76 articleVoteStorageProvider;
    private final p76 blipsProvider;
    private final p76 helpCenterProvider;
    private final GuideProviderModule module;
    private final p76 restServiceProvider;
    private final p76 settingsProvider;

    public GuideProviderModule_ProvideGuideModuleFactory(GuideProviderModule guideProviderModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        this.module = guideProviderModule;
        this.helpCenterProvider = p76Var;
        this.settingsProvider = p76Var2;
        this.blipsProvider = p76Var3;
        this.articleVoteStorageProvider = p76Var4;
        this.restServiceProvider = p76Var5;
    }

    public static GuideProviderModule_ProvideGuideModuleFactory create(GuideProviderModule guideProviderModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        return new GuideProviderModule_ProvideGuideModuleFactory(guideProviderModule, p76Var, p76Var2, p76Var3, p76Var4, p76Var5);
    }

    public static GuideModule provideGuideModule(GuideProviderModule guideProviderModule, HelpCenterProvider helpCenterProvider, HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, ArticleVoteStorage articleVoteStorage, RestServiceProvider restServiceProvider) {
        return (GuideModule) g16.c(guideProviderModule.provideGuideModule(helpCenterProvider, helpCenterSettingsProvider, helpCenterBlipsProvider, articleVoteStorage, restServiceProvider), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public GuideModule get() {
        return provideGuideModule(this.module, (HelpCenterProvider) this.helpCenterProvider.get(), (HelpCenterSettingsProvider) this.settingsProvider.get(), (HelpCenterBlipsProvider) this.blipsProvider.get(), (ArticleVoteStorage) this.articleVoteStorageProvider.get(), (RestServiceProvider) this.restServiceProvider.get());
    }
}
