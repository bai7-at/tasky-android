package com.nytimes.android.ribbon.composable;

import defpackage.r99;
import defpackage.zq3;

/* loaded from: classes4.dex */
final class a implements r99 {
    private final float a;
    private final /* synthetic */ r99 b;

    public a(float f, r99 r99Var) {
        zq3.h(r99Var, "currentConfiguration");
        this.a = f;
        this.b = r99Var;
    }

    @Override // defpackage.r99
    public long a() {
        return this.b.a();
    }

    @Override // defpackage.r99
    public long b() {
        return this.b.b();
    }

    @Override // defpackage.r99
    public long c() {
        return this.b.c();
    }

    @Override // defpackage.r99
    public long d() {
        return this.b.d();
    }

    @Override // defpackage.r99
    public float e() {
        return this.b.e();
    }

    @Override // defpackage.r99
    public float f() {
        return this.a;
    }
}
