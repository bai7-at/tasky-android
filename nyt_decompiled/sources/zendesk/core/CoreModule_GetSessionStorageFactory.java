package zendesk.core;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class CoreModule_GetSessionStorageFactory implements ba2 {
    private final CoreModule module;

    public CoreModule_GetSessionStorageFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetSessionStorageFactory create(CoreModule coreModule) {
        return new CoreModule_GetSessionStorageFactory(coreModule);
    }

    public static SessionStorage getSessionStorage(CoreModule coreModule) {
        return (SessionStorage) g16.c(coreModule.getSessionStorage(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public SessionStorage get() {
        return getSessionStorage(this.module);
    }
}
