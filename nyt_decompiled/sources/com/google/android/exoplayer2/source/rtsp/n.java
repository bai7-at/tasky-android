package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.b;
import com.google.android.exoplayer2.source.rtsp.d;
import com.google.android.exoplayer2.source.rtsp.j;
import com.google.android.exoplayer2.source.rtsp.n;
import com.google.android.exoplayer2.source.rtsp.s;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import defpackage.a82;
import defpackage.ei7;
import defpackage.ep2;
import defpackage.fi7;
import defpackage.ob;
import defpackage.q72;
import defpackage.up8;
import defpackage.ur;
import defpackage.wp8;
import defpackage.y77;
import defpackage.yp8;
import defpackage.z19;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;

/* loaded from: classes2.dex */
final class n implements com.google.android.exoplayer2.source.n {
    private boolean B;
    private final ob a;
    private final Handler b = z19.w();
    private final b c;
    private final j d;
    private final List e;
    private final List f;
    private final c g;
    private final b.a h;
    private n.a i;
    private ImmutableList j;
    private IOException k;
    private RtspMediaSource.RtspPlaybackException l;
    private long m;
    private long n;
    private long r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean w;
    private boolean x;
    private int y;

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements a82, Loader.b, b0.d, j.f, j.e {
        private b() {
        }

        @Override // defpackage.a82
        public yp8 a(int i, int i2) {
            return ((e) ur.e((e) n.this.e.get(i))).c;
        }

        @Override // com.google.android.exoplayer2.source.rtsp.j.f
        public void b(String str, Throwable th) {
            n.this.k = th == null ? new IOException(str) : new IOException(str, th);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.j.e
        public void c(RtspMediaSource.RtspPlaybackException rtspPlaybackException) {
            if (!(rtspPlaybackException instanceof RtspMediaSource.RtspUdpUnsupportedTransportException) || n.this.B) {
                n.this.l = rtspPlaybackException;
            } else {
                n.this.X();
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.j.e
        public void d() {
            n.this.d.G1(n.this.n != -9223372036854775807L ? z19.h1(n.this.n) : n.this.r != -9223372036854775807L ? z19.h1(n.this.r) : 0L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.source.rtsp.j.e
        public void f(long j, ImmutableList immutableList) {
            ArrayList arrayList = new ArrayList(immutableList.size());
            for (int i = 0; i < immutableList.size(); i++) {
                arrayList.add((String) ur.e(((b0) immutableList.get(i)).c.getPath()));
            }
            for (int i2 = 0; i2 < n.this.f.size(); i2++) {
                if (!arrayList.contains(((d) n.this.f.get(i2)).c().getPath())) {
                    n.this.g.a();
                    if (n.this.S()) {
                        n.this.t = true;
                        n.this.n = -9223372036854775807L;
                        n.this.m = -9223372036854775807L;
                        n.this.r = -9223372036854775807L;
                    }
                }
            }
            for (int i3 = 0; i3 < immutableList.size(); i3++) {
                b0 b0Var = (b0) immutableList.get(i3);
                com.google.android.exoplayer2.source.rtsp.d Q = n.this.Q(b0Var.c);
                if (Q != null) {
                    Q.h(b0Var.a);
                    Q.g(b0Var.b);
                    if (n.this.S() && n.this.n == n.this.m) {
                        Q.f(j, b0Var.a);
                    }
                }
            }
            if (!n.this.S()) {
                if (n.this.r == -9223372036854775807L || !n.this.B) {
                    return;
                }
                n nVar = n.this;
                nVar.l(nVar.r);
                n.this.r = -9223372036854775807L;
                return;
            }
            if (n.this.n == n.this.m) {
                n.this.n = -9223372036854775807L;
                n.this.m = -9223372036854775807L;
            } else {
                n.this.n = -9223372036854775807L;
                n nVar2 = n.this;
                nVar2.l(nVar2.m);
            }
        }

        @Override // com.google.android.exoplayer2.source.b0.d
        public void g(t0 t0Var) {
            Handler handler = n.this.b;
            final n nVar = n.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.p
                @Override // java.lang.Runnable
                public final void run() {
                    n.D(n.this);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.source.rtsp.j.f
        public void h(z zVar, ImmutableList immutableList) {
            for (int i = 0; i < immutableList.size(); i++) {
                r rVar = (r) immutableList.get(i);
                n nVar = n.this;
                e eVar = nVar.new e(rVar, i, nVar.h);
                n.this.e.add(eVar);
                eVar.k();
            }
            n.this.g.b(zVar);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(com.google.android.exoplayer2.source.rtsp.d dVar, long j, long j2, boolean z) {
        }

        @Override // defpackage.a82
        public void p(ei7 ei7Var) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void k(com.google.android.exoplayer2.source.rtsp.d dVar, long j, long j2) {
            if (n.this.h() == 0) {
                if (n.this.B) {
                    return;
                }
                n.this.X();
                return;
            }
            int i = 0;
            while (true) {
                if (i >= n.this.e.size()) {
                    break;
                }
                e eVar = (e) n.this.e.get(i);
                if (eVar.a.b == dVar) {
                    eVar.c();
                    break;
                }
                i++;
            }
            n.this.d.F1();
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public Loader.c o(com.google.android.exoplayer2.source.rtsp.d dVar, long j, long j2, IOException iOException, int i) {
            if (!n.this.w) {
                n.this.k = iOException;
            } else if (!(iOException.getCause() instanceof BindException)) {
                n.this.l = new RtspMediaSource.RtspPlaybackException(dVar.b.b.toString(), iOException);
            } else if (n.e(n.this) < 3) {
                return Loader.d;
            }
            return Loader.f;
        }

        @Override // defpackage.a82
        public void s() {
            Handler handler = n.this.b;
            final n nVar = n.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.o
                @Override // java.lang.Runnable
                public final void run() {
                    n.D(n.this);
                }
            });
        }
    }

    interface c {
        void a();

        void b(z zVar);
    }

    final class d {
        public final r a;
        private final com.google.android.exoplayer2.source.rtsp.d b;
        private String c;

        public d(r rVar, int i, b.a aVar) {
            this.a = rVar;
            this.b = new com.google.android.exoplayer2.source.rtsp.d(i, rVar, new d.a() { // from class: com.google.android.exoplayer2.source.rtsp.q
                @Override // com.google.android.exoplayer2.source.rtsp.d.a
                public final void a(String str, b bVar) {
                    n.d.this.f(str, bVar);
                }
            }, n.this.c, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(String str, com.google.android.exoplayer2.source.rtsp.b bVar) {
            this.c = str;
            s.b m = bVar.m();
            if (m != null) {
                n.this.d.A1(bVar.d(), m);
                n.this.B = true;
            }
            n.this.U();
        }

        public Uri c() {
            return this.b.b.b;
        }

        public String d() {
            ur.i(this.c);
            return this.c;
        }

        public boolean e() {
            return this.c != null;
        }
    }

    private final class e {
        public final d a;
        private final Loader b;
        private final com.google.android.exoplayer2.source.b0 c;
        private boolean d;
        private boolean e;

        public e(r rVar, int i, b.a aVar) {
            this.a = n.this.new d(rVar, i, aVar);
            this.b = new Loader("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper " + i);
            com.google.android.exoplayer2.source.b0 l = com.google.android.exoplayer2.source.b0.l(n.this.a);
            this.c = l;
            l.d0(n.this.c);
        }

        public void c() {
            if (this.d) {
                return;
            }
            this.a.b.c();
            this.d = true;
            n.this.b0();
        }

        public long d() {
            return this.c.z();
        }

        public boolean e() {
            return this.c.K(this.d);
        }

        public int f(ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i) {
            return this.c.S(ep2Var, decoderInputBuffer, i, this.d);
        }

        public void g() {
            if (this.e) {
                return;
            }
            this.b.l();
            this.c.T();
            this.e = true;
        }

        public void h() {
            ur.g(this.d);
            this.d = false;
            n.this.b0();
            k();
        }

        public void i(long j) {
            if (this.d) {
                return;
            }
            this.a.b.e();
            this.c.V();
            this.c.b0(j);
        }

        public int j(long j) {
            int E = this.c.E(j, this.d);
            this.c.e0(E);
            return E;
        }

        public void k() {
            this.b.n(this.a.b, n.this.c, 0);
        }
    }

    private final class f implements y77 {
        private final int a;

        public f(int i) {
            this.a = i;
        }

        @Override // defpackage.y77
        public void a() {
            if (n.this.l != null) {
                throw n.this.l;
            }
        }

        @Override // defpackage.y77
        public boolean g() {
            return n.this.R(this.a);
        }

        @Override // defpackage.y77
        public int p(ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i) {
            return n.this.V(this.a, ep2Var, decoderInputBuffer, i);
        }

        @Override // defpackage.y77
        public int s(long j) {
            return n.this.Z(this.a, j);
        }
    }

    public n(ob obVar, b.a aVar, Uri uri, c cVar, String str, SocketFactory socketFactory, boolean z) {
        this.a = obVar;
        this.h = aVar;
        this.g = cVar;
        b bVar = new b();
        this.c = bVar;
        this.d = new j(bVar, bVar, str, uri, socketFactory, z);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.n = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.r = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void D(n nVar) {
        nVar.T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ImmutableList P(ImmutableList immutableList) {
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i = 0; i < immutableList.size(); i++) {
            aVar.a(new up8(Integer.toString(i), (t0) ur.e(((e) immutableList.get(i)).c.F())));
        }
        return aVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.exoplayer2.source.rtsp.d Q(Uri uri) {
        for (int i = 0; i < this.e.size(); i++) {
            if (!((e) this.e.get(i)).d) {
                d dVar = ((e) this.e.get(i)).a;
                if (dVar.c().equals(uri)) {
                    return dVar.b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean S() {
        return this.n != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.u || this.w) {
            return;
        }
        for (int i = 0; i < this.e.size(); i++) {
            if (((e) this.e.get(i)).c.F() == null) {
                return;
            }
        }
        this.w = true;
        this.j = P(ImmutableList.t(this.e));
        ((n.a) ur.e(this.i)).o(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        boolean z = true;
        for (int i = 0; i < this.f.size(); i++) {
            z &= ((d) this.f.get(i)).e();
        }
        if (z && this.x) {
            this.d.E1(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void X() {
        this.B = true;
        this.d.B1();
        b.a b2 = this.h.b();
        if (b2 == null) {
            this.l = new RtspMediaSource.RtspPlaybackException("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        ArrayList arrayList2 = new ArrayList(this.f.size());
        for (int i = 0; i < this.e.size(); i++) {
            e eVar = (e) this.e.get(i);
            if (eVar.d) {
                arrayList.add(eVar);
            } else {
                e eVar2 = new e(eVar.a.a, i, b2);
                arrayList.add(eVar2);
                eVar2.k();
                if (this.f.contains(eVar.a)) {
                    arrayList2.add(eVar2.a);
                }
            }
        }
        ImmutableList t = ImmutableList.t(this.e);
        this.e.clear();
        this.e.addAll(arrayList);
        this.f.clear();
        this.f.addAll(arrayList2);
        for (int i2 = 0; i2 < t.size(); i2++) {
            ((e) t.get(i2)).c();
        }
    }

    private boolean Y(long j) {
        for (int i = 0; i < this.e.size(); i++) {
            if (!((e) this.e.get(i)).c.Z(j, false)) {
                return false;
            }
        }
        return true;
    }

    private boolean a0() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        this.s = true;
        for (int i = 0; i < this.e.size(); i++) {
            this.s &= ((e) this.e.get(i)).d;
        }
    }

    static /* synthetic */ int e(n nVar) {
        int i = nVar.y;
        nVar.y = i + 1;
        return i;
    }

    boolean R(int i) {
        return !a0() && ((e) this.e.get(i)).e();
    }

    int V(int i, ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (a0()) {
            return -3;
        }
        return ((e) this.e.get(i)).f(ep2Var, decoderInputBuffer, i2);
    }

    public void W() {
        for (int i = 0; i < this.e.size(); i++) {
            ((e) this.e.get(i)).g();
        }
        z19.n(this.d);
        this.u = true;
    }

    int Z(int i, long j) {
        if (a0()) {
            return -3;
        }
        return ((e) this.e.get(i)).j(j);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean b() {
        return !this.s;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long c() {
        return h();
    }

    @Override // com.google.android.exoplayer2.source.n
    public long d(long j, fi7 fi7Var) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean f(long j) {
        return b();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long h() {
        if (this.s || this.e.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j = this.m;
        if (j != -9223372036854775807L) {
            return j;
        }
        boolean z = true;
        long j2 = Long.MAX_VALUE;
        for (int i = 0; i < this.e.size(); i++) {
            e eVar = (e) this.e.get(i);
            if (!eVar.d) {
                j2 = Math.min(j2, eVar.d());
                z = false;
            }
        }
        if (z || j2 == Long.MIN_VALUE) {
            return 0L;
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public void i(long j) {
    }

    @Override // com.google.android.exoplayer2.source.n
    public long j(q72[] q72VarArr, boolean[] zArr, y77[] y77VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < q72VarArr.length; i++) {
            if (y77VarArr[i] != null && (q72VarArr[i] == null || !zArr[i])) {
                y77VarArr[i] = null;
            }
        }
        this.f.clear();
        for (int i2 = 0; i2 < q72VarArr.length; i2++) {
            q72 q72Var = q72VarArr[i2];
            if (q72Var != null) {
                up8 n = q72Var.n();
                int indexOf = ((ImmutableList) ur.e(this.j)).indexOf(n);
                this.f.add(((e) ur.e((e) this.e.get(indexOf))).a);
                if (this.j.contains(n) && y77VarArr[i2] == null) {
                    y77VarArr[i2] = new f(indexOf);
                    zArr2[i2] = true;
                }
            }
        }
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            e eVar = (e) this.e.get(i3);
            if (!this.f.contains(eVar.a)) {
                eVar.c();
            }
        }
        this.x = true;
        if (j != 0) {
            this.m = j;
            this.n = j;
            this.r = j;
        }
        U();
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long l(long j) {
        if (h() == 0 && !this.B) {
            this.r = j;
            return j;
        }
        u(j, false);
        this.m = j;
        if (S()) {
            int y1 = this.d.y1();
            if (y1 == 1) {
                return j;
            }
            if (y1 != 2) {
                throw new IllegalStateException();
            }
            this.n = j;
            this.d.C1(j);
            return j;
        }
        if (Y(j)) {
            return j;
        }
        this.n = j;
        if (this.s) {
            for (int i = 0; i < this.e.size(); i++) {
                ((e) this.e.get(i)).h();
            }
            if (this.B) {
                this.d.G1(z19.h1(j));
            } else {
                this.d.C1(j);
            }
        } else {
            this.d.C1(j);
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ((e) this.e.get(i2)).i(j);
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long m() {
        if (!this.t) {
            return -9223372036854775807L;
        }
        this.t = false;
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void n(n.a aVar, long j) {
        this.i = aVar;
        try {
            this.d.start();
        } catch (IOException e2) {
            this.k = e2;
            z19.n(this.d);
        }
    }

    @Override // com.google.android.exoplayer2.source.n
    public void r() {
        IOException iOException = this.k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // com.google.android.exoplayer2.source.n
    public wp8 t() {
        ur.g(this.w);
        return new wp8((up8[]) ((ImmutableList) ur.e(this.j)).toArray(new up8[0]));
    }

    @Override // com.google.android.exoplayer2.source.n
    public void u(long j, boolean z) {
        if (S()) {
            return;
        }
        for (int i = 0; i < this.e.size(); i++) {
            e eVar = (e) this.e.get(i);
            if (!eVar.d) {
                eVar.c.q(j, z, true);
            }
        }
    }
}
