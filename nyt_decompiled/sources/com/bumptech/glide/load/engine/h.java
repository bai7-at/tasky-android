package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.m;
import defpackage.b94;
import defpackage.cz6;
import defpackage.da2;
import defpackage.fz6;
import defpackage.ov3;
import defpackage.pp4;
import defpackage.rr1;
import defpackage.sk5;
import defpackage.sr1;
import defpackage.sz5;
import defpackage.tr1;
import defpackage.w03;
import defpackage.z06;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class h implements j, pp4.a, m.a {
    private static final boolean i = Log.isLoggable("Engine", 2);
    private final n a;
    private final l b;
    private final pp4 c;
    private final b d;
    private final s e;
    private final c f;
    private final a g;
    private final com.bumptech.glide.load.engine.a h;

    static class a {
        final DecodeJob.e a;
        final sz5 b = da2.d(150, new C0150a());
        private int c;

        /* renamed from: com.bumptech.glide.load.engine.h$a$a, reason: collision with other inner class name */
        class C0150a implements da2.d {
            C0150a() {
            }

            @Override // da2.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public DecodeJob a() {
                a aVar = a.this;
                return new DecodeJob(aVar.a, aVar.b);
            }
        }

        a(DecodeJob.e eVar) {
            this.a = eVar;
        }

        DecodeJob a(com.bumptech.glide.c cVar, Object obj, k kVar, ov3 ov3Var, int i, int i2, Class cls, Class cls2, Priority priority, tr1 tr1Var, Map map, boolean z, boolean z2, boolean z3, sk5 sk5Var, DecodeJob.b bVar) {
            DecodeJob decodeJob = (DecodeJob) z06.d((DecodeJob) this.b.b());
            int i3 = this.c;
            this.c = i3 + 1;
            return decodeJob.p(cVar, obj, kVar, ov3Var, i, i2, cls, cls2, priority, tr1Var, map, z, z2, z3, sk5Var, bVar, i3);
        }
    }

    static class b {
        final w03 a;
        final w03 b;
        final w03 c;
        final w03 d;
        final j e;
        final m.a f;
        final sz5 g = da2.d(150, new a());

        class a implements da2.d {
            a() {
            }

            @Override // da2.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i a() {
                b bVar = b.this;
                return new i(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        b(w03 w03Var, w03 w03Var2, w03 w03Var3, w03 w03Var4, j jVar, m.a aVar) {
            this.a = w03Var;
            this.b = w03Var2;
            this.c = w03Var3;
            this.d = w03Var4;
            this.e = jVar;
            this.f = aVar;
        }

        i a(ov3 ov3Var, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((i) z06.d((i) this.g.b())).l(ov3Var, z, z2, z3, z4);
        }
    }

    private static class c implements DecodeJob.e {
        private final rr1.a a;
        private volatile rr1 b;

        c(rr1.a aVar) {
            this.a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.e
        public rr1 a() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            this.b = this.a.build();
                        }
                        if (this.b == null) {
                            this.b = new sr1();
                        }
                    } finally {
                    }
                }
            }
            return this.b;
        }
    }

    public class d {
        private final i a;
        private final fz6 b;

        d(fz6 fz6Var, i iVar) {
            this.b = fz6Var;
            this.a = iVar;
        }

        public void a() {
            synchronized (h.this) {
                this.a.r(this.b);
            }
        }
    }

    public h(pp4 pp4Var, rr1.a aVar, w03 w03Var, w03 w03Var2, w03 w03Var3, w03 w03Var4, boolean z) {
        this(pp4Var, aVar, w03Var, w03Var2, w03Var3, w03Var4, null, null, null, null, null, null, z);
    }

    private m e(ov3 ov3Var) {
        cz6 b2 = this.c.b(ov3Var);
        if (b2 == null) {
            return null;
        }
        return b2 instanceof m ? (m) b2 : new m(b2, true, true, ov3Var, this);
    }

    private m g(ov3 ov3Var) {
        m e = this.h.e(ov3Var);
        if (e != null) {
            e.b();
        }
        return e;
    }

    private m h(ov3 ov3Var) {
        m e = e(ov3Var);
        if (e != null) {
            e.b();
            this.h.a(ov3Var, e);
        }
        return e;
    }

    private m i(k kVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        m g = g(kVar);
        if (g != null) {
            if (i) {
                j("Loaded resource from active resources", j, kVar);
            }
            return g;
        }
        m h = h(kVar);
        if (h == null) {
            return null;
        }
        if (i) {
            j("Loaded resource from cache", j, kVar);
        }
        return h;
    }

    private static void j(String str, long j, ov3 ov3Var) {
        Log.v("Engine", str + " in " + b94.a(j) + "ms, key: " + ov3Var);
    }

    private d l(com.bumptech.glide.c cVar, Object obj, ov3 ov3Var, int i2, int i3, Class cls, Class cls2, Priority priority, tr1 tr1Var, Map map, boolean z, boolean z2, sk5 sk5Var, boolean z3, boolean z4, boolean z5, boolean z6, fz6 fz6Var, Executor executor, k kVar, long j) {
        i a2 = this.a.a(kVar, z6);
        if (a2 != null) {
            a2.e(fz6Var, executor);
            if (i) {
                j("Added to existing load", j, kVar);
            }
            return new d(fz6Var, a2);
        }
        i a3 = this.d.a(kVar, z3, z4, z5, z6);
        DecodeJob a4 = this.g.a(cVar, obj, kVar, ov3Var, i2, i3, cls, cls2, priority, tr1Var, map, z, z2, z6, sk5Var, a3);
        this.a.c(kVar, a3);
        a3.e(fz6Var, executor);
        a3.s(a4);
        if (i) {
            j("Started new load", j, kVar);
        }
        return new d(fz6Var, a3);
    }

    @Override // com.bumptech.glide.load.engine.m.a
    public void a(ov3 ov3Var, m mVar) {
        this.h.d(ov3Var);
        if (mVar.f()) {
            this.c.d(ov3Var, mVar);
        } else {
            this.e.a(mVar, false);
        }
    }

    @Override // com.bumptech.glide.load.engine.j
    public synchronized void b(i iVar, ov3 ov3Var) {
        this.a.d(ov3Var, iVar);
    }

    @Override // pp4.a
    public void c(cz6 cz6Var) {
        this.e.a(cz6Var, true);
    }

    @Override // com.bumptech.glide.load.engine.j
    public synchronized void d(i iVar, ov3 ov3Var, m mVar) {
        if (mVar != null) {
            try {
                if (mVar.f()) {
                    this.h.a(ov3Var, mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.d(ov3Var, iVar);
    }

    public d f(com.bumptech.glide.c cVar, Object obj, ov3 ov3Var, int i2, int i3, Class cls, Class cls2, Priority priority, tr1 tr1Var, Map map, boolean z, boolean z2, sk5 sk5Var, boolean z3, boolean z4, boolean z5, boolean z6, fz6 fz6Var, Executor executor) {
        long b2 = i ? b94.b() : 0L;
        k a2 = this.b.a(obj, ov3Var, i2, i3, map, cls, cls2, sk5Var);
        synchronized (this) {
            try {
                m i4 = i(a2, z3, b2);
                if (i4 == null) {
                    return l(cVar, obj, ov3Var, i2, i3, cls, cls2, priority, tr1Var, map, z, z2, sk5Var, z3, z4, z5, z6, fz6Var, executor, a2, b2);
                }
                fz6Var.a(i4, DataSource.MEMORY_CACHE);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(cz6 cz6Var) {
        if (!(cz6Var instanceof m)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((m) cz6Var).g();
    }

    h(pp4 pp4Var, rr1.a aVar, w03 w03Var, w03 w03Var2, w03 w03Var3, w03 w03Var4, n nVar, l lVar, com.bumptech.glide.load.engine.a aVar2, b bVar, a aVar3, s sVar, boolean z) {
        this.c = pp4Var;
        c cVar = new c(aVar);
        this.f = cVar;
        com.bumptech.glide.load.engine.a aVar4 = aVar2 == null ? new com.bumptech.glide.load.engine.a(z) : aVar2;
        this.h = aVar4;
        aVar4.f(this);
        this.b = lVar == null ? new l() : lVar;
        this.a = nVar == null ? new n() : nVar;
        this.d = bVar == null ? new b(w03Var, w03Var2, w03Var3, w03Var4, this, this) : bVar;
        this.g = aVar3 == null ? new a(cVar) : aVar3;
        this.e = sVar == null ? new s() : sVar;
        pp4Var.c(this);
    }
}
