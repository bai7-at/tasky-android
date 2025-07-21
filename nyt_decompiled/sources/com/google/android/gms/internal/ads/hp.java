package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import defpackage.b8f;
import defpackage.bx9;
import defpackage.e8f;
import defpackage.ezd;
import defpackage.fyf;
import defpackage.g8f;
import defpackage.kdf;
import defpackage.khe;
import defpackage.kxf;
import defpackage.l6a;
import defpackage.lwf;
import defpackage.lxf;
import defpackage.mee;
import defpackage.mxf;
import defpackage.n7f;
import defpackage.pxf;
import defpackage.wad;
import defpackage.yvf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class hp extends b8f {
    private static final byte[] x0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final yvf A;
    private l6a B;
    private l6a C;
    private MediaCrypto D;
    private boolean E;
    private long F;
    private float G;
    private mxf H;
    private l6a I;
    private MediaFormat J;
    private boolean K;
    private float L;
    private ArrayDeque M;
    private zzsx N;
    private pxf O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private long W;
    private int X;
    private int Y;
    private ByteBuffer Z;
    private boolean a0;
    private boolean b0;
    private boolean c0;
    private boolean d0;
    private boolean e0;
    private boolean f0;
    private int g0;
    private int h0;
    private int i0;
    private boolean j0;
    private boolean k0;
    private boolean l0;
    private long m0;
    private long n0;
    private boolean o0;
    private boolean p0;
    private boolean q0;
    private final lxf r;
    protected e8f r0;
    private final fyf s;
    private gp s0;
    private final float t;
    private long t0;
    private final n7f u;
    private boolean u0;
    private final n7f v;
    private lwf v0;
    private final n7f w;
    private lwf w0;
    private final ep x;
    private final MediaCodec.BufferInfo y;
    private final ArrayDeque z;

    public hp(int i, lxf lxfVar, fyf fyfVar, boolean z, float f) {
        super(i);
        this.r = lxfVar;
        fyfVar.getClass();
        this.s = fyfVar;
        this.t = f;
        this.u = new n7f(0, 0);
        this.v = new n7f(0, 0);
        this.w = new n7f(2, 0);
        ep epVar = new ep();
        this.x = epVar;
        this.y = new MediaCodec.BufferInfo();
        this.G = 1.0f;
        this.F = -9223372036854775807L;
        this.z = new ArrayDeque();
        this.s0 = gp.e;
        epVar.i(0);
        epVar.d.order(ByteOrder.nativeOrder());
        this.A = new yvf();
        this.L = -1.0f;
        this.P = 0;
        this.g0 = 0;
        this.X = -1;
        this.Y = -1;
        this.W = -9223372036854775807L;
        this.m0 = -9223372036854775807L;
        this.n0 = -9223372036854775807L;
        this.t0 = -9223372036854775807L;
        this.h0 = 0;
        this.i0 = 0;
        this.r0 = new e8f();
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x040e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void E0(defpackage.pxf r19, android.media.MediaCrypto r20) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hp.E0(pxf, android.media.MediaCrypto):void");
    }

    protected static boolean f0(l6a l6aVar) {
        return l6aVar.F == 0;
    }

    private final void g0() {
        int i = this.i0;
        if (i == 1) {
            y0();
            return;
        }
        if (i == 2) {
            y0();
            k0();
        } else if (i != 3) {
            this.p0 = true;
            G0();
        } else {
            X();
            P0();
        }
    }

    private final void h0() {
        this.X = -1;
        this.v.d = null;
    }

    private final void i0() {
        this.Y = -1;
        this.Z = null;
    }

    private final void j0(gp gpVar) {
        this.s0 = gpVar;
        if (gpVar.c != -9223372036854775807L) {
            this.u0 = true;
        }
    }

    private final void k0() {
        lwf lwfVar = this.w0;
        lwfVar.getClass();
        this.v0 = lwfVar;
        this.h0 = 0;
        this.i0 = 0;
    }

    private final boolean l0() {
        if (this.j0) {
            this.h0 = 1;
            if (this.R) {
                this.i0 = 3;
                return false;
            }
            this.i0 = 2;
        } else {
            k0();
        }
        return true;
    }

    private final boolean m0() {
        mxf mxfVar = this.H;
        if (mxfVar == null || this.h0 == 2 || this.o0) {
            return false;
        }
        if (this.X < 0) {
            int zza = mxfVar.zza();
            this.X = zza;
            if (zza < 0) {
                return false;
            }
            this.v.d = mxfVar.zzf(zza);
            this.v.b();
        }
        if (this.h0 == 1) {
            if (!this.V) {
                this.k0 = true;
                mxfVar.a(this.X, 0, 0, 0L, 4);
                h0();
            }
            this.h0 = 2;
            return false;
        }
        if (this.T) {
            this.T = false;
            ByteBuffer byteBuffer = this.v.d;
            byteBuffer.getClass();
            byteBuffer.put(x0);
            mxfVar.a(this.X, 0, 38, 0L, 0);
            h0();
            this.j0 = true;
            return true;
        }
        if (this.g0 == 1) {
            int i = 0;
            while (true) {
                l6a l6aVar = this.I;
                l6aVar.getClass();
                if (i >= l6aVar.n.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.I.n.get(i);
                ByteBuffer byteBuffer2 = this.v.d;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i++;
            }
            this.g0 = 2;
        }
        ByteBuffer byteBuffer3 = this.v.d;
        byteBuffer3.getClass();
        int position = byteBuffer3.position();
        kdf J = J();
        try {
            int I = I(J, this.v, 0);
            if (I == -3) {
                if (j()) {
                    this.n0 = this.m0;
                }
                return false;
            }
            if (I == -5) {
                if (this.g0 == 2) {
                    this.v.b();
                    this.g0 = 1;
                }
                t0(J);
                return true;
            }
            n7f n7fVar = this.v;
            if (n7fVar.f()) {
                this.n0 = this.m0;
                if (this.g0 == 2) {
                    n7fVar.b();
                    this.g0 = 1;
                }
                this.o0 = true;
                if (!this.j0) {
                    g0();
                    return false;
                }
                try {
                    if (!this.V) {
                        this.k0 = true;
                        mxfVar.a(this.X, 0, 0, 0L, 4);
                        h0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw N(e, this.B, false, khe.x(e.getErrorCode()));
                }
            }
            if (!this.j0 && !n7fVar.g()) {
                n7fVar.b();
                if (this.g0 == 2) {
                    this.g0 = 1;
                }
                return true;
            }
            boolean k = n7fVar.k();
            if (k) {
                n7fVar.c.b(position);
            }
            long j = this.v.f;
            if (this.q0) {
                if (this.z.isEmpty()) {
                    mee meeVar = this.s0.d;
                    l6a l6aVar2 = this.B;
                    l6aVar2.getClass();
                    meeVar.d(j, l6aVar2);
                } else {
                    mee meeVar2 = ((gp) this.z.peekLast()).d;
                    l6a l6aVar3 = this.B;
                    l6aVar3.getClass();
                    meeVar2.d(j, l6aVar3);
                }
                this.q0 = false;
            }
            long max = Math.max(this.m0, j);
            this.m0 = max;
            if (j() || this.v.h()) {
                this.n0 = max;
            }
            this.v.j();
            n7f n7fVar2 = this.v;
            if (n7fVar2.e()) {
                z0(n7fVar2);
            }
            R0(this.v);
            J0(this.v);
            try {
                if (k) {
                    mxfVar.c(this.X, 0, this.v.c, j, 0);
                } else {
                    int i2 = this.X;
                    ByteBuffer byteBuffer4 = this.v.d;
                    if (byteBuffer4 == null) {
                        throw null;
                    }
                    mxfVar.a(i2, 0, byteBuffer4.limit(), j, 0);
                }
                h0();
                this.j0 = true;
                this.g0 = 0;
                this.r0.c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw N(e2, this.B, false, khe.x(e2.getErrorCode()));
            }
        } catch (zzig e3) {
            A0(e3);
            p0(0);
            y0();
            return true;
        }
    }

    private final boolean n0() {
        return this.Y >= 0;
    }

    private final boolean o0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        l6a l6aVar = this.C;
        if (l6aVar == null || !Objects.equals(l6aVar.l, "audio/opus")) {
            return true;
        }
        return !bx9.f(j, j2);
    }

    private final boolean p0(int i) {
        n7f n7fVar = this.u;
        kdf J = J();
        n7fVar.b();
        int I = I(J, this.u, i | 4);
        if (I == -5) {
            t0(J);
            return true;
        }
        if (I != -4 || !this.u.f()) {
            return false;
        }
        this.o0 = true;
        g0();
        return false;
    }

    private final boolean q0(long j) {
        if (this.F == -9223372036854775807L) {
            return true;
        }
        M();
        return SystemClock.elapsedRealtime() - j < this.F;
    }

    private final boolean r0(l6a l6aVar) {
        if (khe.a >= 23 && this.H != null && this.i0 != 3 && v() != 0) {
            float f = this.G;
            l6aVar.getClass();
            float U = U(f, l6aVar, G());
            float f2 = this.L;
            if (f2 != U) {
                if (U == -1.0f) {
                    v0();
                    return false;
                }
                if (f2 != -1.0f || U > this.t) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", U);
                    mxf mxfVar = this.H;
                    mxfVar.getClass();
                    mxfVar.y(bundle);
                    this.L = U;
                }
            }
        }
        return true;
    }

    private final void u0() {
        this.e0 = false;
        this.x.b();
        this.w.b();
        this.d0 = false;
        this.c0 = false;
        this.A.b();
    }

    private final void v0() {
        if (this.j0) {
            this.h0 = 1;
            this.i0 = 3;
        } else {
            X();
            P0();
        }
    }

    private final void y0() {
        try {
            mxf mxfVar = this.H;
            wad.b(mxfVar);
            mxfVar.zzi();
        } finally {
            Y();
        }
    }

    protected abstract void A0(Exception exc);

    @Override // defpackage.b8f
    protected void B() {
        try {
            u0();
            X();
        } finally {
            this.w0 = null;
        }
    }

    protected abstract void B0(String str, kxf kxfVar, long j, long j2);

    protected abstract void C0(String str);

    protected abstract void D0(l6a l6aVar, MediaFormat mediaFormat);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // defpackage.b8f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void E(defpackage.l6a[] r13, long r14, long r16, defpackage.zzf r18) {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.gp r1 = r0.s0
            long r1 = r1.c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            com.google.android.gms.internal.ads.gp r1 = new com.google.android.gms.internal.ads.gp
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.j0(r1)
            return
        L20:
            java.util.ArrayDeque r1 = r0.z
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.m0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.t0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            com.google.android.gms.internal.ads.gp r1 = new com.google.android.gms.internal.ads.gp
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.j0(r1)
            com.google.android.gms.internal.ads.gp r1 = r0.s0
            long r1 = r1.c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L54
            r12.F0()
        L54:
            return
        L55:
            java.util.ArrayDeque r1 = r0.z
            com.google.android.gms.internal.ads.gp r9 = new com.google.android.gms.internal.ads.gp
            long r3 = r0.m0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hp.E(l6a[], long, long, zzf):void");
    }

    protected abstract void F0();

    protected void G0() {
    }

    protected abstract boolean H0(long j, long j2, mxf mxfVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, l6a l6aVar);

    protected boolean I0(l6a l6aVar) {
        return false;
    }

    protected int J0(n7f n7fVar) {
        return 0;
    }

    protected final long K0() {
        return this.s0.c;
    }

    protected final long L0() {
        return this.s0.b;
    }

    protected final mxf M0() {
        return this.H;
    }

    protected zzst N0(Throwable th, pxf pxfVar) {
        return new zzst(th, pxfVar);
    }

    protected final pxf O0() {
        return this.O;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee A[Catch: zzsx -> 0x0085, TryCatch #0 {zzsx -> 0x0085, blocks: (B:25:0x005a, B:27:0x005f, B:79:0x0063, B:81:0x0079, B:82:0x008a, B:29:0x0096, B:31:0x009e, B:33:0x00a2, B:34:0x00a8, B:36:0x00ac, B:38:0x00b4, B:53:0x00d4, B:55:0x00ee, B:56:0x00f7, B:61:0x00fe, B:62:0x0100, B:63:0x00f1, B:71:0x0101, B:73:0x0102, B:75:0x0105, B:76:0x0106, B:77:0x010e, B:86:0x008d, B:87:0x0095, B:88:0x010f, B:41:0x00ba, B:49:0x00c3, B:65:0x00d3), top: B:24:0x005a, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1 A[Catch: zzsx -> 0x0085, TryCatch #0 {zzsx -> 0x0085, blocks: (B:25:0x005a, B:27:0x005f, B:79:0x0063, B:81:0x0079, B:82:0x008a, B:29:0x0096, B:31:0x009e, B:33:0x00a2, B:34:0x00a8, B:36:0x00ac, B:38:0x00b4, B:53:0x00d4, B:55:0x00ee, B:56:0x00f7, B:61:0x00fe, B:62:0x0100, B:63:0x00f1, B:71:0x0101, B:73:0x0102, B:75:0x0105, B:76:0x0106, B:77:0x010e, B:86:0x008d, B:87:0x0095, B:88:0x010f, B:41:0x00ba, B:49:0x00c3, B:65:0x00d3), top: B:24:0x005a, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void P0() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hp.P0():void");
    }

    @Override // defpackage.b8f
    protected void Q() {
        this.B = null;
        j0(gp.e);
        this.z.clear();
        b0();
    }

    protected void Q0(long j) {
        this.t0 = j;
        while (!this.z.isEmpty() && j >= ((gp) this.z.peek()).a) {
            gp gpVar = (gp) this.z.poll();
            gpVar.getClass();
            j0(gpVar);
            F0();
        }
    }

    @Override // defpackage.b8f
    protected void R(boolean z, boolean z2) {
        this.r0 = new e8f();
    }

    protected void R0(n7f n7fVar) {
    }

    @Override // defpackage.b8f
    protected void T(long j, boolean z) {
        this.o0 = false;
        this.p0 = false;
        if (this.c0) {
            this.x.b();
            this.w.b();
            this.d0 = false;
            this.A.b();
        } else {
            a0();
        }
        mee meeVar = this.s0.d;
        if (meeVar.a() > 0) {
            this.q0 = true;
        }
        meeVar.e();
        this.z.clear();
    }

    protected abstract float U(float f, l6a l6aVar, l6a[] l6aVarArr);

    protected abstract int V(fyf fyfVar, l6a l6aVar);

    protected void W(l6a l6aVar) {
    }

    protected final void X() {
        try {
            mxf mxfVar = this.H;
            if (mxfVar != null) {
                mxfVar.zzl();
                this.r0.b++;
                pxf pxfVar = this.O;
                if (pxfVar == null) {
                    throw null;
                }
                C0(pxfVar.a);
            }
            this.H = null;
            this.D = null;
            this.v0 = null;
            Z();
        } catch (Throwable th) {
            this.H = null;
            this.D = null;
            this.v0 = null;
            Z();
            throw th;
        }
    }

    protected void Y() {
        h0();
        i0();
        this.W = -9223372036854775807L;
        this.k0 = false;
        this.j0 = false;
        this.T = false;
        this.U = false;
        this.a0 = false;
        this.b0 = false;
        this.m0 = -9223372036854775807L;
        this.n0 = -9223372036854775807L;
        this.t0 = -9223372036854775807L;
        this.h0 = 0;
        this.i0 = 0;
        this.g0 = this.f0 ? 1 : 0;
    }

    protected final void Z() {
        Y();
        this.M = null;
        this.O = null;
        this.I = null;
        this.J = null;
        this.K = false;
        this.l0 = false;
        this.L = -1.0f;
        this.P = 0;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.V = false;
        this.f0 = false;
        this.g0 = 0;
        this.E = false;
    }

    protected final boolean a0() {
        boolean b0 = b0();
        if (b0) {
            P0();
        }
        return b0;
    }

    protected final boolean b0() {
        if (this.H == null) {
            return false;
        }
        int i = this.i0;
        if (i == 3 || ((this.Q && !this.l0) || (this.R && this.k0))) {
            X();
            return true;
        }
        if (i == 2) {
            int i2 = khe.a;
            wad.f(i2 >= 23);
            if (i2 >= 23) {
                try {
                    k0();
                } catch (zziz e) {
                    ezd.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    X();
                    return true;
                }
            }
        }
        y0();
        return false;
    }

    protected final boolean c0() {
        return this.c0;
    }

    protected final boolean d0(l6a l6aVar) {
        return this.w0 == null && I0(l6aVar);
    }

    protected boolean e0(pxf pxfVar) {
        return true;
    }

    @Override // defpackage.wff
    public boolean i() {
        if (this.B == null) {
            return false;
        }
        if (F() || n0()) {
            return true;
        }
        if (this.W == -9223372036854775807L) {
            return false;
        }
        M();
        return SystemClock.elapsedRealtime() < this.W;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.wff
    public void o(long r25, long r27) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hp.o(long, long):void");
    }

    @Override // defpackage.wff
    public boolean q() {
        return this.p0;
    }

    @Override // defpackage.wff
    public void s(float f, float f2) {
        this.G = f2;
        r0(this.I);
    }

    protected abstract g8f s0(pxf pxfVar, l6a l6aVar, l6a l6aVar2);

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0069, code lost:
    
        if (l0() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0097, code lost:
    
        if (l0() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a9, code lost:
    
        if (l0() == false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected defpackage.g8f t0(defpackage.kdf r12) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hp.t0(kdf):g8f");
    }

    protected abstract kxf w0(pxf pxfVar, l6a l6aVar, MediaCrypto mediaCrypto, float f);

    protected abstract List x0(fyf fyfVar, l6a l6aVar, boolean z);

    @Override // defpackage.zff
    public final int y(l6a l6aVar) {
        try {
            return V(this.s, l6aVar);
        } catch (zzth e) {
            throw this.N(e, l6aVar, false, 4002);
        }
    }

    protected abstract void z0(n7f n7fVar);

    @Override // defpackage.zff
    public final int zze() {
        return 8;
    }
}
