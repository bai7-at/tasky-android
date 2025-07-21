package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import defpackage.ur0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class ur0 extends c1 implements br0 {
    private static final q76 h = new q76() { // from class: qr0
        @Override // defpackage.q76
        public final Object get() {
            return Collections.emptySet();
        }
    };
    private final Map a;
    private final Map b;
    private final Map c;
    private final List d;
    private final i32 e;
    private final AtomicReference f;
    private final fr0 g;

    public static final class b {
        private final Executor a;
        private final List b = new ArrayList();
        private final List c = new ArrayList();
        private fr0 d = fr0.a;

        b(Executor executor) {
            this.a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(nq0 nq0Var) {
            this.c.add(nq0Var);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.b.add(new q76() { // from class: vr0
                @Override // defpackage.q76
                public final Object get() {
                    ComponentRegistrar f;
                    f = ur0.b.f(ComponentRegistrar.this);
                    return f;
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.b.addAll(collection);
            return this;
        }

        public ur0 e() {
            return new ur0(this.a, this.b, this.c, this.d);
        }

        public b g(fr0 fr0Var) {
            this.d = fr0Var;
            return this;
        }
    }

    public static b i(Executor executor) {
        return new b(executor);
    }

    private void j(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((q76) it2.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.g.a(componentRegistrar));
                        it2.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.a.isEmpty()) {
                o51.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.a.keySet());
                arrayList2.addAll(list);
                o51.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final nq0 nq0Var = (nq0) it3.next();
                this.a.put(nq0Var, new d04(new q76() { // from class: rr0
                    @Override // defpackage.q76
                    public final Object get() {
                        Object n;
                        n = ur0.this.n(nq0Var);
                        return n;
                    }
                }));
            }
            arrayList.addAll(s(list));
            arrayList.addAll(t());
            r();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        q();
    }

    private void k(Map map, boolean z) {
        for (Map.Entry entry : map.entrySet()) {
            nq0 nq0Var = (nq0) entry.getKey();
            q76 q76Var = (q76) entry.getValue();
            if (nq0Var.l() || (nq0Var.m() && z)) {
                q76Var.get();
            }
        }
        this.e.d();
    }

    private static List m(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(nq0 nq0Var) {
        return nq0Var.f().a(new w07(nq0Var, this));
    }

    private void q() {
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            k(this.a, bool.booleanValue());
        }
    }

    private void r() {
        for (nq0 nq0Var : this.a.keySet()) {
            for (km1 km1Var : nq0Var.e()) {
                if (km1Var.g() && !this.c.containsKey(km1Var.c())) {
                    this.c.put(km1Var.c(), q14.b(Collections.emptySet()));
                } else if (this.b.containsKey(km1Var.c())) {
                    continue;
                } else {
                    if (km1Var.f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", nq0Var, km1Var.c()));
                    }
                    if (!km1Var.g()) {
                        this.b.put(km1Var.c(), rk5.e());
                    }
                }
            }
        }
    }

    private List s(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            nq0 nq0Var = (nq0) it2.next();
            if (nq0Var.n()) {
                final q76 q76Var = (q76) this.a.get(nq0Var);
                for (Class cls : nq0Var.h()) {
                    if (this.b.containsKey(cls)) {
                        final rk5 rk5Var = (rk5) ((q76) this.b.get(cls));
                        arrayList.add(new Runnable() { // from class: sr0
                            @Override // java.lang.Runnable
                            public final void run() {
                                rk5.this.j(q76Var);
                            }
                        });
                    } else {
                        this.b.put(cls, q76Var);
                    }
                }
            }
        }
        return arrayList;
    }

    private List t() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            nq0 nq0Var = (nq0) entry.getKey();
            if (!nq0Var.n()) {
                q76 q76Var = (q76) entry.getValue();
                for (Class cls : nq0Var.h()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(q76Var);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.c.containsKey(entry2.getKey())) {
                final q14 q14Var = (q14) this.c.get(entry2.getKey());
                for (final q76 q76Var2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: tr0
                        @Override // java.lang.Runnable
                        public final void run() {
                            q14.this.a(q76Var2);
                        }
                    });
                }
            } else {
                this.c.put((Class) entry2.getKey(), q14.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // defpackage.c1, defpackage.uq0
    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // defpackage.uq0
    public synchronized q76 b(Class cls) {
        q14 q14Var = (q14) this.c.get(cls);
        if (q14Var != null) {
            return q14Var;
        }
        return h;
    }

    @Override // defpackage.c1, defpackage.uq0
    public /* bridge */ /* synthetic */ Set c(Class cls) {
        return super.c(cls);
    }

    @Override // defpackage.uq0
    public synchronized q76 d(Class cls) {
        c16.c(cls, "Null interface requested.");
        return (q76) this.b.get(cls);
    }

    @Override // defpackage.uq0
    public gl1 e(Class cls) {
        q76 d = d(cls);
        return d == null ? rk5.e() : d instanceof rk5 ? (rk5) d : rk5.i(d);
    }

    public void l(boolean z) {
        HashMap hashMap;
        if (kz4.a(this.f, null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.a);
            }
            k(hashMap, z);
        }
    }

    private ur0(Executor executor, Iterable iterable, Collection collection, fr0 fr0Var) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.f = new AtomicReference();
        i32 i32Var = new i32(executor);
        this.e = i32Var;
        this.g = fr0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(nq0.q(i32Var, i32.class, xa8.class, h86.class));
        arrayList.add(nq0.q(this, br0.class, new Class[0]));
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            nq0 nq0Var = (nq0) it2.next();
            if (nq0Var != null) {
                arrayList.add(nq0Var);
            }
        }
        this.d = m(iterable);
        j(arrayList);
    }
}
