package zendesk.core;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class CoreModule_GetBlipsProviderFactory implements ba2 {
    private final CoreModule module;

    public CoreModule_GetBlipsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetBlipsProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetBlipsProviderFactory(coreModule);
    }

    public static BlipsProvider getBlipsProvider(CoreModule coreModule) {
        return (BlipsProvider) g16.c(coreModule.getBlipsProvider(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public BlipsProvider get() {
        return getBlipsProvider(this.module);
    }
}
