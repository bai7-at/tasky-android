package androidx.compose.runtime.snapshots;

import defpackage.cv3;
import defpackage.ds5;
import defpackage.v72;
import defpackage.vw7;
import defpackage.ww8;
import defpackage.y08;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class k implements y08, Map, cv3 {
    private q a = new a(v72.a());
    private final Set b = new g(this);
    private final Set c = new h(this);
    private final Collection d = new j(this);

    public static final class a extends q {
        private ds5 c;
        private int d;

        public a(ds5 ds5Var) {
            this.c = ds5Var;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public void c(q qVar) {
            Object obj;
            zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            a aVar = (a) qVar;
            obj = vw7.a;
            synchronized (obj) {
                this.c = aVar.c;
                this.d = aVar.d;
                ww8 ww8Var = ww8.a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.q
        public q d() {
            return new a(this.c);
        }

        public final ds5 i() {
            return this.c;
        }

        public final int j() {
            return this.d;
        }

        public final void k(ds5 ds5Var) {
            this.c = ds5Var;
        }

        public final void l(int i) {
            this.d = i;
        }
    }

    public Set a() {
        return this.b;
    }

    public Set c() {
        return this.c;
    }

    @Override // java.util.Map
    public void clear() {
        e d;
        Object obj;
        q o = o();
        zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) SnapshotKt.F((a) o);
        aVar.i();
        ds5 a2 = v72.a();
        if (a2 != aVar.i()) {
            q o2 = o();
            zq3.f(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) o2;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                a aVar3 = (a) SnapshotKt.h0(aVar2, this, d);
                obj = vw7.a;
                synchronized (obj) {
                    aVar3.k(a2);
                    aVar3.l(aVar3.j() + 1);
                }
            }
            SnapshotKt.Q(d, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return f().i().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return f().i().containsValue(obj);
    }

    public final int d() {
        return f().j();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    public final a f() {
        q o = o();
        zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) SnapshotKt.X((a) o, this);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return f().i().get(obj);
    }

    public int h() {
        return f().i().size();
    }

    public Collection i() {
        return this.d;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return f().i().isEmpty();
    }

    public final boolean j(Object obj) {
        Object obj2;
        Iterator it2 = entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (zq3.c(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return c();
    }

    public final Map l() {
        return f().i();
    }

    @Override // defpackage.y08
    public void n(q qVar) {
        zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.a = (a) qVar;
    }

    @Override // defpackage.y08
    public q o() {
        return this.a;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        Object obj3;
        ds5 i;
        int j;
        Object put;
        e d;
        Object obj4;
        boolean z;
        do {
            obj3 = vw7.a;
            synchronized (obj3) {
                q o = o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) SnapshotKt.F((a) o);
                i = aVar.i();
                j = aVar.j();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i);
            ds5.a o2 = i.o();
            put = o2.put(obj, obj2);
            ds5 build = o2.build();
            if (zq3.c(build, i)) {
                break;
            }
            q o3 = o();
            zq3.f(o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) o3;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                a aVar3 = (a) SnapshotKt.h0(aVar2, this, d);
                obj4 = vw7.a;
                synchronized (obj4) {
                    if (aVar3.j() == j) {
                        aVar3.k(build);
                        z = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.Q(d, this);
        } while (!z);
        return put;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        Object obj;
        ds5 i;
        int j;
        e d;
        Object obj2;
        boolean z;
        do {
            obj = vw7.a;
            synchronized (obj) {
                q o = o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) SnapshotKt.F((a) o);
                i = aVar.i();
                j = aVar.j();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i);
            ds5.a o2 = i.o();
            o2.putAll(map);
            ds5 build = o2.build();
            if (zq3.c(build, i)) {
                return;
            }
            q o3 = o();
            zq3.f(o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) o3;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                a aVar3 = (a) SnapshotKt.h0(aVar2, this, d);
                obj2 = vw7.a;
                synchronized (obj2) {
                    if (aVar3.j() == j) {
                        aVar3.k(build);
                        z = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.Q(d, this);
        } while (!z);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        Object obj2;
        ds5 i;
        int j;
        Object remove;
        e d;
        Object obj3;
        boolean z;
        do {
            obj2 = vw7.a;
            synchronized (obj2) {
                q o = o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) SnapshotKt.F((a) o);
                i = aVar.i();
                j = aVar.j();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i);
            ds5.a o2 = i.o();
            remove = o2.remove(obj);
            ds5 build = o2.build();
            if (zq3.c(build, i)) {
                break;
            }
            q o3 = o();
            zq3.f(o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) o3;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                a aVar3 = (a) SnapshotKt.h0(aVar2, this, d);
                obj3 = vw7.a;
                synchronized (obj3) {
                    if (aVar3.j() == j) {
                        aVar3.k(build);
                        z = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.Q(d, this);
        } while (!z);
        return remove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return h();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return i();
    }
}
