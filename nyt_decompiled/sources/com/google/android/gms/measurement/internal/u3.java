package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
public final class u3 {
    private final int a;
    private final boolean b;
    private final boolean c;
    final /* synthetic */ x3 d;

    u3(x3 x3Var, int i, boolean z, boolean z2) {
        this.d = x3Var;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final void a(String str) {
        this.d.E(this.a, this.b, this.c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.d.E(this.a, this.b, this.c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.d.E(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.d.E(this.a, this.b, this.c, str, obj, obj2, obj3);
    }
}
