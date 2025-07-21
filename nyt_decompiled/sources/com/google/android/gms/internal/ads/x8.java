package com.google.android.gms.internal.ads;

import defpackage.mge;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class x8 extends AbstractSet {
    final /* synthetic */ zzfzj a;

    x8(zzfzj zzfzjVar) {
        this.a = zzfzjVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int E;
        Map t = this.a.t();
        if (t != null) {
            return t.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            E = this.a.E(entry.getKey());
            if (E != -1 && mge.a(zzfzj.r(this.a, E), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfzj zzfzjVar = this.a;
        Map t = zzfzjVar.t();
        return t != null ? t.entrySet().iterator() : new v8(zzfzjVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int D;
        int[] a;
        Object[] c;
        Object[] d;
        int i;
        Map t = this.a.t();
        if (t != null) {
            return t.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfzj zzfzjVar = this.a;
        if (zzfzjVar.z()) {
            return false;
        }
        D = zzfzjVar.D();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzfzj zzfzjVar2 = this.a;
        Object q = zzfzj.q(zzfzjVar2);
        a = zzfzjVar2.a();
        c = zzfzjVar2.c();
        d = zzfzjVar2.d();
        int b = c9.b(key, value, D, q, a, c, d);
        if (b == -1) {
            return false;
        }
        this.a.y(b, D);
        zzfzj zzfzjVar3 = this.a;
        i = zzfzjVar3.f;
        zzfzjVar3.f = i - 1;
        this.a.w();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
