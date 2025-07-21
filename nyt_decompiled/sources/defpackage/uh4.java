package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.j;
import com.google.android.exoplayer2.mediacodec.k;
import com.google.android.exoplayer2.mediacodec.l;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.android.gms.common.Scopes;
import com.google.common.collect.ImmutableList;
import defpackage.pq2;
import defpackage.v89;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class uh4 extends MediaCodecRenderer {
    private static final int[] N1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean O1;
    private static boolean P1;
    private int A1;
    private int B1;
    private long C1;
    private long D1;
    private long E1;
    private int F1;
    private long G1;
    private z89 H1;
    private z89 I1;
    private boolean J1;
    private int K1;
    c L1;
    private u79 M1;
    private final Context f1;
    private final y79 g1;
    private final v89.a h1;
    private final d i1;
    private final long j1;
    private final int k1;
    private final boolean l1;
    private b m1;
    private boolean n1;
    private boolean o1;
    private Surface p1;
    private PlaceholderSurface q1;
    private boolean r1;
    private int s1;
    private boolean t1;
    private boolean u1;
    private boolean v1;
    private long w1;
    private long x1;
    private long y1;
    private int z1;

    private static final class a {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    protected static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    private final class c implements j.c, Handler.Callback {
        private final Handler a;

        public c(j jVar) {
            Handler x = z19.x(this);
            this.a = x;
            jVar.c(this, x);
        }

        private void b(long j) {
            uh4 uh4Var = uh4.this;
            if (this != uh4Var.L1 || uh4Var.B0() == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                uh4.this.r2();
                return;
            }
            try {
                uh4.this.q2(j);
            } catch (ExoPlaybackException e) {
                uh4.this.t1(e);
            }
        }

        @Override // com.google.android.exoplayer2.mediacodec.j.c
        public void a(j jVar, long j, long j2) {
            if (z19.a >= 30) {
                b(j);
            } else {
                this.a.sendMessageAtFrontOfQueue(Message.obtain(this.a, 0, (int) (j >> 32), (int) j));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(z19.e1(message.arg1, message.arg2));
            return true;
        }
    }

    private static final class d {
        private final y79 a;
        private final uh4 b;
        private Handler e;
        private CopyOnWriteArrayList f;
        private Pair g;
        private Pair h;
        private boolean k;
        private boolean l;
        private final ArrayDeque c = new ArrayDeque();
        private final ArrayDeque d = new ArrayDeque();
        private int i = -1;
        private boolean j = true;
        private long m = -9223372036854775807L;
        private z89 n = z89.e;
        private long o = -9223372036854775807L;
        private long p = -9223372036854775807L;

        class a {
            final /* synthetic */ t0 a;

            a(t0 t0Var) {
                this.a = t0Var;
            }
        }

        private static final class b {
            private static Constructor a;
            private static Method b;
            private static Method c;
            private static Constructor d;
            private static Method e;

            public static oy1 a(float f) {
                c();
                Object newInstance = a.newInstance(null);
                b.invoke(newInstance, Float.valueOf(f));
                lh4.a(ur.e(c.invoke(newInstance, null)));
                return null;
            }

            public static v79 b() {
                c();
                lh4.a(ur.e(e.invoke(d.newInstance(null), null)));
                return null;
            }

            private static void c() {
                if (a == null || b == null || c == null) {
                    Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
                    a = cls.getConstructor(null);
                    b = cls.getMethod("setRotationDegrees", Float.TYPE);
                    c = cls.getMethod("build", null);
                }
                if (d == null || e == null) {
                    Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    d = cls2.getConstructor(null);
                    e = cls2.getMethod("build", null);
                }
            }
        }

        public d(y79 y79Var, uh4 uh4Var) {
            this.a = y79Var;
            this.b = uh4Var;
        }

        private void k(long j, boolean z) {
            ur.i(null);
            throw null;
        }

        public MediaFormat a(MediaFormat mediaFormat) {
            if (z19.a >= 29 && this.b.f1.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
                mediaFormat.setInteger("allow-frame-drop", 0);
            }
            return mediaFormat;
        }

        public void b() {
            lh4.a(ur.e(null));
            throw null;
        }

        public void c() {
            ur.i(null);
            throw null;
        }

        public long d(long j, long j2) {
            ur.g(this.p != -9223372036854775807L);
            return (j + j2) - this.p;
        }

        public Surface e() {
            lh4.a(ur.e(null));
            throw null;
        }

        public boolean f() {
            return false;
        }

        public boolean g() {
            Pair pair = this.h;
            return pair == null || !((bu7) pair.second).equals(bu7.c);
        }

        public boolean h(t0 t0Var, long j) {
            int i;
            ur.g(!f());
            if (!this.j) {
                return false;
            }
            if (this.f == null) {
                this.j = false;
                return false;
            }
            this.e = z19.w();
            Pair Y1 = this.b.Y1(t0Var.L);
            try {
                if (!uh4.S1() && (i = t0Var.x) != 0) {
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f;
                    b.a(i);
                    copyOnWriteArrayList.add(0, null);
                }
                b.b();
                Context unused = this.b.f1;
                mc1 mc1Var = mc1.a;
                Handler handler = this.e;
                Objects.requireNonNull(handler);
                new gm4(handler);
                new a(t0Var);
                throw null;
            } catch (Exception e) {
                throw this.b.J(e, t0Var, 7000);
            }
        }

        public boolean i(t0 t0Var, long j, boolean z) {
            ur.i(null);
            ur.g(this.i != -1);
            throw null;
        }

        public void j(String str) {
            this.i = z19.b0(this.b.f1, str, false);
        }

        public void l(long j, long j2) {
            ur.i(null);
            while (!this.c.isEmpty()) {
                boolean z = false;
                boolean z2 = this.b.getState() == 2;
                long longValue = ((Long) ur.e((Long) this.c.peek())).longValue();
                long j3 = longValue + this.p;
                long P1 = this.b.P1(j, j2, SystemClock.elapsedRealtime() * 1000, j3, z2);
                if (this.k && this.c.size() == 1) {
                    z = true;
                }
                if (this.b.C2(j, P1)) {
                    k(-1L, z);
                    return;
                }
                if (!z2 || j == this.b.w1 || P1 > 50000) {
                    return;
                }
                this.a.h(j3);
                long b2 = this.a.b(System.nanoTime() + (P1 * 1000));
                if (this.b.B2((b2 - System.nanoTime()) / 1000, j2, z)) {
                    k(-2L, z);
                } else {
                    if (!this.d.isEmpty() && j3 > ((Long) ((Pair) this.d.peek()).first).longValue()) {
                        this.g = (Pair) this.d.remove();
                    }
                    this.b.p2(longValue, b2, (t0) this.g.second);
                    if (this.o >= j3) {
                        this.o = -9223372036854775807L;
                        this.b.m2(this.n);
                    }
                    k(b2, z);
                }
            }
        }

        public boolean m() {
            return this.l;
        }

        public void n() {
            lh4.a(ur.e(null));
            throw null;
        }

        public void o(t0 t0Var) {
            lh4.a(ur.e(null));
            new pq2.b(t0Var.t, t0Var.u).b(t0Var.y).a();
            throw null;
        }

        public void p(Surface surface, bu7 bu7Var) {
            Pair pair = this.h;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((bu7) this.h.second).equals(bu7Var)) {
                return;
            }
            this.h = Pair.create(surface, bu7Var);
            if (f()) {
                lh4.a(ur.e(null));
                new zc8(surface, bu7Var.b(), bu7Var.a());
                throw null;
            }
        }

        public void q(List list) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f;
            if (copyOnWriteArrayList == null) {
                this.f = new CopyOnWriteArrayList(list);
            } else {
                copyOnWriteArrayList.clear();
                this.f.addAll(list);
            }
        }
    }

    public uh4(Context context, j.b bVar, l lVar, long j, boolean z, Handler handler, v89 v89Var, int i) {
        this(context, bVar, lVar, j, z, handler, v89Var, i, 30.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C2(long j, long j2) {
        boolean z = getState() == 2;
        boolean z2 = this.v1 ? !this.t1 : z || this.u1;
        long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.D1;
        if (this.x1 != -9223372036854775807L || j < I0()) {
            return false;
        }
        return z2 || (z && D2(j2, elapsedRealtime));
    }

    private boolean E2(k kVar) {
        return z19.a >= 23 && !this.J1 && !T1(kVar.a) && (!kVar.g || PlaceholderSurface.b(this.f1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long P1(long j, long j2, long j3, long j4, boolean z) {
        long J0 = (long) ((j4 - j) / J0());
        return z ? J0 - (j3 - j2) : J0;
    }

    private void Q1() {
        j B0;
        this.t1 = false;
        if (z19.a < 23 || !this.J1 || (B0 = B0()) == null) {
            return;
        }
        this.L1 = new c(B0);
    }

    private void R1() {
        this.I1 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean S1() {
        return z19.a >= 21;
    }

    private static void U1(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    private static boolean V1() {
        return "NVIDIA".equals(z19.c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x073c, code lost:
    
        if (r11.equals("A10-70L") == false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean X1() {
        /*
            Method dump skipped, instructions count: 3180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh4.X1():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007a, code lost:
    
        if (r8.equals("video/av01") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int Z1(com.google.android.exoplayer2.mediacodec.k r10, com.google.android.exoplayer2.t0 r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh4.Z1(com.google.android.exoplayer2.mediacodec.k, com.google.android.exoplayer2.t0):int");
    }

    private static Point a2(k kVar, t0 t0Var) {
        int i = t0Var.u;
        int i2 = t0Var.t;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : N1) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (z19.a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point c2 = kVar.c(i6, i4);
                if (kVar.w(c2.x, c2.y, t0Var.w)) {
                    return c2;
                }
            } else {
                try {
                    int l = z19.l(i4, 16) * 16;
                    int l2 = z19.l(i5, 16) * 16;
                    if (l * l2 <= MediaCodecUtil.P()) {
                        int i7 = z ? l2 : l;
                        if (!z) {
                            l = l2;
                        }
                        return new Point(i7, l);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    private static List c2(Context context, l lVar, t0 t0Var, boolean z, boolean z2) {
        String str = t0Var.l;
        if (str == null) {
            return ImmutableList.x();
        }
        if (z19.a >= 26 && "video/dolby-vision".equals(str) && !a.a(context)) {
            List n = MediaCodecUtil.n(lVar, t0Var, z, z2);
            if (!n.isEmpty()) {
                return n;
            }
        }
        return MediaCodecUtil.v(lVar, t0Var, z, z2);
    }

    protected static int d2(k kVar, t0 t0Var) {
        if (t0Var.m == -1) {
            return Z1(kVar, t0Var);
        }
        int size = t0Var.n.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) t0Var.n.get(i2)).length;
        }
        return t0Var.m + i;
    }

    private static int e2(int i, int i2) {
        return (i * 3) / (i2 * 2);
    }

    private static boolean g2(long j) {
        return j < -30000;
    }

    private static boolean h2(long j) {
        return j < -500000;
    }

    private void j2() {
        if (this.z1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.h1.n(this.z1, elapsedRealtime - this.y1);
            this.z1 = 0;
            this.y1 = elapsedRealtime;
        }
    }

    private void l2() {
        int i = this.F1;
        if (i != 0) {
            this.h1.B(this.E1, i);
            this.E1 = 0L;
            this.F1 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m2(z89 z89Var) {
        if (z89Var.equals(z89.e) || z89Var.equals(this.I1)) {
            return;
        }
        this.I1 = z89Var;
        this.h1.D(z89Var);
    }

    private void n2() {
        if (this.r1) {
            this.h1.A(this.p1);
        }
    }

    private void o2() {
        z89 z89Var = this.I1;
        if (z89Var != null) {
            this.h1.D(z89Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p2(long j, long j2, t0 t0Var) {
        u79 u79Var = this.M1;
        if (u79Var != null) {
            u79Var.b(j, j2, t0Var, F0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r2() {
        s1();
    }

    private void s2() {
        Surface surface = this.p1;
        PlaceholderSurface placeholderSurface = this.q1;
        if (surface == placeholderSurface) {
            this.p1 = null;
        }
        placeholderSurface.release();
        this.q1 = null;
    }

    private void u2(j jVar, t0 t0Var, int i, long j, boolean z) {
        long d2 = this.i1.f() ? this.i1.d(j, I0()) * 1000 : System.nanoTime();
        if (z) {
            p2(j, d2, t0Var);
        }
        if (z19.a >= 21) {
            v2(jVar, i, j, d2);
        } else {
            t2(jVar, i, j);
        }
    }

    private static void w2(j jVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        jVar.i(bundle);
    }

    private void x2() {
        this.x1 = this.j1 > 0 ? SystemClock.elapsedRealtime() + this.j1 : -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.f, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, uh4] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.view.Surface] */
    private void y2(Object obj) {
        PlaceholderSurface placeholderSurface = obj instanceof Surface ? (Surface) obj : null;
        if (placeholderSurface == null) {
            PlaceholderSurface placeholderSurface2 = this.q1;
            if (placeholderSurface2 != null) {
                placeholderSurface = placeholderSurface2;
            } else {
                k C0 = C0();
                if (C0 != null && E2(C0)) {
                    placeholderSurface = PlaceholderSurface.c(this.f1, C0.g);
                    this.q1 = placeholderSurface;
                }
            }
        }
        if (this.p1 == placeholderSurface) {
            if (placeholderSurface == null || placeholderSurface == this.q1) {
                return;
            }
            o2();
            n2();
            return;
        }
        this.p1 = placeholderSurface;
        this.g1.m(placeholderSurface);
        this.r1 = false;
        int state = getState();
        j B0 = B0();
        if (B0 != null && !this.i1.f()) {
            if (z19.a < 23 || placeholderSurface == null || this.n1) {
                k1();
                T0();
            } else {
                z2(B0, placeholderSurface);
            }
        }
        if (placeholderSurface == null || placeholderSurface == this.q1) {
            R1();
            Q1();
            if (this.i1.f()) {
                this.i1.b();
                return;
            }
            return;
        }
        o2();
        Q1();
        if (state == 2) {
            x2();
        }
        if (this.i1.f()) {
            this.i1.p(placeholderSurface, bu7.c);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z1
    public void A(float f, float f2) {
        super.A(f, f2);
        this.g1.i(f);
    }

    protected boolean A2(long j, long j2, boolean z) {
        return h2(j) && !z;
    }

    protected boolean B2(long j, long j2, boolean z) {
        return g2(j) && !z;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z1
    public void D(long j, long j2) {
        super.D(j, j2);
        if (this.i1.f()) {
            this.i1.l(j, j2);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean D0() {
        return this.J1 && z19.a < 23;
    }

    protected boolean D2(long j, long j2) {
        return g2(j) && j2 > 100000;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected float E0(float f, t0 t0Var, t0[] t0VarArr) {
        float f2 = -1.0f;
        for (t0 t0Var2 : t0VarArr) {
            float f3 = t0Var2.w;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    protected void F2(j jVar, int i, long j) {
        ep8.a("skipVideoBuffer");
        jVar.m(i, false);
        ep8.c();
        this.a1.f++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected List G0(l lVar, t0 t0Var, boolean z) {
        return MediaCodecUtil.w(c2(this.f1, lVar, t0Var, z, this.J1), t0Var);
    }

    protected void G2(int i, int i2) {
        wc1 wc1Var = this.a1;
        wc1Var.h += i;
        int i3 = i + i2;
        wc1Var.g += i3;
        this.z1 += i3;
        int i4 = this.A1 + i3;
        this.A1 = i4;
        wc1Var.i = Math.max(i4, wc1Var.i);
        int i5 = this.k1;
        if (i5 <= 0 || this.z1 < i5) {
            return;
        }
        j2();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected j.a H0(k kVar, t0 t0Var, MediaCrypto mediaCrypto, float f) {
        PlaceholderSurface placeholderSurface = this.q1;
        if (placeholderSurface != null && placeholderSurface.secure != kVar.g) {
            s2();
        }
        String str = kVar.c;
        b b2 = b2(kVar, t0Var, P());
        this.m1 = b2;
        MediaFormat f2 = f2(t0Var, str, b2, f, this.l1, this.J1 ? this.K1 : 0);
        if (this.p1 == null) {
            if (!E2(kVar)) {
                throw new IllegalStateException();
            }
            if (this.q1 == null) {
                this.q1 = PlaceholderSurface.c(this.f1, kVar.g);
            }
            this.p1 = this.q1;
        }
        if (this.i1.f()) {
            f2 = this.i1.a(f2);
        }
        return j.a.b(kVar, f2, t0Var, this.i1.f() ? this.i1.e() : this.p1, mediaCrypto);
    }

    protected void H2(long j) {
        this.a1.a(j);
        this.E1 += j;
        this.F1++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void K0(DecoderInputBuffer decoderInputBuffer) {
        if (this.o1) {
            ByteBuffer byteBuffer = (ByteBuffer) ur.e(decoderInputBuffer.f);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4) {
                    if (b4 == 0 || b4 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        w2(B0(), bArr);
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void R() {
        R1();
        Q1();
        this.r1 = false;
        this.L1 = null;
        try {
            super.R();
        } finally {
            this.h1.m(this.a1);
            this.h1.D(z89.e);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void S(boolean z, boolean z2) {
        super.S(z, z2);
        boolean z3 = L().a;
        ur.g((z3 && this.K1 == 0) ? false : true);
        if (this.J1 != z3) {
            this.J1 = z3;
            k1();
        }
        this.h1.o(this.a1);
        this.u1 = z2;
        this.v1 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void T(long j, boolean z) {
        super.T(j, z);
        if (this.i1.f()) {
            this.i1.c();
        }
        Q1();
        this.g1.j();
        this.C1 = -9223372036854775807L;
        this.w1 = -9223372036854775807L;
        this.A1 = 0;
        if (z) {
            x2();
        } else {
            this.x1 = -9223372036854775807L;
        }
    }

    protected boolean T1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (uh4.class) {
            try {
                if (!O1) {
                    P1 = X1();
                    O1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return P1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void V0(Exception exc) {
        a84.e("MediaCodecVideoRenderer", "Video codec error", exc);
        this.h1.C(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void W() {
        try {
            super.W();
        } finally {
            if (this.i1.f()) {
                this.i1.n();
            }
            if (this.q1 != null) {
                s2();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void W0(String str, j.a aVar, long j, long j2) {
        this.h1.k(str, j, j2);
        this.n1 = T1(str);
        this.o1 = ((k) ur.e(C0())).p();
        if (z19.a >= 23 && this.J1) {
            this.L1 = new c((j) ur.e(B0()));
        }
        this.i1.j(str);
    }

    protected void W1(j jVar, int i, long j) {
        ep8.a("dropVideoBuffer");
        jVar.m(i, false);
        ep8.c();
        G2(0, 1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void X() {
        super.X();
        this.z1 = 0;
        this.y1 = SystemClock.elapsedRealtime();
        this.D1 = SystemClock.elapsedRealtime() * 1000;
        this.E1 = 0L;
        this.F1 = 0;
        this.g1.k();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void X0(String str) {
        this.h1.l(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void Y() {
        this.x1 = -9223372036854775807L;
        j2();
        l2();
        this.g1.l();
        super.Y();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected yc1 Y0(ep2 ep2Var) {
        yc1 Y0 = super.Y0(ep2Var);
        this.h1.p(ep2Var.b, Y0);
        return Y0;
    }

    protected Pair Y1(sn0 sn0Var) {
        if (sn0.g(sn0Var)) {
            return sn0Var.c == 7 ? Pair.create(sn0Var, sn0Var.c().d(6).a()) : Pair.create(sn0Var, sn0Var);
        }
        sn0 sn0Var2 = sn0.f;
        return Pair.create(sn0Var2, sn0Var2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void Z0(t0 t0Var, MediaFormat mediaFormat) {
        int integer;
        int i;
        j B0 = B0();
        if (B0 != null) {
            B0.d(this.s1);
        }
        int i2 = 0;
        if (this.J1) {
            i = t0Var.t;
            integer = t0Var.u;
        } else {
            ur.e(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = t0Var.y;
        if (S1()) {
            int i3 = t0Var.x;
            if (i3 == 90 || i3 == 270) {
                f = 1.0f / f;
                int i4 = integer;
                integer = i;
                i = i4;
            }
        } else if (!this.i1.f()) {
            i2 = t0Var.x;
        }
        this.H1 = new z89(i, integer, i2, f);
        this.g1.g(t0Var.w);
        if (this.i1.f()) {
            this.i1.o(t0Var.c().n0(i).S(integer).f0(i2).c0(f).G());
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void b1(long j) {
        super.b1(j);
        if (this.J1) {
            return;
        }
        this.B1--;
    }

    protected b b2(k kVar, t0 t0Var, t0[] t0VarArr) {
        int Z1;
        int i = t0Var.t;
        int i2 = t0Var.u;
        int d2 = d2(kVar, t0Var);
        if (t0VarArr.length == 1) {
            if (d2 != -1 && (Z1 = Z1(kVar, t0Var)) != -1) {
                d2 = Math.min((int) (d2 * 1.5f), Z1);
            }
            return new b(i, i2, d2);
        }
        int length = t0VarArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            t0 t0Var2 = t0VarArr[i3];
            if (t0Var.L != null && t0Var2.L == null) {
                t0Var2 = t0Var2.c().L(t0Var.L).G();
            }
            if (kVar.f(t0Var, t0Var2).d != 0) {
                int i4 = t0Var2.t;
                z |= i4 == -1 || t0Var2.u == -1;
                i = Math.max(i, i4);
                i2 = Math.max(i2, t0Var2.u);
                d2 = Math.max(d2, d2(kVar, t0Var2));
            }
        }
        if (z) {
            a84.j("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + QueryKeys.SCROLL_POSITION_TOP + i2);
            Point a2 = a2(kVar, t0Var);
            if (a2 != null) {
                i = Math.max(i, a2.x);
                i2 = Math.max(i2, a2.y);
                d2 = Math.max(d2, Z1(kVar, t0Var.c().n0(i).S(i2).G()));
                a84.j("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + QueryKeys.SCROLL_POSITION_TOP + i2);
            }
        }
        return new b(i, i2, d2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void c1() {
        super.c1();
        Q1();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z1
    public boolean d() {
        boolean d2 = super.d();
        return this.i1.f() ? d2 & this.i1.m() : d2;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void d1(DecoderInputBuffer decoderInputBuffer) {
        boolean z = this.J1;
        if (!z) {
            this.B1++;
        }
        if (z19.a >= 23 || !z) {
            return;
        }
        q2(decoderInputBuffer.e);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void e1(t0 t0Var) {
        if (this.i1.f()) {
            return;
        }
        this.i1.h(t0Var, I0());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected yc1 f0(k kVar, t0 t0Var, t0 t0Var2) {
        yc1 f = kVar.f(t0Var, t0Var2);
        int i = f.e;
        int i2 = t0Var2.t;
        b bVar = this.m1;
        if (i2 > bVar.a || t0Var2.u > bVar.b) {
            i |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        if (d2(kVar, t0Var2) > this.m1.c) {
            i |= 64;
        }
        int i3 = i;
        return new yc1(kVar.a, t0Var, t0Var2, i3 != 0 ? 0 : f.d, i3);
    }

    protected MediaFormat f2(t0 t0Var, String str, b bVar, float f, boolean z, int i) {
        Pair r;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", t0Var.t);
        mediaFormat.setInteger("height", t0Var.u);
        bi4.e(mediaFormat, t0Var.n);
        bi4.c(mediaFormat, "frame-rate", t0Var.w);
        bi4.d(mediaFormat, "rotation-degrees", t0Var.x);
        bi4.b(mediaFormat, t0Var.L);
        if ("video/dolby-vision".equals(t0Var.l) && (r = MediaCodecUtil.r(t0Var)) != null) {
            bi4.d(mediaFormat, Scopes.PROFILE, ((Integer) r.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.a);
        mediaFormat.setInteger("max-height", bVar.b);
        bi4.d(mediaFormat, "max-input-size", bVar.c);
        if (z19.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            U1(mediaFormat, i);
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z1
    public boolean g() {
        PlaceholderSurface placeholderSurface;
        if (super.g() && ((!this.i1.f() || this.i1.g()) && (this.t1 || (((placeholderSurface = this.q1) != null && this.p1 == placeholderSurface) || B0() == null || this.J1)))) {
            this.x1 = -9223372036854775807L;
            return true;
        }
        if (this.x1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.x1) {
            return true;
        }
        this.x1 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean g1(long j, long j2, j jVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, t0 t0Var) {
        ur.e(jVar);
        if (this.w1 == -9223372036854775807L) {
            this.w1 = j;
        }
        if (j3 != this.C1) {
            if (!this.i1.f()) {
                this.g1.h(j3);
            }
            this.C1 = j3;
        }
        long I0 = j3 - I0();
        if (z && !z2) {
            F2(jVar, i, I0);
            return true;
        }
        boolean z3 = false;
        boolean z4 = getState() == 2;
        long P12 = P1(j, j2, SystemClock.elapsedRealtime() * 1000, j3, z4);
        if (this.p1 == this.q1) {
            if (!g2(P12)) {
                return false;
            }
            F2(jVar, i, I0);
            H2(P12);
            return true;
        }
        if (C2(j, P12)) {
            if (!this.i1.f()) {
                z3 = true;
            } else if (!this.i1.i(t0Var, I0, z2)) {
                return false;
            }
            u2(jVar, t0Var, i, I0, z3);
            H2(P12);
            return true;
        }
        if (z4 && j != this.w1) {
            long nanoTime = System.nanoTime();
            long b2 = this.g1.b((P12 * 1000) + nanoTime);
            if (!this.i1.f()) {
                P12 = (b2 - nanoTime) / 1000;
            }
            boolean z5 = this.x1 != -9223372036854775807L;
            if (A2(P12, j2, z2) && i2(j, z5)) {
                return false;
            }
            if (B2(P12, j2, z2)) {
                if (z5) {
                    F2(jVar, i, I0);
                } else {
                    W1(jVar, i, I0);
                }
                H2(P12);
                return true;
            }
            if (this.i1.f()) {
                this.i1.l(j, j2);
                if (!this.i1.i(t0Var, I0, z2)) {
                    return false;
                }
                u2(jVar, t0Var, i, I0, false);
                return true;
            }
            if (z19.a >= 21) {
                if (P12 < 50000) {
                    if (b2 == this.G1) {
                        F2(jVar, i, I0);
                    } else {
                        p2(I0, b2, t0Var);
                        v2(jVar, i, I0, b2);
                    }
                    H2(P12);
                    this.G1 = b2;
                    return true;
                }
            } else if (P12 < 30000) {
                if (P12 > 11000) {
                    try {
                        Thread.sleep((P12 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                p2(I0, b2, t0Var);
                t2(jVar, i, I0);
                H2(P12);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.z1, com.google.android.exoplayer2.a2
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    protected boolean i2(long j, boolean z) {
        int c0 = c0(j);
        if (c0 == 0) {
            return false;
        }
        if (z) {
            wc1 wc1Var = this.a1;
            wc1Var.d += c0;
            wc1Var.f += this.B1;
        } else {
            this.a1.j++;
            G2(c0, this.B1);
        }
        y0();
        if (this.i1.f()) {
            this.i1.c();
        }
        return true;
    }

    void k2() {
        this.v1 = true;
        if (this.t1) {
            return;
        }
        this.t1 = true;
        this.h1.A(this.p1);
        this.r1 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void m1() {
        super.m1();
        this.B1 = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException p0(Throwable th, k kVar) {
        return new MediaCodecVideoDecoderException(th, kVar, this.p1);
    }

    protected void q2(long j) {
        D1(j);
        m2(this.H1);
        this.a1.e++;
        k2();
        b1(j);
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.w1.b
    public void s(int i, Object obj) {
        Surface surface;
        if (i == 1) {
            y2(obj);
            return;
        }
        if (i == 7) {
            this.M1 = (u79) obj;
            return;
        }
        if (i == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.K1 != intValue) {
                this.K1 = intValue;
                if (this.J1) {
                    k1();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            this.s1 = ((Integer) obj).intValue();
            j B0 = B0();
            if (B0 != null) {
                B0.d(this.s1);
                return;
            }
            return;
        }
        if (i == 5) {
            this.g1.o(((Integer) obj).intValue());
            return;
        }
        if (i == 13) {
            this.i1.q((List) ur.e(obj));
            return;
        }
        if (i != 14) {
            super.s(i, obj);
            return;
        }
        bu7 bu7Var = (bu7) ur.e(obj);
        if (bu7Var.b() == 0 || bu7Var.a() == 0 || (surface = this.p1) == null) {
            return;
        }
        this.i1.p(surface, bu7Var);
    }

    protected void t2(j jVar, int i, long j) {
        ep8.a("releaseOutputBuffer");
        jVar.m(i, true);
        ep8.c();
        this.a1.e++;
        this.A1 = 0;
        if (this.i1.f()) {
            return;
        }
        this.D1 = SystemClock.elapsedRealtime() * 1000;
        m2(this.H1);
        k2();
    }

    protected void v2(j jVar, int i, long j, long j2) {
        ep8.a("releaseOutputBuffer");
        jVar.j(i, j2);
        ep8.c();
        this.a1.e++;
        this.A1 = 0;
        if (this.i1.f()) {
            return;
        }
        this.D1 = SystemClock.elapsedRealtime() * 1000;
        m2(this.H1);
        k2();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean w1(k kVar) {
        return this.p1 != null || E2(kVar);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected int z1(l lVar, t0 t0Var) {
        boolean z;
        int i = 0;
        if (!ku4.s(t0Var.l)) {
            return a2.r(0);
        }
        boolean z2 = t0Var.r != null;
        List c2 = c2(this.f1, lVar, t0Var, z2, false);
        if (z2 && c2.isEmpty()) {
            c2 = c2(this.f1, lVar, t0Var, false, false);
        }
        if (c2.isEmpty()) {
            return a2.r(1);
        }
        if (!MediaCodecRenderer.A1(t0Var)) {
            return a2.r(2);
        }
        k kVar = (k) c2.get(0);
        boolean o = kVar.o(t0Var);
        if (!o) {
            for (int i2 = 1; i2 < c2.size(); i2++) {
                k kVar2 = (k) c2.get(i2);
                if (kVar2.o(t0Var)) {
                    z = false;
                    o = true;
                    kVar = kVar2;
                    break;
                }
            }
        }
        z = true;
        int i3 = o ? 4 : 3;
        int i4 = kVar.r(t0Var) ? 16 : 8;
        int i5 = kVar.h ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (z19.a >= 26 && "video/dolby-vision".equals(t0Var.l) && !a.a(this.f1)) {
            i6 = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        if (o) {
            List c22 = c2(this.f1, lVar, t0Var, z2, true);
            if (!c22.isEmpty()) {
                k kVar3 = (k) MediaCodecUtil.w(c22, t0Var).get(0);
                if (kVar3.o(t0Var) && kVar3.r(t0Var)) {
                    i = 32;
                }
            }
        }
        return a2.n(i3, i4, i, i5, i6);
    }

    protected void z2(j jVar, Surface surface) {
        jVar.f(surface);
    }

    public uh4(Context context, j.b bVar, l lVar, long j, boolean z, Handler handler, v89 v89Var, int i, float f) {
        super(2, bVar, lVar, z, f);
        this.j1 = j;
        this.k1 = i;
        Context applicationContext = context.getApplicationContext();
        this.f1 = applicationContext;
        y79 y79Var = new y79(applicationContext);
        this.g1 = y79Var;
        this.h1 = new v89.a(handler, v89Var);
        this.i1 = new d(y79Var, this);
        this.l1 = V1();
        this.x1 = -9223372036854775807L;
        this.s1 = 1;
        this.H1 = z89.e;
        this.K1 = 0;
        R1();
    }
}
