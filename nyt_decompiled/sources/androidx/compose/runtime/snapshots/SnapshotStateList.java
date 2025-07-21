package androidx.compose.runtime.snapshots;

import defpackage.bv3;
import defpackage.cs5;
import defpackage.ln0;
import defpackage.ss2;
import defpackage.uw7;
import defpackage.v72;
import defpackage.ww8;
import defpackage.y08;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class SnapshotStateList implements y08, List, RandomAccess, bv3 {
    private q a = new a(v72.b());

    public static final class a extends q {
        private cs5 c;
        private int d;
        private int e;

        public a(cs5 cs5Var) {
            this.c = cs5Var;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public void c(q qVar) {
            Object obj;
            obj = uw7.a;
            synchronized (obj) {
                zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.c = ((a) qVar).c;
                this.d = ((a) qVar).d;
                this.e = ((a) qVar).e;
                ww8 ww8Var = ww8.a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.q
        public q d() {
            return new a(this.c);
        }

        public final cs5 i() {
            return this.c;
        }

        public final int j() {
            return this.d;
        }

        public final int k() {
            return this.e;
        }

        public final void l(cs5 cs5Var) {
            this.c = cs5Var;
        }

        public final void m(int i) {
            this.d = i;
        }

        public final void n(int i) {
            this.e = i;
        }
    }

    private final boolean g(ss2 ss2Var) {
        Object obj;
        int j;
        cs5 i;
        Object invoke;
        e d;
        Object obj2;
        boolean z;
        do {
            obj = uw7.a;
            synchronized (obj) {
                q o = o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.F((a) o);
                j = aVar.j();
                i = aVar.i();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i);
            cs5.a b = i.b();
            invoke = ss2Var.invoke(b);
            cs5 build = b.build();
            if (zq3.c(build, i)) {
                break;
            }
            q o2 = o();
            zq3.f(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) o2;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                a aVar3 = (a) SnapshotKt.h0(aVar2, this, d);
                obj2 = uw7.a;
                synchronized (obj2) {
                    if (aVar3.j() == j) {
                        aVar3.l(build);
                        z = true;
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.Q(d, this);
        } while (!z);
        return ((Boolean) invoke).booleanValue();
    }

    public final a a() {
        q o = o();
        zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) SnapshotKt.X((a) o, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        Object obj2;
        int j;
        cs5 i;
        boolean z;
        e d;
        Object obj3;
        do {
            obj2 = uw7.a;
            synchronized (obj2) {
                q o = o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.F((a) o);
                j = aVar.j();
                i = aVar.i();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i);
            cs5 add = i.add(obj);
            z = false;
            if (zq3.c(add, i)) {
                return false;
            }
            q o2 = o();
            zq3.f(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) o2;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                a aVar3 = (a) SnapshotKt.h0(aVar2, this, d);
                obj3 = uw7.a;
                synchronized (obj3) {
                    if (aVar3.j() == j) {
                        aVar3.l(add);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.Q(d, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int i, final Collection collection) {
        return g(new ss2() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList$addAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(List list) {
                return Boolean.valueOf(list.addAll(i, collection));
            }
        });
    }

    public int c() {
        return a().i().size();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        e d;
        Object obj;
        q o = o();
        zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        a aVar = (a) o;
        SnapshotKt.J();
        synchronized (SnapshotKt.I()) {
            d = e.e.d();
            a aVar2 = (a) SnapshotKt.h0(aVar, this, d);
            obj = uw7.a;
            synchronized (obj) {
                aVar2.l(v72.b());
                aVar2.m(aVar2.j() + 1);
                aVar2.n(aVar2.k() + 1);
            }
        }
        SnapshotKt.Q(d, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return a().i().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return a().i().containsAll(collection);
    }

    public final int f() {
        q o = o();
        zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) SnapshotKt.F((a) o)).k();
    }

    @Override // java.util.List
    public Object get(int i) {
        return a().i().get(i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return a().i().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return a().i().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    public Object j(int i) {
        Object obj;
        int j;
        cs5 i2;
        e d;
        Object obj2;
        boolean z;
        Object obj3 = get(i);
        do {
            obj = uw7.a;
            synchronized (obj) {
                q o = o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.F((a) o);
                j = aVar.j();
                i2 = aVar.i();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i2);
            cs5 P = i2.P(i);
            if (zq3.c(P, i2)) {
                break;
            }
            q o2 = o();
            zq3.f(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) o2;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                a aVar3 = (a) SnapshotKt.h0(aVar2, this, d);
                obj2 = uw7.a;
                synchronized (obj2) {
                    if (aVar3.j() == j) {
                        aVar3.l(P);
                        z = true;
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.Q(d, this);
        } while (!z);
        return obj3;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return a().i().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new l(this, 0);
    }

    @Override // defpackage.y08
    public void n(q qVar) {
        qVar.g(o());
        zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.a = (a) qVar;
    }

    @Override // defpackage.y08
    public q o() {
        return this.a;
    }

    public final void p(int i, int i2) {
        Object obj;
        int j;
        cs5 i3;
        e d;
        Object obj2;
        boolean z;
        do {
            obj = uw7.a;
            synchronized (obj) {
                q o = o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.F((a) o);
                j = aVar.j();
                i3 = aVar.i();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i3);
            cs5.a b = i3.b();
            b.subList(i, i2).clear();
            cs5 build = b.build();
            if (zq3.c(build, i3)) {
                return;
            }
            q o2 = o();
            zq3.f(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) o2;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                a aVar3 = (a) SnapshotKt.h0(aVar2, this, d);
                obj2 = uw7.a;
                synchronized (obj2) {
                    if (aVar3.j() == j) {
                        aVar3.l(build);
                        z = true;
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.Q(d, this);
        } while (!z);
    }

    public final int q(Collection collection, int i, int i2) {
        Object obj;
        int j;
        cs5 i3;
        e d;
        Object obj2;
        boolean z;
        int size = size();
        do {
            obj = uw7.a;
            synchronized (obj) {
                q o = o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.F((a) o);
                j = aVar.j();
                i3 = aVar.i();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i3);
            cs5.a b = i3.b();
            b.subList(i, i2).retainAll(collection);
            cs5 build = b.build();
            if (zq3.c(build, i3)) {
                break;
            }
            q o2 = o();
            zq3.f(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) o2;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                a aVar3 = (a) SnapshotKt.h0(aVar2, this, d);
                obj2 = uw7.a;
                synchronized (obj2) {
                    if (aVar3.j() == j) {
                        aVar3.l(build);
                        z = true;
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.Q(d, this);
        } while (!z);
        return size - size();
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return j(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        Object obj;
        int j;
        cs5 i;
        boolean z;
        e d;
        Object obj2;
        do {
            obj = uw7.a;
            synchronized (obj) {
                q o = o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.F((a) o);
                j = aVar.j();
                i = aVar.i();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i);
            cs5 removeAll = i.removeAll(collection);
            z = false;
            if (zq3.c(removeAll, i)) {
                return false;
            }
            q o2 = o();
            zq3.f(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) o2;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                a aVar3 = (a) SnapshotKt.h0(aVar2, this, d);
                obj2 = uw7.a;
                synchronized (obj2) {
                    if (aVar3.j() == j) {
                        aVar3.l(removeAll);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.Q(d, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(final Collection collection) {
        return g(new ss2() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList$retainAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(List list) {
                return Boolean.valueOf(list.retainAll(collection));
            }
        });
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        Object obj2;
        int j;
        cs5 i2;
        e d;
        Object obj3;
        boolean z;
        Object obj4 = get(i);
        do {
            obj2 = uw7.a;
            synchronized (obj2) {
                q o = o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.F((a) o);
                j = aVar.j();
                i2 = aVar.i();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i2);
            cs5 cs5Var = i2.set(i, obj);
            if (zq3.c(cs5Var, i2)) {
                break;
            }
            q o2 = o();
            zq3.f(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) o2;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                a aVar3 = (a) SnapshotKt.h0(aVar2, this, d);
                obj3 = uw7.a;
                synchronized (obj3) {
                    if (aVar3.j() == j) {
                        aVar3.l(cs5Var);
                        z = true;
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.Q(d, this);
        } while (!z);
        return obj4;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            throw new IllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        return new r(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return ln0.a(this);
    }

    public final List u() {
        return a().i();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        Object obj;
        int j;
        cs5 i;
        boolean z;
        e d;
        Object obj2;
        do {
            obj = uw7.a;
            synchronized (obj) {
                q o = o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.F((a) o);
                j = aVar.j();
                i = aVar.i();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i);
            cs5 addAll = i.addAll(collection);
            z = false;
            if (zq3.c(addAll, i)) {
                return false;
            }
            q o2 = o();
            zq3.f(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) o2;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                a aVar3 = (a) SnapshotKt.h0(aVar2, this, d);
                obj2 = uw7.a;
                synchronized (obj2) {
                    if (aVar3.j() == j) {
                        aVar3.l(addAll);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.Q(d, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new l(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        Object obj2;
        int j;
        cs5 i;
        boolean z;
        e d;
        Object obj3;
        do {
            obj2 = uw7.a;
            synchronized (obj2) {
                q o = o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.F((a) o);
                j = aVar.j();
                i = aVar.i();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i);
            cs5 remove = i.remove(obj);
            z = false;
            if (zq3.c(remove, i)) {
                return false;
            }
            q o2 = o();
            zq3.f(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) o2;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                a aVar3 = (a) SnapshotKt.h0(aVar2, this, d);
                obj3 = uw7.a;
                synchronized (obj3) {
                    if (aVar3.j() == j) {
                        aVar3.l(remove);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.Q(d, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return ln0.b(this, objArr);
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        Object obj2;
        int j;
        cs5 i2;
        e d;
        Object obj3;
        boolean z;
        do {
            obj2 = uw7.a;
            synchronized (obj2) {
                q o = o();
                zq3.f(o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.F((a) o);
                j = aVar.j();
                i2 = aVar.i();
                ww8 ww8Var = ww8.a;
            }
            zq3.e(i2);
            cs5 add = i2.add(i, obj);
            if (zq3.c(add, i2)) {
                return;
            }
            q o2 = o();
            zq3.f(o2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) o2;
            SnapshotKt.J();
            synchronized (SnapshotKt.I()) {
                d = e.e.d();
                a aVar3 = (a) SnapshotKt.h0(aVar2, this, d);
                obj3 = uw7.a;
                synchronized (obj3) {
                    if (aVar3.j() == j) {
                        aVar3.l(add);
                        z = true;
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.Q(d, this);
        } while (!z);
    }
}
