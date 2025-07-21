package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.e;
import com.bumptech.glide.load.engine.g;
import defpackage.b18;
import defpackage.b94;
import defpackage.cz6;
import defpackage.da2;
import defpackage.k91;
import defpackage.mk5;
import defpackage.ov3;
import defpackage.rj3;
import defpackage.rr1;
import defpackage.sk5;
import defpackage.sz5;
import defpackage.t91;
import defpackage.tr1;
import defpackage.wz6;
import defpackage.xq8;
import defpackage.y03;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class DecodeJob implements e.a, Runnable, Comparable, da2.f {
    private Object B;
    private Thread H;
    private ov3 L;
    private ov3 M;
    private Object N;
    private DataSource Q;
    private k91 S;
    private volatile com.bumptech.glide.load.engine.e X;
    private volatile boolean Y;
    private volatile boolean Z;
    private final e d;
    private final sz5 e;
    private com.bumptech.glide.c h;
    private ov3 i;
    private Priority j;
    private k k;
    private int l;
    private int m;
    private tr1 n;
    private sk5 r;
    private b s;
    private int t;
    private Stage u;
    private RunReason w;
    private long x;
    private boolean y;
    private final com.bumptech.glide.load.engine.f a = new com.bumptech.glide.load.engine.f();
    private final List b = new ArrayList();
    private final b18 c = b18.a();
    private final d f = new d();
    private final f g = new f();

    private enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    private enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    interface b {
        void a(cz6 cz6Var, DataSource dataSource);

        void c(GlideException glideException);

        void d(DecodeJob decodeJob);
    }

    private final class c implements g.a {
        private final DataSource a;

        c(DataSource dataSource) {
            this.a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.g.a
        public cz6 a(cz6 cz6Var) {
            return DecodeJob.this.y(this.a, cz6Var);
        }
    }

    private static class d {
        private ov3 a;
        private wz6 b;
        private p c;

        d() {
        }

        void a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        void b(e eVar, sk5 sk5Var) {
            y03.a("DecodeJob.encode");
            try {
                eVar.a().b(this.a, new com.bumptech.glide.load.engine.d(this.b, this.c, sk5Var));
            } finally {
                this.c.h();
                y03.d();
            }
        }

        boolean c() {
            return this.c != null;
        }

        void d(ov3 ov3Var, wz6 wz6Var, p pVar) {
            this.a = ov3Var;
            this.b = wz6Var;
            this.c = pVar;
        }
    }

    interface e {
        rr1 a();
    }

    private static class f {
        private boolean a;
        private boolean b;
        private boolean c;

        f() {
        }

        private boolean a(boolean z) {
            return (this.c || z || this.b) && this.a;
        }

        synchronized boolean b() {
            this.b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.c = true;
            return a(false);
        }

        synchronized boolean d(boolean z) {
            this.a = true;
            return a(z);
        }

        synchronized void e() {
            this.b = false;
            this.a = false;
            this.c = false;
        }
    }

    DecodeJob(e eVar, sz5 sz5Var) {
        this.d = eVar;
        this.e = sz5Var;
    }

    private void A() {
        this.g.e();
        this.f.a();
        this.a.a();
        this.Y = false;
        this.h = null;
        this.i = null;
        this.r = null;
        this.j = null;
        this.k = null;
        this.s = null;
        this.u = null;
        this.X = null;
        this.H = null;
        this.L = null;
        this.N = null;
        this.Q = null;
        this.S = null;
        this.x = 0L;
        this.Z = false;
        this.B = null;
        this.b.clear();
        this.e.a(this);
    }

    private void B() {
        this.H = Thread.currentThread();
        this.x = b94.b();
        boolean z = false;
        while (!this.Z && this.X != null && !(z = this.X.b())) {
            this.u = l(this.u);
            this.X = k();
            if (this.u == Stage.SOURCE) {
                c();
                return;
            }
        }
        if ((this.u == Stage.FINISHED || this.Z) && !z) {
            v();
        }
    }

    private cz6 C(Object obj, DataSource dataSource, o oVar) {
        sk5 n = n(dataSource);
        t91 l = this.h.g().l(obj);
        try {
            return oVar.a(l, n, this.l, this.m, new c(dataSource));
        } finally {
            l.b();
        }
    }

    private void D() {
        int i = a.a[this.w.ordinal()];
        if (i == 1) {
            this.u = l(Stage.INITIALIZE);
            this.X = k();
            B();
        } else if (i == 2) {
            B();
        } else {
            if (i == 3) {
                j();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.w);
        }
    }

    private void E() {
        Throwable th;
        this.c.c();
        if (!this.Y) {
            this.Y = true;
            return;
        }
        if (this.b.isEmpty()) {
            th = null;
        } else {
            List list = this.b;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    private cz6 g(k91 k91Var, Object obj, DataSource dataSource) {
        if (obj == null) {
            k91Var.b();
            return null;
        }
        try {
            long b2 = b94.b();
            cz6 i = i(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                q("Decoded result " + i, b2);
            }
            return i;
        } finally {
            k91Var.b();
        }
    }

    private cz6 i(Object obj, DataSource dataSource) {
        return C(obj, dataSource, this.a.h(obj.getClass()));
    }

    private void j() {
        cz6 cz6Var;
        if (Log.isLoggable("DecodeJob", 2)) {
            s("Retrieved data", this.x, "data: " + this.N + ", cache key: " + this.L + ", fetcher: " + this.S);
        }
        try {
            cz6Var = g(this.S, this.N, this.Q);
        } catch (GlideException e2) {
            e2.i(this.M, this.Q);
            this.b.add(e2);
            cz6Var = null;
        }
        if (cz6Var != null) {
            u(cz6Var, this.Q);
        } else {
            B();
        }
    }

    private com.bumptech.glide.load.engine.e k() {
        int i = a.b[this.u.ordinal()];
        if (i == 1) {
            return new q(this.a, this);
        }
        if (i == 2) {
            return new com.bumptech.glide.load.engine.b(this.a, this);
        }
        if (i == 3) {
            return new t(this.a, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.u);
    }

    private Stage l(Stage stage) {
        int i = a.b[stage.ordinal()];
        if (i == 1) {
            return this.n.a() ? Stage.DATA_CACHE : l(Stage.DATA_CACHE);
        }
        if (i == 2) {
            return this.y ? Stage.FINISHED : Stage.SOURCE;
        }
        if (i == 3 || i == 4) {
            return Stage.FINISHED;
        }
        if (i == 5) {
            return this.n.b() ? Stage.RESOURCE_CACHE : l(Stage.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    private sk5 n(DataSource dataSource) {
        sk5 sk5Var = this.r;
        boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.a.w();
        mk5 mk5Var = com.bumptech.glide.load.resource.bitmap.a.j;
        Boolean bool = (Boolean) sk5Var.c(mk5Var);
        if (bool != null && (!bool.booleanValue() || z)) {
            return sk5Var;
        }
        sk5 sk5Var2 = new sk5();
        sk5Var2.d(this.r);
        sk5Var2.e(mk5Var, Boolean.valueOf(z));
        return sk5Var2;
    }

    private int o() {
        return this.j.ordinal();
    }

    private void q(String str, long j) {
        s(str, j, null);
    }

    private void s(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(b94.a(j));
        sb.append(", load key: ");
        sb.append(this.k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    private void t(cz6 cz6Var, DataSource dataSource) {
        E();
        this.s.a(cz6Var, dataSource);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u(cz6 cz6Var, DataSource dataSource) {
        p pVar;
        if (cz6Var instanceof rj3) {
            ((rj3) cz6Var).b();
        }
        if (this.f.c()) {
            cz6Var = p.f(cz6Var);
            pVar = cz6Var;
        } else {
            pVar = 0;
        }
        t(cz6Var, dataSource);
        this.u = Stage.ENCODE;
        try {
            if (this.f.c()) {
                this.f.b(this.d, this.r);
            }
            w();
        } finally {
            if (pVar != 0) {
                pVar.h();
            }
        }
    }

    private void v() {
        E();
        this.s.c(new GlideException("Failed to load resource", new ArrayList(this.b)));
        x();
    }

    private void w() {
        if (this.g.b()) {
            A();
        }
    }

    private void x() {
        if (this.g.c()) {
            A();
        }
    }

    boolean F() {
        Stage l = l(Stage.INITIALIZE);
        return l == Stage.RESOURCE_CACHE || l == Stage.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.e.a
    public void a(ov3 ov3Var, Exception exc, k91 k91Var, DataSource dataSource) {
        k91Var.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.j(ov3Var, dataSource, k91Var.a());
        this.b.add(glideException);
        if (Thread.currentThread() == this.H) {
            B();
        } else {
            this.w = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.s.d(this);
        }
    }

    @Override // da2.f
    public b18 b() {
        return this.c;
    }

    @Override // com.bumptech.glide.load.engine.e.a
    public void c() {
        this.w = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.s.d(this);
    }

    @Override // com.bumptech.glide.load.engine.e.a
    public void d(ov3 ov3Var, Object obj, k91 k91Var, DataSource dataSource, ov3 ov3Var2) {
        this.L = ov3Var;
        this.N = obj;
        this.S = k91Var;
        this.Q = dataSource;
        this.M = ov3Var2;
        if (Thread.currentThread() != this.H) {
            this.w = RunReason.DECODE_DATA;
            this.s.d(this);
        } else {
            y03.a("DecodeJob.decodeFromRetrievedData");
            try {
                j();
            } finally {
                y03.d();
            }
        }
    }

    public void e() {
        this.Z = true;
        com.bumptech.glide.load.engine.e eVar = this.X;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(DecodeJob decodeJob) {
        int o = o() - decodeJob.o();
        return o == 0 ? this.t - decodeJob.t : o;
    }

    DecodeJob p(com.bumptech.glide.c cVar, Object obj, k kVar, ov3 ov3Var, int i, int i2, Class cls, Class cls2, Priority priority, tr1 tr1Var, Map map, boolean z, boolean z2, boolean z3, sk5 sk5Var, b bVar, int i3) {
        this.a.u(cVar, obj, ov3Var, i, i2, tr1Var, cls, cls2, priority, sk5Var, map, z, z2, this.d);
        this.h = cVar;
        this.i = ov3Var;
        this.j = priority;
        this.k = kVar;
        this.l = i;
        this.m = i2;
        this.n = tr1Var;
        this.y = z3;
        this.r = sk5Var;
        this.s = bVar;
        this.t = i3;
        this.w = RunReason.INITIALIZE;
        this.B = obj;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        y03.b("DecodeJob#run(model=%s)", this.B);
        k91 k91Var = this.S;
        try {
            try {
                try {
                    if (this.Z) {
                        v();
                        if (k91Var != null) {
                            k91Var.b();
                        }
                        y03.d();
                        return;
                    }
                    D();
                    if (k91Var != null) {
                        k91Var.b();
                    }
                    y03.d();
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.Z + ", stage: " + this.u, th);
                    }
                    if (this.u != Stage.ENCODE) {
                        this.b.add(th);
                        v();
                    }
                    if (!this.Z) {
                        throw th;
                    }
                    throw th;
                }
            } catch (CallbackException e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            if (k91Var != null) {
                k91Var.b();
            }
            y03.d();
            throw th2;
        }
    }

    cz6 y(DataSource dataSource, cz6 cz6Var) {
        cz6 cz6Var2;
        xq8 xq8Var;
        EncodeStrategy encodeStrategy;
        ov3 cVar;
        Class<?> cls = cz6Var.get().getClass();
        wz6 wz6Var = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            xq8 r = this.a.r(cls);
            xq8Var = r;
            cz6Var2 = r.a(this.h, cz6Var, this.l, this.m);
        } else {
            cz6Var2 = cz6Var;
            xq8Var = null;
        }
        if (!cz6Var.equals(cz6Var2)) {
            cz6Var.c();
        }
        if (this.a.v(cz6Var2)) {
            wz6Var = this.a.n(cz6Var2);
            encodeStrategy = wz6Var.a(this.r);
        } else {
            encodeStrategy = EncodeStrategy.NONE;
        }
        wz6 wz6Var2 = wz6Var;
        if (!this.n.d(!this.a.x(this.L), dataSource, encodeStrategy)) {
            return cz6Var2;
        }
        if (wz6Var2 == null) {
            throw new Registry.NoResultEncoderAvailableException(cz6Var2.get().getClass());
        }
        int i = a.c[encodeStrategy.ordinal()];
        if (i == 1) {
            cVar = new com.bumptech.glide.load.engine.c(this.L, this.i);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
            }
            cVar = new r(this.a.b(), this.L, this.i, this.l, this.m, xq8Var, cls, this.r);
        }
        p f2 = p.f(cz6Var2);
        this.f.d(cVar, wz6Var2, f2);
        return f2;
    }

    void z(boolean z) {
        if (this.g.d(z)) {
            A();
        }
    }
}
