package com.google.android.gms.internal.pal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class c9 implements Iterator {
    d9 a;
    d9 b = null;
    int c;
    final /* synthetic */ zzzr d;

    c9(zzzr zzzrVar) {
        this.d = zzzrVar;
        this.a = zzzrVar.zze.d;
        this.c = zzzrVar.zzd;
    }

    final d9 b() {
        d9 d9Var = this.a;
        zzzr zzzrVar = this.d;
        if (d9Var == zzzrVar.zze) {
            throw new NoSuchElementException();
        }
        if (zzzrVar.zzd != this.c) {
            throw new ConcurrentModificationException();
        }
        this.a = d9Var.d;
        this.b = d9Var;
        return d9Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.zze;
    }

    @Override // java.util.Iterator
    public final void remove() {
        d9 d9Var = this.b;
        if (d9Var == null) {
            throw new IllegalStateException();
        }
        this.d.h(d9Var, true);
        this.b = null;
        this.c = this.d.zzd;
    }
}
