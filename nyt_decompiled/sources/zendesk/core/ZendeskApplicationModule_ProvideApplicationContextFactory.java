package zendesk.core;

import android.content.Context;
import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideApplicationContextFactory implements ba2 {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationContextFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideApplicationContextFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationContextFactory(zendeskApplicationModule);
    }

    public static Context provideApplicationContext(ZendeskApplicationModule zendeskApplicationModule) {
        return (Context) g16.c(zendeskApplicationModule.provideApplicationContext(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public Context get() {
        return provideApplicationContext(this.module);
    }
}
