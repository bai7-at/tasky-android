package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class CoreModule_GetScheduledExecutorServiceFactory implements ba2 {
    private final CoreModule module;

    public CoreModule_GetScheduledExecutorServiceFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetScheduledExecutorServiceFactory create(CoreModule coreModule) {
        return new CoreModule_GetScheduledExecutorServiceFactory(coreModule);
    }

    public static ScheduledExecutorService getScheduledExecutorService(CoreModule coreModule) {
        return (ScheduledExecutorService) g16.c(coreModule.getScheduledExecutorService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ScheduledExecutorService get() {
        return getScheduledExecutorService(this.module);
    }
}
