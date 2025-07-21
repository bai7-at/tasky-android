package com.google.android.gms.internal.pal;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class j extends l {
    private int a = 0;
    private final int b;
    final /* synthetic */ zzaby c;

    j(zzaby zzabyVar) {
        this.c = zzabyVar;
        this.b = zzabyVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // defpackage.yt9
    public final byte zza() {
        int i = this.a;
        if (i >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = i + 1;
        return this.c.c(i);
    }
}
