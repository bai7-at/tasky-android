package defpackage;

import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
final class baf {
    private final Object a;
    private final int b;

    baf(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof baf)) {
            return false;
        }
        baf bafVar = (baf) obj;
        return this.a == bafVar.a && this.b == bafVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
    }
}
