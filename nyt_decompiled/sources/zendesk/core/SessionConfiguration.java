package zendesk.core;

import java.util.Locale;

/* loaded from: classes5.dex */
class SessionConfiguration {
    private Identity identity;
    private Locale locale;

    static class Builder {
        private Identity identity;
        private Locale locale;

        public SessionConfiguration build() {
            return new SessionConfiguration(this);
        }

        Builder setIdentity(Identity identity) {
            this.identity = identity;
            return this;
        }

        Builder setLocale(Locale locale) {
            this.locale = locale;
            return this;
        }

        private Builder(SessionConfiguration sessionConfiguration) {
            this.identity = new Identity() { // from class: zendesk.core.SessionConfiguration.Builder.1
            };
            this.locale = Locale.getDefault();
            this.identity = sessionConfiguration.getIdentity();
        }

        Builder() {
            this.identity = new Identity() { // from class: zendesk.core.SessionConfiguration.Builder.1
            };
            this.locale = Locale.getDefault();
        }
    }

    Identity getIdentity() {
        return this.identity;
    }

    Locale getLocale() {
        return this.locale;
    }

    Builder newBuilder() {
        return new Builder();
    }

    private SessionConfiguration(Builder builder) {
        this.identity = builder.identity;
        this.locale = builder.locale;
    }
}
