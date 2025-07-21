package com.google.android.gms.internal.ads;

import defpackage.wad;

/* loaded from: classes3.dex */
public final class co {
    private boolean a;
    public xo b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;

    public co(xo xoVar) {
        this.b = xoVar;
    }

    public final void a(int i) {
        this.a = 1 == ((this.a ? 1 : 0) | i);
        this.c += i;
    }

    public final void b(int i) {
        this.a = true;
        this.f = true;
        this.g = i;
    }

    public final void c(xo xoVar) {
        this.a |= this.b != xoVar;
        this.b = xoVar;
    }

    public final void d(int i) {
        if (this.d && this.e != 5) {
            wad.d(i == 5);
            return;
        }
        this.a = true;
        this.d = true;
        this.e = i;
    }
}
