package com.google.android.exoplayer2;

import com.google.android.exoplayer2.w1;
import defpackage.cx6;
import defpackage.rh4;
import defpackage.sv5;
import defpackage.y77;

/* loaded from: classes2.dex */
public interface z1 extends w1.b {

    public interface a {
        void a();

        void b();
    }

    default void A(float f, float f2) {
    }

    void B(int i, sv5 sv5Var);

    void D(long j, long j2);

    long E();

    void F(long j);

    rh4 G();

    void a();

    void c();

    boolean d();

    int f();

    boolean g();

    String getName();

    int getState();

    y77 h();

    boolean k();

    void m();

    void o(cx6 cx6Var, t0[] t0VarArr, y77 y77Var, long j, boolean z, boolean z2, long j2, long j3);

    void release();

    void start();

    void stop();

    void t(t0[] t0VarArr, y77 y77Var, long j, long j2);

    void u();

    boolean v();

    a2 x();
}
