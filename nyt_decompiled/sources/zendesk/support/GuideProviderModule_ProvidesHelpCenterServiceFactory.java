package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import zendesk.core.RestServiceProvider;

/* loaded from: classes5.dex */
public final class GuideProviderModule_ProvidesHelpCenterServiceFactory implements ba2 {
    private final p76 helpCenterCachingNetworkConfigProvider;
    private final p76 restServiceProvider;

    public GuideProviderModule_ProvidesHelpCenterServiceFactory(p76 p76Var, p76 p76Var2) {
        this.restServiceProvider = p76Var;
        this.helpCenterCachingNetworkConfigProvider = p76Var2;
    }

    public static GuideProviderModule_ProvidesHelpCenterServiceFactory create(p76 p76Var, p76 p76Var2) {
        return new GuideProviderModule_ProvidesHelpCenterServiceFactory(p76Var, p76Var2);
    }

    public static HelpCenterService providesHelpCenterService(RestServiceProvider restServiceProvider, Object obj) {
        return (HelpCenterService) g16.c(GuideProviderModule.providesHelpCenterService(restServiceProvider, (HelpCenterCachingNetworkConfig) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public HelpCenterService get() {
        return providesHelpCenterService((RestServiceProvider) this.restServiceProvider.get(), this.helpCenterCachingNetworkConfigProvider.get());
    }
}
