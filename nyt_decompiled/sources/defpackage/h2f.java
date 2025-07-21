package defpackage;

import com.google.android.gms.internal.ads.ci;
import com.google.android.gms.internal.ads.zzgyl;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class h2f extends AbstractList implements RandomAccess, o1f {
    private final o1f a;

    public h2f(o1f o1fVar) {
        this.a = o1fVar;
    }

    @Override // defpackage.o1f
    public final void W0(zzgyl zzgylVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((ci) this.a).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new g2f(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new f2f(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.o1f
    public final o1f zze() {
        return this;
    }

    @Override // defpackage.o1f
    public final Object zzf(int i) {
        return this.a.zzf(i);
    }

    @Override // defpackage.o1f
    public final List zzh() {
        return this.a.zzh();
    }
}
