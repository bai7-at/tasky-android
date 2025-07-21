package zendesk.support;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class GuideProviderModule_ProvideHelpCenterSessionCacheFactory implements ba2 {
    private static final GuideProviderModule_ProvideHelpCenterSessionCacheFactory INSTANCE = new GuideProviderModule_ProvideHelpCenterSessionCacheFactory();

    public static GuideProviderModule_ProvideHelpCenterSessionCacheFactory create() {
        return INSTANCE;
    }

    public static HelpCenterSessionCache provideHelpCenterSessionCache() {
        return (HelpCenterSessionCache) g16.c(GuideProviderModule.provideHelpCenterSessionCache(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public HelpCenterSessionCache get() {
        return provideHelpCenterSessionCache();
    }
}
