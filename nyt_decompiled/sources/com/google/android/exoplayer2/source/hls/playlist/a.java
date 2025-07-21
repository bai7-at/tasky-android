package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.a;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.h;
import com.google.android.exoplayer2.upstream.i;
import com.google.common.collect.j;
import defpackage.b93;
import defpackage.e93;
import defpackage.f93;
import defpackage.pi4;
import defpackage.ur;
import defpackage.v64;
import defpackage.z19;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class a implements HlsPlaylistTracker, Loader.b {
    public static final HlsPlaylistTracker.a s = new HlsPlaylistTracker.a() { // from class: uh1
        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.a
        public final HlsPlaylistTracker a(b93 b93Var, h hVar, f93 f93Var) {
            return new a(b93Var, hVar, f93Var);
        }
    };
    private final b93 a;
    private final f93 b;
    private final h c;
    private final HashMap d;
    private final CopyOnWriteArrayList e;
    private final double f;
    private p.a g;
    private Loader h;
    private Handler i;
    private HlsPlaylistTracker.c j;
    private d k;
    private Uri l;
    private com.google.android.exoplayer2.source.hls.playlist.c m;
    private boolean n;
    private long r;

    private class b implements HlsPlaylistTracker.b {
        private b() {
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
        public void a() {
            a.this.e.remove(this);
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
        public boolean e(Uri uri, h.c cVar, boolean z) {
            c cVar2;
            if (a.this.m == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List list = ((d) z19.j(a.this.k)).e;
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    c cVar3 = (c) a.this.d.get(((d.b) list.get(i2)).a);
                    if (cVar3 != null && elapsedRealtime < cVar3.h) {
                        i++;
                    }
                }
                h.b c = a.this.c.c(new h.a(1, 0, a.this.k.e.size(), i), cVar);
                if (c != null && c.a == 2 && (cVar2 = (c) a.this.d.get(uri)) != null) {
                    cVar2.i(c.b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements Loader.b {
        private final Uri a;
        private final Loader b = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
        private final com.google.android.exoplayer2.upstream.a c;
        private com.google.android.exoplayer2.source.hls.playlist.c d;
        private long e;
        private long f;
        private long g;
        private long h;
        private boolean i;
        private IOException j;

        public c(Uri uri) {
            this.a = uri;
            this.c = a.this.a.a(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i(long j) {
            this.h = SystemClock.elapsedRealtime() + j;
            return this.a.equals(a.this.l) && !a.this.K();
        }

        private Uri j() {
            com.google.android.exoplayer2.source.hls.playlist.c cVar = this.d;
            if (cVar != null) {
                c.f fVar = cVar.v;
                if (fVar.a != -9223372036854775807L || fVar.e) {
                    Uri.Builder buildUpon = this.a.buildUpon();
                    com.google.android.exoplayer2.source.hls.playlist.c cVar2 = this.d;
                    if (cVar2.v.e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar2.k + cVar2.r.size()));
                        com.google.android.exoplayer2.source.hls.playlist.c cVar3 = this.d;
                        if (cVar3.n != -9223372036854775807L) {
                            List list = cVar3.s;
                            int size = list.size();
                            if (!list.isEmpty() && ((c.b) j.e(list)).m) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    c.f fVar2 = this.d.v;
                    if (fVar2.a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(Uri uri) {
            this.i = false;
            q(uri);
        }

        private void q(Uri uri) {
            i iVar = new i(this.c, uri, 4, a.this.b.b(a.this.k, this.d));
            a.this.g.y(new v64(iVar.a, iVar.b, this.b.n(iVar, this, a.this.c.b(iVar.c))), iVar.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(final Uri uri) {
            this.h = 0L;
            if (this.i || this.b.j() || this.b.i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.g) {
                q(uri);
            } else {
                this.i = true;
                a.this.i.postDelayed(new Runnable() { // from class: com.google.android.exoplayer2.source.hls.playlist.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.c.this.n(uri);
                    }
                }, this.g - elapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(com.google.android.exoplayer2.source.hls.playlist.c cVar, v64 v64Var) {
            boolean z;
            com.google.android.exoplayer2.source.hls.playlist.c cVar2 = this.d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.e = elapsedRealtime;
            com.google.android.exoplayer2.source.hls.playlist.c F = a.this.F(cVar2, cVar);
            this.d = F;
            IOException iOException = null;
            if (F != cVar2) {
                this.j = null;
                this.f = elapsedRealtime;
                a.this.Q(this.a, F);
            } else if (!F.o) {
                if (cVar.k + cVar.r.size() < this.d.k) {
                    iOException = new HlsPlaylistTracker.PlaylistResetException(this.a);
                    z = true;
                } else {
                    z = false;
                    if (elapsedRealtime - this.f > z19.h1(r13.m) * a.this.f) {
                        iOException = new HlsPlaylistTracker.PlaylistStuckException(this.a);
                    }
                }
                if (iOException != null) {
                    this.j = iOException;
                    a.this.M(this.a, new h.c(v64Var, new pi4(4), iOException, 1), z);
                }
            }
            com.google.android.exoplayer2.source.hls.playlist.c cVar3 = this.d;
            this.g = elapsedRealtime + z19.h1(!cVar3.v.e ? cVar3 != cVar2 ? cVar3.m : cVar3.m / 2 : 0L);
            if ((this.d.n != -9223372036854775807L || this.a.equals(a.this.l)) && !this.d.o) {
                r(j());
            }
        }

        public com.google.android.exoplayer2.source.hls.playlist.c l() {
            return this.d;
        }

        public boolean m() {
            int i;
            if (this.d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, z19.h1(this.d.u));
            com.google.android.exoplayer2.source.hls.playlist.c cVar = this.d;
            return cVar.o || (i = cVar.d) == 2 || i == 1 || this.e + max > elapsedRealtime;
        }

        public void p() {
            r(this.a);
        }

        public void s() {
            this.b.a();
            IOException iOException = this.j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void e(i iVar, long j, long j2, boolean z) {
            v64 v64Var = new v64(iVar.a, iVar.b, iVar.f(), iVar.d(), j, j2, iVar.b());
            a.this.c.d(iVar.a);
            a.this.g.p(v64Var, 4);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void k(i iVar, long j, long j2) {
            e93 e93Var = (e93) iVar.e();
            v64 v64Var = new v64(iVar.a, iVar.b, iVar.f(), iVar.d(), j, j2, iVar.b());
            if (e93Var instanceof com.google.android.exoplayer2.source.hls.playlist.c) {
                w((com.google.android.exoplayer2.source.hls.playlist.c) e93Var, v64Var);
                a.this.g.s(v64Var, 4);
            } else {
                this.j = ParserException.c("Loaded playlist has unexpected type.", null);
                a.this.g.w(v64Var, 4, this.j, true);
            }
            a.this.c.d(iVar.a);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public Loader.c o(i iVar, long j, long j2, IOException iOException, int i) {
            Loader.c cVar;
            v64 v64Var = new v64(iVar.a, iVar.b, iVar.f(), iVar.d(), j, j2, iVar.b());
            boolean z = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            if ((iVar.f().getQueryParameter("_HLS_msn") != null) || z) {
                int i2 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode : Integer.MAX_VALUE;
                if (z || i2 == 400 || i2 == 503) {
                    this.g = SystemClock.elapsedRealtime();
                    p();
                    ((p.a) z19.j(a.this.g)).w(v64Var, iVar.c, iOException, true);
                    return Loader.f;
                }
            }
            h.c cVar2 = new h.c(v64Var, new pi4(iVar.c), iOException, i);
            if (a.this.M(this.a, cVar2, false)) {
                long a = a.this.c.a(cVar2);
                cVar = a != -9223372036854775807L ? Loader.h(false, a) : Loader.g;
            } else {
                cVar = Loader.f;
            }
            boolean c = cVar.c();
            a.this.g.w(v64Var, iVar.c, iOException, !c);
            if (!c) {
                a.this.c.d(iVar.a);
            }
            return cVar;
        }

        public void x() {
            this.b.l();
        }
    }

    public a(b93 b93Var, h hVar, f93 f93Var) {
        this(b93Var, hVar, f93Var, 3.5d);
    }

    private void D(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            this.d.put(uri, new c(uri));
        }
    }

    private static c.d E(com.google.android.exoplayer2.source.hls.playlist.c cVar, com.google.android.exoplayer2.source.hls.playlist.c cVar2) {
        int i = (int) (cVar2.k - cVar.k);
        List list = cVar.r;
        if (i < list.size()) {
            return (c.d) list.get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.exoplayer2.source.hls.playlist.c F(com.google.android.exoplayer2.source.hls.playlist.c cVar, com.google.android.exoplayer2.source.hls.playlist.c cVar2) {
        return !cVar2.f(cVar) ? cVar2.o ? cVar.d() : cVar : cVar2.c(H(cVar, cVar2), G(cVar, cVar2));
    }

    private int G(com.google.android.exoplayer2.source.hls.playlist.c cVar, com.google.android.exoplayer2.source.hls.playlist.c cVar2) {
        c.d E;
        if (cVar2.i) {
            return cVar2.j;
        }
        com.google.android.exoplayer2.source.hls.playlist.c cVar3 = this.m;
        int i = cVar3 != null ? cVar3.j : 0;
        return (cVar == null || (E = E(cVar, cVar2)) == null) ? i : (cVar.j + E.d) - ((c.d) cVar2.r.get(0)).d;
    }

    private long H(com.google.android.exoplayer2.source.hls.playlist.c cVar, com.google.android.exoplayer2.source.hls.playlist.c cVar2) {
        if (cVar2.p) {
            return cVar2.h;
        }
        com.google.android.exoplayer2.source.hls.playlist.c cVar3 = this.m;
        long j = cVar3 != null ? cVar3.h : 0L;
        if (cVar == null) {
            return j;
        }
        int size = cVar.r.size();
        c.d E = E(cVar, cVar2);
        return E != null ? cVar.h + E.e : ((long) size) == cVar2.k - cVar.k ? cVar.e() : j;
    }

    private Uri I(Uri uri) {
        c.C0188c c0188c;
        com.google.android.exoplayer2.source.hls.playlist.c cVar = this.m;
        if (cVar == null || !cVar.v.e || (c0188c = (c.C0188c) cVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c0188c.b));
        int i = c0188c.c;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    private boolean J(Uri uri) {
        List list = this.k.e;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(((d.b) list.get(i)).a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        List list = this.k.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            c cVar = (c) ur.e((c) this.d.get(((d.b) list.get(i)).a));
            if (elapsedRealtime > cVar.h) {
                Uri uri = cVar.a;
                this.l = uri;
                cVar.r(I(uri));
                return true;
            }
        }
        return false;
    }

    private void L(Uri uri) {
        if (uri.equals(this.l) || !J(uri)) {
            return;
        }
        com.google.android.exoplayer2.source.hls.playlist.c cVar = this.m;
        if (cVar == null || !cVar.o) {
            this.l = uri;
            c cVar2 = (c) this.d.get(uri);
            com.google.android.exoplayer2.source.hls.playlist.c cVar3 = cVar2.d;
            if (cVar3 == null || !cVar3.o) {
                cVar2.r(I(uri));
            } else {
                this.m = cVar3;
                this.j.b(cVar3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M(Uri uri, h.c cVar, boolean z) {
        Iterator it2 = this.e.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            z2 |= !((HlsPlaylistTracker.b) it2.next()).e(uri, cVar, z);
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(Uri uri, com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        if (uri.equals(this.l)) {
            if (this.m == null) {
                this.n = !cVar.o;
                this.r = cVar.h;
            }
            this.m = cVar;
            this.j.b(cVar);
        }
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            ((HlsPlaylistTracker.b) it2.next()).a();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void e(i iVar, long j, long j2, boolean z) {
        v64 v64Var = new v64(iVar.a, iVar.b, iVar.f(), iVar.d(), j, j2, iVar.b());
        this.c.d(iVar.a);
        this.g.p(v64Var, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void k(i iVar, long j, long j2) {
        e93 e93Var = (e93) iVar.e();
        boolean z = e93Var instanceof com.google.android.exoplayer2.source.hls.playlist.c;
        d e = z ? d.e(e93Var.a) : (d) e93Var;
        this.k = e;
        this.l = ((d.b) e.e.get(0)).a;
        this.e.add(new b());
        D(e.d);
        v64 v64Var = new v64(iVar.a, iVar.b, iVar.f(), iVar.d(), j, j2, iVar.b());
        c cVar = (c) this.d.get(this.l);
        if (z) {
            cVar.w((com.google.android.exoplayer2.source.hls.playlist.c) e93Var, v64Var);
        } else {
            cVar.p();
        }
        this.c.d(iVar.a);
        this.g.s(v64Var, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public Loader.c o(i iVar, long j, long j2, IOException iOException, int i) {
        v64 v64Var = new v64(iVar.a, iVar.b, iVar.f(), iVar.d(), j, j2, iVar.b());
        long a = this.c.a(new h.c(v64Var, new pi4(iVar.c), iOException, i));
        boolean z = a == -9223372036854775807L;
        this.g.w(v64Var, iVar.c, iOException, z);
        if (z) {
            this.c.d(iVar.a);
        }
        return z ? Loader.g : Loader.h(false, a);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void a(HlsPlaylistTracker.b bVar) {
        this.e.remove(bVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void b(Uri uri) {
        ((c) this.d.get(uri)).s();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public long c() {
        return this.r;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public d d() {
        return this.k;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void f(Uri uri) {
        ((c) this.d.get(uri)).p();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void g(HlsPlaylistTracker.b bVar) {
        ur.e(bVar);
        this.e.add(bVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean h(Uri uri) {
        return ((c) this.d.get(uri)).m();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean i(Uri uri, long j) {
        if (((c) this.d.get(uri)) != null) {
            return !r0.i(j);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean isLive() {
        return this.n;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void j(Uri uri, p.a aVar, HlsPlaylistTracker.c cVar) {
        this.i = z19.w();
        this.g = aVar;
        this.j = cVar;
        i iVar = new i(this.a.a(4), uri, 4, this.b.a());
        ur.g(this.h == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.h = loader;
        aVar.y(new v64(iVar.a, iVar.b, loader.n(iVar, this, this.c.b(iVar.c))), iVar.c);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void l() {
        Loader loader = this.h;
        if (loader != null) {
            loader.a();
        }
        Uri uri = this.l;
        if (uri != null) {
            b(uri);
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public com.google.android.exoplayer2.source.hls.playlist.c m(Uri uri, boolean z) {
        com.google.android.exoplayer2.source.hls.playlist.c l = ((c) this.d.get(uri)).l();
        if (l != null && z) {
            L(uri);
        }
        return l;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.l = null;
        this.m = null;
        this.k = null;
        this.r = -9223372036854775807L;
        this.h.l();
        this.h = null;
        Iterator it2 = this.d.values().iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).x();
        }
        this.i.removeCallbacksAndMessages(null);
        this.i = null;
        this.d.clear();
    }

    public a(b93 b93Var, h hVar, f93 f93Var, double d) {
        this.a = b93Var;
        this.b = f93Var;
        this.c = hVar;
        this.f = d;
        this.e = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.r = -9223372036854775807L;
    }
}
