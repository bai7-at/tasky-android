package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import zendesk.core.ZendeskLocaleConverter;

/* loaded from: classes5.dex */
public final class GuideProviderModule_ProvideZendeskHelpCenterServiceFactory implements ba2 {
    private final p76 helpCenterServiceProvider;
    private final p76 localeConverterProvider;

    public GuideProviderModule_ProvideZendeskHelpCenterServiceFactory(p76 p76Var, p76 p76Var2) {
        this.helpCenterServiceProvider = p76Var;
        this.localeConverterProvider = p76Var2;
    }

    public static GuideProviderModule_ProvideZendeskHelpCenterServiceFactory create(p76 p76Var, p76 p76Var2) {
        return new GuideProviderModule_ProvideZendeskHelpCenterServiceFactory(p76Var, p76Var2);
    }

    public static ZendeskHelpCenterService provideZendeskHelpCenterService(Object obj, ZendeskLocaleConverter zendeskLocaleConverter) {
        return (ZendeskHelpCenterService) g16.c(GuideProviderModule.provideZendeskHelpCenterService((HelpCenterService) obj, zendeskLocaleConverter), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskHelpCenterService get() {
        return provideZendeskHelpCenterService(this.helpCenterServiceProvider.get(), (ZendeskLocaleConverter) this.localeConverterProvider.get());
    }
}
