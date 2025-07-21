package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.s3.Headers;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.j;
import com.google.android.exoplayer2.source.rtsp.m;
import com.google.android.exoplayer2.source.rtsp.n;
import com.google.android.exoplayer2.source.rtsp.s;
import com.google.android.exoplayer2.source.rtsp.u;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import defpackage.a84;
import defpackage.s48;
import defpackage.ur;
import defpackage.ys3;
import defpackage.z19;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;

/* loaded from: classes2.dex */
final class j implements Closeable {
    private final f a;
    private final e b;
    private final String c;
    private final SocketFactory d;
    private final boolean e;
    private Uri i;
    private u.a k;
    private String l;
    private b m;
    private i n;
    private boolean s;
    private boolean t;
    private boolean u;
    private final ArrayDeque f = new ArrayDeque();
    private final SparseArray g = new SparseArray();
    private final d h = new d();
    private s j = new s(new c());
    private long w = -9223372036854775807L;
    private int r = -1;

    private final class b implements Runnable, Closeable {
        private final Handler a = z19.w();
        private final long b;
        private boolean c;

        public b(long j) {
            this.b = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.c = false;
            this.a.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.h.e(j.this.i, j.this.l);
            this.a.postDelayed(this, this.b);
        }

        public void start() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.a.postDelayed(this, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements s.d {
        private final Handler a = z19.w();

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void h(List list) {
            j.this.z1(list);
            if (u.e(list)) {
                g(list);
            } else {
                f(list);
            }
        }

        private void f(List list) {
            j.this.h.d(Integer.parseInt((String) ur.e(u.k(list).c.d("CSeq"))));
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void g(List list) {
            ImmutableList x;
            y l = u.l(list);
            int parseInt = Integer.parseInt((String) ur.e(l.b.d("CSeq")));
            x xVar = (x) j.this.g.get(parseInt);
            if (xVar == null) {
                return;
            }
            j.this.g.remove(parseInt);
            int i = xVar.b;
            try {
                int i2 = l.a;
                if (i2 == 200) {
                    switch (i) {
                        case 1:
                        case 3:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                            return;
                        case 2:
                            i(new l(l.b, i2, d0.b(l.c)));
                            return;
                        case 4:
                            j(new v(i2, u.j(l.b.d("Public"))));
                            return;
                        case 5:
                            k();
                            return;
                        case 6:
                            String d = l.b.d(Headers.RANGE);
                            z d2 = d == null ? z.c : z.d(d);
                            try {
                                String d3 = l.b.d("RTP-Info");
                                x = d3 == null ? ImmutableList.x() : b0.a(d3, j.this.i);
                            } catch (ParserException unused) {
                                x = ImmutableList.x();
                            }
                            l(new w(l.a, d2, x));
                            return;
                        case 10:
                            String d4 = l.b.d("Session");
                            String d5 = l.b.d("Transport");
                            if (d4 == null || d5 == null) {
                                throw ParserException.c("Missing mandatory session or transport header", null);
                            }
                            m(new a0(l.a, u.m(d4), d5));
                            return;
                        default:
                            throw new IllegalStateException();
                    }
                }
                if (i2 == 401) {
                    if (j.this.k == null || j.this.t) {
                        j.this.w1(new RtspMediaSource.RtspPlaybackException(u.t(i) + " " + l.a));
                        return;
                    }
                    ImmutableList e = l.b.e("WWW-Authenticate");
                    if (e.isEmpty()) {
                        throw ParserException.c("Missing WWW-Authenticate header in a 401 response.", null);
                    }
                    for (int i3 = 0; i3 < e.size(); i3++) {
                        j.this.n = u.o((String) e.get(i3));
                        if (j.this.n.a == 2) {
                            break;
                        }
                    }
                    j.this.h.b();
                    j.this.t = true;
                    return;
                }
                if (i2 == 461) {
                    String str = u.t(i) + " " + l.a;
                    j.this.w1((i != 10 || ((String) ur.e(xVar.c.d("Transport"))).contains("TCP")) ? new RtspMediaSource.RtspPlaybackException(str) : new RtspMediaSource.RtspUdpUnsupportedTransportException(str));
                    return;
                }
                if (i2 != 301 && i2 != 302) {
                    j.this.w1(new RtspMediaSource.RtspPlaybackException(u.t(i) + " " + l.a));
                    return;
                }
                if (j.this.r != -1) {
                    j.this.r = 0;
                }
                String d6 = l.b.d(HttpHeader.LOCATION);
                if (d6 == null) {
                    j.this.a.b("Redirection without new location.", null);
                    return;
                }
                Uri parse = Uri.parse(d6);
                j.this.i = u.p(parse);
                j.this.k = u.n(parse);
                j.this.h.c(j.this.i, j.this.l);
            } catch (ParserException | IllegalArgumentException e2) {
                j.this.w1(new RtspMediaSource.RtspPlaybackException(e2));
            }
        }

        private void i(l lVar) {
            z zVar = z.c;
            String str = (String) lVar.c.a.get("range");
            if (str != null) {
                try {
                    zVar = z.d(str);
                } catch (ParserException e) {
                    j.this.a.b("SDP format error.", e);
                    return;
                }
            }
            ImmutableList u1 = j.u1(lVar, j.this.i);
            if (u1.isEmpty()) {
                j.this.a.b("No playable track.", null);
            } else {
                j.this.a.h(zVar, u1);
                j.this.s = true;
            }
        }

        private void j(v vVar) {
            if (j.this.m != null) {
                return;
            }
            if (j.D1(vVar.b)) {
                j.this.h.c(j.this.i, j.this.l);
            } else {
                j.this.a.b("DESCRIBE not supported.", null);
            }
        }

        private void k() {
            ur.g(j.this.r == 2);
            j.this.r = 1;
            j.this.u = false;
            if (j.this.w != -9223372036854775807L) {
                j jVar = j.this;
                jVar.G1(z19.h1(jVar.w));
            }
        }

        private void l(w wVar) {
            boolean z = true;
            if (j.this.r != 1 && j.this.r != 2) {
                z = false;
            }
            ur.g(z);
            j.this.r = 2;
            if (j.this.m == null) {
                j jVar = j.this;
                jVar.m = jVar.new b(30000L);
                j.this.m.start();
            }
            j.this.w = -9223372036854775807L;
            j.this.b.f(z19.D0(wVar.b.a), wVar.c);
        }

        private void m(a0 a0Var) {
            ur.g(j.this.r != -1);
            j.this.r = 1;
            j.this.l = a0Var.b.a;
            j.this.v1();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.s.d
        public void c(final List list) {
            this.a.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.k
                @Override // java.lang.Runnable
                public final void run() {
                    j.c.this.h(list);
                }
            });
        }
    }

    private final class d {
        private int a;
        private x b;

        private d() {
        }

        private x a(int i, String str, Map map, Uri uri) {
            String str2 = j.this.c;
            int i2 = this.a;
            this.a = i2 + 1;
            m.b bVar = new m.b(str2, str, i2);
            if (j.this.n != null) {
                ur.i(j.this.k);
                try {
                    bVar.b("Authorization", j.this.n.a(j.this.k, uri, i));
                } catch (ParserException e) {
                    j.this.w1(new RtspMediaSource.RtspPlaybackException(e));
                }
            }
            bVar.d(map);
            return new x(uri, i, bVar.e(), "");
        }

        private void h(x xVar) {
            int parseInt = Integer.parseInt((String) ur.e(xVar.c.d("CSeq")));
            ur.g(j.this.g.get(parseInt) == null);
            j.this.g.append(parseInt, xVar);
            ImmutableList q = u.q(xVar);
            j.this.z1(q);
            j.this.j.j(q);
            this.b = xVar;
        }

        private void i(y yVar) {
            ImmutableList r = u.r(yVar);
            j.this.z1(r);
            j.this.j.j(r);
        }

        public void b() {
            ur.i(this.b);
            ImmutableListMultimap b = this.b.c.b();
            HashMap hashMap = new HashMap();
            for (String str : b.keySet()) {
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    hashMap.put(str, (String) com.google.common.collect.j.e(b.get(str)));
                }
            }
            h(a(this.b.b, j.this.l, hashMap, this.b.a));
        }

        public void c(Uri uri, String str) {
            h(a(2, str, ImmutableMap.o(), uri));
        }

        public void d(int i) {
            i(new y(405, new m.b(j.this.c, j.this.l, i).e()));
            this.a = Math.max(this.a, i + 1);
        }

        public void e(Uri uri, String str) {
            h(a(4, str, ImmutableMap.o(), uri));
        }

        public void f(Uri uri, String str) {
            ur.g(j.this.r == 2);
            h(a(5, str, ImmutableMap.o(), uri));
            j.this.u = true;
        }

        public void g(Uri uri, long j, String str) {
            boolean z = true;
            if (j.this.r != 1 && j.this.r != 2) {
                z = false;
            }
            ur.g(z);
            h(a(6, str, ImmutableMap.q(Headers.RANGE, z.b(j)), uri));
        }

        public void j(Uri uri, String str, String str2) {
            j.this.r = 0;
            h(a(10, str2, ImmutableMap.q("Transport", str), uri));
        }

        public void k(Uri uri, String str) {
            if (j.this.r == -1 || j.this.r == 0) {
                return;
            }
            j.this.r = 0;
            h(a(12, str, ImmutableMap.o(), uri));
        }
    }

