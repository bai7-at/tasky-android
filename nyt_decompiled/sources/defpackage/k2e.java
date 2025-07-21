package defpackage;

import com.google.android.gms.internal.icing.c0;
import com.google.android.gms.internal.icing.zzcf;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class k2e extends AbstractList implements RandomAccess, rlc {
    private final rlc a;

    public k2e(rlc rlcVar) {
        this.a = rlcVar;
    }

    @Override // defpackage.rlc
    public final void G(zzcf zzcfVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((c0) this.a).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new i1e(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new g0e(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.rlc
    public final Object zzg(int i) {
        return this.a.zzg(i);
    }

    @Override // defpackage.rlc
    public final List zzh() {
        return this.a.zzh();
    }

    @Override // defpackage.rlc
    public final rlc zzi() {
        return this;
    }
}
