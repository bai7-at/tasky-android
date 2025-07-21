package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class m8 extends k8 implements ListIterator {
    final /* synthetic */ n8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m8(n8 n8Var) {
        super(n8Var);
        this.d = n8Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        boolean isEmpty = this.d.isEmpty();
        b();
        ((ListIterator) this.a).add(obj);
        zzfyt zzfytVar = this.d.f;
        i = zzfytVar.e;
        zzfytVar.e = i + 1;
        if (isEmpty) {
            this.d.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(n8 n8Var, int i) {
        super(n8Var, ((List) n8Var.b).listIterator(i));
        this.d = n8Var;
    }
}
