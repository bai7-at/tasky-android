package zendesk.core;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class CoreModule_GetAuthenticationProviderFactory implements ba2 {
    private final CoreModule module;

    public CoreModule_GetAuthenticationProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetAuthenticationProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetAuthenticationProviderFactory(coreModule);
    }

    public static AuthenticationProvider getAuthenticationProvider(CoreModule coreModule) {
        return (AuthenticationProvider) g16.c(coreModule.getAuthenticationProvider(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public AuthenticationProvider get() {
        return getAuthenticationProvider(this.module);
    }
}
