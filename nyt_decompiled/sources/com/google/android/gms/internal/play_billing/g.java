package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class g extends i {
    private int a = 0;
    private final int b;
    final /* synthetic */ zzba c;

    g(zzba zzbaVar) {
        this.c = zzbaVar;
        this.b = zzbaVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // defpackage.wea
    public final byte zza() {
        int i = this.a;
        if (i >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = i + 1;
        return this.c.c(i);
    }
}
