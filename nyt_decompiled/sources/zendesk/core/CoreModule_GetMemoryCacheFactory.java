package zendesk.core;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class CoreModule_GetMemoryCacheFactory implements ba2 {
    private final CoreModule module;

    public CoreModule_GetMemoryCacheFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetMemoryCacheFactory create(CoreModule coreModule) {
        return new CoreModule_GetMemoryCacheFactory(coreModule);
    }

    public static MemoryCache getMemoryCache(CoreModule coreModule) {
        return (MemoryCache) g16.c(coreModule.getMemoryCache(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public MemoryCache get() {
        return getMemoryCache(this.module);
    }
}
