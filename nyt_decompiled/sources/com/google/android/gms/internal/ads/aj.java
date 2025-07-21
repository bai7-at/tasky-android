package com.google.android.gms.internal.ads;

import defpackage.a2f;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class aj implements Iterator {
    private final ArrayDeque a;
    private zzgyg b;

    /* synthetic */ aj(zzgyl zzgylVar, a2f a2fVar) {
        if (!(zzgylVar instanceof zzhbx)) {
            this.a = null;
            this.b = (zzgyg) zzgylVar;
            return;
        }
        zzhbx zzhbxVar = (zzhbx) zzgylVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzhbxVar.k());
        this.a = arrayDeque;
        arrayDeque.push(zzhbxVar);
        this.b = c(zzhbxVar.zzd);
    }

    private final zzgyg c(zzgyl zzgylVar) {
        while (zzgylVar instanceof zzhbx) {
            zzhbx zzhbxVar = (zzhbx) zzgylVar;
            this.a.push(zzhbxVar);
            zzgylVar = zzhbxVar.zzd;
        }
        return (zzgyg) zzgylVar;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zzgyg next() {
        zzgyg zzgygVar;
        zzgyg zzgygVar2 = this.b;
        if (zzgygVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            zzgygVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgygVar = c(((zzhbx) this.a.pop()).zze);
        } while (zzgygVar.g() == 0);
        this.b = zzgygVar;
        return zzgygVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
