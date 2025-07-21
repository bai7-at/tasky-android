package zendesk.support;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class SupportApplicationModule_ProvidesZendeskTrackerFactory implements ba2 {
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvidesZendeskTrackerFactory(SupportApplicationModule supportApplicationModule) {
        this.module = supportApplicationModule;
    }

    public static SupportApplicationModule_ProvidesZendeskTrackerFactory create(SupportApplicationModule supportApplicationModule) {
        return new SupportApplicationModule_ProvidesZendeskTrackerFactory(supportApplicationModule);
    }

    public static ZendeskTracker providesZendeskTracker(SupportApplicationModule supportApplicationModule) {
        return (ZendeskTracker) g16.c(supportApplicationModule.providesZendeskTracker(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ZendeskTracker get() {
        return providesZendeskTracker(this.module);
    }
}
