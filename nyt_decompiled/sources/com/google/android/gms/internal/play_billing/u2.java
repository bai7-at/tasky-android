package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
final class u2 {
    private final Object a;
    private final Object b;
    private final Object c;

    u2(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.a) + "=" + String.valueOf(this.b) + " and " + String.valueOf(this.a) + "=" + String.valueOf(this.c));
    }
}
