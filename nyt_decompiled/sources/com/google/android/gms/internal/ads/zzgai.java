package com.google.android.gms.internal.ads;

import defpackage.tge;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
enum zzgai implements Iterator {
    INSTANCE;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        tge.j(false, "no calls to next() since the last call to remove()");
    }
}
