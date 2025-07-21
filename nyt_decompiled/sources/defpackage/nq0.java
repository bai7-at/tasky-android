package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class nq0 {
    private final String a;
    private final Set b;
    private final Set c;
    private final int d;
    private final int e;
    private final ar0 f;
    private final Set g;

    public static class b {
        private String a;
        private final Set b;
        private final Set c;
        private int d;
        private int e;
        private ar0 f;
        private Set g;

        /* JADX INFO: Access modifiers changed from: private */
        public b g() {
            this.e = 1;
            return this;
        }

        private b i(int i) {
            c16.d(this.d == 0, "Instantiation type has already been set.");
            this.d = i;
            return this;
        }

        private void j(Class cls) {
            c16.a(!this.b.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(km1 km1Var) {
            c16.c(km1Var, "Null dependency");
            j(km1Var.c());
            this.c.add(km1Var);
            return this;
        }

        public b c() {
            return i(1);
        }

        public nq0 d() {
            c16.d(this.f != null, "Missing required property: factory.");
            return new nq0(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }

        public b e() {
            return i(2);
        }

        public b f(ar0 ar0Var) {
            this.f = (ar0) c16.c(ar0Var, "Null factory");
            return this;
        }

        public b h(String str) {
            this.a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            c16.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class cls2 : clsArr) {
                c16.c(cls2, "Null interface");
            }
            Collections.addAll(this.b, clsArr);
        }
    }

    public static b c(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b d(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static nq0 j(final Object obj, Class cls) {
        return k(cls).f(new ar0() { // from class: lq0
            @Override // defpackage.ar0
            public final Object a(uq0 uq0Var) {
                Object o;
                o = nq0.o(obj, uq0Var);
                return o;
            }
        }).d();
    }

    public static b k(Class cls) {
        return c(cls).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object o(Object obj, uq0 uq0Var) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object p(Object obj, uq0 uq0Var) {
        return obj;
    }

    public static nq0 q(final Object obj, Class cls, Class... clsArr) {
        return d(cls, clsArr).f(new ar0() { // from class: mq0
            @Override // defpackage.ar0
            public final Object a(uq0 uq0Var) {
                Object p;
                p = nq0.p(obj, uq0Var);
                return p;
            }
        }).d();
    }

    public Set e() {
        return this.c;
    }

    public ar0 f() {
        return this.f;
    }

    public String g() {
        return this.a;
    }

    public Set h() {
        return this.b;
    }

    public Set i() {
        return this.g;
    }

    public boolean l() {
        return this.d == 1;
    }

    public boolean m() {
        return this.d == 2;
    }

    public boolean n() {
        return this.e == 0;
    }

    public nq0 r(ar0 ar0Var) {
        return new nq0(this.a, this.b, this.c, this.d, this.e, ar0Var, this.g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    private nq0(String str, Set set, Set set2, int i, int i2, ar0 ar0Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = ar0Var;
        this.g = Collections.unmodifiableSet(set3);
    }
}