    public interface e {
        void c(RtspMediaSource.RtspPlaybackException rtspPlaybackException);

        void d();

        void f(long j, ImmutableList immutableList);
    }

    public interface f {
        void b(String str, Throwable th);

        void h(z zVar, ImmutableList immutableList);
    }

    public j(f fVar, e eVar, String str, Uri uri, SocketFactory socketFactory, boolean z) {
        this.a = fVar;
        this.b = eVar;
        this.c = str;
        this.d = socketFactory;
        this.e = z;
        this.i = u.p(uri);
        this.k = u.n(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean D1(List list) {
        return list.isEmpty() || list.contains(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static ImmutableList u1(l lVar, Uri uri) {
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i = 0; i < lVar.c.b.size(); i++) {
            com.google.android.exoplayer2.source.rtsp.a aVar2 = (com.google.android.exoplayer2.source.rtsp.a) lVar.c.b.get(i);
            if (h.c(aVar2)) {
                aVar.a(new r(lVar.a, aVar2, uri));
            }
        }
        return aVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v1() {
        n.d dVar = (n.d) this.f.pollFirst();
        if (dVar == null) {
            this.b.d();
        } else {
            this.h.j(dVar.c(), dVar.d(), this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w1(Throwable th) {
        RtspMediaSource.RtspPlaybackException rtspPlaybackException = th instanceof RtspMediaSource.RtspPlaybackException ? (RtspMediaSource.RtspPlaybackException) th : new RtspMediaSource.RtspPlaybackException(th);
        if (this.s) {
            this.b.c(rtspPlaybackException);
        } else {
            this.a.b(s48.e(th.getMessage()), th);
        }
    }

    private Socket x1(Uri uri) {
        ur.a(uri.getHost() != null);
        return this.d.createSocket((String) ur.e(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : 554);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z1(List list) {
        if (this.e) {
            a84.b("RtspClient", ys3.g("\n").d(list));
        }
    }

    public void A1(int i, s.b bVar) {
        this.j.i(i, bVar);
    }

    public void B1() {
        try {
            close();
            s sVar = new s(new c());
            this.j = sVar;
            sVar.h(x1(this.i));
            this.l = null;
            this.t = false;
            this.n = null;
        } catch (IOException e2) {
            this.b.c(new RtspMediaSource.RtspPlaybackException(e2));
        }
    }

    public void C1(long j) {
        if (this.r == 2 && !this.u) {
            this.h.f(this.i, (String) ur.e(this.l));
        }
        this.w = j;
    }

    public void E1(List list) {
        this.f.addAll(list);
        v1();
    }

    public void F1() {
        this.r = 1;
    }

    public void G1(long j) {
        this.h.g(this.i, j, (String) ur.e(this.l));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.m;
        if (bVar != null) {
            bVar.close();
            this.m = null;
            this.h.k(this.i, (String) ur.e(this.l));
        }
        this.j.close();
    }

    public void start() {
        try {
            this.j.h(x1(this.i));
            this.h.e(this.i, this.l);
        } catch (IOException e2) {
            z19.n(this.j);
            throw e2;
        }
    }

    public int y1() {
        return this.r;
    }
}
