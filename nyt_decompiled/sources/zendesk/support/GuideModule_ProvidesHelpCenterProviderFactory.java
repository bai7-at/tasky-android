package zendesk.support;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class GuideModule_ProvidesHelpCenterProviderFactory implements ba2 {
    private final GuideModule module;

    public GuideModule_ProvidesHelpCenterProviderFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesHelpCenterProviderFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesHelpCenterProviderFactory(guideModule);
    }

    public static HelpCenterProvider providesHelpCenterProvider(GuideModule guideModule) {
        return (HelpCenterProvider) g16.c(guideModule.providesHelpCenterProvider(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public HelpCenterProvider get() {
        return providesHelpCenterProvider(this.module);
    }
}
