package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.e;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.h;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.w0;
import defpackage.a84;
import defpackage.ax7;
import defpackage.cy6;
import defpackage.dr5;
import defpackage.eb4;
import defpackage.f8;
import defpackage.fw1;
import defpackage.k60;
import defpackage.mh2;
import defpackage.mm0;
import defpackage.n72;
import defpackage.ob;
import defpackage.pi4;
import defpackage.q19;
import defpackage.rg1;
import defpackage.sq8;
import defpackage.t81;
import defpackage.u81;
import defpackage.ur;
import defpackage.us0;
import defpackage.v64;
import defpackage.x64;
import defpackage.x81;
import defpackage.z19;
import defpackage.zj0;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class DashMediaSource extends com.google.android.exoplayer2.source.a {
    private final SparseArray B;
    private final Runnable H;
    private final Runnable L;
    private final e.b M;
    private final x64 N;
    private com.google.android.exoplayer2.upstream.a Q;
    private Loader S;
    private sq8 X;
    private IOException Y;
    private Handler Z;
    private w0.g e0;
    private Uri f0;
    private Uri g0;
    private final w0 h;
    private t81 h0;
    private final boolean i;
    private boolean i0;
    private final a.InterfaceC0194a j;
    private long j0;
    private final a.InterfaceC0184a k;
    private long k0;
    private final us0 l;
    private long l0;
    private final i m;
    private int m0;
    private final com.google.android.exoplayer2.upstream.h n;
    private long n0;
    private int o0;
    private final k60 r;
    private final long s;
    private final long t;
    private final p.a u;
    private final i.a w;
    private final e x;
    private final Object y;

    public static final class Factory implements q {
        public static final /* synthetic */ int k = 0;
        private final a.InterfaceC0184a c;
        private final a.InterfaceC0194a d;
        private fw1 e;
        private us0 f;
        private com.google.android.exoplayer2.upstream.h g;
        private long h;
        private long i;
        private i.a j;

        public Factory(a.InterfaceC0194a interfaceC0194a) {
            this(new c.a(interfaceC0194a), interfaceC0194a);
        }

        @Override // com.google.android.exoplayer2.source.o.a
        public int[] b() {
            return new int[]{0};
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public DashMediaSource a(w0 w0Var) {
            ur.e(w0Var.b);
            i.a aVar = this.j;
            if (aVar == null) {
                aVar = new u81();
            }
            List list = w0Var.b.e;
            return new DashMediaSource(w0Var, null, this.d, !list.isEmpty() ? new mh2(aVar, list) : aVar, this.c, this.f, null, this.e.a(w0Var), this.g, this.h, this.i, null);
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory c(fw1 fw1Var) {
            this.e = (fw1) ur.f(fw1Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory d(com.google.android.exoplayer2.upstream.h hVar) {
            this.g = (com.google.android.exoplayer2.upstream.h) ur.f(hVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(a.InterfaceC0184a interfaceC0184a, a.InterfaceC0194a interfaceC0194a) {
            this.c = (a.InterfaceC0184a) ur.e(interfaceC0184a);
            this.d = interfaceC0194a;
            this.e = new com.google.android.exoplayer2.drm.g();
            this.g = new com.google.android.exoplayer2.upstream.g();
            this.h = 30000L;
            this.i = 5000000L;
            this.f = new rg1();
        }
    }

    class a implements ax7.b {
        a() {
        }

        @Override // ax7.b
        public void a() {
            DashMediaSource.this.a0(ax7.h());
        }

        @Override // ax7.b
        public void b(IOException iOException) {
            DashMediaSource.this.Z(iOException);
        }
    }

    private static final class b extends g2 {
        private final long f;
        private final long g;
        private final long h;
        private final int i;
        private final long j;
        private final long k;
        private final long l;
        private final t81 m;
        private final w0 n;
        private final w0.g r;

        public b(long j, long j2, long j3, int i, long j4, long j5, long j6, t81 t81Var, w0 w0Var, w0.g gVar) {
            ur.g(t81Var.d == (gVar != null));
            this.f = j;
            this.g = j2;
            this.h = j3;
            this.i = i;
            this.j = j4;
            this.k = j5;
            this.l = j6;
            this.m = t81Var;
            this.n = w0Var;
            this.r = gVar;
        }

        private long x(long j) {
            x81 l;
            long j2 = this.l;
            if (!y(this.m)) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.k) {
                    return -9223372036854775807L;
                }
            }
            long j3 = this.j + j2;
            long g = this.m.g(0);
            int i = 0;
            while (i < this.m.e() - 1 && j3 >= g) {
                j3 -= g;
                i++;
                g = this.m.g(i);
            }
            dr5 d = this.m.d(i);
            int a = d.a(2);
            return (a == -1 || (l = ((cy6) ((f8) d.c.get(a)).c.get(0)).l()) == null || l.h(g) == 0) ? j2 : (j2 + l.b(l.g(j3, g))) - j3;
        }

        private static boolean y(t81 t81Var) {
            return t81Var.d && t81Var.e != -9223372036854775807L && t81Var.b == -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.g2
        public int g(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.i) >= 0 && intValue < n()) {
                return intValue;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.g2
        public g2.b l(int i, g2.b bVar, boolean z) {
            ur.c(i, 0, n());
            return bVar.x(z ? this.m.d(i).a : null, z ? Integer.valueOf(this.i + i) : null, 0, this.m.g(i), z19.D0(this.m.d(i).b - this.m.d(0).b) - this.j);
        }

        @Override // com.google.android.exoplayer2.g2
        public int n() {
            return this.m.e();
        }

        @Override // com.google.android.exoplayer2.g2
        public Object r(int i) {
            ur.c(i, 0, n());
            return Integer.valueOf(this.i + i);
        }

        @Override // com.google.android.exoplayer2.g2
        public g2.d t(int i, g2.d dVar, long j) {
            ur.c(i, 0, 1);
            long x = x(j);
            Object obj = g2.d.u;
            w0 w0Var = this.n;
            t81 t81Var = this.m;
            return dVar.j(obj, w0Var, t81Var, this.f, this.g, this.h, true, y(t81Var), this.r, x, this.k, 0, n() - 1, this.j);
        }

        @Override // com.google.android.exoplayer2.g2
        public int u() {
            return 1;
        }
    }

    private final class c implements e.b {
        private c() {
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void a(long j) {
            DashMediaSource.this.S(j);
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void b() {
            DashMediaSource.this.T();
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    static final class d implements i.a {
        private static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // com.google.android.exoplayer2.upstream.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, zj0.c)).readLine();
            try {
                Matcher matcher = a.matcher(readLine);
                if (!matcher.matches()) {
                    throw ParserException.c("Couldn't parse timestamp: " + readLine, null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!QueryKeys.MEMFLY_API_VERSION.equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j * (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw ParserException.c(null, e);
            }
        }
    }

    private final class e implements Loader.b {
        private e() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(com.google.android.exoplayer2.upstream.i iVar, long j, long j2, boolean z) {
            DashMediaSource.this.U(iVar, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void k(com.google.android.exoplayer2.upstream.i iVar, long j, long j2) {
            DashMediaSource.this.V(iVar, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c o(com.google.android.exoplayer2.upstream.i iVar, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.W(iVar, j, j2, iOException, i);
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    final class f implements x64 {
        f() {
        }

        private void b() {
            if (DashMediaSource.this.Y != null) {
                throw DashMediaSource.this.Y;
            }
        }

        @Override // defpackage.x64
        public void a() {
            DashMediaSource.this.S.a();
            b();
        }
    }

    private final class g implements Loader.b {
        private g() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(com.google.android.exoplayer2.upstream.i iVar, long j, long j2, boolean z) {
            DashMediaSource.this.U(iVar, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void k(com.google.android.exoplayer2.upstream.i iVar, long j, long j2) {
            DashMediaSource.this.X(iVar, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c o(com.google.android.exoplayer2.upstream.i iVar, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.Y(iVar, j, j2, iOException);
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    private static final class h implements i.a {
        private h() {
        }

        @Override // com.google.android.exoplayer2.upstream.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(z19.K0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        n72.a("goog.exo.dash");
    }

    /* synthetic */ DashMediaSource(w0 w0Var, t81 t81Var, a.InterfaceC0194a interfaceC0194a, i.a aVar, a.InterfaceC0184a interfaceC0184a, us0 us0Var, mm0 mm0Var, com.google.android.exoplayer2.drm.i iVar, com.google.android.exoplayer2.upstream.h hVar, long j, long j2, a aVar2) {
        this(w0Var, t81Var, interfaceC0194a, aVar, interfaceC0184a, us0Var, mm0Var, iVar, hVar, j, j2);
    }

    private static long K(dr5 dr5Var, long j, long j2) {
        long D0 = z19.D0(dr5Var.b);
        boolean O = O(dr5Var);
        long j3 = Long.MAX_VALUE;
        for (int i = 0; i < dr5Var.c.size(); i++) {
            f8 f8Var = (f8) dr5Var.c.get(i);
            List list = f8Var.c;
            int i2 = f8Var.b;
            boolean z = (i2 == 1 || i2 == 2) ? false : true;
            if ((!O || !z) && !list.isEmpty()) {
                x81 l = ((cy6) list.get(0)).l();
                if (l == null) {
                    return D0 + j;
                }
                long k = l.k(j, j2);
                if (k == 0) {
                    return D0;
                }
                long d2 = (l.d(j, j2) + k) - 1;
                j3 = Math.min(j3, l.c(d2, j) + l.b(d2) + D0);
            }
        }
        return j3;
    }

    private static long L(dr5 dr5Var, long j, long j2) {
        long D0 = z19.D0(dr5Var.b);
        boolean O = O(dr5Var);
        long j3 = D0;
        for (int i = 0; i < dr5Var.c.size(); i++) {
            f8 f8Var = (f8) dr5Var.c.get(i);
            List list = f8Var.c;
            int i2 = f8Var.b;
            boolean z = (i2 == 1 || i2 == 2) ? false : true;
            if ((!O || !z) && !list.isEmpty()) {
                x81 l = ((cy6) list.get(0)).l();
                if (l == null || l.k(j, j2) == 0) {
                    return D0;
                }
                j3 = Math.max(j3, l.b(l.d(j, j2)) + D0);
            }
        }
        return j3;
    }

    private static long M(t81 t81Var, long j) {
        x81 l;
        int e2 = t81Var.e() - 1;
        dr5 d2 = t81Var.d(e2);
        long D0 = z19.D0(d2.b);
        long g2 = t81Var.g(e2);
        long D02 = z19.D0(j);
        long D03 = z19.D0(t81Var.a);
        long D04 = z19.D0(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT);
        for (int i = 0; i < d2.c.size(); i++) {
            List list = ((f8) d2.c.get(i)).c;
            if (!list.isEmpty() && (l = ((cy6) list.get(0)).l()) != null) {
                long e3 = ((D03 + D0) + l.e(g2, D02)) - D02;
                if (e3 < D04 - 100000 || (e3 > D04 && e3 < D04 + 100000)) {
                    D04 = e3;
                }
            }
        }
        return eb4.a(D04, 1000L, RoundingMode.CEILING);
    }

    private long N() {
        return Math.min((this.m0 - 1) * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, CrashReportManager.TIME_WINDOW);
    }

    private static boolean O(dr5 dr5Var) {
        for (int i = 0; i < dr5Var.c.size(); i++) {
            int i2 = ((f8) dr5Var.c.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean P(dr5 dr5Var) {
        for (int i = 0; i < dr5Var.c.size(); i++) {
            x81 l = ((cy6) ((f8) dr5Var.c.get(i)).c.get(0)).l();
            if (l == null || l.i()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        b0(false);
    }

    private void R() {
        ax7.j(this.S, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(IOException iOException) {
        a84.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        b0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(long j) {
        this.l0 = j;
        b0(true);
    }

    private void b0(boolean z) {
        dr5 dr5Var;
        long j;
        long j2;
        for (int i = 0; i < this.B.size(); i++) {
            int keyAt = this.B.keyAt(i);
            if (keyAt >= this.o0) {
                ((com.google.android.exoplayer2.source.dash.b) this.B.valueAt(i)).M(this.h0, keyAt - this.o0);
            }
        }
        dr5 d2 = this.h0.d(0);
        int e2 = this.h0.e() - 1;
        dr5 d3 = this.h0.d(e2);
        long g2 = this.h0.g(e2);
        long D0 = z19.D0(z19.d0(this.l0));
        long L = L(d2, this.h0.g(0), D0);
        long K = K(d3, g2, D0);
        boolean z2 = this.h0.d && !P(d3);
        if (z2) {
            long j3 = this.h0.f;
            if (j3 != -9223372036854775807L) {
                L = Math.max(L, K - z19.D0(j3));
            }
        }
        long j4 = K - L;
        t81 t81Var = this.h0;
        if (t81Var.d) {
            ur.g(t81Var.a != -9223372036854775807L);
            long D02 = (D0 - z19.D0(this.h0.a)) - L;
            i0(D02, j4);
            long h1 = this.h0.a + z19.h1(L);
            long D03 = D02 - z19.D0(this.e0.a);
            long min = Math.min(this.t, j4 / 2);
            j = h1;
            j2 = D03 < min ? min : D03;
            dr5Var = d2;
        } else {
            dr5Var = d2;
            j = -9223372036854775807L;
            j2 = 0;
        }
        long D04 = L - z19.D0(dr5Var.b);
        t81 t81Var2 = this.h0;
        C(new b(t81Var2.a, j, this.l0, this.o0, D04, j4, j2, t81Var2, this.h, t81Var2.d ? this.e0 : null));
        if (this.i) {
            return;
        }
        this.Z.removeCallbacks(this.L);
        if (z2) {
            this.Z.postDelayed(this.L, M(this.h0, z19.d0(this.l0)));
        }
        if (this.i0) {
            h0();
            return;
        }
        if (z) {
            t81 t81Var3 = this.h0;
            if (t81Var3.d) {
                long j5 = t81Var3.e;
                if (j5 != -9223372036854775807L) {
                    if (j5 == 0) {
                        j5 = BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT;
                    }
                    f0(Math.max(0L, (this.j0 + j5) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void c0(q19 q19Var) {
        String str = q19Var.a;
        if (z19.c(str, "urn:mpeg:dash:utc:direct:2014") || z19.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            d0(q19Var);
            return;
        }
        if (z19.c(str, "urn:mpeg:dash:utc:http-iso:2014") || z19.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            e0(q19Var, new d());
            return;
        }
        if (z19.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || z19.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            e0(q19Var, new h(null));
        } else if (z19.c(str, "urn:mpeg:dash:utc:ntp:2014") || z19.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            R();
        } else {
            Z(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void d0(q19 q19Var) {
        try {
            a0(z19.K0(q19Var.b) - this.k0);
        } catch (ParserException e2) {
            Z(e2);
        }
    }

    private void e0(q19 q19Var, i.a aVar) {
        g0(new com.google.android.exoplayer2.upstream.i(this.Q, Uri.parse(q19Var.b), 5, aVar), new g(this, null), 1);
    }

    private void f0(long j) {
        this.Z.postDelayed(this.H, j);
    }

    private void g0(com.google.android.exoplayer2.upstream.i iVar, Loader.b bVar, int i) {
        this.u.y(new v64(iVar.a, iVar.b, this.S.n(iVar, bVar, i)), iVar.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        Uri uri;
        this.Z.removeCallbacks(this.H);
        if (this.S.i()) {
            return;
        }
        if (this.S.j()) {
            this.i0 = true;
            return;
        }
        synchronized (this.y) {
            uri = this.f0;
        }
        this.i0 = false;
        g0(new com.google.android.exoplayer2.upstream.i(this.Q, uri, 4, this.w), this.x, this.n.b(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i0(long r18, long r20) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.i0(long, long):void");
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void B(sq8 sq8Var) {
        this.X = sq8Var;
        this.m.b(Looper.myLooper(), z());
        this.m.Z();
        if (this.i) {
            b0(false);
            return;
        }
        this.Q = this.j.a();
        this.S = new Loader("DashMediaSource");
        this.Z = z19.w();
        h0();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D() {
        this.i0 = false;
        this.Q = null;
        Loader loader = this.S;
        if (loader != null) {
            loader.l();
            this.S = null;
        }
        this.j0 = 0L;
        this.k0 = 0L;
        this.h0 = this.i ? this.h0 : null;
        this.f0 = this.g0;
        this.Y = null;
        Handler handler = this.Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.Z = null;
        }
        this.l0 = -9223372036854775807L;
        this.m0 = 0;
        this.n0 = -9223372036854775807L;
        this.B.clear();
        this.r.i();
        this.m.release();
    }

    void S(long j) {
        long j2 = this.n0;
        if (j2 == -9223372036854775807L || j2 < j) {
            this.n0 = j;
        }
    }

    void T() {
        this.Z.removeCallbacks(this.L);
        h0();
    }

    void U(com.google.android.exoplayer2.upstream.i iVar, long j, long j2) {
        v64 v64Var = new v64(iVar.a, iVar.b, iVar.f(), iVar.d(), j, j2, iVar.b());
        this.n.d(iVar.a);
        this.u.p(v64Var, iVar.c);
    }

    void V(com.google.android.exoplayer2.upstream.i iVar, long j, long j2) {
        v64 v64Var = new v64(iVar.a, iVar.b, iVar.f(), iVar.d(), j, j2, iVar.b());
        this.n.d(iVar.a);
        this.u.s(v64Var, iVar.c);
        t81 t81Var = (t81) iVar.e();
        t81 t81Var2 = this.h0;
        int e2 = t81Var2 == null ? 0 : t81Var2.e();
        long j3 = t81Var.d(0).b;
        int i = 0;
        while (i < e2 && this.h0.d(i).b < j3) {
            i++;
        }
        if (t81Var.d) {
            if (e2 - i > t81Var.e()) {
                a84.j("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j4 = this.n0;
                if (j4 == -9223372036854775807L || t81Var.h * 1000 > j4) {
                    this.m0 = 0;
                } else {
                    a84.j("DashMediaSource", "Loaded stale dynamic manifest: " + t81Var.h + ", " + this.n0);
                }
            }
            int i2 = this.m0;
            this.m0 = i2 + 1;
            if (i2 < this.n.b(iVar.c)) {
                f0(N());
                return;
            } else {
                this.Y = new DashManifestStaleException();
                return;
            }
        }
        this.h0 = t81Var;
        this.i0 = t81Var.d & this.i0;
        this.j0 = j - j2;
        this.k0 = j;
        synchronized (this.y) {
            try {
                if (iVar.b.a == this.f0) {
                    Uri uri = this.h0.k;
                    if (uri == null) {
                        uri = iVar.f();
                    }
                    this.f0 = uri;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e2 != 0) {
            this.o0 += i;
            b0(true);
            return;
        }
        t81 t81Var3 = this.h0;
        if (!t81Var3.d) {
            b0(true);
            return;
        }
        q19 q19Var = t81Var3.i;
        if (q19Var != null) {
            c0(q19Var);
        } else {
            R();
        }
    }

    Loader.c W(com.google.android.exoplayer2.upstream.i iVar, long j, long j2, IOException iOException, int i) {
        v64 v64Var = new v64(iVar.a, iVar.b, iVar.f(), iVar.d(), j, j2, iVar.b());
        long a2 = this.n.a(new h.c(v64Var, new pi4(iVar.c), iOException, i));
        Loader.c h2 = a2 == -9223372036854775807L ? Loader.g : Loader.h(false, a2);
        boolean c2 = h2.c();
        this.u.w(v64Var, iVar.c, iOException, !c2);
        if (!c2) {
            this.n.d(iVar.a);
        }
        return h2;
    }

    void X(com.google.android.exoplayer2.upstream.i iVar, long j, long j2) {
        v64 v64Var = new v64(iVar.a, iVar.b, iVar.f(), iVar.d(), j, j2, iVar.b());
        this.n.d(iVar.a);
        this.u.s(v64Var, iVar.c);
        a0(((Long) iVar.e()).longValue() - j);
    }

    Loader.c Y(com.google.android.exoplayer2.upstream.i iVar, long j, long j2, IOException iOException) {
        this.u.w(new v64(iVar.a, iVar.b, iVar.f(), iVar.d(), j, j2, iVar.b()), iVar.c, iOException, true);
        this.n.d(iVar.a);
        Z(iOException);
        return Loader.f;
    }

    @Override // com.google.android.exoplayer2.source.o
    public w0 f() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.source.o
    public n g(o.b bVar, ob obVar, long j) {
        int intValue = ((Integer) bVar.a).intValue() - this.o0;
        p.a w = w(bVar);
        com.google.android.exoplayer2.source.dash.b bVar2 = new com.google.android.exoplayer2.source.dash.b(intValue + this.o0, this.h0, this.r, intValue, this.k, this.X, null, this.m, u(bVar), this.n, w, this.l0, this.N, obVar, this.l, this.M, z());
        this.B.put(bVar2.a, bVar2);
        return bVar2;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void h(n nVar) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) nVar;
        bVar.I();
        this.B.remove(bVar.a);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void p() {
        this.N.a();
    }

    private DashMediaSource(w0 w0Var, t81 t81Var, a.InterfaceC0194a interfaceC0194a, i.a aVar, a.InterfaceC0184a interfaceC0184a, us0 us0Var, mm0 mm0Var, com.google.android.exoplayer2.drm.i iVar, com.google.android.exoplayer2.upstream.h hVar, long j, long j2) {
        this.h = w0Var;
        this.e0 = w0Var.d;
        this.f0 = ((w0.h) ur.e(w0Var.b)).a;
        this.g0 = w0Var.b.a;
        this.h0 = t81Var;
        this.j = interfaceC0194a;
        this.w = aVar;
        this.k = interfaceC0184a;
        this.m = iVar;
        this.n = hVar;
        this.s = j;
        this.t = j2;
        this.l = us0Var;
        this.r = new k60();
        boolean z = t81Var != null;
        this.i = z;
        a aVar2 = null;
        this.u = w(null);
        this.y = new Object();
        this.B = new SparseArray();
        this.M = new c(this, aVar2);
        this.n0 = -9223372036854775807L;
        this.l0 = -9223372036854775807L;
        if (!z) {
            this.x = new e(this, aVar2);
            this.N = new f();
            this.H = new Runnable() { // from class: v81
                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.h0();
                }
            };
            this.L = new Runnable() { // from class: w81
                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.Q();
                }
            };
            return;
        }
        ur.g(true ^ t81Var.d);
        this.x = null;
        this.H = null;
        this.L = null;
        this.N = new x64.a();
    }
}
