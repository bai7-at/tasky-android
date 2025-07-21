package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class GuideProviderModule_ProvideHelpCenterProviderFactory implements ba2 {
    private final p76 blipsProvider;
    private final p76 helpCenterServiceProvider;
    private final p76 helpCenterSessionCacheProvider;
    private final GuideProviderModule module;
    private final p76 settingsProvider;

    public GuideProviderModule_ProvideHelpCenterProviderFactory(GuideProviderModule guideProviderModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        this.module = guideProviderModule;
        this.settingsProvider = p76Var;
        this.blipsProvider = p76Var2;
        this.helpCenterServiceProvider = p76Var3;
        this.helpCenterSessionCacheProvider = p76Var4;
    }

    public static GuideProviderModule_ProvideHelpCenterProviderFactory create(GuideProviderModule guideProviderModule, p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        return new GuideProviderModule_ProvideHelpCenterProviderFactory(guideProviderModule, p76Var, p76Var2, p76Var3, p76Var4);
    }

    public static HelpCenterProvider provideHelpCenterProvider(GuideProviderModule guideProviderModule, HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, Object obj, Object obj2) {
        return (HelpCenterProvider) g16.c(guideProviderModule.provideHelpCenterProvider(helpCenterSettingsProvider, helpCenterBlipsProvider, (ZendeskHelpCenterService) obj, (HelpCenterSessionCache) obj2), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public HelpCenterProvider get() {
        return provideHelpCenterProvider(this.module, (HelpCenterSettingsProvider) this.settingsProvider.get(), (HelpCenterBlipsProvider) this.blipsProvider.get(), this.helpCenterServiceProvider.get(), this.helpCenterSessionCacheProvider.get());
    }
}
