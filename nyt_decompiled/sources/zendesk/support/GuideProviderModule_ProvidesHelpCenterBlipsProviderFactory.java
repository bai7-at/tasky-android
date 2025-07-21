package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import java.util.Locale;
import zendesk.core.BlipsProvider;

/* loaded from: classes5.dex */
public final class GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory implements ba2 {
    private final p76 blipsProvider;
    private final p76 localeProvider;
    private final GuideProviderModule module;

    public GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory(GuideProviderModule guideProviderModule, p76 p76Var, p76 p76Var2) {
        this.module = guideProviderModule;
        this.blipsProvider = p76Var;
        this.localeProvider = p76Var2;
    }

    public static GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory create(GuideProviderModule guideProviderModule, p76 p76Var, p76 p76Var2) {
        return new GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory(guideProviderModule, p76Var, p76Var2);
    }

    public static HelpCenterBlipsProvider providesHelpCenterBlipsProvider(GuideProviderModule guideProviderModule, BlipsProvider blipsProvider, Locale locale) {
        return (HelpCenterBlipsProvider) g16.c(guideProviderModule.providesHelpCenterBlipsProvider(blipsProvider, locale), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public HelpCenterBlipsProvider get() {
        return providesHelpCenterBlipsProvider(this.module, (BlipsProvider) this.blipsProvider.get(), (Locale) this.localeProvider.get());
    }
}
