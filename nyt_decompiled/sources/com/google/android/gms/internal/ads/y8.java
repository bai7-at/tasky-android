package com.google.android.gms.internal.ads;

import defpackage.ohe;
import defpackage.tge;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class y8 implements Iterator {
    int a;
    int b;
    int c;
    final /* synthetic */ zzfzj d;

    /* synthetic */ y8(zzfzj zzfzjVar, ohe oheVar) {
        int i;
        this.d = zzfzjVar;
        i = zzfzjVar.e;
        this.a = i;
        this.b = zzfzjVar.l();
        this.c = -1;
    }

    private final void c() {
        int i;
        i = this.d.e;
        if (i != this.a) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        Object b = b(i);
        this.b = this.d.m(this.b);
        return b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c();
        tge.j(this.c >= 0, "no calls to next() since the last call to remove()");
        this.a += 32;
        int i = this.c;
        zzfzj zzfzjVar = this.d;
        zzfzjVar.remove(zzfzj.n(zzfzjVar, i));
        this.b--;
        this.c = -1;
    }
}
