package com.google.android.gms.internal.icing;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class i extends k {
    private int a = 0;
    private final int b;
    final /* synthetic */ zzcf c;

    i(zzcf zzcfVar) {
        this.c = zzcfVar;
        this.b = zzcfVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // defpackage.rcb
    public final byte zza() {
        int i = this.a;
        if (i >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = i + 1;
        return this.c.c(i);
    }
}
