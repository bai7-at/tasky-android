package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.j;
import com.google.android.exoplayer2.t0;
import defpackage.a84;
import defpackage.ep2;
import defpackage.ep8;
import defpackage.j15;
import defpackage.lm8;
import defpackage.md5;
import defpackage.r31;
import defpackage.rq2;
import defpackage.sv5;
import defpackage.ur;
import defpackage.wc1;
import defpackage.yc1;
import defpackage.z19;
import defpackage.zf0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class MediaCodecRenderer extends com.google.android.exoplayer2.f {
    private static final byte[] e1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private boolean A0;
    private final DecoderInputBuffer B;
    private boolean B0;
    private g C0;
    private long D0;
    private int E0;
    private int F0;
    private ByteBuffer G0;
    private final f H;
    private boolean H0;
    private boolean I0;
    private boolean J0;
    private boolean K0;
    private final ArrayList L;
    private boolean L0;
    private final MediaCodec.BufferInfo M;
    private boolean M0;
    private final ArrayDeque N;
    private int N0;
    private int O0;
    private int P0;
    private final md5 Q;
    private boolean Q0;
    private boolean R0;
    private t0 S;
    private boolean S0;
    private long T0;
    private long U0;
    private boolean V0;
    private boolean W0;
    private t0 X;
    private boolean X0;
    private DrmSession Y;
    private boolean Y0;
    private DrmSession Z;
    private ExoPlaybackException Z0;
    protected wc1 a1;
    private b b1;
    private long c1;
    private boolean d1;
    private MediaCrypto e0;
    private boolean f0;
    private long g0;
    private float h0;
    private float i0;
    private j j0;
    private t0 k0;
    private MediaFormat l0;
    private boolean m0;
    private float n0;
    private ArrayDeque o0;
    private DecoderInitializationException p0;
    private k q0;
    private int r0;
    private final j.b s;
    private boolean s0;
    private final l t;
    private boolean t0;
    private final boolean u;
    private boolean u0;
    private boolean v0;
    private final float w;
    private boolean w0;
    private final DecoderInputBuffer x;
    private boolean x0;
    private final DecoderInputBuffer y;
    private boolean y0;
    private boolean z0;

    private static final class a {
        public static void a(j.a aVar, sv5 sv5Var) {
            LogSessionId logSessionId;
            boolean equals;
            String stringId;
            LogSessionId a = sv5Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a.equals(logSessionId);
            if (equals) {
                return;
            }
            MediaFormat mediaFormat = aVar.b;
            stringId = a.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }

    private static final class b {
        public static final b e = new b(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;
        public final long c;
        public final lm8 d = new lm8();

        public b(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    public MediaCodecRenderer(int i, j.b bVar, l lVar, boolean z, float f) {
        super(i);
        this.s = bVar;
        this.t = (l) ur.e(lVar);
        this.u = z;
        this.w = f;
        this.x = DecoderInputBuffer.w();
        this.y = new DecoderInputBuffer(0);
        this.B = new DecoderInputBuffer(2);
        f fVar = new f();
        this.H = fVar;
        this.L = new ArrayList();
        this.M = new MediaCodec.BufferInfo();
        this.h0 = 1.0f;
        this.i0 = 1.0f;
        this.g0 = -9223372036854775807L;
        this.N = new ArrayDeque();
        r1(b.e);
        fVar.t(0);
        fVar.c.order(ByteOrder.nativeOrder());
        this.Q = new md5();
        this.n0 = -1.0f;
        this.r0 = 0;
        this.N0 = 0;
        this.E0 = -1;
        this.F0 = -1;
        this.D0 = -9223372036854775807L;
        this.T0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.c1 = -9223372036854775807L;
        this.O0 = 0;
        this.P0 = 0;
    }

    private List A0(boolean z) {
        List G0 = G0(this.t, this.S, z);
        if (G0.isEmpty() && z) {
            G0 = G0(this.t, this.S, false);
            if (!G0.isEmpty()) {
                a84.j("MediaCodecRenderer", "Drm session requires secure decoder for " + this.S.l + ", but no secure decoder available. Trying to proceed with " + G0 + InstructionFileId.DOT);
            }
        }
        return G0;
    }

    protected static boolean A1(t0 t0Var) {
        int i = t0Var.f0;
        return i == 0 || i == 2;
    }

    private boolean B1(t0 t0Var) {
        if (z19.a >= 23 && this.j0 != null && this.P0 != 3 && getState() != 0) {
            float E0 = E0(this.i0, t0Var, P());
            float f = this.n0;
            if (f == E0) {
                return true;
            }
            if (E0 == -1.0f) {
                s0();
                return false;
            }
            if (f == -1.0f && E0 <= this.w) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", E0);
            this.j0.i(bundle);
            this.n0 = E0;
        }
        return true;
    }

    private void C1() {
        r31 e = this.Z.e();
        if (e instanceof rq2) {
            try {
                this.e0.setMediaDrmSession(((rq2) e).b);
            } catch (MediaCryptoException e2) {
                throw J(e2, this.S, 6006);
            }
        }
        q1(this.Z);
        this.O0 = 0;
        this.P0 = 0;
    }

    private boolean L0() {
        return this.F0 >= 0;
    }

    private void M0(t0 t0Var) {
        q0();
        String str = t0Var.l;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.H.E(32);
        } else {
            this.H.E(1);
        }
        this.J0 = true;
    }

    private void N0(k kVar, MediaCrypto mediaCrypto) {
        String str = kVar.a;
        int i = z19.a;
        float E0 = i < 23 ? -1.0f : E0(this.i0, this.S, P());
        float f = E0 > this.w ? E0 : -1.0f;
        e1(this.S);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        j.a H0 = H0(kVar, this.S, mediaCrypto, f);
        if (i >= 31) {
            a.a(H0, O());
        }
        try {
            ep8.a("createCodec:" + str);
            this.j0 = this.s.a(H0);
            ep8.c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!kVar.o(this.S)) {
                a84.j("MediaCodecRenderer", z19.D("Format exceeds selected codec's capabilities [%s, %s]", t0.k(this.S), str));
            }
            this.q0 = kVar;
            this.n0 = f;
            this.k0 = this.S;
            this.r0 = g0(str);
            this.s0 = h0(str, this.k0);
            this.t0 = m0(str);
            this.u0 = o0(str);
            this.v0 = j0(str);
            this.w0 = k0(str);
            this.x0 = i0(str);
            this.y0 = n0(str, this.k0);
            this.B0 = l0(kVar) || D0();
            if (this.j0.h()) {
                this.M0 = true;
                this.N0 = 1;
                this.z0 = this.r0 != 0;
            }
            if ("c2.android.mp3.decoder".equals(kVar.a)) {
                this.C0 = new g();
            }
            if (getState() == 2) {
                this.D0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.a1.a++;
            W0(str, H0, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            ep8.c();
            throw th;
        }
    }

    private boolean P0(long j) {
        int size = this.L.size();
        for (int i = 0; i < size; i++) {
            if (((Long) this.L.get(i)).longValue() == j) {
                this.L.remove(i);
                return true;
            }
        }
        return false;
    }

    private static boolean Q0(IllegalStateException illegalStateException) {
        if (z19.a >= 21 && R0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private static boolean R0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean S0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void U0(android.media.MediaCrypto r8, boolean r9) {
        /*
            r7 = this;
            java.util.ArrayDeque r0 = r7.o0
            r1 = 0
            if (r0 != 0) goto L3a
            java.util.List r0 = r7.A0(r9)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            r2.<init>()     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            r7.o0 = r2     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            boolean r3 = r7.u     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            if (r3 == 0) goto L1a
            r2.addAll(r0)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            goto L2c
        L18:
            r8 = move-exception
            goto L2f
        L1a:
            boolean r2 = r0.isEmpty()     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            if (r2 != 0) goto L2c
            java.util.ArrayDeque r2 = r7.o0     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            com.google.android.exoplayer2.mediacodec.k r0 = (com.google.android.exoplayer2.mediacodec.k) r0     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            r2.add(r0)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
        L2c:
            r7.p0 = r1     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            goto L3a
        L2f:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r0 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.t0 r7 = r7.S
            r1 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r7, r8, r9, r1)
            throw r0
        L3a:
            java.util.ArrayDeque r0 = r7.o0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb6
            java.util.ArrayDeque r0 = r7.o0
            java.lang.Object r0 = r0.peekFirst()
            com.google.android.exoplayer2.mediacodec.k r0 = (com.google.android.exoplayer2.mediacodec.k) r0
        L4a:
            com.google.android.exoplayer2.mediacodec.j r2 = r7.j0
            if (r2 != 0) goto Lb3
            java.util.ArrayDeque r2 = r7.o0
            java.lang.Object r2 = r2.peekFirst()
            com.google.android.exoplayer2.mediacodec.k r2 = (com.google.android.exoplayer2.mediacodec.k) r2
            boolean r3 = r7.w1(r2)
            if (r3 != 0) goto L5d
            return
        L5d:
            r7.N0(r2, r8)     // Catch: java.lang.Exception -> L61
            goto L4a
        L61:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L76
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            defpackage.a84.j(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.N0(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L4a
        L74:
            r3 = move-exception
            goto L77
        L76:
            throw r3     // Catch: java.lang.Exception -> L74
        L77:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            defpackage.a84.k(r4, r5, r3)
            java.util.ArrayDeque r4 = r7.o0
            r4.removeFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r4 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.t0 r5 = r7.S
            r4.<init>(r5, r3, r9, r2)
            r7.V0(r4)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = r7.p0
            if (r2 != 0) goto La1
            r7.p0 = r4
            goto La7
        La1:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.a(r2, r4)
            r7.p0 = r2
        La7:
            java.util.ArrayDeque r2 = r7.o0
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lb0
            goto L4a
        Lb0:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r7 = r7.p0
            throw r7
        Lb3:
            r7.o0 = r1
            return
        Lb6:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r8 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.t0 r7 = r7.S
            r0 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r7, r1, r9, r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.U0(android.media.MediaCrypto, boolean):void");
    }

    private void d0() {
        String str;
        ur.g(!this.V0);
        ep2 M = M();
        this.B.f();
        do {
            this.B.f();
            int a0 = a0(M, this.B, 0);
            if (a0 == -5) {
                Y0(M);
                return;
            }
            if (a0 != -4) {
                if (a0 != -3) {
                    throw new IllegalStateException();
                }
                return;
            }
            if (this.B.l()) {
                this.V0 = true;
                return;
            }
            if (this.X0) {
                t0 t0Var = (t0) ur.e(this.S);
                this.X = t0Var;
                Z0(t0Var, null);
                this.X0 = false;
            }
            this.B.u();
            t0 t0Var2 = this.S;
            if (t0Var2 != null && (str = t0Var2.l) != null && str.equals("audio/opus")) {
                this.Q.a(this.B, this.S.n);
            }
        } while (this.H.y(this.B));
        this.K0 = true;
    }

    private boolean e0(long j, long j2) {
        boolean z;
        ur.g(!this.W0);
        if (this.H.D()) {
            f fVar = this.H;
            if (!g1(j, j2, null, fVar.c, this.F0, 0, fVar.C(), this.H.A(), this.H.k(), this.H.l(), this.X)) {
                return false;
            }
            b1(this.H.B());
            this.H.f();
            z = false;
        } else {
            z = false;
        }
        if (this.V0) {
            this.W0 = true;
            return z;
        }
        if (this.K0) {
            ur.g(this.H.y(this.B));
            this.K0 = z;
        }
        if (this.L0) {
            if (this.H.D()) {
                return true;
            }
            q0();
            this.L0 = z;
            T0();
            if (!this.J0) {
                return z;
            }
        }
        d0();
        if (this.H.D()) {
            this.H.u();
        }
        if (this.H.D() || this.V0 || this.L0) {
            return true;
        }
        return z;
    }

    private void f1() {
        int i = this.P0;
        if (i == 1) {
            x0();
            return;
        }
        if (i == 2) {
            x0();
            C1();
        } else if (i == 3) {
            j1();
        } else {
            this.W0 = true;
            l1();
        }
    }

    private int g0(String str) {
        int i = z19.a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = z19.d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = z19.b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean h0(String str, t0 t0Var) {
        return z19.a < 21 && t0Var.n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private void h1() {
        this.S0 = true;
        MediaFormat b2 = this.j0.b();
        if (this.r0 != 0 && b2.getInteger("width") == 32 && b2.getInteger("height") == 32) {
            this.A0 = true;
            return;
        }
        if (this.y0) {
            b2.setInteger("channel-count", 1);
        }
        this.l0 = b2;
        this.m0 = true;
    }

    private static boolean i0(String str) {
        if (z19.a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(z19.c)) {
            String str2 = z19.b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private boolean i1(int i) {
        ep2 M = M();
        this.x.f();
        int a0 = a0(M, this.x, i | 4);
        if (a0 == -5) {
            Y0(M);
            return true;
        }
        if (a0 != -4 || !this.x.l()) {
            return false;
        }
        this.V0 = true;
        f1();
        return false;
    }

    private static boolean j0(String str) {
        int i = z19.a;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i <= 19) {
                String str2 = z19.b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private void j1() {
        k1();
        T0();
    }

    private static boolean k0(String str) {
        return z19.a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean l0(k kVar) {
        String str = kVar.a;
        int i = z19.a;
        return (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(z19.c) && "AFTS".equals(z19.d) && kVar.g));
    }

    private static boolean m0(String str) {
        int i = z19.a;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && z19.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean n0(String str, t0 t0Var) {
        return z19.a <= 18 && t0Var.M == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private static boolean o0(String str) {
        return z19.a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void o1() {
        this.E0 = -1;
        this.y.c = null;
    }

    private void p1() {
        this.F0 = -1;
        this.G0 = null;
    }

    private void q0() {
        this.L0 = false;
        this.H.f();
        this.B.f();
        this.K0 = false;
        this.J0 = false;
        this.Q.d();
    }

    private void q1(DrmSession drmSession) {
        DrmSession.f(this.Y, drmSession);
        this.Y = drmSession;
    }

    private boolean r0() {
        if (this.Q0) {
            this.O0 = 1;
            if (this.t0 || this.v0) {
                this.P0 = 3;
                return false;
            }
            this.P0 = 1;
        }
        return true;
    }

    private void r1(b bVar) {
        this.b1 = bVar;
        long j = bVar.c;
        if (j != -9223372036854775807L) {
            this.d1 = true;
            a1(j);
        }
    }

    private void s0() {
        if (!this.Q0) {
            j1();
        } else {
            this.O0 = 1;
            this.P0 = 3;
        }
    }

    private boolean t0() {
        if (this.Q0) {
            this.O0 = 1;
            if (this.t0 || this.v0) {
                this.P0 = 3;
                return false;
            }
            this.P0 = 2;
        } else {
            C1();
        }
        return true;
    }

    private boolean u0(long j, long j2) {
        boolean z;
        boolean g1;
        j jVar;
        ByteBuffer byteBuffer;
        int i;
        MediaCodec.BufferInfo bufferInfo;
        int l;
        if (!L0()) {
            if (this.w0 && this.R0) {
                try {
                    l = this.j0.l(this.M);
                } catch (IllegalStateException unused) {
                    f1();
                    if (this.W0) {
                        k1();
                    }
                    return false;
                }
            } else {
                l = this.j0.l(this.M);
            }
            if (l < 0) {
                if (l == -2) {
                    h1();
                    return true;
                }
                if (this.B0 && (this.V0 || this.O0 == 2)) {
                    f1();
                }
                return false;
            }
            if (this.A0) {
                this.A0 = false;
                this.j0.m(l, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.M;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                f1();
                return false;
            }
            this.F0 = l;
            ByteBuffer n = this.j0.n(l);
            this.G0 = n;
            if (n != null) {
                n.position(this.M.offset);
                ByteBuffer byteBuffer2 = this.G0;
                MediaCodec.BufferInfo bufferInfo3 = this.M;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.x0) {
                MediaCodec.BufferInfo bufferInfo4 = this.M;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                    long j3 = this.T0;
                    if (j3 != -9223372036854775807L) {
                        bufferInfo4.presentationTimeUs = j3;
                    }
                }
            }
            this.H0 = P0(this.M.presentationTimeUs);
            long j4 = this.U0;
            long j5 = this.M.presentationTimeUs;
            this.I0 = j4 == j5;
            D1(j5);
        }
        if (this.w0 && this.R0) {
            try {
                jVar = this.j0;
                byteBuffer = this.G0;
                i = this.F0;
                bufferInfo = this.M;
                z = false;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                g1 = g1(j, j2, jVar, byteBuffer, i, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.H0, this.I0, this.X);
            } catch (IllegalStateException unused3) {
                f1();
                if (this.W0) {
                    k1();
                }
                return z;
            }
        } else {
            z = false;
            j jVar2 = this.j0;
            ByteBuffer byteBuffer3 = this.G0;
            int i2 = this.F0;
            MediaCodec.BufferInfo bufferInfo5 = this.M;
            g1 = g1(j, j2, jVar2, byteBuffer3, i2, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.H0, this.I0, this.X);
        }
        if (g1) {
            b1(this.M.presentationTimeUs);
            boolean z2 = (this.M.flags & 4) != 0 ? true : z;
            p1();
            if (!z2) {
                return true;
            }
            f1();
        }
        return z;
    }

    private void u1(DrmSession drmSession) {
        DrmSession.f(this.Z, drmSession);
        this.Z = drmSession;
    }

    private boolean v0(k kVar, t0 t0Var, DrmSession drmSession, DrmSession drmSession2) {
        r31 e;
        r31 e2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (e = drmSession2.e()) != null && (e2 = drmSession.e()) != null && e.getClass().equals(e2.getClass())) {
            if (!(e instanceof rq2)) {
                return false;
            }
            rq2 rq2Var = (rq2) e;
            if (!drmSession2.c().equals(drmSession.c()) || z19.a < 23) {
                return true;
            }
            UUID uuid = zf0.e;
            if (!uuid.equals(drmSession.c()) && !uuid.equals(drmSession2.c())) {
                return !kVar.g && (rq2Var.c ? false : drmSession2.h(t0Var.l));
            }
        }
        return true;
    }

    private boolean v1(long j) {
        return this.g0 == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.g0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.exoplayer2.f, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer] */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.google.android.exoplayer2.f, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer] */
    /* JADX WARN: Type inference failed for: r15v3, types: [wc1] */
    private boolean w0() {
        int i;
        if (this.j0 == null || (i = this.O0) == 2 || this.V0) {
            return false;
        }
        if (i == 0 && x1()) {
            s0();
        }
        if (this.E0 < 0) {
            int k = this.j0.k();
            this.E0 = k;
            if (k < 0) {
                return false;
            }
            this.y.c = this.j0.e(k);
            this.y.f();
        }
        if (this.O0 == 1) {
            if (!this.B0) {
                this.R0 = true;
                this.j0.g(this.E0, 0, 0, 0L, 4);
                o1();
            }
            this.O0 = 2;
            return false;
        }
        if (this.z0) {
            this.z0 = false;
            ByteBuffer byteBuffer = this.y.c;
            byte[] bArr = e1;
            byteBuffer.put(bArr);
            this.j0.g(this.E0, 0, bArr.length, 0L, 0);
            o1();
            this.Q0 = true;
            return true;
        }
        if (this.N0 == 1) {
            for (int i2 = 0; i2 < this.k0.n.size(); i2++) {
                this.y.c.put((byte[]) this.k0.n.get(i2));
            }
            this.N0 = 2;
        }
        int position = this.y.c.position();
        ep2 M = M();
        try {
            int a0 = a0(M, this.y, 0);
            if (k() || this.y.p()) {
                this.U0 = this.T0;
            }
            if (a0 == -3) {
                return false;
            }
            if (a0 == -5) {
                if (this.N0 == 2) {
                    this.y.f();
                    this.N0 = 1;
                }
                Y0(M);
                return true;
            }
            if (this.y.l()) {
                if (this.N0 == 2) {
                    this.y.f();
                    this.N0 = 1;
                }
                this.V0 = true;
                if (!this.Q0) {
                    f1();
                    return false;
                }
                try {
                    if (!this.B0) {
                        this.R0 = true;
                        this.j0.g(this.E0, 0, 0, 0L, 4);
                        o1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw J(e, this.S, z19.W(e.getErrorCode()));
                }
            }
            if (!this.Q0 && !this.y.o()) {
                this.y.f();
                if (this.N0 == 2) {
                    this.N0 = 1;
                }
                return true;
            }
            boolean v = this.y.v();
            if (v) {
                this.y.b.b(position);
            }
            if (this.s0 && !v) {
                j15.b(this.y.c);
                if (this.y.c.position() == 0) {
                    return true;
                }
                this.s0 = false;
            }
            DecoderInputBuffer decoderInputBuffer = this.y;
            long j = decoderInputBuffer.e;
            g gVar = this.C0;
            if (gVar != null) {
                j = gVar.d(this.S, decoderInputBuffer);
                this.T0 = Math.max(this.T0, this.C0.b(this.S));
            }
            long j2 = j;
            if (this.y.k()) {
                this.L.add(Long.valueOf(j2));
            }
            if (this.X0) {
                if (this.N.isEmpty()) {
                    this.b1.d.a(j2, this.S);
                } else {
                    ((b) this.N.peekLast()).d.a(j2, this.S);
                }
                this.X0 = false;
            }
            this.T0 = Math.max(this.T0, j2);
            this.y.u();
            if (this.y.j()) {
                K0(this.y);
            }
            d1(this.y);
            try {
                if (v) {
                    this.j0.a(this.E0, 0, this.y.b, j2, 0);
                } else {
                    this.j0.g(this.E0, 0, this.y.c.limit(), j2, 0);
                }
                o1();
                this.Q0 = true;
                this.N0 = 0;
                this = this.a1;
                this.c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw this.J(e2, this.S, z19.W(e2.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e3) {
            V0(e3);
            i1(0);
            x0();
            return true;
        }
    }

    private void x0() {
        try {
            this.j0.flush();
        } finally {
            m1();
        }
    }

    @Override // com.google.android.exoplayer2.z1
    public void A(float f, float f2) {
        this.h0 = f;
        this.i0 = f2;
        B1(this.k0);
    }

    protected final j B0() {
        return this.j0;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.a2
    public final int C() {
        return 8;
    }

    protected final k C0() {
        return this.q0;
    }

    @Override // com.google.android.exoplayer2.z1
    public void D(long j, long j2) {
        boolean z = false;
        if (this.Y0) {
            this.Y0 = false;
            f1();
        }
        ExoPlaybackException exoPlaybackException = this.Z0;
        if (exoPlaybackException != null) {
            this.Z0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.W0) {
                l1();
                return;
            }
            if (this.S != null || i1(2)) {
                T0();
                if (this.J0) {
                    ep8.a("bypassRender");
                    while (e0(j, j2)) {
                    }
                    ep8.c();
                } else if (this.j0 != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    ep8.a("drainAndFeed");
                    while (u0(j, j2) && v1(elapsedRealtime)) {
                    }
                    while (w0() && v1(elapsedRealtime)) {
                    }
                    ep8.c();
                } else {
                    this.a1.d += c0(j);
                    i1(1);
                }
                this.a1.c();
            }
        } catch (IllegalStateException e) {
            if (!Q0(e)) {
                throw e;
            }
            V0(e);
            if (z19.a >= 21 && S0(e)) {
                z = true;
            }
            if (z) {
                k1();
            }
            throw K(p0(e, C0()), this.S, z, 4003);
        }
    }

    protected boolean D0() {
        return false;
    }

    protected final void D1(long j) {
        t0 t0Var = (t0) this.b1.d.j(j);
        if (t0Var == null && this.d1 && this.l0 != null) {
            t0Var = (t0) this.b1.d.i();
        }
        if (t0Var != null) {
            this.X = t0Var;
        } else if (!this.m0 || this.X == null) {
            return;
        }
        Z0(this.X, this.l0);
        this.m0 = false;
        this.d1 = false;
    }

    protected abstract float E0(float f, t0 t0Var, t0[] t0VarArr);

    protected final MediaFormat F0() {
        return this.l0;
    }

    protected abstract List G0(l lVar, t0 t0Var, boolean z);

    protected abstract j.a H0(k kVar, t0 t0Var, MediaCrypto mediaCrypto, float f);

    protected final long I0() {
        return this.b1.c;
    }

    protected float J0() {
        return this.h0;
    }

    protected void K0(DecoderInputBuffer decoderInputBuffer) {
    }

    protected final boolean O0(t0 t0Var) {
        return this.Z == null && y1(t0Var);
    }

    @Override // com.google.android.exoplayer2.f
    protected void R() {
        this.S = null;
        r1(b.e);
        this.N.clear();
        z0();
    }

    @Override // com.google.android.exoplayer2.f
    protected void S(boolean z, boolean z2) {
        this.a1 = new wc1();
    }

    @Override // com.google.android.exoplayer2.f
    protected void T(long j, boolean z) {
        this.V0 = false;
        this.W0 = false;
        this.Y0 = false;
        if (this.J0) {
            this.H.f();
            this.B.f();
            this.K0 = false;
            this.Q.d();
        } else {
            y0();
        }
        if (this.b1.d.l() > 0) {
            this.X0 = true;
        }
        this.b1.d.c();
        this.N.clear();
    }

    protected final void T0() {
        t0 t0Var;
        if (this.j0 != null || this.J0 || (t0Var = this.S) == null) {
            return;
        }
        if (O0(t0Var)) {
            M0(this.S);
            return;
        }
        q1(this.Z);
        String str = this.S.l;
        DrmSession drmSession = this.Y;
        if (drmSession != null) {
            r31 e = drmSession.e();
            if (this.e0 == null) {
                if (e == null) {
                    if (this.Y.getError() == null) {
                        return;
                    }
                } else if (e instanceof rq2) {
                    rq2 rq2Var = (rq2) e;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(rq2Var.a, rq2Var.b);
                        this.e0 = mediaCrypto;
                        this.f0 = !rq2Var.c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e2) {
                        throw J(e2, this.S, 6006);
                    }
                }
            }
            if (rq2.d && (e instanceof rq2)) {
                int state = this.Y.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) ur.e(this.Y.getError());
                    throw J(drmSessionException, this.S, drmSessionException.errorCode);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            U0(this.e0, this.f0);
        } catch (DecoderInitializationException e3) {
            throw J(e3, this.S, 4001);
        }
    }

    protected abstract void V0(Exception exc);

    @Override // com.google.android.exoplayer2.f
    protected void W() {
        try {
            q0();
            k1();
        } finally {
            u1(null);
        }
    }

    protected abstract void W0(String str, j.a aVar, long j, long j2);

    @Override // com.google.android.exoplayer2.f
    protected void X() {
    }

    protected abstract void X0(String str);

    @Override // com.google.android.exoplayer2.f
    protected void Y() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0081, code lost:
    
        if (t0() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b4, code lost:
    
        if (t0() == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected defpackage.yc1 Y0(defpackage.ep2 r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.Y0(ep2):yc1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L13;
     */
    @Override // com.google.android.exoplayer2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void Z(com.google.android.exoplayer2.t0[] r13, long r14, long r16) {
        /*
            r12 = this;
            r0 = r12
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r1 = r0.b1
            long r1 = r1.c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.r1(r1)
            goto L65
        L20:
            java.util.ArrayDeque r1 = r0.N
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.T0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.c1
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.r1(r1)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r1 = r0.b1
            long r1 = r1.c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L65
            r12.c1()
            goto L65
        L55:
            java.util.ArrayDeque r1 = r0.N
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r9 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b
            long r3 = r0.T0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.Z(com.google.android.exoplayer2.t0[], long, long):void");
    }

    protected abstract void Z0(t0 t0Var, MediaFormat mediaFormat);

    protected void a1(long j) {
    }

    @Override // com.google.android.exoplayer2.a2
    public final int b(t0 t0Var) {
        try {
            return z1(this.t, t0Var);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw this.J(e, t0Var, 4002);
        }
    }

    protected void b1(long j) {
        this.c1 = j;
        while (!this.N.isEmpty() && j >= ((b) this.N.peek()).a) {
            r1((b) this.N.poll());
            c1();
        }
    }

    protected void c1() {
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean d() {
        return this.W0;
    }

    protected abstract void d1(DecoderInputBuffer decoderInputBuffer);

    protected void e1(t0 t0Var) {
    }

    protected abstract yc1 f0(k kVar, t0 t0Var, t0 t0Var2);

    @Override // com.google.android.exoplayer2.z1
    public boolean g() {
        return this.S != null && (Q() || L0() || (this.D0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.D0));
    }

    protected abstract boolean g1(long j, long j2, j jVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, t0 t0Var);

    /* JADX WARN: Multi-variable type inference failed */
    protected void k1() {
        try {
            j jVar = this.j0;
            if (jVar != null) {
                jVar.release();
                this.a1.b++;
                X0(this.q0.a);
            }
            this.j0 = null;
            try {
                MediaCrypto mediaCrypto = this.e0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.j0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.e0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    protected void l1() {
    }

    protected void m1() {
        o1();
        p1();
        this.D0 = -9223372036854775807L;
        this.R0 = false;
        this.Q0 = false;
        this.z0 = false;
        this.A0 = false;
        this.H0 = false;
        this.I0 = false;
        this.L.clear();
        this.T0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.c1 = -9223372036854775807L;
        g gVar = this.C0;
        if (gVar != null) {
            gVar.c();
        }
        this.O0 = 0;
        this.P0 = 0;
        this.N0 = this.M0 ? 1 : 0;
    }

    protected void n1() {
        m1();
        this.Z0 = null;
        this.C0 = null;
        this.o0 = null;
        this.q0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = false;
        this.S0 = false;
        this.n0 = -1.0f;
        this.r0 = 0;
        this.s0 = false;
        this.t0 = false;
        this.u0 = false;
        this.v0 = false;
        this.w0 = false;
        this.x0 = false;
        this.y0 = false;
        this.B0 = false;
        this.M0 = false;
        this.N0 = 0;
        this.f0 = false;
    }

    protected MediaCodecDecoderException p0(Throwable th, k kVar) {
        return new MediaCodecDecoderException(th, kVar);
    }

    protected final void s1() {
        this.Y0 = true;
    }

    protected final void t1(ExoPlaybackException exoPlaybackException) {
        this.Z0 = exoPlaybackException;
    }

    protected boolean w1(k kVar) {
        return true;
    }

    protected boolean x1() {
        return false;
    }

    protected final boolean y0() {
        boolean z0 = z0();
        if (z0) {
            T0();
        }
        return z0;
    }

    protected boolean y1(t0 t0Var) {
        return false;
    }

    protected boolean z0() {
        if (this.j0 == null) {
            return false;
        }
        int i = this.P0;
        if (i == 3 || this.t0 || ((this.u0 && !this.S0) || (this.v0 && this.R0))) {
            k1();
            return true;
        }
        if (i == 2) {
            int i2 = z19.a;
            ur.g(i2 >= 23);
            if (i2 >= 23) {
                try {
                    C1();
                } catch (ExoPlaybackException e) {
                    a84.k("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    k1();
                    return true;
                }
            }
        }
        x0();
        return false;
    }

    protected abstract int z1(l lVar, t0 t0Var);

    public static class DecoderInitializationException extends Exception {
        public final k codecInfo;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(t0 t0Var, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + t0Var, th, t0Var.l, z, null, b(i), null);
        }

        private static String b(int i) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException c(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        private static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public DecoderInitializationException(t0 t0Var, Throwable th, boolean z, k kVar) {
            this("Decoder init failed: " + kVar.a + ", " + t0Var, th, t0Var.l, z, kVar, z19.a >= 21 ? d(th) : null, null);
        }

        private DecoderInitializationException(String str, Throwable th, String str2, boolean z, k kVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = kVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }
}
