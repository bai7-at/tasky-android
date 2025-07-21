package com.google.android.gms.measurement.internal;

import java.util.Map;

/* loaded from: classes3.dex */
final class k9 implements z3 {
    final /* synthetic */ String a;
    final /* synthetic */ r9 b;

    k9(r9 r9Var, String str) {
        this.b = r9Var;
        this.a = str;
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.b.k(i, th, bArr, this.a);
    }
}
