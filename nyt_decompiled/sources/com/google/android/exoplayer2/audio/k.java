package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.e;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.j;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.z1;
import com.google.common.collect.ImmutableList;
import defpackage.a84;
import defpackage.bi4;
import defpackage.ep2;
import defpackage.ku4;
import defpackage.rh4;
import defpackage.u20;
import defpackage.ur;
import defpackage.yc1;
import defpackage.z19;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public class k extends MediaCodecRenderer implements rh4 {
    private final Context f1;
    private final e.a g1;
    private final AudioSink h1;
    private int i1;
    private boolean j1;
    private t0 k1;
    private t0 l1;
    private long m1;
    private boolean n1;
    private boolean o1;
    private boolean p1;
    private boolean q1;
    private z1.a r1;

    private static final class b {
        public static void a(AudioSink audioSink, Object obj) {
            audioSink.c((AudioDeviceInfo) obj);
        }
    }

    private final class c implements AudioSink.a {
        private c() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void a(boolean z) {
            k.this.g1.C(z);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void b(Exception exc) {
            a84.e("MediaCodecAudioRenderer", "Audio sink error", exc);
            k.this.g1.l(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void c(long j) {
            k.this.g1.B(j);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void d() {
            if (k.this.r1 != null) {
                k.this.r1.a();
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void e(int i, long j, long j2) {
            k.this.g1.D(i, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void f() {
            k.this.V();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void g() {
            k.this.N1();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void h() {
            if (k.this.r1 != null) {
                k.this.r1.b();
            }
        }
    }

    public k(Context context, j.b bVar, com.google.android.exoplayer2.mediacodec.l lVar, boolean z, Handler handler, e eVar, AudioSink audioSink) {
        super(1, bVar, lVar, z, 44100.0f);
        this.f1 = context.getApplicationContext();
        this.h1 = audioSink;
        this.g1 = new e.a(handler, eVar);
        audioSink.m(new c());
    }

    private static boolean H1(String str) {
        if (z19.a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(z19.c)) {
            String str2 = z19.b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean I1() {
        if (z19.a == 23) {
            String str = z19.d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int J1(com.google.android.exoplayer2.mediacodec.k kVar, t0 t0Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(kVar.a) || (i = z19.a) >= 24 || (i == 23 && z19.z0(this.f1))) {
            return t0Var.m;
        }
        return -1;
    }

    private static List L1(com.google.android.exoplayer2.mediacodec.l lVar, t0 t0Var, boolean z, AudioSink audioSink) {
        com.google.android.exoplayer2.mediacodec.k x;
        return t0Var.l == null ? ImmutableList.x() : (!audioSink.b(t0Var) || (x = MediaCodecUtil.x()) == null) ? MediaCodecUtil.v(lVar, t0Var, z, false) : ImmutableList.y(x);
    }

    private void O1() {
        long q = this.h1.q(d());
        if (q != Long.MIN_VALUE) {
            if (!this.o1) {
                q = Math.max(this.m1, q);
            }
            this.m1 = q;
            this.o1 = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected float E0(float f, t0 t0Var, t0[] t0VarArr) {
        int i = -1;
        for (t0 t0Var2 : t0VarArr) {
            int i2 = t0Var2.N;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z1
    public rh4 G() {
        return this;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected List G0(com.google.android.exoplayer2.mediacodec.l lVar, t0 t0Var, boolean z) {
        return MediaCodecUtil.w(L1(lVar, t0Var, z, this.h1), t0Var);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected j.a H0(com.google.android.exoplayer2.mediacodec.k kVar, t0 t0Var, MediaCrypto mediaCrypto, float f) {
        this.i1 = K1(kVar, t0Var, P());
        this.j1 = H1(kVar.a);
        MediaFormat M1 = M1(t0Var, kVar.c, this.i1, f);
        this.l1 = (!"audio/raw".equals(kVar.b) || "audio/raw".equals(t0Var.l)) ? null : t0Var;
        return j.a.a(kVar, M1, t0Var, mediaCrypto);
    }

    protected int K1(com.google.android.exoplayer2.mediacodec.k kVar, t0 t0Var, t0[] t0VarArr) {
        int J1 = J1(kVar, t0Var);
        if (t0VarArr.length == 1) {
            return J1;
        }
        for (t0 t0Var2 : t0VarArr) {
            if (kVar.f(t0Var, t0Var2).d != 0) {
                J1 = Math.max(J1, J1(kVar, t0Var2));
            }
        }
        return J1;
    }

    protected MediaFormat M1(t0 t0Var, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", t0Var.M);
        mediaFormat.setInteger("sample-rate", t0Var.N);
        bi4.e(mediaFormat, t0Var.n);
        bi4.d(mediaFormat, "max-input-size", i);
        int i2 = z19.a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !I1()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && "audio/ac4".equals(t0Var.l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.h1.n(z19.f0(4, t0Var.M, t0Var.N)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    protected void N1() {
        this.o1 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void R() {
        this.p1 = true;
        this.k1 = null;
        try {
            this.h1.flush();
            try {
                super.R();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.R();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void S(boolean z, boolean z2) {
        super.S(z, z2);
        this.g1.p(this.a1);
        if (L().a) {
            this.h1.v();
        } else {
            this.h1.h();
        }
        this.h1.u(O());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void T(long j, boolean z) {
        super.T(j, z);
        if (this.q1) {
            this.h1.o();
        } else {
            this.h1.flush();
        }
        this.m1 = j;
        this.n1 = true;
        this.o1 = true;
    }

    @Override // com.google.android.exoplayer2.f
    protected void U() {
        this.h1.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void V0(Exception exc) {
        a84.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.g1.k(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void W() {
        try {
            super.W();
        } finally {
            if (this.p1) {
                this.p1 = false;
                this.h1.a();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void W0(String str, j.a aVar, long j, long j2) {
        this.g1.m(str, j, j2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void X() {
        super.X();
        this.h1.L();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void X0(String str) {
        this.g1.n(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void Y() {
        O1();
        this.h1.pause();
        super.Y();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected yc1 Y0(ep2 ep2Var) {
        this.k1 = (t0) ur.e(ep2Var.b);
        yc1 Y0 = super.Y0(ep2Var);
        this.g1.q(this.k1, Y0);
        return Y0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void Z0(t0 t0Var, MediaFormat mediaFormat) {
        int i;
        t0 t0Var2 = this.l1;
        int[] iArr = null;
        if (t0Var2 != null) {
            t0Var = t0Var2;
        } else if (B0() != null) {
            t0 G = new t0.b().g0("audio/raw").a0("audio/raw".equals(t0Var.l) ? t0Var.Q : (z19.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? z19.e0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).P(t0Var.S).Q(t0Var.X).J(mediaFormat.getInteger("channel-count")).h0(mediaFormat.getInteger("sample-rate")).G();
            if (this.j1 && G.M == 6 && (i = t0Var.M) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < t0Var.M; i2++) {
                    iArr[i2] = i2;
                }
            }
            t0Var = G;
        }
        try {
            this.h1.w(t0Var, 0, iArr);
        } catch (AudioSink.ConfigurationException e) {
            throw J(e, e.format, 5001);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void a1(long j) {
        this.h1.r(j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void c1() {
        super.c1();
        this.h1.s();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z1
    public boolean d() {
        return super.d() && this.h1.d();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void d1(DecoderInputBuffer decoderInputBuffer) {
        if (!this.n1 || decoderInputBuffer.k()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.e - this.m1) > 500000) {
            this.m1 = decoderInputBuffer.e;
        }
        this.n1 = false;
    }

    @Override // defpackage.rh4
    public u1 e() {
        return this.h1.e();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected yc1 f0(com.google.android.exoplayer2.mediacodec.k kVar, t0 t0Var, t0 t0Var2) {
        yc1 f = kVar.f(t0Var, t0Var2);
        int i = f.e;
        if (O0(t0Var2)) {
            i |= 32768;
        }
        if (J1(kVar, t0Var2) > this.i1) {
            i |= 64;
        }
        int i2 = i;
        return new yc1(kVar.a, t0Var, t0Var2, i2 != 0 ? 0 : f.d, i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z1
    public boolean g() {
        return this.h1.f() || super.g();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean g1(long j, long j2, com.google.android.exoplayer2.mediacodec.j jVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, t0 t0Var) {
        ur.e(byteBuffer);
        if (this.l1 != null && (i2 & 2) != 0) {
            ((com.google.android.exoplayer2.mediacodec.j) ur.e(jVar)).m(i, false);
            return true;
        }
        if (z) {
            if (jVar != null) {
                jVar.m(i, false);
            }
            this.a1.f += i3;
            this.h1.s();
            return true;
        }
        try {
            if (!this.h1.l(byteBuffer, j3, i3)) {
                return false;
            }
            if (jVar != null) {
                jVar.m(i, false);
            }
            this.a1.e += i3;
            return true;
        } catch (AudioSink.InitializationException e) {
            throw K(e, this.k1, e.isRecoverable, 5001);
        } catch (AudioSink.WriteException e2) {
            throw K(e2, t0Var, e2.isRecoverable, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.z1, com.google.android.exoplayer2.a2
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.rh4
    public void i(u1 u1Var) {
        this.h1.i(u1Var);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void l1() {
        try {
            this.h1.p();
        } catch (AudioSink.WriteException e) {
            throw K(e, e.format, e.isRecoverable, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.w1.b
    public void s(int i, Object obj) {
        if (i == 2) {
            this.h1.t(((Float) obj).floatValue());
        }
        if (i == 3) {
            this.h1.j((com.google.android.exoplayer2.audio.a) obj);
            return;
        }
        if (i == 6) {
            this.h1.k((u20) obj);
            return;
        }
        switch (i) {
            case 9:
                this.h1.x(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.h1.g(((Integer) obj).intValue());
                break;
            case 11:
                this.r1 = (z1.a) obj;
                break;
            case 12:
                if (z19.a >= 23) {
                    b.a(this.h1, obj);
                    break;
                }
                break;
            default:
                super.s(i, obj);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean y1(t0 t0Var) {
        return this.h1.b(t0Var);
    }

    @Override // defpackage.rh4
    public long z() {
        if (getState() == 2) {
            O1();
        }
        return this.m1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected int z1(com.google.android.exoplayer2.mediacodec.l lVar, t0 t0Var) {
        boolean z;
        if (!ku4.o(t0Var.l)) {
            return a2.r(0);
        }
        int i = z19.a >= 21 ? 32 : 0;
        boolean z2 = true;
        boolean z3 = t0Var.f0 != 0;
        boolean A1 = MediaCodecRenderer.A1(t0Var);
        int i2 = 8;
        if (A1 && this.h1.b(t0Var) && (!z3 || MediaCodecUtil.x() != null)) {
            return a2.y(4, 8, i);
        }
        if ((!"audio/raw".equals(t0Var.l) || this.h1.b(t0Var)) && this.h1.b(z19.f0(2, t0Var.M, t0Var.N))) {
            List L1 = L1(lVar, t0Var, false, this.h1);
            if (L1.isEmpty()) {
                return a2.r(1);
            }
            if (!A1) {
                return a2.r(2);
            }
            com.google.android.exoplayer2.mediacodec.k kVar = (com.google.android.exoplayer2.mediacodec.k) L1.get(0);
            boolean o = kVar.o(t0Var);
            if (!o) {
                for (int i3 = 1; i3 < L1.size(); i3++) {
                    com.google.android.exoplayer2.mediacodec.k kVar2 = (com.google.android.exoplayer2.mediacodec.k) L1.get(i3);
                    if (kVar2.o(t0Var)) {
                        z = false;
                        kVar = kVar2;
                        break;
                    }
                }
            }
            z = true;
            z2 = o;
            int i4 = z2 ? 4 : 3;
            if (z2 && kVar.r(t0Var)) {
                i2 = 16;
            }
            return a2.n(i4, i2, i, kVar.h ? 64 : 0, z ? 128 : 0);
        }
        return a2.r(1);
    }
}
