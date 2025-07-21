package zendesk.core;

import defpackage.ba2;
import defpackage.g16;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideExecutorFactory implements ba2 {
    private static final ZendeskApplicationModule_ProvideExecutorFactory INSTANCE = new ZendeskApplicationModule_ProvideExecutorFactory();

    public static ZendeskApplicationModule_ProvideExecutorFactory create() {
        return INSTANCE;
    }

    public static ScheduledExecutorService provideExecutor() {
        return (ScheduledExecutorService) g16.c(ZendeskApplicationModule.provideExecutor(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ScheduledExecutorService get() {
        return provideExecutor();
    }
}
