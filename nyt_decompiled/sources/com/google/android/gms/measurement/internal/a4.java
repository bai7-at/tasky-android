package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.ywd;
import java.util.Map;

/* loaded from: classes3.dex */
final class a4 implements Runnable {
    private final z3 a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map f;

    /* synthetic */ a4(String str, z3 z3Var, int i, Throwable th, byte[] bArr, Map map, ywd ywdVar) {
        Preconditions.checkNotNull(z3Var);
        this.a = z3Var;
        this.b = i;
        this.c = th;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }
}
