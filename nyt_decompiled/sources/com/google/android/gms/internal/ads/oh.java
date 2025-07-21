package com.google.android.gms.internal.ads;

import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
final class oh {
    private final Object a;
    private final int b;

    oh(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oh)) {
            return false;
        }
        oh ohVar = (oh) obj;
        return this.a == ohVar.a && this.b == ohVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
    }
}
