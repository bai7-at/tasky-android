package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class u1 extends w1 {
    private int a = 0;
    private final int b;
    final /* synthetic */ zzjb c;

    u1(zzjb zzjbVar) {
        this.c = zzjbVar;
        this.b = zzjbVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // defpackage.k8f
    public final byte zza() {
        int i = this.a;
        if (i >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = i + 1;
        return this.c.c(i);
    }
}
