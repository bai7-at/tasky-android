package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.k;
import defpackage.ds5;
import defpackage.du8;
import defpackage.ku8;
import defpackage.uo6;
import defpackage.vw7;
import defpackage.ww8;
import defpackage.zh3;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;

/* loaded from: classes.dex */
final class g extends i {
    public g(k kVar) {
        super(kVar);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) f((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) g(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (ku8.o(obj)) {
            return j((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            if (!contains((Map.Entry) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public Void f(Map.Entry entry) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    public Void g(Collection collection) {
        vw7.b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new m(a(), ((zh3) a().f().i().entrySet()).iterator());
    }

    public boolean j(Map.Entry entry) {
        return zq3.c(a().get(entry.getKey()), entry.getValue());
    }

    public boolean n(Map.Entry entry) {
        return a().remove(entry.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (ku8.o(obj)) {
            return n((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it2 = collection.iterator();
        while (true) {
            boolean z = false;
            while (it2.hasNext()) {
                if (a().remove(((Map.Entry) it2.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        Object obj;
        ds5 i;
        int j;
        boolean z;
        e d;
        Object obj2;
        Collection<Map.Entry> collection2 = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(kotlin.collections.t.e(kotlin.collections.i.w(collection2, 10)), 16));
        for (Map.Entry entry : collection2) {
            Pair a = du8.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a.c(), a.d());
        }
        k a2 = a();
        boolean z2 = false;
        do {
            obj = vw7.a;
            synchronized (obj) {
                q o = a2.o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                k.a aVar = (k.a) SnapshotKt.F((k.a) o);
                i = aVar.i();
                j = aVar.j();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i);
            ds5.a o2 = i.o();
            Iterator it2 = a2.entrySet().iterator();
            while (true) {
                z = true;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it2.next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !zq3.c(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    o2.remove(entry2.getKey());
                    z2 = true;
                }
            }
            ww8 ww8Var2 = ww8.a;
            ds5 build = o2.build();
            if (zq3.c(build, i)) {
                break;
            }
            q o3 = a2.o();
            zq3.f(o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            k.a aVar2 = (k.a) o3;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                k.a aVar3 = (k.a) SnapshotKt.h0(aVar2, a2, d);
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
            SnapshotKt.Q(d, a2);
        } while (!z);
        return z2;
    }
}
