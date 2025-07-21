package zendesk.support;

import android.content.Context;
import java.util.Locale;

/* loaded from: classes5.dex */
class SupportApplicationModule {
    private ApplicationScope applicationScope;

    SupportApplicationModule(ApplicationScope applicationScope) {
        this.applicationScope = applicationScope;
    }

    Locale provideLocale() {
        return this.applicationScope.getLocale();
    }

    SupportSdkMetadata provideMetadata(Context context) {
        return new SupportSdkMetadata(context);
    }

    ZendeskTracker providesZendeskTracker() {
        return this.applicationScope.getZendeskTracker();
    }
}
