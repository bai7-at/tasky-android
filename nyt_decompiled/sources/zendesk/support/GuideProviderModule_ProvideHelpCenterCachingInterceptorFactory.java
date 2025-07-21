package zendesk.support;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory implements ba2 {
    private static final GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory INSTANCE = new GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory();

    public static GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory create() {
        return INSTANCE;
    }

    public static HelpCenterCachingInterceptor provideHelpCenterCachingInterceptor() {
        return (HelpCenterCachingInterceptor) g16.c(GuideProviderModule.provideHelpCenterCachingInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public HelpCenterCachingInterceptor get() {
        return provideHelpCenterCachingInterceptor();
    }
}
