package defpackage;

import com.google.android.gms.internal.play_billing.c0;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class ccd extends AbstractList implements RandomAccess, cqb {
    private final cqb a;

    public ccd(cqb cqbVar) {
        this.a = cqbVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((c0) this.a).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new yad(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new u9d(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.cqb
    public final cqb zze() {
        return this;
    }

    @Override // defpackage.cqb
    public final Object zzf(int i) {
        return this.a.zzf(i);
    }

    @Override // defpackage.cqb
    public final List zzh() {
        return this.a.zzh();
    }
}
