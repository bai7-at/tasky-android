package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class dd4 implements to {
    private final s33 a = new s33();
    private final b b = new b();
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final int e;
    private int f;

    private static final class a implements nz5 {
        private final b a;
        int b;
        private Class c;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.nz5
        public void a() {
            this.a.c(this);
        }

        void b(int i, Class cls) {
            this.b = i;
            this.c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            int i = this.b * 31;
            Class cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    private static final class b extends o50 {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.o50
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i, Class cls) {
            a aVar = (a) b();
            aVar.b(i, cls);
            return aVar;
        }
    }

    public dd4(int i) {
        this.e = i;
    }

    private void d(int i, Class cls) {
        NavigableMap k = k(cls);
        Integer num = (Integer) k.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                k.remove(Integer.valueOf(i));
                return;
            } else {
                k.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    private void e() {
        f(this.e);
    }

    private void f(int i) {
        while (this.f > i) {
            Object f = this.a.f();
            z06.d(f);
            wn g = g(f);
            this.f -= g.r(f) * g.q();
            d(g.r(f), f.getClass());
            if (Log.isLoggable(g.p(), 2)) {
                Log.v(g.p(), "evicted: " + g.r(f));
            }
        }
    }

    private wn g(Object obj) {
        return h(obj.getClass());
    }

    private wn h(Class cls) {
        wn wnVar = (wn) this.d.get(cls);
        if (wnVar == null) {
            if (cls.equals(int[].class)) {
                wnVar = new nn3();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                wnVar = new ye0();
            }
            this.d.put(cls, wnVar);
        }
        return wnVar;
    }

    private Object i(a aVar) {
        return this.a.a(aVar);
    }

    private Object j(a aVar, Class cls) {
        wn h = h(cls);
        Object i = i(aVar);
        if (i != null) {
            this.f -= h.r(i) * h.q();
            d(h.r(i), cls);
        }
        if (i != null) {
            return i;
        }
        if (Log.isLoggable(h.p(), 2)) {
            Log.v(h.p(), "Allocated " + aVar.b + " bytes");
        }
        return h.newArray(aVar.b);
    }

    private NavigableMap k(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }

    private boolean l() {
        int i = this.f;
        return i == 0 || this.e / i >= 2;
    }

    private boolean m(int i) {
        return i <= this.e / 2;
    }

    private boolean n(int i, Integer num) {
        return num != null && (l() || num.intValue() <= i * 8);
    }

    @Override // defpackage.to
    public synchronized void a(int i) {
        try {
            if (i >= 40) {
                clearMemory();
            } else if (i >= 20 || i == 15) {
                f(this.e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.to
    public synchronized Object b(int i, Class cls) {
        Integer num;
        try {
            num = (Integer) k(cls).ceilingKey(Integer.valueOf(i));
        } catch (Throwable th) {
            throw th;
        }
        return j(n(i, num) ? this.b.e(num.intValue(), cls) : this.b.e(i, cls), cls);
    }

    @Override // defpackage.to
    public synchronized Object c(int i, Class cls) {
        return j(this.b.e(i, cls), cls);
    }

    @Override // defpackage.to
    public synchronized void clearMemory() {
        f(0);
    }

    @Override // defpackage.to
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        wn h = h(cls);
        int r = h.r(obj);
        int q = h.q() * r;
        if (m(q)) {
            a e = this.b.e(r, cls);
            this.a.d(e, obj);
            NavigableMap k = k(cls);
            Integer num = (Integer) k.get(Integer.valueOf(e.b));
            Integer valueOf = Integer.valueOf(e.b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            k.put(valueOf, Integer.valueOf(i));
            this.f += q;
            e();
        }
    }
}
