package defpackage;

import defpackage.ds5;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class or5 extends o1 implements ds5.a {
    private mr5 a;
    private wx4 b = new wx4();
    private us8 c;
    private Object d;
    private int e;
    private int f;

    public or5(mr5 mr5Var) {
        this.a = mr5Var;
        this.c = this.a.s();
        this.f = this.a.size();
    }

    @Override // ds5.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public mr5 build() {
        mr5 mr5Var;
        if (this.c == this.a.s()) {
            mr5Var = this.a;
        } else {
            this.b = new wx4();
            mr5Var = new mr5(this.c, size());
        }
        this.a = mr5Var;
        return mr5Var;
    }

    public final int c() {
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        us8 a = us8.e.a();
        zq3.f(a, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.c = a;
        l(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.c.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final us8 d() {
        return this.c;
    }

    public final wx4 f() {
        return this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.c.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.o1
    public Set getEntries() {
        return new qr5(this);
    }

    @Override // defpackage.o1
    public Set getKeys() {
        return new sr5(this);
    }

    @Override // defpackage.o1
    public int getSize() {
        return this.f;
    }

    @Override // defpackage.o1
    public Collection getValues() {
        return new ur5(this);
    }

    public final void h(int i) {
        this.e = i;
    }

    public final void i(Object obj) {
        this.d = obj;
    }

    protected final void j(wx4 wx4Var) {
        this.b = wx4Var;
    }

    public void l(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.d = null;
        this.c = this.c.D(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        mr5 mr5Var = map instanceof mr5 ? (mr5) map : null;
        if (mr5Var == null) {
            or5 or5Var = map instanceof or5 ? (or5) map : null;
            mr5Var = or5Var != null ? or5Var.build() : null;
        }
        if (mr5Var == null) {
            super.putAll(map);
            return;
        }
        em1 em1Var = new em1(0, 1, null);
        int size = size();
        us8 us8Var = this.c;
        us8 s = mr5Var.s();
        zq3.f(s, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.c = us8Var.E(s, 0, em1Var, this);
        int size2 = (mr5Var.size() + size) - em1Var.a();
        if (size != size2) {
            l(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.d = null;
        us8 G = this.c.G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (G == null) {
            G = us8.e.a();
            zq3.f(G, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.c = G;
        return this.d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        us8 H = this.c.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (H == null) {
            H = us8.e.a();
            zq3.f(H, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.c = H;
        return size != size();
    }
}
