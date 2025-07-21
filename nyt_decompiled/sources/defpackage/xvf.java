package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.amazonaws.event.ProgressEvent;
import com.google.android.gms.internal.ads.hp;
import com.google.android.gms.internal.ads.qp;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzpw;
import com.google.android.gms.internal.ads.zzpx;
import com.google.android.gms.internal.ads.zzqa;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class xvf extends hp implements xdf {
    private final rsf A0;
    private int B0;
    private boolean C0;
    private boolean D0;
    private l6a E0;
    private l6a F0;
    private long G0;
    private boolean H0;
    private boolean I0;
    private uff J0;
    private boolean K0;
    private final Context y0;
    private final jrf z0;

    public xvf(Context context, lxf lxfVar, fyf fyfVar, boolean z, Handler handler, mrf mrfVar, rsf rsfVar) {
        super(1, lxfVar, fyfVar, false, 44100.0f);
        this.y0 = context.getApplicationContext();
        this.A0 = rsfVar;
        this.z0 = new jrf(handler, mrfVar);
        rsfVar.o(new vvf(this, null));
    }

    private final int S0(pxf pxfVar, l6a l6aVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(pxfVar.a) || (i = khe.a) >= 24 || (i == 23 && khe.j(this.y0))) {
            return l6aVar.m;
        }
        return -1;
    }

    private static List T0(fyf fyfVar, l6a l6aVar, boolean z, rsf rsfVar) {
        pxf b;
        return l6aVar.l == null ? zzgaa.t() : (!rsfVar.s(l6aVar) || (b = qp.b()) == null) ? qp.f(fyfVar, l6aVar, false, false) : zzgaa.u(b);
    }

    private final void i0() {
        long b = this.A0.b(q());
        if (b != Long.MIN_VALUE) {
            if (!this.H0) {
                b = Math.max(this.G0, b);
            }
            this.G0 = b;
            this.H0 = false;
        }
    }

    @Override // defpackage.b8f
    protected final void A() {
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void A0(Exception exc) {
        ezd.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.z0.a(exc);
    }

    @Override // com.google.android.gms.internal.ads.hp, defpackage.b8f
    protected final void B() {
        this.K0 = false;
        try {
            super.B();
            if (this.I0) {
                this.I0 = false;
                this.A0.zzk();
            }
        } catch (Throwable th) {
            if (this.I0) {
                this.I0 = false;
                this.A0.zzk();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void B0(String str, kxf kxfVar, long j, long j2) {
        this.z0.e(str, j, j2);
    }

    @Override // defpackage.b8f
    protected final void C() {
        this.A0.zzi();
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void C0(String str) {
        this.z0.f(str);
    }

    @Override // defpackage.b8f
    protected final void D() {
        i0();
        this.A0.zzh();
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void D0(l6a l6aVar, MediaFormat mediaFormat) {
        int i;
        l6a l6aVar2 = this.F0;
        int[] iArr = null;
        boolean z = true;
        if (l6aVar2 != null) {
            l6aVar = l6aVar2;
        } else if (M0() != null) {
            mediaFormat.getClass();
            int z2 = "audio/raw".equals(l6aVar.l) ? l6aVar.A : (khe.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? khe.z(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            x3a x3aVar = new x3a();
            x3aVar.w("audio/raw");
            x3aVar.q(z2);
            x3aVar.f(l6aVar.B);
            x3aVar.g(l6aVar.C);
            x3aVar.p(l6aVar.j);
            x3aVar.k(l6aVar.a);
            x3aVar.m(l6aVar.b);
            x3aVar.n(l6aVar.c);
            x3aVar.y(l6aVar.d);
            x3aVar.u(l6aVar.e);
            x3aVar.k0(mediaFormat.getInteger("channel-count"));
            x3aVar.x(mediaFormat.getInteger("sample-rate"));
            l6a D = x3aVar.D();
            if (this.C0 && D.y == 6 && (i = l6aVar.y) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < l6aVar.y; i2++) {
                    iArr[i2] = i2;
                }
            } else if (this.D0) {
                int i3 = D.y;
                if (i3 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i3 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i3 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i3 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i3 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            l6aVar = D;
        }
        try {
            int i4 = khe.a;
            if (i4 >= 29) {
                if (c0()) {
                    O();
                }
                if (i4 < 29) {
                    z = false;
                }
                wad.f(z);
            }
            this.A0.m(l6aVar, 0, iArr);
        } catch (zzpw e) {
            throw N(e, e.zza, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void F0() {
        this.A0.zzg();
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void G0() {
        try {
            this.A0.zzj();
        } catch (zzqa e) {
            throw N(e, e.zzc, e.zzb, true != c0() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final boolean H0(long j, long j2, mxf mxfVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, l6a l6aVar) {
        byteBuffer.getClass();
        if (this.F0 != null && (i2 & 2) != 0) {
            mxfVar.getClass();
            mxfVar.e(i, false);
            return true;
        }
        if (z) {
            if (mxfVar != null) {
                mxfVar.e(i, false);
            }
            this.r0.f += i3;
            this.A0.zzg();
            return true;
        }
        try {
            if (!this.A0.n(byteBuffer, j3, i3)) {
                return false;
            }
            if (mxfVar != null) {
                mxfVar.e(i, false);
            }
            this.r0.e += i3;
            return true;
        } catch (zzpx e) {
            throw N(e, this.E0, e.zzb, 5001);
        } catch (zzqa e2) {
            if (c0()) {
                O();
            }
            throw N(e2, l6aVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final boolean I0(l6a l6aVar) {
        O();
        return this.A0.s(l6aVar);
    }

    @Override // com.google.android.gms.internal.ads.hp, defpackage.b8f
    protected final void Q() {
        this.I0 = true;
        this.E0 = null;
        try {
            this.A0.zzf();
            super.Q();
        } catch (Throwable th) {
            super.Q();
            throw th;
        } finally {
            this.z0.g(this.r0);
        }
    }

    @Override // com.google.android.gms.internal.ads.hp, defpackage.b8f
    protected final void R(boolean z, boolean z2) {
        super.R(z, z2);
        this.z0.h(this.r0);
        O();
        this.A0.r(P());
        this.A0.h(M());
    }

    @Override // com.google.android.gms.internal.ads.hp, defpackage.b8f
    protected final void T(long j, boolean z) {
        super.T(j, z);
        this.A0.zzf();
        this.G0 = j;
        this.K0 = false;
        this.H0 = true;
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final float U(float f, l6a l6aVar, l6a[] l6aVarArr) {
        int i = -1;
        for (l6a l6aVar2 : l6aVarArr) {
            int i2 = l6aVar2.z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final int V(fyf fyfVar, l6a l6aVar) {
        int i;
        boolean z;
        int i2 = 1;
        if (!qcb.g(l6aVar.l)) {
            return 128;
        }
        int i3 = khe.a;
        int i4 = l6aVar.F;
        boolean f0 = hp.f0(l6aVar);
        if (!f0 || (i4 != 0 && qp.b() == null)) {
            i = 0;
        } else {
            wpf d = this.A0.d(l6aVar);
            if (d.a) {
                i = true != d.b ? 512 : 1536;
                if (d.c) {
                    i |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
                }
            } else {
                i = 0;
            }
            if (this.A0.s(l6aVar)) {
                return i | 172;
            }
        }
        if ((!"audio/raw".equals(l6aVar.l) || this.A0.s(l6aVar)) && this.A0.s(khe.N(2, l6aVar.y, l6aVar.z))) {
            List T0 = T0(fyfVar, l6aVar, false, this.A0);
            if (!T0.isEmpty()) {
                if (f0) {
                    pxf pxfVar = (pxf) T0.get(0);
                    boolean e = pxfVar.e(l6aVar);
                    if (!e) {
                        for (int i5 = 1; i5 < T0.size(); i5++) {
                            pxf pxfVar2 = (pxf) T0.get(i5);
                            if (pxfVar2.e(l6aVar)) {
                                e = true;
                                z = false;
                                pxfVar = pxfVar2;
                                break;
                            }
                        }
                    }
                    z = true;
                    int i6 = true != e ? 3 : 4;
                    int i7 = 8;
                    if (e && pxfVar.f(l6aVar)) {
                        i7 = 16;
                    }
                    return i6 | i7 | 32 | (true != pxfVar.g ? 0 : 64) | (true != z ? 0 : 128) | i;
                }
                i2 = 2;
            }
        }
        return i2 | 128;
    }

    protected final void X0() {
        this.H0 = true;
    }

    @Override // defpackage.off
    public final void c(int i, Object obj) {
        if (i == 2) {
            rsf rsfVar = this.A0;
            obj.getClass();
            rsfVar.g(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            waf wafVar = (waf) obj;
            rsf rsfVar2 = this.A0;
            wafVar.getClass();
            rsfVar2.i(wafVar);
            return;
        }
        if (i == 6) {
            ddf ddfVar = (ddf) obj;
            rsf rsfVar3 = this.A0;
            ddfVar.getClass();
            rsfVar3.j(ddfVar);
            return;
        }
        switch (i) {
            case 9:
                rsf rsfVar4 = this.A0;
                obj.getClass();
                rsfVar4.f(((Boolean) obj).booleanValue());
                break;
            case 10:
                rsf rsfVar5 = this.A0;
                obj.getClass();
                rsfVar5.c(((Integer) obj).intValue());
                break;
            case 11:
                this.J0 = (uff) obj;
                break;
            case 12:
                if (khe.a >= 23) {
                    rvf.a(this.A0, obj);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xdf
    public final void e(hib hibVar) {
        this.A0.p(hibVar);
    }

    @Override // defpackage.wff, defpackage.zff
    public final String f() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.hp, defpackage.wff
    public final boolean i() {
        return this.A0.e() || super.i();
    }

    @Override // com.google.android.gms.internal.ads.hp, defpackage.wff
    public final boolean q() {
        return super.q() && this.A0.k();
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final g8f s0(pxf pxfVar, l6a l6aVar, l6a l6aVar2) {
        int i;
        int i2;
        g8f b = pxfVar.b(l6aVar, l6aVar2);
        int i3 = b.e;
        if (d0(l6aVar2)) {
            i3 |= 32768;
        }
        if (S0(pxfVar, l6aVar2) > this.B0) {
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
        l6a l6aVar = kdfVar.a;
        l6aVar.getClass();
        this.E0 = l6aVar;
        g8f t0 = super.t0(kdfVar);
        this.z0.i(l6aVar, t0);
        return t0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        if ("AXON 7 mini".equals(r10) == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    @Override // com.google.android.gms.internal.ads.hp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.kxf w0(defpackage.pxf r8, defpackage.l6a r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvf.w0(pxf, l6a, android.media.MediaCrypto, float):kxf");
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final List x0(fyf fyfVar, l6a l6aVar, boolean z) {
        return qp.g(T0(fyfVar, l6aVar, false, this.A0), l6aVar);
    }

    @Override // com.google.android.gms.internal.ads.hp
    protected final void z0(n7f n7fVar) {
        l6a l6aVar;
        if (khe.a < 29 || (l6aVar = n7fVar.b) == null || !Objects.equals(l6aVar.l, "audio/opus") || !c0()) {
            return;
        }
        ByteBuffer byteBuffer = n7fVar.g;
        byteBuffer.getClass();
        l6a l6aVar2 = n7fVar.b;
        l6aVar2.getClass();
        if (byteBuffer.remaining() == 8) {
            this.A0.l(l6aVar2.B, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // defpackage.xdf
    public final long zza() {
        if (v() == 2) {
            i0();
        }
        return this.G0;
    }

    @Override // defpackage.xdf
    public final hib zzc() {
        return this.A0.zzc();
    }

    @Override // defpackage.xdf
    public final boolean zzj() {
        boolean z = this.K0;
        this.K0 = false;
        return z;
    }

    @Override // defpackage.b8f, defpackage.wff
    public final xdf zzk() {
        return this;
    }
}
