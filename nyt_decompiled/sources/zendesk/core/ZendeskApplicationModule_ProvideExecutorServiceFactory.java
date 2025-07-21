package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideExecutorServiceFactory implements ba2 {
    private final p76 scheduledExecutorServiceProvider;

    public ZendeskApplicationModule_ProvideExecutorServiceFactory(p76 p76Var) {
        this.scheduledExecutorServiceProvider = p76Var;
    }

    public static ZendeskApplicationModule_ProvideExecutorServiceFactory create(p76 p76Var) {
        return new ZendeskApplicationModule_ProvideExecutorServiceFactory(p76Var);
    }

    public static ExecutorService provideExecutorService(ScheduledExecutorService scheduledExecutorService) {
        return (ExecutorService) g16.c(ZendeskApplicationModule.provideExecutorService(scheduledExecutorService), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ExecutorService get() {
        return provideExecutorService((ScheduledExecutorService) this.scheduledExecutorServiceProvider.get());
    }
}
