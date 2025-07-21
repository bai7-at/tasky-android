package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class GuideProviderModule_ProvideCustomNetworkConfigFactory implements ba2 {
    private final p76 helpCenterCachingInterceptorProvider;

    public GuideProviderModule_ProvideCustomNetworkConfigFactory(p76 p76Var) {
        this.helpCenterCachingInterceptorProvider = p76Var;
    }

    public static GuideProviderModule_ProvideCustomNetworkConfigFactory create(p76 p76Var) {
        return new GuideProviderModule_ProvideCustomNetworkConfigFactory(p76Var);
    }

    public static HelpCenterCachingNetworkConfig provideCustomNetworkConfig(Object obj) {
        return (HelpCenterCachingNetworkConfig) g16.c(GuideProviderModule.provideCustomNetworkConfig((HelpCenterCachingInterceptor) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public HelpCenterCachingNetworkConfig get() {
        return provideCustomNetworkConfig(this.helpCenterCachingInterceptorProvider.get());
    }
}
