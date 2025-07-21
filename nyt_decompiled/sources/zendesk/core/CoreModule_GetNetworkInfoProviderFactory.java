package zendesk.core;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class CoreModule_GetNetworkInfoProviderFactory implements ba2 {
    private final CoreModule module;

    public CoreModule_GetNetworkInfoProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetNetworkInfoProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetNetworkInfoProviderFactory(coreModule);
    }

    public static NetworkInfoProvider getNetworkInfoProvider(CoreModule coreModule) {
        return (NetworkInfoProvider) g16.c(coreModule.getNetworkInfoProvider(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public NetworkInfoProvider get() {
        return getNetworkInfoProvider(this.module);
    }
}
