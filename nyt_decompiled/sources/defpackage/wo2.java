package defpackage;

import android.app.Notification;

/* loaded from: classes.dex */
public final class wo2 {
    private final int a;
    private final int b;
    private final Notification c;

    public wo2(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public Notification b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wo2.class != obj.getClass()) {
            return false;
        }
        wo2 wo2Var = (wo2) obj;
        if (this.a == wo2Var.a && this.b == wo2Var.b) {
            return this.c.equals(wo2Var.c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
