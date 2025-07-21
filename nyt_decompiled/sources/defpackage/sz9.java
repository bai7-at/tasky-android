package defpackage;

import com.google.android.gms.internal.pal.g0;
import com.google.android.gms.internal.pal.zzaby;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class sz9 extends AbstractList implements RandomAccess, vw9 {
    private final vw9 a;

    public sz9(vw9 vw9Var) {
        this.a = vw9Var;
    }

    @Override // defpackage.vw9
    public final void c0(zzaby zzabyVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((g0) this.a).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new qz9(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new oz9(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.vw9
    public final vw9 zze() {
        return this;
    }

    @Override // defpackage.vw9
    public final Object zzf(int i) {
        return this.a.zzf(i);
    }

    @Override // defpackage.vw9
    public final List zzh() {
        return this.a.zzh();
    }
}
