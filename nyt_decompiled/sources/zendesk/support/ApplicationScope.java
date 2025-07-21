package zendesk.support;

import java.util.Locale;
import zendesk.support.ZendeskTracker;

/* loaded from: classes5.dex */
class ApplicationScope {
    private final Locale locale;
    private final ZendeskTracker zendeskTracker;

    public Locale getLocale() {
        return this.locale;
    }

    public ZendeskTracker getZendeskTracker() {
        return this.zendeskTracker;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    private ApplicationScope(Builder builder) {
        this.locale = builder.locale;
        this.zendeskTracker = builder.zendeskTracker;
    }

    static class Builder {
        private Locale locale;
        private ZendeskTracker zendeskTracker;

        Builder() {
            this.locale = Locale.getDefault();
            this.zendeskTracker = new ZendeskTracker.DefaultTracker();
        }

        ApplicationScope build() {
            return new ApplicationScope(this);
        }

        Builder zendeskTracker(ZendeskTracker zendeskTracker) {
            this.zendeskTracker = zendeskTracker;
            return this;
        }

        Builder(ApplicationScope applicationScope) {
            this.locale = applicationScope.getLocale();
        }
    }
}
