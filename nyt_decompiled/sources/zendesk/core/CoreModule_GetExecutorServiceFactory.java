package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class CoreModule_GetExecutorServiceFactory implements ba2 {
    private final CoreModule module;

    public CoreModule_GetExecutorServiceFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetExecutorServiceFactory create(CoreModule coreModule) {
        return new CoreModule_GetExecutorServiceFactory(coreModule);
    }

    public static ExecutorService getExecutorService(CoreModule coreModule) {
        return (ExecutorService) g16.c(coreModule.getExecutorService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ExecutorService get() {
        return getExecutorService(this.module);
    }
}
