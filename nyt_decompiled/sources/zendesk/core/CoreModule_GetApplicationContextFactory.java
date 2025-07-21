package zendesk.core;

import android.content.Context;
import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class CoreModule_GetApplicationContextFactory implements ba2 {
    private final CoreModule module;

    public CoreModule_GetApplicationContextFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetApplicationContextFactory create(CoreModule coreModule) {
        return new CoreModule_GetApplicationContextFactory(coreModule);
    }

    public static Context getApplicationContext(CoreModule coreModule) {
        return (Context) g16.c(coreModule.getApplicationContext(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public Context get() {
        return getApplicationContext(this.module);
    }
}
