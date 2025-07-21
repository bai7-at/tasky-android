package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.b;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.j;
import com.google.common.primitives.Ints;
import defpackage.b91;
import defpackage.b93;
import defpackage.c93;
import defpackage.fi7;
import defpackage.h60;
import defpackage.mm0;
import defpackage.nm0;
import defpackage.ok0;
import defpackage.q72;
import defpackage.qh4;
import defpackage.rm8;
import defpackage.sq8;
import defpackage.sv5;
import defpackage.t50;
import defpackage.up8;
import defpackage.ur;
import defpackage.yy8;
import defpackage.z19;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
class b {
    private final c93 a;
    private final com.google.android.exoplayer2.upstream.a b;
    private final com.google.android.exoplayer2.upstream.a c;
    private final rm8 d;
    private final Uri[] e;
    private final t0[] f;
    private final HlsPlaylistTracker g;
    private final up8 h;
    private final List i;
    private final sv5 k;
    private final long l;
    private boolean m;
    private IOException o;
    private Uri p;
    private boolean q;
    private q72 r;
    private boolean t;
    private final FullSegmentEncryptionKeyCache j = new FullSegmentEncryptionKeyCache(4);
    private byte[] n = z19.f;
    private long s = -9223372036854775807L;

    private static final class a extends b91 {
        private byte[] l;

        public a(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, t0 t0Var, int i, Object obj, byte[] bArr) {
            super(aVar, bVar, 3, t0Var, i, obj, bArr);
        }

        @Override // defpackage.b91
        protected void g(byte[] bArr, int i) {
            this.l = Arrays.copyOf(bArr, i);
        }

