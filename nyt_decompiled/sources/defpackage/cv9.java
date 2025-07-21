package defpackage;

import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
final class cv9 {
    private final Object a;
    private final int b;

    cv9(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cv9)) {
            return false;
        }
        cv9 cv9Var = (cv9) obj;
        return this.a == cv9Var.a && this.b == cv9Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
    }
}
