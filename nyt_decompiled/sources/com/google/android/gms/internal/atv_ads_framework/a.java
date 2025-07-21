package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes3.dex */
final class a {
    private final Object a;
    private final Object b;
    private final Object c;

    a(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.a + "=" + this.b + " and " + this.a + "=" + this.c);
    }
}