        public byte[] j() {
            return this.l;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.b$b, reason: collision with other inner class name */
    public static final class C0186b {
        public ok0 a;
        public boolean b;
        public Uri c;

        public C0186b() {
            a();
        }

        public void a() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }

    static final class c extends t50 {
        private final List e;
        private final long f;
        private final String g;

        public c(String str, long j, List list) {
            super(0L, list.size() - 1);
            this.g = str;
            this.f = j;
            this.e = list;
        }

        @Override // defpackage.qh4
        public long a() {
            c();
            return this.f + ((c.e) this.e.get((int) d())).e;
        }

        @Override // defpackage.qh4
        public long b() {
            c();
            c.e eVar = (c.e) this.e.get((int) d());
            return this.f + eVar.e + eVar.c;
        }
    }

    private static final class d extends h60 {
        private int h;

        public d(up8 up8Var, int[] iArr) {
            super(up8Var, iArr);
            this.h = q(up8Var.d(iArr[0]));
        }

        @Override // defpackage.q72
        public int b() {
            return this.h;
        }

        @Override // defpackage.q72
        public Object j() {
            return null;
        }

        @Override // defpackage.q72
        public void m(long j, long j2, long j3, List list, qh4[] qh4VarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (a(this.h, elapsedRealtime)) {
                for (int i = this.b - 1; i >= 0; i--) {
                    if (!a(i, elapsedRealtime)) {
                        this.h = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // defpackage.q72
        public int t() {
            return 0;
        }
    }

    static final class e {
        public final c.e a;
        public final long b;
        public final int c;
        public final boolean d;

        public e(c.e eVar, long j, int i) {
            this.a = eVar;
            this.b = j;
            this.c = i;
            this.d = (eVar instanceof c.b) && ((c.b) eVar).m;
        }
    }

    public b(c93 c93Var, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, t0[] t0VarArr, b93 b93Var, sq8 sq8Var, rm8 rm8Var, long j, List list, sv5 sv5Var, mm0 mm0Var) {
        this.a = c93Var;
        this.g = hlsPlaylistTracker;
        this.e = uriArr;
        this.f = t0VarArr;
        this.d = rm8Var;
        this.l = j;
        this.i = list;
        this.k = sv5Var;
        com.google.android.exoplayer2.upstream.a a2 = b93Var.a(1);
        this.b = a2;
        if (sq8Var != null) {
            a2.i(sq8Var);
        }
        this.c = b93Var.a(3);
        this.h = new up8(t0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((t0VarArr[i].e & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.r = new d(this.h, Ints.l(arrayList));
    }

    private static Uri d(com.google.android.exoplayer2.source.hls.playlist.c cVar, c.e eVar) {
        String str;
        if (eVar == null || (str = eVar.g) == null) {
            return null;
        }
        return yy8.e(cVar.a, str);
    }

    private Pair f(com.google.android.exoplayer2.source.hls.d dVar, boolean z, com.google.android.exoplayer2.source.hls.playlist.c cVar, long j, long j2) {
        if (dVar != null && !z) {
            if (!dVar.h()) {
                return new Pair(Long.valueOf(dVar.j), Integer.valueOf(dVar.o));
            }
            Long valueOf = Long.valueOf(dVar.o == -1 ? dVar.g() : dVar.j);
            int i = dVar.o;
            return new Pair(valueOf, Integer.valueOf(i != -1 ? i + 1 : -1));
        }
        long j3 = cVar.u + j;
        if (dVar != null && !this.q) {
            j2 = dVar.g;
        }
        if (!cVar.o && j2 >= j3) {
            return new Pair(Long.valueOf(cVar.k + cVar.r.size()), -1);
        }
        long j4 = j2 - j;
        int i2 = 0;
        int g = z19.g(cVar.r, Long.valueOf(j4), true, !this.g.isLive() || dVar == null);
        long j5 = g + cVar.k;
        if (g >= 0) {
            c.d dVar2 = (c.d) cVar.r.get(g);
            List list = j4 < dVar2.e + dVar2.c ? dVar2.m : cVar.s;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                c.b bVar = (c.b) list.get(i2);
                if (j4 >= bVar.e + bVar.c) {
                    i2++;
                } else if (bVar.l) {
                    j5 += list == cVar.s ? 1L : 0L;
                    r1 = i2;
                }
            }
        }
        return new Pair(Long.valueOf(j5), Integer.valueOf(r1));
    }

    private static e g(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j, int i) {
        int i2 = (int) (j - cVar.k);
        if (i2 == cVar.r.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < cVar.s.size()) {
                return new e((c.e) cVar.s.get(i), j, i);
            }
            return null;
        }
        c.d dVar = (c.d) cVar.r.get(i2);
        if (i == -1) {
            return new e(dVar, j, -1);
        }
        if (i < dVar.m.size()) {
            return new e((c.e) dVar.m.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < cVar.r.size()) {
            return new e((c.e) cVar.r.get(i3), j + 1, -1);
        }
        if (cVar.s.isEmpty()) {
            return null;
        }
        return new e((c.e) cVar.s.get(0), j + 1, 0);
    }

    static List i(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j, int i) {
        int i2 = (int) (j - cVar.k);
        if (i2 < 0 || cVar.r.size() < i2) {
            return ImmutableList.x();
        }
        ArrayList arrayList = new ArrayList();
        if (i2 < cVar.r.size()) {
            if (i != -1) {
                c.d dVar = (c.d) cVar.r.get(i2);
                if (i == 0) {
                    arrayList.add(dVar);
                } else if (i < dVar.m.size()) {
                    List list = dVar.m;
                    arrayList.addAll(list.subList(i, list.size()));
                }
                i2++;
            }
            List list2 = cVar.r;
            arrayList.addAll(list2.subList(i2, list2.size()));
            i = 0;
        }
        if (cVar.n != -9223372036854775807L) {
            int i3 = i != -1 ? i : 0;
            if (i3 < cVar.s.size()) {
                List list3 = cVar.s;
                arrayList.addAll(list3.subList(i3, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private ok0 l(Uri uri, int i, boolean z, nm0 nm0Var) {
        if (uri == null) {
            return null;
        }
        byte[] c2 = this.j.c(uri);
        if (c2 != null) {
            this.j.b(uri, c2);
            return null;
        }
        return new a(this.c, new b.C0195b().i(uri).b(1).e(ImmutableMap.o()).a(), this.f[i], this.r.t(), this.r.j(), this.n);
    }

    private long s(long j) {
        long j2 = this.s;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    private void w(com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        this.s = cVar.o ? -9223372036854775807L : cVar.e() - this.g.c();
    }

    public qh4[] a(com.google.android.exoplayer2.source.hls.d dVar, long j) {
        int i;
        int e2 = dVar == null ? -1 : this.h.e(dVar.d);
        int length = this.r.length();
        qh4[] qh4VarArr = new qh4[length];
        boolean z = false;
        int i2 = 0;
        while (i2 < length) {
            int g = this.r.g(i2);
            Uri uri = this.e[g];
            if (this.g.h(uri)) {
                com.google.android.exoplayer2.source.hls.playlist.c m = this.g.m(uri, z);
                ur.e(m);
                long c2 = m.h - this.g.c();
                i = i2;
                Pair f = f(dVar, g != e2 ? true : z, m, c2, j);
                qh4VarArr[i] = new c(m.a, c2, i(m, ((Long) f.first).longValue(), ((Integer) f.second).intValue()));
            } else {
                qh4VarArr[i2] = qh4.a;
                i = i2;
            }
            i2 = i + 1;
            z = false;
        }
        return qh4VarArr;
    }

    public long b(long j, fi7 fi7Var) {
        int b = this.r.b();
        Uri[] uriArr = this.e;
        com.google.android.exoplayer2.source.hls.playlist.c m = (b >= uriArr.length || b == -1) ? null : this.g.m(uriArr[this.r.r()], true);
        if (m == null || m.r.isEmpty() || !m.c) {
            return j;
        }
        long c2 = m.h - this.g.c();
        long j2 = j - c2;
        int g = z19.g(m.r, Long.valueOf(j2), true, true);
        long j3 = ((c.d) m.r.get(g)).e;
        return fi7Var.a(j2, j3, g != m.r.size() - 1 ? ((c.d) m.r.get(g + 1)).e : j3) + c2;
    }

    public int c(com.google.android.exoplayer2.source.hls.d dVar) {
        if (dVar.o == -1) {
            return 1;
        }
        com.google.android.exoplayer2.source.hls.playlist.c cVar = (com.google.android.exoplayer2.source.hls.playlist.c) ur.e(this.g.m(this.e[this.h.e(dVar.d)], false));
        int i = (int) (dVar.j - cVar.k);
        if (i < 0) {
            return 1;
        }
        List list = i < cVar.r.size() ? ((c.d) cVar.r.get(i)).m : cVar.s;
        if (dVar.o >= list.size()) {
            return 2;
        }
        c.b bVar = (c.b) list.get(dVar.o);
        if (bVar.m) {
            return 0;
        }
        return z19.c(Uri.parse(yy8.d(cVar.a, bVar.a)), dVar.b.a) ? 1 : 2;
    }

    public void e(long j, long j2, List list, boolean z, C0186b c0186b) {
        com.google.android.exoplayer2.source.hls.playlist.c cVar;
        long j3;
        Uri uri;
        int i;
        com.google.android.exoplayer2.source.hls.d dVar = list.isEmpty() ? null : (com.google.android.exoplayer2.source.hls.d) j.e(list);
        int e2 = dVar == null ? -1 : this.h.e(dVar.d);
        long j4 = j2 - j;
        long s = s(j);
        if (dVar != null && !this.q) {
            long d2 = dVar.d();
            j4 = Math.max(0L, j4 - d2);
            if (s != -9223372036854775807L) {
                s = Math.max(0L, s - d2);
            }
        }
        this.r.m(j, j4, s, list, a(dVar, j2));
        int r = this.r.r();
        boolean z2 = e2 != r;
        Uri uri2 = this.e[r];
        if (!this.g.h(uri2)) {
            c0186b.c = uri2;
            this.t &= uri2.equals(this.p);
            this.p = uri2;
            return;
        }
        com.google.android.exoplayer2.source.hls.playlist.c m = this.g.m(uri2, true);
        ur.e(m);
        this.q = m.c;
        w(m);
        long c2 = m.h - this.g.c();
        Pair f = f(dVar, z2, m, c2, j2);
        long longValue = ((Long) f.first).longValue();
        int intValue = ((Integer) f.second).intValue();
        if (longValue >= m.k || dVar == null || !z2) {
            cVar = m;
            j3 = c2;
            uri = uri2;
            i = r;
        } else {
            Uri uri3 = this.e[e2];
            com.google.android.exoplayer2.source.hls.playlist.c m2 = this.g.m(uri3, true);
            ur.e(m2);
            j3 = m2.h - this.g.c();
            Pair f2 = f(dVar, false, m2, j3, j2);
            longValue = ((Long) f2.first).longValue();
            intValue = ((Integer) f2.second).intValue();
            i = e2;
            uri = uri3;
            cVar = m2;
        }
        if (longValue < cVar.k) {
            this.o = new BehindLiveWindowException();
            return;
        }
        e g = g(cVar, longValue, intValue);
        if (g == null) {
            if (!cVar.o) {
                c0186b.c = uri;
                this.t &= uri.equals(this.p);
                this.p = uri;
                return;
            } else {
                if (z || cVar.r.isEmpty()) {
                    c0186b.b = true;
                    return;
                }
                g = new e((c.e) j.e(cVar.r), (cVar.k + cVar.r.size()) - 1, -1);
            }
        }
        this.t = false;
        this.p = null;
        Uri d3 = d(cVar, g.a.b);
        ok0 l = l(d3, i, true, null);
        c0186b.a = l;
        if (l != null) {
            return;
        }
        Uri d4 = d(cVar, g.a);
        ok0 l2 = l(d4, i, false, null);
        c0186b.a = l2;
        if (l2 != null) {
            return;
        }
        boolean w = com.google.android.exoplayer2.source.hls.d.w(dVar, uri, cVar, g, j3);
        if (w && g.d) {
            return;
        }
        c0186b.a = com.google.android.exoplayer2.source.hls.d.j(this.a, this.b, this.f[i], j3, cVar, g, uri, this.i, this.r.t(), this.r.j(), this.m, this.d, this.l, dVar, this.j.a(d4), this.j.a(d3), w, this.k, null);
    }

    public int h(long j, List list) {
        return (this.o != null || this.r.length() < 2) ? list.size() : this.r.p(j, list);
    }

    public up8 j() {
        return this.h;
    }

    public q72 k() {
        return this.r;
    }

    public boolean m(ok0 ok0Var, long j) {
        q72 q72Var = this.r;
        return q72Var.h(q72Var.l(this.h.e(ok0Var.d)), j);
    }

    public void n() {
        IOException iOException = this.o;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.p;
        if (uri == null || !this.t) {
            return;
        }
        this.g.b(uri);
    }

    public boolean o(Uri uri) {
        return z19.s(this.e, uri);
    }

    public void p(ok0 ok0Var) {
        if (ok0Var instanceof a) {
            a aVar = (a) ok0Var;
            this.n = aVar.h();
            this.j.b(aVar.b.a, (byte[]) ur.e(aVar.j()));
        }
    }

    public boolean q(Uri uri, long j) {
        int l;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.e;
            if (i >= uriArr.length) {
                i = -1;
                break;
            }
            if (uriArr[i].equals(uri)) {
                break;
            }
            i++;
        }
        if (i == -1 || (l = this.r.l(i)) == -1) {
            return true;
        }
        this.t |= uri.equals(this.p);
        return j == -9223372036854775807L || (this.r.h(l, j) && this.g.i(uri, j));
    }

    public void r() {
        this.o = null;
    }

    public void t(boolean z) {
        this.m = z;
    }

    public void u(q72 q72Var) {
        this.r = q72Var;
    }

    public boolean v(long j, ok0 ok0Var, List list) {
        if (this.o != null) {
            return false;
        }
        return this.r.e(j, ok0Var, list);
    }
}
