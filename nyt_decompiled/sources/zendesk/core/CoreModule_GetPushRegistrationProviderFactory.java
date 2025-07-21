package zendesk.core;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class CoreModule_GetPushRegistrationProviderFactory implements ba2 {
    private final CoreModule module;

    public CoreModule_GetPushRegistrationProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetPushRegistrationProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetPushRegistrationProviderFactory(coreModule);
    }

    public static PushRegistrationProvider getPushRegistrationProvider(CoreModule coreModule) {
        return (PushRegistrationProvider) g16.c(coreModule.getPushRegistrationProvider(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public PushRegistrationProvider get() {
        return getPushRegistrationProvider(this.module);
    }
}
