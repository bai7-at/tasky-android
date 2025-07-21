package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class yg extends ah {
    private int a = 0;
    private final int b;
    final /* synthetic */ zzgyl c;

    yg(zzgyl zzgylVar) {
        this.c = zzgylVar;
        this.b = zzgylVar.g();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // defpackage.zze
    public final byte zza() {
        int i = this.a;
        if (i >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = i + 1;
        return this.c.e(i);
    }
}
