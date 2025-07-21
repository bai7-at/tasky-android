package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.k;
import defpackage.ds5;
import defpackage.vw7;
import defpackage.ww8;
import defpackage.zh3;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
final class j extends i {
    public j(k kVar) {
        super(kVar);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) f(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) g(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return a().containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            if (!a().containsValue(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public Void f(Object obj) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    public Void g(Collection collection) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public p iterator() {
        return new p(a(), ((zh3) a().f().i().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return a().j(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Object obj;
        ds5 i;
        int j;
        boolean z;
        e d;
        Object obj2;
        Set c1 = kotlin.collections.i.c1(collection);
        k a = a();
        boolean z2 = false;
        do {
            obj = vw7.a;
            synchronized (obj) {
                q o = a.o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                k.a aVar = (k.a) SnapshotKt.F((k.a) o);
                i = aVar.i();
                j = aVar.j();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i);
            ds5.a o2 = i.o();
            Iterator it2 = a.entrySet().iterator();
            while (true) {
                z = true;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (c1.contains(entry.getValue())) {
                    o2.remove(entry.getKey());
                    z2 = true;
                }
            }
            ww8 ww8Var2 = ww8.a;
            ds5 build = o2.build();
            if (zq3.c(build, i)) {
                break;
            }
            q o3 = a.o();
            zq3.f(o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            k.a aVar2 = (k.a) o3;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                k.a aVar3 = (k.a) SnapshotKt.h0(aVar2, a, d);
                obj2 = vw7.a;
                synchronized (obj2) {
                    if (aVar3.j() == j) {
                        aVar3.k(build);
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.Q(d, a);
        } while (!z);
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        Object obj;
        ds5 i;
        int j;
        boolean z;
        e d;
        Object obj2;
        Set c1 = kotlin.collections.i.c1(collection);
        k a = a();
        boolean z2 = false;
        do {
            obj = vw7.a;
            synchronized (obj) {
                q o = a.o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                k.a aVar = (k.a) SnapshotKt.F((k.a) o);
                i = aVar.i();
                j = aVar.j();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i);
            ds5.a o2 = i.o();
            Iterator it2 = a.entrySet().iterator();
            while (true) {
                z = true;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (!c1.contains(entry.getValue())) {
                    o2.remove(entry.getKey());
                    z2 = true;
                }
            }
            ww8 ww8Var2 = ww8.a;
            ds5 build = o2.build();
            if (zq3.c(build, i)) {
                break;
            }
            q o3 = a.o();
            zq3.f(o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            k.a aVar2 = (k.a) o3;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                k.a aVar3 = (k.a) SnapshotKt.h0(aVar2, a, d);
                obj2 = vw7.a;
                synchronized (obj2) {
                    if (aVar3.j() == j) {
                        aVar3.k(build);
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.Q(d, a);
        } while (!z);
        return z2;
    }
}
