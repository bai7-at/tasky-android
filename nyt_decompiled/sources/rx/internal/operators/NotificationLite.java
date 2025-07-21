package rx.internal.operators;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class NotificationLite {
    private static final NotificationLite a = new NotificationLite();
    private static final Object b = new Serializable() { // from class: rx.internal.operators.NotificationLite.1
        private static final long serialVersionUID = 1;

        public String toString() {
            return "Notification=>Completed";
        }
    };
    private static final Object c = new Serializable() { // from class: rx.internal.operators.NotificationLite.2
        private static final long serialVersionUID = 2;

        public String toString() {
            return "Notification=>NULL";
        }
    };

    private NotificationLite() {
    }

    public static NotificationLite b() {
        return a;
    }

    public Object a(Object obj) {
        if (obj == c) {
            return null;
        }
        return obj;
    }

    public Object c(Object obj) {
        return obj == null ? c : obj;
    }
}
