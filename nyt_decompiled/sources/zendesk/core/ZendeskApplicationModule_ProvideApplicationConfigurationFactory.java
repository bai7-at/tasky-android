package zendesk.core;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideApplicationConfigurationFactory implements ba2 {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationConfigurationFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideApplicationConfigurationFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationConfigurationFactory(zendeskApplicationModule);
    }

    public static ApplicationConfiguration provideApplicationConfiguration(ZendeskApplicationModule zendeskApplicationModule) {
        return (ApplicationConfiguration) g16.c(zendeskApplicationModule.provideApplicationConfiguration(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ApplicationConfiguration get() {
        return provideApplicationConfiguration(this.module);
    }
}
