package defpackage;

import com.google.firebase.messaging.reporting.MessagingClientEvent;

/* loaded from: classes3.dex */
public final class hs4 {
    private static final hs4 b = new a().a();
    private final MessagingClientEvent a;

    public static final class a {
        private MessagingClientEvent a = null;

        a() {
        }

        public hs4 a() {
            return new hs4(this.a);
        }

        public a b(MessagingClientEvent messagingClientEvent) {
            this.a = messagingClientEvent;
            return this;
        }
    }

    hs4(MessagingClientEvent messagingClientEvent) {
        this.a = messagingClientEvent;
    }

    public static a b() {
        return new a();
    }

    public MessagingClientEvent a() {
        return this.a;
    }

    public byte[] c() {
        return i76.a(this);
    }
}
