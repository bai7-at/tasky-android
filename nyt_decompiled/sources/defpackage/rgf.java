package defpackage;

import com.google.android.gms.internal.measurement.m2;
import com.google.android.gms.internal.measurement.zzjb;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class rgf extends AbstractList implements RandomAccess, gcf {
    private final gcf a;

    public rgf(gcf gcfVar) {
        this.a = gcfVar;
    }

    @Override // defpackage.gcf
    public final void X(zzjb zzjbVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((m2) this.a).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ogf(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new ngf(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.gcf
    public final gcf zze() {
        return this;
    }

    @Override // defpackage.gcf
    public final Object zzf(int i) {
        return this.a.zzf(i);
    }

    @Override // defpackage.gcf
    public final List zzh() {
        return this.a.zzh();
    }
}
