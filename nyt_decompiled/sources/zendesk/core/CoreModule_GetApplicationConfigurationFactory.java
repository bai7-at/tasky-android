package zendesk.core;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class CoreModule_GetApplicationConfigurationFactory implements ba2 {
    private final CoreModule module;

    public CoreModule_GetApplicationConfigurationFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetApplicationConfigurationFactory create(CoreModule coreModule) {
        return new CoreModule_GetApplicationConfigurationFactory(coreModule);
    }

    public static ApplicationConfiguration getApplicationConfiguration(CoreModule coreModule) {
        return (ApplicationConfiguration) g16.c(coreModule.getApplicationConfiguration(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ApplicationConfiguration get() {
        return getApplicationConfiguration(this.module);
    }
}
