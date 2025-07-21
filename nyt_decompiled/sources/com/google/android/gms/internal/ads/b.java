package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.acd;
import defpackage.ar9;
import defpackage.dae;
import defpackage.e8f;
import defpackage.ezd;
import defpackage.f9g;
import defpackage.fyf;
import defpackage.g8f;
import defpackage.ir9;
import defpackage.kdf;
import defpackage.khe;
import defpackage.kxf;
import defpackage.l6a;
import defpackage.lxf;
import defpackage.mxf;
import defpackage.n7f;
import defpackage.ot9;
import defpackage.pr9;
import defpackage.pt9;
import defpackage.pxf;
import defpackage.qcb;
import defpackage.rr9;
import defpackage.tr9;
import defpackage.tt9;
import defpackage.ut9;
import defpackage.vr9;
import defpackage.wmc;
import defpackage.x3a;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class b extends hp implements tr9 {
    private static final int[] Z0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean a1;
    private static boolean b1;
    private final ot9 A0;
    private final boolean B0;
    private final vr9 C0;
    private final rr9 D0;
    private ir9 E0;
    private boolean F0;
    private boolean G0;
    private Surface H0;
    private zzaak I0;
    private boolean J0;
    private int K0;
    private long L0;
    private int M0;
    private int N0;
    private int O0;
    private long P0;
    private int Q0;
    private long R0;
    private wmc S0;
    private wmc T0;
    private boolean U0;
    private boolean V0;
    private int W0;
    private pr9 X0;
    private tt9 Y0;
    private final Context y0;
    private final ut9 z0;

    public b(Context context, lxf lxfVar, fyf fyfVar, long j, boolean z, Handler handler, pt9 pt9Var, int i, float f) {
        super(2, lxfVar, fyfVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.y0 = applicationContext;
        this.A0 = new ot9(handler, pt9Var);
        f9g f9gVar = new f9g(applicationContext);
        f9gVar.c(new vr9(applicationContext, this, 0L));
        ar9 d = f9gVar.d();
        this.z0 = d;
        this.C0 = d.zza();
        this.D0 = new rr9();
        this.B0 = "NVIDIA".equals(khe.c);
        this.K0 = 1;
        this.S0 = wmc.e;
        this.W0 = 0;
        this.T0 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04c2, code lost:
    
        if (r0.equals("deb") != false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x079d, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L516;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static final boolean U0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b.U0(java.lang.String):boolean");
    }

    private static List V0(Context context, fyf fyfVar, l6a l6aVar, boolean z, boolean z2) {
        String str = l6aVar.l;
        if (str == null) {
            return zzgaa.t();
        }
        if (khe.a >= 26 && "video/dolby-vision".equals(str) && !a.a(context)) {
            List d = qp.d(fyfVar, l6aVar, z, z2);
            if (!d.isEmpty()) {
                return d;
            }
        }
        return qp.f(fyfVar, l6aVar, z, z2);
    }

    private final void W0() {
        Surface surface = this.H0;
        zzaak zzaakVar = this.I0;
        if (surface == zzaakVar) {
            this.H0 = null;
        }
        if (zzaakVar != null) {
            zzaakVar.release();
            this.I0 = null;
        }
    }

    private final boolean X0(pxf pxfVar) {
        if (khe.a < 23 || U0(pxfVar.a)) {
            return false;
        }
        return !pxfVar.f || zzaak.b(this.y0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        if (r3.equals("video/av01") != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int Y0(defpackage.pxf r10, defpackage.l6a r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b.Y0(pxf, l6a):int");
    }

    protected static int Z0(pxf pxfVar, l6a l6aVar) {
        if (l6aVar.m == -1) {
            return Y0(pxfVar, l6aVar);
        }
        int size = l6aVar.n.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) l6aVar.n.get(i2)).length;
        }
        return l6aVar.m + i;
    }

    private final void k0() {
        wmc wmcVar = this.T0;
        if (wmcVar != null) {
            this.A0.t(wmcVar);
        }
    }

    @Override // defpackage.b8f
    protected final void A() {
        if (this.z0.zzk()) {
            this.z0.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void A0(Exception exc) {
        ezd.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.A0.s(exc);
    }

    @Override // com.google.android.gms.internal.ads.hp, defpackage.b8f
    protected final void B() {
        try {
            super.B();
            this.V0 = false;
            if (this.I0 != null) {
                W0();
            }
        } catch (Throwable th) {
            this.V0 = false;
            if (this.I0 != null) {
                W0();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void B0(String str, kxf kxfVar, long j, long j2) {
        this.A0.a(str, j, j2);
        this.F0 = U0(str);
        pxf O0 = O0();
        O0.getClass();
        boolean z = false;
        if (khe.a >= 29 && "video/x-vnd.on2.vp9".equals(O0.b)) {
            MediaCodecInfo.CodecProfileLevel[] h = O0.h();
            int length = h.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (h[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.G0 = z;
    }

    @Override // defpackage.b8f
    protected final void C() {
        this.M0 = 0;
        M();
        this.L0 = SystemClock.elapsedRealtime();
        this.P0 = 0L;
        this.Q0 = 0;
        this.C0.g();
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void C0(String str) {
        this.A0.b(str);
    }

    @Override // defpackage.b8f
    protected final void D() {
        if (this.M0 > 0) {
            M();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A0.d(this.M0, elapsedRealtime - this.L0);
            this.M0 = 0;
            this.L0 = elapsedRealtime;
        }
        int i = this.Q0;
        if (i != 0) {
            this.A0.r(this.P0, i);
            this.P0 = 0L;
            this.Q0 = 0;
        }
        this.C0.h();
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void D0(l6a l6aVar, MediaFormat mediaFormat) {
        mxf M0 = M0();
        if (M0 != null) {
            M0.d(this.K0);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = l6aVar.u;
        int i = khe.a;
        int i2 = l6aVar.t;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer2;
            integer2 = integer;
            integer = i3;
        }
        this.S0 = new wmc(integer, integer2, 0, f);
        this.C0.l(l6aVar.s);
        if (this.Y0 == null) {
            return;
        }
        x3a b = l6aVar.b();
        b.C(integer);
        b.i(integer2);
        b.v(0);
        b.s(f);
        b.D();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void F0() {
        this.C0.f();
        int i = khe.a;
        if (this.z0.zzk()) {
            this.z0.g(K0());
        }
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final boolean H0(long j, long j2, mxf mxfVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, l6a l6aVar) {
        mxfVar.getClass();
        long K0 = j3 - K0();
        int a = this.C0.a(j3, j, j2, L0(), z2, this.D0);
        if (z && !z2) {
            b1(mxfVar, i, K0);
            return true;
        }
        if (this.H0 == this.I0) {
            if (this.D0.c() < 30000) {
                b1(mxfVar, i, K0);
                T0(this.D0.c());
                return true;
            }
        } else {
            if (this.Y0 != null) {
                try {
                    throw null;
                } catch (zzabn e) {
                    throw N(e, e.zza, false, 7001);
                }
            }
            if (a == 0) {
                M();
                long nanoTime = System.nanoTime();
                int i4 = khe.a;
                a1(mxfVar, i, K0, nanoTime);
                T0(this.D0.c());
                return true;
            }
            if (a == 1) {
                rr9 rr9Var = this.D0;
                long d = rr9Var.d();
                long c = rr9Var.c();
                int i5 = khe.a;
                if (d == this.R0) {
                    b1(mxfVar, i, K0);
                } else {
                    a1(mxfVar, i, K0, d);
                }
                T0(c);
                this.R0 = d;
                return true;
            }
            if (a == 2) {
                int i6 = khe.a;
                Trace.beginSection("dropVideoBuffer");
                mxfVar.e(i, false);
                Trace.endSection();
                S0(0, 1);
                T0(this.D0.c());
                return true;
            }
            if (a == 3) {
                b1(mxfVar, i, K0);
                T0(this.D0.c());
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final int J0(n7f n7fVar) {
        int i = khe.a;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final zzst N0(Throwable th, pxf pxfVar) {
        return new zzaae(th, pxfVar, this.H0);
    }

    @Override // com.google.android.gms.internal.ads.hp, defpackage.b8f
    protected final void Q() {
        this.T0 = null;
        this.C0.d();
        int i = khe.a;
        this.J0 = false;
        try {
            super.Q();
        } finally {
            this.A0.c(this.r0);
            this.A0.t(wmc.e);
        }
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void Q0(long j) {
        super.Q0(j);
        this.O0--;
    }

    @Override // com.google.android.gms.internal.ads.hp, defpackage.b8f
    protected final void R(boolean z, boolean z2) {
        super.R(z, z2);
        O();
        this.A0.e(this.r0);
        this.C0.e(z2);
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void R0(n7f n7fVar) {
        this.O0++;
        int i = khe.a;
    }

    @Override // defpackage.b8f
    protected final void S() {
        vr9 vr9Var = this.C0;
        acd M = M();
        vr9Var.k(M);
        this.z0.h(M);
    }

    protected final void S0(int i, int i2) {
        e8f e8fVar = this.r0;
        e8fVar.h += i;
        int i3 = i + i2;
        e8fVar.g += i3;
        this.M0 += i3;
        int i4 = this.N0 + i3;
        this.N0 = i4;
        e8fVar.i = Math.max(i4, e8fVar.i);
    }

    @Override // com.google.android.gms.internal.ads.hp, defpackage.b8f
    protected final void T(long j, boolean z) {
        if (this.Y0 != null) {
            throw null;
        }
        super.T(j, z);
        if (this.z0.zzk()) {
            this.z0.g(K0());
        }
        this.C0.i();
        if (z) {
            this.C0.c();
        }
        int i = khe.a;
        this.N0 = 0;
    }

    protected final void T0(long j) {
        e8f e8fVar = this.r0;
        e8fVar.k += j;
        e8fVar.l++;
        this.P0 += j;
        this.Q0++;
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final float U(float f, l6a l6aVar, l6a[] l6aVarArr) {
        float f2 = -1.0f;
        for (l6a l6aVar2 : l6aVarArr) {
            float f3 = l6aVar2.s;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final int V(fyf fyfVar, l6a l6aVar) {
        boolean z;
        if (!qcb.h(l6aVar.l)) {
            return 128;
        }
        int i = 1;
        int i2 = 0;
        boolean z2 = l6aVar.o != null;
        List V0 = V0(this.y0, fyfVar, l6aVar, z2, false);
        if (z2 && V0.isEmpty()) {
            V0 = V0(this.y0, fyfVar, l6aVar, false, false);
        }
        if (!V0.isEmpty()) {
            if (hp.f0(l6aVar)) {
                pxf pxfVar = (pxf) V0.get(0);
                boolean e = pxfVar.e(l6aVar);
                if (!e) {
                    for (int i3 = 1; i3 < V0.size(); i3++) {
                        pxf pxfVar2 = (pxf) V0.get(i3);
                        if (pxfVar2.e(l6aVar)) {
                            e = true;
                            z = false;
                            pxfVar = pxfVar2;
                            break;
                        }
                    }
                }
                z = true;
                int i4 = true != e ? 3 : 4;
                int i5 = true != pxfVar.f(l6aVar) ? 8 : 16;
                int i6 = true != pxfVar.g ? 0 : 64;
                int i7 = true != z ? 0 : 128;
                if (khe.a >= 26 && "video/dolby-vision".equals(l6aVar.l) && !a.a(this.y0)) {
                    i7 = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                }
                if (e) {
                    List V02 = V0(this.y0, fyfVar, l6aVar, z2, true);
                    if (!V02.isEmpty()) {
                        pxf pxfVar3 = (pxf) qp.g(V02, l6aVar).get(0);
                        if (pxfVar3.e(l6aVar) && pxfVar3.f(l6aVar)) {
                            i2 = 32;
                        }
                    }
                }
                return i4 | i5 | i2 | i6 | i7;
            }
            i = 2;
        }
        return i | 128;
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void W(l6a l6aVar) {
        if (this.U0 && !this.V0 && !this.z0.zzk()) {
            try {
                this.z0.d(l6aVar);
                this.z0.g(K0());
                pr9 pr9Var = this.X0;
                if (pr9Var != null) {
                    this.z0.f(pr9Var);
                }
            } catch (zzabn e) {
                throw N(e, l6aVar, false, 7000);
            }
        }
        if (this.Y0 != null || !this.z0.zzk()) {
            this.V0 = true;
        } else {
            this.Y0 = this.z0.zzb();
            lc.b();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void Y() {
        super.Y();
        this.O0 = 0;
    }

    protected final void a1(mxf mxfVar, int i, long j, long j2) {
        Surface surface;
        int i2 = khe.a;
        Trace.beginSection("releaseOutputBuffer");
        mxfVar.zzm(i, j2);
        Trace.endSection();
        this.r0.e++;
        this.N0 = 0;
        if (this.Y0 == null) {
            wmc wmcVar = this.S0;
            if (!wmcVar.equals(wmc.e) && !wmcVar.equals(this.T0)) {
                this.T0 = wmcVar;
                this.A0.t(wmcVar);
            }
            if (!this.C0.p() || (surface = this.H0) == null) {
                return;
            }
            this.A0.q(surface);
            this.J0 = true;
        }
    }

    protected final void b1(mxf mxfVar, int i, long j) {
        int i2 = khe.a;
        Trace.beginSection("skipVideoBuffer");
        mxfVar.e(i, false);
        Trace.endSection();
        this.r0.f++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.view.Surface] */
    @Override // defpackage.off
    public final void c(int i, Object obj) {
        Surface surface;
        if (i != 1) {
            if (i == 7) {
                obj.getClass();
                pr9 pr9Var = (pr9) obj;
                this.X0 = pr9Var;
                this.z0.f(pr9Var);
                return;
            }
            if (i == 10) {
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                if (this.W0 != intValue) {
                    this.W0 = intValue;
                    return;
                }
                return;
            }
            if (i == 4) {
                obj.getClass();
                int intValue2 = ((Integer) obj).intValue();
                this.K0 = intValue2;
                mxf M0 = M0();
                if (M0 != null) {
                    M0.d(intValue2);
                    return;
                }
                return;
            }
            if (i == 5) {
                vr9 vr9Var = this.C0;
                obj.getClass();
                vr9Var.j(((Integer) obj).intValue());
                return;
            } else if (i == 13) {
                obj.getClass();
                this.z0.e((List) obj);
                this.U0 = true;
                return;
            } else {
                if (i != 14) {
                    return;
                }
                obj.getClass();
                dae daeVar = (dae) obj;
                if (daeVar.b() == 0 || daeVar.a() == 0 || (surface = this.H0) == null) {
                    return;
                }
                this.z0.i(surface, daeVar);
                return;
            }
        }
        zzaak zzaakVar = obj instanceof Surface ? (Surface) obj : null;
        if (zzaakVar == null) {
            zzaak zzaakVar2 = this.I0;
            if (zzaakVar2 != null) {
                zzaakVar = zzaakVar2;
            } else {
                pxf O0 = O0();
                if (O0 != null && X0(O0)) {
                    zzaakVar = zzaak.a(this.y0, O0.f);
                    this.I0 = zzaakVar;
                }
            }
        }
        if (this.H0 == zzaakVar) {
            if (zzaakVar == null || zzaakVar == this.I0) {
                return;
            }
            k0();
            Surface surface2 = this.H0;
            if (surface2 == null || !this.J0) {
                return;
            }
            this.A0.q(surface2);
            return;
        }
        this.H0 = zzaakVar;
        this.C0.m(zzaakVar);
        this.J0 = false;
        int v = v();
        mxf M02 = M0();
        zzaak zzaakVar3 = zzaakVar;
        if (M02 != null) {
            zzaakVar3 = zzaakVar;
            if (!this.z0.zzk()) {
                zzaak zzaakVar4 = zzaakVar;
                if (khe.a >= 23) {
                    if (zzaakVar != null) {
                        zzaakVar4 = zzaakVar;
                        if (!this.F0) {
                            M02.b(zzaakVar);
                            zzaakVar3 = zzaakVar;
                        }
                    } else {
                        zzaakVar4 = null;
                    }
                }
                X();
                P0();
                zzaakVar3 = zzaakVar4;
            }
        }
        if (zzaakVar3 == null || zzaakVar3 == this.I0) {
            this.T0 = null;
            if (this.z0.zzk()) {
                this.z0.zzc();
            }
        } else {
            k0();
            if (v == 2) {
                this.C0.c();
            }
            if (this.z0.zzk()) {
                this.z0.i(zzaakVar3, dae.c);
            }
        }
        int i2 = khe.a;
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final boolean e0(pxf pxfVar) {
        return this.H0 != null || X0(pxfVar);
    }

    @Override // defpackage.wff, defpackage.zff
    public final String f() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.hp, defpackage.wff
    public final boolean i() {
        boolean z;
        zzaak zzaakVar;
        if (!super.i()) {
            z = false;
        } else {
            if (this.Y0 != null) {
                throw null;
            }
            z = true;
        }
        if (!z || (((zzaakVar = this.I0) == null || this.H0 != zzaakVar) && M0() != null)) {
            return this.C0.o(z);
        }
        return true;
    }

    @Override // defpackage.tr9
    public final boolean k(long j, long j2) {
        return j < -30000 && j2 > 100000;
    }

    @Override // defpackage.tr9
    public final boolean l(long j, long j2, long j3, boolean z, boolean z2) {
        int K;
        if (j >= -500000 || z || (K = K(j2)) == 0) {
            return false;
        }
        if (z2) {
            e8f e8fVar = this.r0;
            e8fVar.d += K;
            e8fVar.f += this.O0;
        } else {
            this.r0.j++;
            S0(K, this.O0);
        }
        a0();
        if (this.Y0 == null) {
            return true;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.hp, defpackage.wff
    public final void o(long j, long j2) {
        super.o(j, j2);
        if (this.Y0 == null) {
            return;
        }
        try {
            throw null;
        } catch (zzabn e) {
            throw N(e, e.zza, false, 7001);
        }
    }

    @Override // defpackage.tr9
    public final boolean p(long j, long j2, boolean z) {
        return j < -30000 && !z;
    }

    @Override // com.google.android.gms.internal.ads.hp, defpackage.wff
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        if (this.Y0 == null) {
            return true;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.hp, defpackage.wff
    public final void s(float f, float f2) {
        super.s(f, f2);
        this.C0.n(f);
        if (this.Y0 != null) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final g8f s0(pxf pxfVar, l6a l6aVar, l6a l6aVar2) {
        int i;
        int i2;
        g8f b = pxfVar.b(l6aVar, l6aVar2);
        int i3 = b.e;
        ir9 ir9Var = this.E0;
        ir9Var.getClass();
        if (l6aVar2.q > ir9Var.a || l6aVar2.r > ir9Var.b) {
            i3 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        if (Z0(pxfVar, l6aVar2) > ir9Var.c) {
            i3 |= 64;
        }
        String str = pxfVar.a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = b.d;
        }
        return new g8f(str, l6aVar, l6aVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final g8f t0(kdf kdfVar) {
        g8f t0 = super.t0(kdfVar);
        l6a l6aVar = kdfVar.a;
        l6aVar.getClass();
        this.A0.f(l6aVar, t0);
        return t0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x022b  */
    @Override // com.google.android.gms.internal.ads.hp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.kxf w0(defpackage.pxf r20, defpackage.l6a r21, android.media.MediaCrypto r22, float r23) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b.w0(pxf, l6a, android.media.MediaCrypto, float):kxf");
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final List x0(fyf fyfVar, l6a l6aVar, boolean z) {
        return qp.g(V0(this.y0, fyfVar, l6aVar, false, false), l6aVar);
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void z0(n7f n7fVar) {
        if (this.G0) {
            ByteBuffer byteBuffer = n7fVar.g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        mxf M0 = M0();
                        M0.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        M0.y(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.b8f, defpackage.wff
    public final void zzs() {
        this.C0.b();
    }
}
