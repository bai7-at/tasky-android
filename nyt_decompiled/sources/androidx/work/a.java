package androidx.work;

import defpackage.c75;
import defpackage.el1;
import defpackage.fj1;
import defpackage.he8;
import defpackage.i47;
import defpackage.ip8;
import defpackage.iu0;
import defpackage.lv0;
import defpackage.sk9;
import defpackage.yk3;
import defpackage.zl0;
import defpackage.zq3;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;

/* loaded from: classes.dex */
public final class a {
    public static final b u = new b(null);
    private final Executor a;
    private final CoroutineContext b;
    private final Executor c;
    private final zl0 d;
    private final sk9 e;
    private final yk3 f;
    private final i47 g;
    private final lv0 h;
    private final lv0 i;
    private final lv0 j;
    private final lv0 k;
    private final String l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final boolean r;
    private final boolean s;
    private final ip8 t;

    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public static final class C0120a {
        private Executor a;
        private CoroutineContext b;
        private sk9 c;
        private yk3 d;
        private Executor e;
        private zl0 f;
        private i47 g;
        private lv0 h;
        private lv0 i;
        private lv0 j;
        private lv0 k;
        private String l;
        private int n;
        private ip8 s;
        private int m = 4;
        private int o = Integer.MAX_VALUE;
        private int p = 20;
        private int q = 8;
        private boolean r = true;

        public final a a() {
            return new a(this);
        }

        public final zl0 b() {
            return this.f;
        }

        public final int c() {
            return this.q;
        }

        public final String d() {
            return this.l;
        }

        public final Executor e() {
            return this.a;
        }

        public final lv0 f() {
            return this.h;
        }

        public final yk3 g() {
            return this.d;
        }

        public final int h() {
            return this.m;
        }

        public final boolean i() {
            return this.r;
        }

        public final int j() {
            return this.o;
        }

        public final int k() {
            return this.p;
        }

        public final int l() {
            return this.n;
        }

        public final i47 m() {
            return this.g;
        }

        public final lv0 n() {
            return this.i;
        }

        public final Executor o() {
            return this.e;
        }

        public final ip8 p() {
            return this.s;
        }

        public final CoroutineContext q() {
            return this.b;
        }

        public final lv0 r() {
            return this.k;
        }

        public final sk9 s() {
            return this.c;
        }

        public final lv0 t() {
            return this.j;
        }

        public final C0120a u(sk9 sk9Var) {
            zq3.h(sk9Var, "workerFactory");
            this.c = sk9Var;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public a(C0120a c0120a) {
        zq3.h(c0120a, "builder");
        CoroutineContext q = c0120a.q();
        Executor e = c0120a.e();
        if (e == null) {
            e = q != null ? iu0.d(q) : null;
            if (e == null) {
                e = iu0.e(false);
            }
        }
        this.a = e;
        this.b = q == null ? c0120a.e() != null ? ExecutorsKt.from(e) : Dispatchers.getDefault() : q;
        this.r = c0120a.o() == null;
        Executor o = c0120a.o();
        this.c = o == null ? iu0.e(true) : o;
        zl0 b2 = c0120a.b();
        this.d = b2 == null ? new he8() : b2;
        sk9 s = c0120a.s();
        this.e = s == null ? el1.a : s;
        yk3 g = c0120a.g();
        this.f = g == null ? c75.a : g;
        i47 m = c0120a.m();
        this.g = m == null ? new fj1() : m;
        this.m = c0120a.h();
        this.n = c0120a.l();
        this.o = c0120a.j();
        this.q = c0120a.k();
        this.h = c0120a.f();
        this.i = c0120a.n();
        this.j = c0120a.t();
        this.k = c0120a.r();
        this.l = c0120a.d();
        this.p = c0120a.c();
        this.s = c0120a.i();
        ip8 p = c0120a.p();
        this.t = p == null ? iu0.f() : p;
    }

    public final zl0 a() {
        return this.d;
    }

    public final int b() {
        return this.p;
    }

    public final String c() {
        return this.l;
    }

    public final Executor d() {
        return this.a;
    }

    public final lv0 e() {
        return this.h;
    }

    public final yk3 f() {
        return this.f;
    }

    public final int g() {
        return this.o;
    }

    public final int h() {
        return this.q;
    }

    public final int i() {
        return this.n;
    }

    public final int j() {
        return this.m;
    }

    public final i47 k() {
        return this.g;
    }

    public final lv0 l() {
        return this.i;
    }

    public final Executor m() {
        return this.c;
    }

    public final ip8 n() {
        return this.t;
    }

    public final CoroutineContext o() {
        return this.b;
    }

    public final lv0 p() {
        return this.k;
    }

    public final sk9 q() {
        return this.e;
    }

    public final lv0 r() {
        return this.j;
    }

    public final boolean s() {
        return this.s;
    }
}
