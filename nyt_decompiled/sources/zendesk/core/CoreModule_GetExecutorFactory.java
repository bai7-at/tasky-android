package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CoreModule_GetExecutorFactory implements ba2 {
    private final CoreModule module;

    public CoreModule_GetExecutorFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetExecutorFactory create(CoreModule coreModule) {
        return new CoreModule_GetExecutorFactory(coreModule);
    }

    public static Executor getExecutor(CoreModule coreModule) {
        return (Executor) g16.c(coreModule.getExecutor(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public Executor get() {
        return getExecutor(this.module);
    }
}
