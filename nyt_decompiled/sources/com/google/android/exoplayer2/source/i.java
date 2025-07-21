package com.google.android.exoplayer2.source;

import android.content.Context;
import com.google.android.exoplayer2.source.e0;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.c;
import com.google.android.exoplayer2.w0;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import defpackage.a82;
import defpackage.a84;
import defpackage.d82;
import defpackage.e06;
import defpackage.ei7;
import defpackage.fw1;
import defpackage.gc8;
import defpackage.ur;
import defpackage.wb8;
import defpackage.xb8;
import defpackage.y72;
import defpackage.yp8;
import defpackage.z19;
import defpackage.z72;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class i implements q {
    private final a c;
    private a.InterfaceC0194a d;
    private o.a e;
    private com.google.android.exoplayer2.upstream.h f;
    private long g;
    private long h;
    private long i;
    private float j;
    private float k;
    private boolean l;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private final d82 a;
        private final Map b = new HashMap();
        private final Set c = new HashSet();
        private final Map d = new HashMap();
        private a.InterfaceC0194a e;
        private fw1 f;
        private com.google.android.exoplayer2.upstream.h g;

        public a(d82 d82Var) {
            this.a = d82Var;
        }

        private void f() {
            n(0);
            n(1);
            n(2);
            n(3);
            n(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ o.a m(a.InterfaceC0194a interfaceC0194a) {
            return new y.b(interfaceC0194a, this.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private defpackage.gc8 n(int r5) {
            /*
                r4 = this;
                java.util.Map r0 = r4.b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L19
                java.util.Map r4 = r4.b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r4 = r4.get(r5)
                gc8 r4 = (defpackage.gc8) r4
                return r4
            L19:
                com.google.android.exoplayer2.upstream.a$a r0 = r4.e
                java.lang.Object r0 = defpackage.ur.e(r0)
                com.google.android.exoplayer2.upstream.a$a r0 = (com.google.android.exoplayer2.upstream.a.InterfaceC0194a) r0
                java.lang.Class<com.google.android.exoplayer2.source.o$a> r1 = com.google.android.exoplayer2.source.o.a.class
                r2 = 0
                if (r5 == 0) goto L5f
                r3 = 1
                if (r5 == r3) goto L53
                r3 = 2
                if (r5 == r3) goto L46
                r3 = 3
                if (r5 == r3) goto L3a
                r1 = 4
                if (r5 == r1) goto L33
                goto L6b
            L33:
                com.google.android.exoplayer2.source.h r1 = new com.google.android.exoplayer2.source.h     // Catch: java.lang.ClassNotFoundException -> L6b
                r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L6b
            L38:
                r2 = r1
                goto L6b
            L3a:
                java.lang.Class<com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory> r0 = com.google.android.exoplayer2.source.rtsp.RtspMediaSource.Factory.class
                java.lang.Class r0 = r0.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L6b
                com.google.android.exoplayer2.source.g r1 = new com.google.android.exoplayer2.source.g     // Catch: java.lang.ClassNotFoundException -> L6b
                r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L6b
                goto L38
            L46:
                java.lang.Class<com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory> r3 = com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory.class
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L6b
                com.google.android.exoplayer2.source.f r3 = new com.google.android.exoplayer2.source.f     // Catch: java.lang.ClassNotFoundException -> L6b
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L6b
            L51:
                r2 = r3
                goto L6b
            L53:
                java.lang.Class<com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory> r3 = com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource.Factory.class
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L6b
                com.google.android.exoplayer2.source.e r3 = new com.google.android.exoplayer2.source.e     // Catch: java.lang.ClassNotFoundException -> L6b
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L6b
                goto L51
            L5f:
                java.lang.Class<com.google.android.exoplayer2.source.dash.DashMediaSource$Factory> r3 = com.google.android.exoplayer2.source.dash.DashMediaSource.Factory.class
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L6b
                com.google.android.exoplayer2.source.d r3 = new com.google.android.exoplayer2.source.d     // Catch: java.lang.ClassNotFoundException -> L6b
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L6b
                goto L51
            L6b:
                java.util.Map r0 = r4.b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r0.put(r1, r2)
                if (r2 == 0) goto L7f
                java.util.Set r4 = r4.c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4.add(r5)
            L7f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.i.a.n(int):gc8");
        }

        public o.a g(int i) {
            o.a aVar = (o.a) this.d.get(Integer.valueOf(i));
            if (aVar != null) {
                return aVar;
            }
            gc8 n = n(i);
            if (n == null) {
                return null;
            }
            o.a aVar2 = (o.a) n.get();
            fw1 fw1Var = this.f;
            if (fw1Var != null) {
                aVar2.c(fw1Var);
            }
            com.google.android.exoplayer2.upstream.h hVar = this.g;
            if (hVar != null) {
                aVar2.d(hVar);
            }
            this.d.put(Integer.valueOf(i), aVar2);
            return aVar2;
        }

        public int[] h() {
            f();
            return Ints.l(this.c);
        }

        public void o(a.InterfaceC0194a interfaceC0194a) {
            if (interfaceC0194a != this.e) {
                this.e = interfaceC0194a;
                this.b.clear();
                this.d.clear();
            }
        }

        public void p(fw1 fw1Var) {
            this.f = fw1Var;
            Iterator it2 = this.d.values().iterator();
            while (it2.hasNext()) {
                ((o.a) it2.next()).c(fw1Var);
            }
        }

        public void q(com.google.android.exoplayer2.upstream.h hVar) {
            this.g = hVar;
            Iterator it2 = this.d.values().iterator();
            while (it2.hasNext()) {
                ((o.a) it2.next()).d(hVar);
            }
        }
    }

    private static final class b implements y72 {
        private final t0 a;

        public b(t0 t0Var) {
            this.a = t0Var;
        }

        @Override // defpackage.y72
        public void a(long j, long j2) {
        }

        @Override // defpackage.y72
        public void c(a82 a82Var) {
            yp8 a = a82Var.a(0, 3);
            a82Var.p(new ei7.b(-9223372036854775807L));
            a82Var.s();
            a.d(this.a.c().g0("text/x-unknown").K(this.a.l).G());
        }

        @Override // defpackage.y72
        public int d(z72 z72Var, e06 e06Var) {
            return z72Var.a(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // defpackage.y72
        public boolean e(z72 z72Var) {
            return true;
        }

        @Override // defpackage.y72
        public void release() {
        }
    }

    public i(Context context, d82 d82Var) {
        this(new c.a(context), d82Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ o.a f(Class cls) {
        return k(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ o.a g(Class cls, a.InterfaceC0194a interfaceC0194a) {
        return l(cls, interfaceC0194a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y72[] h(t0 t0Var) {
        wb8 wb8Var = wb8.a;
        return new y72[]{wb8Var.b(t0Var) ? new xb8(wb8Var.c(t0Var), t0Var) : new b(t0Var)};
    }

    private static o i(w0 w0Var, o oVar) {
        w0.d dVar = w0Var.f;
        if (dVar.a == 0 && dVar.b == Long.MIN_VALUE && !dVar.d) {
            return oVar;
        }
        long D0 = z19.D0(w0Var.f.a);
        long D02 = z19.D0(w0Var.f.b);
        w0.d dVar2 = w0Var.f;
        return new ClippingMediaSource(oVar, D0, D02, !dVar2.e, dVar2.c, dVar2.d);
    }

    private o j(w0 w0Var, o oVar) {
        ur.e(w0Var.b);
        if (w0Var.b.d == null) {
            return oVar;
        }
        a84.j("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o.a k(Class cls) {
        try {
            return (o.a) cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o.a l(Class cls, a.InterfaceC0194a interfaceC0194a) {
        try {
            return (o.a) cls.getConstructor(a.InterfaceC0194a.class).newInstance(interfaceC0194a);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.source.o.a
    public o a(w0 w0Var) {
        ur.e(w0Var.b);
        String scheme = w0Var.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((o.a) ur.e(this.e)).a(w0Var);
        }
        w0.h hVar = w0Var.b;
        int r0 = z19.r0(hVar.a, hVar.b);
        o.a g = this.c.g(r0);
        ur.j(g, "No suitable media source factory found for content type: " + r0);
        w0.g.a c = w0Var.d.c();
        if (w0Var.d.a == -9223372036854775807L) {
            c.k(this.g);
        }
        if (w0Var.d.d == -3.4028235E38f) {
            c.j(this.j);
        }
        if (w0Var.d.e == -3.4028235E38f) {
            c.h(this.k);
        }
        if (w0Var.d.b == -9223372036854775807L) {
            c.i(this.h);
        }
        if (w0Var.d.c == -9223372036854775807L) {
            c.g(this.i);
        }
        w0.g f = c.f();
        if (!f.equals(w0Var.d)) {
            w0Var = w0Var.c().c(f).a();
        }
        o a2 = g.a(w0Var);
        ImmutableList immutableList = ((w0.h) z19.j(w0Var.b)).g;
        if (!immutableList.isEmpty()) {
            o[] oVarArr = new o[immutableList.size() + 1];
            oVarArr[0] = a2;
            for (int i = 0; i < immutableList.size(); i++) {
                if (this.l) {
                    final t0 G = new t0.b().g0(((w0.k) immutableList.get(i)).b).X(((w0.k) immutableList.get(i)).c).i0(((w0.k) immutableList.get(i)).d).e0(((w0.k) immutableList.get(i)).e).W(((w0.k) immutableList.get(i)).f).U(((w0.k) immutableList.get(i)).g).G();
                    y.b bVar = new y.b(this.d, new d82() { // from class: li1
                        @Override // defpackage.d82
                        public final y72[] c() {
                            y72[] h;
                            h = i.h(t0.this);
                            return h;
                        }
                    });
                    com.google.android.exoplayer2.upstream.h hVar2 = this.f;
                    if (hVar2 != null) {
                        bVar.d(hVar2);
                    }
                    oVarArr[i + 1] = bVar.a(w0.f(((w0.k) immutableList.get(i)).a.toString()));
                } else {
                    e0.b bVar2 = new e0.b(this.d);
                    com.google.android.exoplayer2.upstream.h hVar3 = this.f;
                    if (hVar3 != null) {
                        bVar2.b(hVar3);
                    }
                    oVarArr[i + 1] = bVar2.a((w0.k) immutableList.get(i), -9223372036854775807L);
                }
            }
            a2 = new MergingMediaSource(oVarArr);
        }
        return j(w0Var, i(w0Var, a2));
    }

    @Override // com.google.android.exoplayer2.source.o.a
    public int[] b() {
        return this.c.h();
    }

    @Override // com.google.android.exoplayer2.source.o.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public i c(fw1 fw1Var) {
        this.c.p((fw1) ur.f(fw1Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // com.google.android.exoplayer2.source.o.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public i d(com.google.android.exoplayer2.upstream.h hVar) {
        this.f = (com.google.android.exoplayer2.upstream.h) ur.f(hVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c.q(hVar);
        return this;
    }

    public i(a.InterfaceC0194a interfaceC0194a, d82 d82Var) {
        this.d = interfaceC0194a;
        a aVar = new a(d82Var);
        this.c = aVar;
        aVar.o(interfaceC0194a);
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.j = -3.4028235E38f;
        this.k = -3.4028235E38f;
    }
}
