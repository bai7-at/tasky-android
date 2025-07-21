package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.amazonaws.event.ProgressEvent;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.b;
import com.google.android.exoplayer2.audio.c;
import com.google.android.exoplayer2.audio.g;
import com.google.android.exoplayer2.audio.j;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.u1;
import com.google.common.collect.ImmutableList;
import defpackage.a84;
import defpackage.d72;
import defpackage.gm4;
import defpackage.gx8;
import defpackage.i2;
import defpackage.ku4;
import defpackage.m2;
import defpackage.ow1;
import defpackage.pt0;
import defpackage.sv5;
import defpackage.u20;
import defpackage.ur;
import defpackage.vl0;
import defpackage.vw4;
import defpackage.wk5;
import defpackage.wy;
import defpackage.z19;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class DefaultAudioSink implements AudioSink {
    public static boolean h0;
    private static final Object i0 = new Object();
    private static ExecutorService j0;
    private static int k0;
    private i A;
    private i B;
    private u1 C;
    private boolean D;
    private ByteBuffer E;
    private int F;
    private long G;
    private long H;
    private long I;
    private long J;
    private int K;
    private boolean L;
    private boolean M;
    private long N;
    private float O;
    private ByteBuffer P;
    private int Q;
    private ByteBuffer R;
    private byte[] S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private u20 Z;
    private final Context a;
    private d a0;
    private final wy b;
    private boolean b0;
    private final boolean c;
    private long c0;
    private final com.google.android.exoplayer2.audio.i d;
    private long d0;
    private final q e;
    private boolean e0;
    private final ImmutableList f;
    private boolean f0;
    private final ImmutableList g;
    private Looper g0;
    private final pt0 h;
    private final com.google.android.exoplayer2.audio.g i;
    private final ArrayDeque j;
    private final boolean k;
    private final int l;
    private l m;
    private final j n;
    private final j o;
    private final e p;
    private final d72 q;
    private sv5 r;
    private AudioSink.a s;
    private g t;
    private g u;
    private com.google.android.exoplayer2.audio.d v;
    private AudioTrack w;
    private com.google.android.exoplayer2.audio.b x;
    private com.google.android.exoplayer2.audio.c y;
    private com.google.android.exoplayer2.audio.a z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    private static final class b {
        public static void a(AudioTrack audioTrack, d dVar) {
            audioTrack.setPreferredDevice(dVar == null ? null : dVar.a);
        }
    }

    private static final class c {
        public static void a(AudioTrack audioTrack, sv5 sv5Var) {
            LogSessionId logSessionId;
            boolean equals;
            LogSessionId a = sv5Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a.equals(logSessionId);
            if (equals) {
                return;
            }
            audioTrack.setLogSessionId(a);
        }
    }

    private static final class d {
        public final AudioDeviceInfo a;

        public d(AudioDeviceInfo audioDeviceInfo) {
            this.a = audioDeviceInfo;
        }
    }

    public interface e {
        public static final e a = new j.a().g();

        int a(int i, int i2, int i3, int i4, int i5, int i6, double d);
    }

    public static final class f {
        private final Context a;
        private wy c;
        private boolean d;
        private boolean e;
        d72 h;
        private com.google.android.exoplayer2.audio.b b = com.google.android.exoplayer2.audio.b.c;
        private int f = 0;
        e g = e.a;

        public f(Context context) {
            this.a = context;
        }

        public DefaultAudioSink g() {
            if (this.c == null) {
                this.c = new h(new AudioProcessor[0]);
            }
            return new DefaultAudioSink(this);
        }

        public f h(boolean z) {
            this.e = z;
            return this;
        }

        public f i(boolean z) {
            this.d = z;
            return this;
        }

        public f j(int i) {
            this.f = i;
            return this;
        }
    }

    private static final class g {
        public final t0 a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final com.google.android.exoplayer2.audio.d i;
        public final boolean j;

        public g(t0 t0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, com.google.android.exoplayer2.audio.d dVar, boolean z) {
            this.a = t0Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = dVar;
            this.j = z;
        }

        private AudioTrack d(boolean z, com.google.android.exoplayer2.audio.a aVar, int i) {
            int i2 = z19.a;
            return i2 >= 29 ? f(z, aVar, i) : i2 >= 21 ? e(z, aVar, i) : g(aVar, i);
        }

        private AudioTrack e(boolean z, com.google.android.exoplayer2.audio.a aVar, int i) {
            return new AudioTrack(i(aVar, z), DefaultAudioSink.O(this.e, this.f, this.g), this.h, 1, i);
        }

        private AudioTrack f(boolean z, com.google.android.exoplayer2.audio.a aVar, int i) {
            return new AudioTrack.Builder().setAudioAttributes(i(aVar, z)).setAudioFormat(DefaultAudioSink.O(this.e, this.f, this.g)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
        }

        private AudioTrack g(com.google.android.exoplayer2.audio.a aVar, int i) {
            int i0 = z19.i0(aVar.c);
            return i == 0 ? new AudioTrack(i0, this.e, this.f, this.g, this.h, 1) : new AudioTrack(i0, this.e, this.f, this.g, this.h, 1, i);
        }

        private static AudioAttributes i(com.google.android.exoplayer2.audio.a aVar, boolean z) {
            return z ? j() : aVar.c().a;
        }

        private static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z, com.google.android.exoplayer2.audio.a aVar, int i) {
            try {
                AudioTrack d = d(z, aVar, i);
                int state = d.getState();
                if (state == 1) {
                    return d;
                }
                try {
                    d.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.e, this.f, this.h, this.a, l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AudioSink.InitializationException(0, this.e, this.f, this.h, this.a, l(), e);
            }
        }

        public boolean b(g gVar) {
            return gVar.c == this.c && gVar.g == this.g && gVar.e == this.e && gVar.f == this.f && gVar.d == this.d && gVar.j == this.j;
        }

        public g c(int i) {
            return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, i, this.i, this.j);
        }

        public long h(long j) {
            return z19.P0(j, this.e);
        }

        public long k(long j) {
            return z19.P0(j, this.a.N);
        }

        public boolean l() {
            return this.c == 1;
        }
    }

    public static class h implements wy {
        private final AudioProcessor[] a;
        private final com.google.android.exoplayer2.audio.l b;
        private final n c;

        public h(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new com.google.android.exoplayer2.audio.l(), new n());
        }

        @Override // defpackage.wy
        public long a(long j) {
            return this.c.g(j);
        }

        @Override // defpackage.wy
        public AudioProcessor[] b() {
            return this.a;
        }

        @Override // defpackage.wy
        public u1 c(u1 u1Var) {
            this.c.i(u1Var.a);
            this.c.h(u1Var.b);
            return u1Var;
        }

        @Override // defpackage.wy
        public long d() {
            return this.b.p();
        }

        @Override // defpackage.wy
        public boolean e(boolean z) {
            this.b.v(z);
            return z;
        }

        public h(AudioProcessor[] audioProcessorArr, com.google.android.exoplayer2.audio.l lVar, n nVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.b = lVar;
            this.c = nVar;
            audioProcessorArr2[audioProcessorArr.length] = lVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = nVar;
        }
    }

    private static final class i {
        public final u1 a;
        public final long b;
        public final long c;

        private i(u1 u1Var, long j, long j2) {
            this.a = u1Var;
            this.b = j;
            this.c = j2;
        }
    }

    private static final class j {
        private final long a;
        private Exception b;
        private long c;

        public j(long j) {
            this.a = j;
        }

        public void a() {
            this.b = null;
        }

        public void b(Exception exc) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.b == null) {
                this.b = exc;
                this.c = this.a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.c) {
                Exception exc2 = this.b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.b;
                a();
                throw exc3;
            }
        }
    }

    private final class k implements g.a {
        private k() {
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void a(int i, long j) {
            if (DefaultAudioSink.this.s != null) {
                DefaultAudioSink.this.s.e(i, j, SystemClock.elapsedRealtime() - DefaultAudioSink.this.d0);
            }
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void b(long j) {
            a84.j("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void c(long j) {
            if (DefaultAudioSink.this.s != null) {
                DefaultAudioSink.this.s.c(j);
            }
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void d(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.this.S() + ", " + DefaultAudioSink.this.T();
            if (DefaultAudioSink.h0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            a84.j("DefaultAudioSink", str);
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void e(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.this.S() + ", " + DefaultAudioSink.this.T();
            if (DefaultAudioSink.h0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            a84.j("DefaultAudioSink", str);
        }
    }

    private final class l {
        private final Handler a = new Handler(Looper.myLooper());
        private final AudioTrack.StreamEventCallback b;

        class a extends AudioTrack.StreamEventCallback {
            final /* synthetic */ DefaultAudioSink a;

            a(DefaultAudioSink defaultAudioSink) {
                this.a = defaultAudioSink;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i) {
                if (audioTrack.equals(DefaultAudioSink.this.w) && DefaultAudioSink.this.s != null && DefaultAudioSink.this.W) {
                    DefaultAudioSink.this.s.h();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.w) && DefaultAudioSink.this.s != null && DefaultAudioSink.this.W) {
                    DefaultAudioSink.this.s.h();
                }
            }
        }

        public l() {
            this.b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new gm4(handler), this.b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.b);
            this.a.removeCallbacksAndMessages(null);
        }
    }

    private void G(long j2) {
        u1 u1Var;
        if (o0()) {
            u1Var = u1.d;
        } else {
            u1Var = m0() ? this.b.c(this.C) : u1.d;
            this.C = u1Var;
        }
        u1 u1Var2 = u1Var;
        this.D = m0() ? this.b.e(this.D) : false;
        this.j.add(new i(u1Var2, Math.max(0L, j2), this.u.h(T())));
        l0();
        AudioSink.a aVar = this.s;
        if (aVar != null) {
            aVar.a(this.D);
        }
    }

    private long H(long j2) {
        while (!this.j.isEmpty() && j2 >= ((i) this.j.getFirst()).c) {
            this.B = (i) this.j.remove();
        }
        i iVar = this.B;
        long j3 = j2 - iVar.c;
        if (iVar.a.equals(u1.d)) {
            return this.B.b + j3;
        }
        if (this.j.isEmpty()) {
            return this.B.b + this.b.a(j3);
        }
        i iVar2 = (i) this.j.getFirst();
        return iVar2.b - z19.c0(iVar2.c - j2, this.B.a.a);
    }

    private long I(long j2) {
        return j2 + this.u.h(this.b.d());
    }

    private AudioTrack J(g gVar) {
        try {
            AudioTrack a2 = gVar.a(this.b0, this.z, this.Y);
            d72 d72Var = this.q;
            if (d72Var != null) {
                d72Var.D(X(a2));
            }
            return a2;
        } catch (AudioSink.InitializationException e2) {
            AudioSink.a aVar = this.s;
            if (aVar != null) {
                aVar.b(e2);
            }
            throw e2;
        }
    }

    private AudioTrack K() {
        try {
            return J((g) ur.e(this.u));
        } catch (AudioSink.InitializationException e2) {
            g gVar = this.u;
            if (gVar.h > 1000000) {
                g c2 = gVar.c(1000000);
                try {
                    AudioTrack J = this.J(c2);
                    this.u = c2;
                    return J;
                } catch (AudioSink.InitializationException e3) {
                    e2.addSuppressed(e3);
                    this.Z();
                    throw e2;
                }
            }
            this.Z();
            throw e2;
        }
    }

    private boolean M() {
        if (!this.v.f()) {
            ByteBuffer byteBuffer = this.R;
            if (byteBuffer == null) {
                return true;
            }
            q0(byteBuffer, Long.MIN_VALUE);
            return this.R == null;
        }
        this.v.h();
        c0(Long.MIN_VALUE);
        if (!this.v.e()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.R;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private com.google.android.exoplayer2.audio.b N() {
        if (this.y == null && this.a != null) {
            this.g0 = Looper.myLooper();
            com.google.android.exoplayer2.audio.c cVar = new com.google.android.exoplayer2.audio.c(this.a, new c.f() { // from class: kg1
                @Override // com.google.android.exoplayer2.audio.c.f
                public final void a(b bVar) {
                    DefaultAudioSink.this.a0(bVar);
                }
            });
            this.y = cVar;
            this.x = cVar.d();
        }
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat O(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    private static int P(int i2, int i3, int i4) {
        int minBufferSize = AudioTrack.getMinBufferSize(i2, i3, i4);
        ur.g(minBufferSize != -2);
        return minBufferSize;
    }

    private static int Q(int i2, ByteBuffer byteBuffer) {
        switch (i2) {
            case 5:
            case 6:
            case 18:
                return i2.e(byteBuffer);
            case 7:
            case 8:
                return ow1.e(byteBuffer);
            case 9:
                int m = vw4.m(z19.J(byteBuffer, byteBuffer.position()));
                if (m != -1) {
                    return m;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return ProgressEvent.PART_COMPLETED_EVENT_CODE;
            case 13:
            case 19:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i2);
            case 14:
                int b2 = i2.b(byteBuffer);
                if (b2 == -1) {
                    return 0;
                }
                return i2.i(byteBuffer, b2) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return m2.c(byteBuffer);
            case 20:
                return wk5.g(byteBuffer);
        }
    }

    private int R(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int playbackOffloadSupport;
        int i2 = z19.a;
        if (i2 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            return playbackOffloadSupport;
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i2 == 30 && z19.d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long S() {
        return this.u.c == 0 ? this.G / r0.b : this.H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long T() {
        return this.u.c == 0 ? this.I / r0.d : this.J;
    }

    private boolean U() {
        sv5 sv5Var;
        if (!this.h.d()) {
            return false;
        }
        AudioTrack K = K();
        this.w = K;
        if (X(K)) {
            d0(this.w);
            if (this.l != 3) {
                AudioTrack audioTrack = this.w;
                t0 t0Var = this.u.a;
                audioTrack.setOffloadDelayPadding(t0Var.S, t0Var.X);
            }
        }
        int i2 = z19.a;
        if (i2 >= 31 && (sv5Var = this.r) != null) {
            c.a(this.w, sv5Var);
        }
        this.Y = this.w.getAudioSessionId();
        com.google.android.exoplayer2.audio.g gVar = this.i;
        AudioTrack audioTrack2 = this.w;
        g gVar2 = this.u;
        gVar.r(audioTrack2, gVar2.c == 2, gVar2.g, gVar2.d, gVar2.h);
        i0();
        int i3 = this.Z.a;
        if (i3 != 0) {
            this.w.attachAuxEffect(i3);
            this.w.setAuxEffectSendLevel(this.Z.b);
        }
        d dVar = this.a0;
        if (dVar != null && i2 >= 23) {
            b.a(this.w, dVar);
        }
        this.M = true;
        return true;
    }

    private static boolean V(int i2) {
        return (z19.a >= 24 && i2 == -6) || i2 == -32;
    }

    private boolean W() {
        return this.w != null;
    }

    private static boolean X(AudioTrack audioTrack) {
        return z19.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y(AudioTrack audioTrack, pt0 pt0Var) {
        try {
            audioTrack.flush();
            audioTrack.release();
            pt0Var.e();
            synchronized (i0) {
                try {
                    int i2 = k0 - 1;
                    k0 = i2;
                    if (i2 == 0) {
                        j0.shutdown();
                        j0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            pt0Var.e();
            synchronized (i0) {
                try {
                    int i3 = k0 - 1;
                    k0 = i3;
                    if (i3 == 0) {
                        j0.shutdown();
                        j0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    private void Z() {
        if (this.u.l()) {
            this.e0 = true;
        }
    }

    private void b0() {
        if (this.V) {
            return;
        }
        this.V = true;
        this.i.f(T());
        this.w.stop();
        this.F = 0;
    }

    private void c0(long j2) {
        ByteBuffer d2;
        if (!this.v.f()) {
            ByteBuffer byteBuffer = this.P;
            if (byteBuffer == null) {
                byteBuffer = AudioProcessor.a;
            }
            q0(byteBuffer, j2);
            return;
        }
        while (!this.v.e()) {
            do {
                d2 = this.v.d();
                if (d2.hasRemaining()) {
                    q0(d2, j2);
                } else {
                    ByteBuffer byteBuffer2 = this.P;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.v.i(this.P);
                    }
                }
            } while (!d2.hasRemaining());
            return;
        }
    }

    private void d0(AudioTrack audioTrack) {
        if (this.m == null) {
            this.m = new l();
        }
        this.m.a(audioTrack);
    }

    private static void e0(final AudioTrack audioTrack, final pt0 pt0Var) {
        pt0Var.c();
        synchronized (i0) {
            try {
                if (j0 == null) {
                    j0 = z19.E0("ExoPlayer:AudioTrackReleaseThread");
                }
                k0++;
                j0.execute(new Runnable() { // from class: lg1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAudioSink.Y(audioTrack, pt0Var);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void f0() {
        this.G = 0L;
        this.H = 0L;
        this.I = 0L;
        this.J = 0L;
        this.f0 = false;
        this.K = 0;
        this.B = new i(this.C, 0L, 0L);
        this.N = 0L;
        this.A = null;
        this.j.clear();
        this.P = null;
        this.Q = 0;
        this.R = null;
        this.V = false;
        this.U = false;
        this.E = null;
        this.F = 0;
        this.e.n();
        l0();
    }

    private void g0(u1 u1Var) {
        i iVar = new i(u1Var, -9223372036854775807L, -9223372036854775807L);
        if (W()) {
            this.A = iVar;
        } else {
            this.B = iVar;
        }
    }

    private void h0() {
        if (W()) {
            try {
                this.w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.C.a).setPitch(this.C.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                a84.k("DefaultAudioSink", "Failed to set playback params", e2);
            }
            u1 u1Var = new u1(this.w.getPlaybackParams().getSpeed(), this.w.getPlaybackParams().getPitch());
            this.C = u1Var;
            this.i.s(u1Var.a);
        }
    }

    private void i0() {
        if (W()) {
            if (z19.a >= 21) {
                j0(this.w, this.O);
            } else {
                k0(this.w, this.O);
            }
        }
    }

    private static void j0(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    private static void k0(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    private void l0() {
        com.google.android.exoplayer2.audio.d dVar = this.u.i;
        this.v = dVar;
        dVar.b();
    }

    private boolean m0() {
        if (!this.b0) {
            g gVar = this.u;
            if (gVar.c == 0 && !n0(gVar.a.Q)) {
                return true;
            }
        }
        return false;
    }

    private boolean n0(int i2) {
        return this.c && z19.v0(i2);
    }

    private boolean o0() {
        g gVar = this.u;
        return gVar != null && gVar.j && z19.a >= 23;
    }

    private boolean p0(t0 t0Var, com.google.android.exoplayer2.audio.a aVar) {
        int f2;
        int H;
        int R;
        if (z19.a < 29 || this.l == 0 || (f2 = ku4.f((String) ur.e(t0Var.l), t0Var.i)) == 0 || (H = z19.H(t0Var.M)) == 0 || (R = R(O(t0Var.N, H, f2), aVar.c().a)) == 0) {
            return false;
        }
        if (R == 1) {
            return ((t0Var.S != 0 || t0Var.X != 0) && (this.l == 1)) ? false : true;
        }
        if (R == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private void q0(ByteBuffer byteBuffer, long j2) {
        int r0;
        AudioSink.a aVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.R;
            if (byteBuffer2 != null) {
                ur.a(byteBuffer2 == byteBuffer);
            } else {
                this.R = byteBuffer;
                if (z19.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.S;
                    if (bArr == null || bArr.length < remaining) {
                        this.S = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.S, 0, remaining);
                    byteBuffer.position(position);
                    this.T = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (z19.a < 21) {
                int b2 = this.i.b(this.I);
                if (b2 > 0) {
                    r0 = this.w.write(this.S, this.T, Math.min(remaining2, b2));
                    if (r0 > 0) {
                        this.T += r0;
                        byteBuffer.position(byteBuffer.position() + r0);
                    }
                } else {
                    r0 = 0;
                }
            } else if (this.b0) {
                ur.g(j2 != -9223372036854775807L);
                if (j2 == Long.MIN_VALUE) {
                    j2 = this.c0;
                } else {
                    this.c0 = j2;
                }
                r0 = s0(this.w, byteBuffer, remaining2, j2);
            } else {
                r0 = r0(this.w, byteBuffer, remaining2);
            }
            this.d0 = SystemClock.elapsedRealtime();
            if (r0 < 0) {
                AudioSink.WriteException writeException = new AudioSink.WriteException(r0, this.u.a, V(r0) && this.J > 0);
                AudioSink.a aVar2 = this.s;
                if (aVar2 != null) {
                    aVar2.b(writeException);
                }
                if (writeException.isRecoverable) {
                    this.x = com.google.android.exoplayer2.audio.b.c;
                    throw writeException;
                }
                this.o.b(writeException);
                return;
            }
            this.o.a();
            if (X(this.w)) {
                if (this.J > 0) {
                    this.f0 = false;
                }
                if (this.W && (aVar = this.s) != null && r0 < remaining2 && !this.f0) {
                    aVar.d();
                }
            }
            int i2 = this.u.c;
            if (i2 == 0) {
                this.I += r0;
            }
            if (r0 == remaining2) {
                if (i2 != 0) {
                    ur.g(byteBuffer == this.P);
                    this.J += this.K * this.Q;
                }
                this.R = null;
            }
        }
    }

    private static int r0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    private int s0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
        if (z19.a >= 26) {
            return audioTrack.write(byteBuffer, i2, 1, j2 * 1000);
        }
        if (this.E == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.E = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.E.putInt(1431633921);
        }
        if (this.F == 0) {
            this.E.putInt(4, i2);
            this.E.putLong(8, j2 * 1000);
            this.E.position(0);
            this.F = i2;
        }
        int remaining = this.E.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.E, remaining, 1);
            if (write < 0) {
                this.F = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int r0 = r0(audioTrack, byteBuffer, i2);
        if (r0 < 0) {
            this.F = 0;
            return r0;
        }
        this.F -= r0;
        return r0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void L() {
        this.W = true;
        if (W()) {
            this.i.t();
            this.w.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void a() {
        flush();
        gx8 it2 = this.f.iterator();
        while (it2.hasNext()) {
            ((AudioProcessor) it2.next()).a();
        }
        gx8 it3 = this.g.iterator();
        while (it3.hasNext()) {
            ((AudioProcessor) it3.next()).a();
        }
        com.google.android.exoplayer2.audio.d dVar = this.v;
        if (dVar != null) {
            dVar.j();
        }
        this.W = false;
        this.e0 = false;
    }

    public void a0(com.google.android.exoplayer2.audio.b bVar) {
        ur.g(this.g0 == Looper.myLooper());
        if (bVar.equals(N())) {
            return;
        }
        this.x = bVar;
        AudioSink.a aVar = this.s;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean b(t0 t0Var) {
        return n(t0Var) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void c(AudioDeviceInfo audioDeviceInfo) {
        d dVar = audioDeviceInfo == null ? null : new d(audioDeviceInfo);
        this.a0 = dVar;
        AudioTrack audioTrack = this.w;
        if (audioTrack != null) {
            b.a(audioTrack, dVar);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean d() {
        return !W() || (this.U && !f());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public u1 e() {
        return this.C;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean f() {
        return W() && this.i.g(T());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (W()) {
            f0();
            if (this.i.h()) {
                this.w.pause();
            }
            if (X(this.w)) {
                ((l) ur.e(this.m)).b(this.w);
            }
            if (z19.a < 21 && !this.X) {
                this.Y = 0;
            }
            g gVar = this.t;
            if (gVar != null) {
                this.u = gVar;
                this.t = null;
            }
            this.i.p();
            e0(this.w, this.h);
            this.w = null;
        }
        this.o.a();
        this.n.a();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void g(int i2) {
        if (this.Y != i2) {
            this.Y = i2;
            this.X = i2 != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void h() {
        if (this.b0) {
            this.b0 = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void i(u1 u1Var) {
        this.C = new u1(z19.p(u1Var.a, 0.1f, 8.0f), z19.p(u1Var.b, 0.1f, 8.0f));
        if (o0()) {
            h0();
        } else {
            g0(u1Var);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void j(com.google.android.exoplayer2.audio.a aVar) {
        if (this.z.equals(aVar)) {
            return;
        }
        this.z = aVar;
        if (this.b0) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void k(u20 u20Var) {
        if (this.Z.equals(u20Var)) {
            return;
        }
        int i2 = u20Var.a;
        float f2 = u20Var.b;
        AudioTrack audioTrack = this.w;
        if (audioTrack != null) {
            if (this.Z.a != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.w.setAuxEffectSendLevel(f2);
            }
        }
        this.Z = u20Var;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean l(ByteBuffer byteBuffer, long j2, int i2) {
        ByteBuffer byteBuffer2 = this.P;
        ur.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.t != null) {
            if (!M()) {
                return false;
            }
            if (this.t.b(this.u)) {
                this.u = this.t;
                this.t = null;
                if (X(this.w) && this.l != 3) {
                    if (this.w.getPlayState() == 3) {
                        this.w.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.w;
                    t0 t0Var = this.u.a;
                    audioTrack.setOffloadDelayPadding(t0Var.S, t0Var.X);
                    this.f0 = true;
                }
            } else {
                b0();
                if (f()) {
                    return false;
                }
                flush();
            }
            G(j2);
        }
        if (!W()) {
            try {
                if (!U()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e2) {
                if (e2.isRecoverable) {
                    throw e2;
                }
                this.n.b(e2);
                return false;
            }
        }
        this.n.a();
        if (this.M) {
            this.N = Math.max(0L, j2);
            this.L = false;
            this.M = false;
            if (o0()) {
                h0();
            }
            G(j2);
            if (this.W) {
                L();
            }
        }
        if (!this.i.j(T())) {
            return false;
        }
        if (this.P == null) {
            ur.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            g gVar = this.u;
            if (gVar.c != 0 && this.K == 0) {
                int Q = Q(gVar.g, byteBuffer);
                this.K = Q;
                if (Q == 0) {
                    return true;
                }
            }
            if (this.A != null) {
                if (!M()) {
                    return false;
                }
                G(j2);
                this.A = null;
            }
            long k2 = this.N + this.u.k(S() - this.e.m());
            if (!this.L && Math.abs(k2 - j2) > 200000) {
                AudioSink.a aVar = this.s;
                if (aVar != null) {
                    aVar.b(new AudioSink.UnexpectedDiscontinuityException(j2, k2));
                }
                this.L = true;
            }
            if (this.L) {
                if (!M()) {
                    return false;
                }
                long j3 = j2 - k2;
                this.N += j3;
                this.L = false;
                G(j2);
                AudioSink.a aVar2 = this.s;
                if (aVar2 != null && j3 != 0) {
                    aVar2.g();
                }
            }
            if (this.u.c == 0) {
                this.G += byteBuffer.remaining();
            } else {
                this.H += this.K * i2;
            }
            this.P = byteBuffer;
            this.Q = i2;
        }
        c0(j2);
        if (!this.P.hasRemaining()) {
            this.P = null;
            this.Q = 0;
            return true;
        }
        if (!this.i.i(T())) {
            return false;
        }
        a84.j("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void m(AudioSink.a aVar) {
        this.s = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int n(t0 t0Var) {
        if (!"audio/raw".equals(t0Var.l)) {
            return ((this.e0 || !p0(t0Var, this.z)) && !N().i(t0Var)) ? 0 : 2;
        }
        if (z19.w0(t0Var.Q)) {
            int i2 = t0Var.Q;
            return (i2 == 2 || (this.c && i2 == 4)) ? 2 : 1;
        }
        a84.j("DefaultAudioSink", "Invalid PCM encoding: " + t0Var.Q);
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void o() {
        if (z19.a < 25) {
            flush();
            return;
        }
        this.o.a();
        this.n.a();
        if (W()) {
            f0();
            if (this.i.h()) {
                this.w.pause();
            }
            this.w.flush();
            this.i.p();
            com.google.android.exoplayer2.audio.g gVar = this.i;
            AudioTrack audioTrack = this.w;
            g gVar2 = this.u;
            gVar.r(audioTrack, gVar2.c == 2, gVar2.g, gVar2.d, gVar2.h);
            this.M = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void p() {
        if (!this.U && W() && M()) {
            b0();
            this.U = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.W = false;
        if (W() && this.i.o()) {
            this.w.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long q(boolean z) {
        if (!W() || this.M) {
            return Long.MIN_VALUE;
        }
        return I(H(Math.min(this.i.c(z), this.u.h(T()))));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void release() {
        com.google.android.exoplayer2.audio.c cVar = this.y;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void s() {
        this.L = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void t(float f2) {
        if (this.O != f2) {
            this.O = f2;
            i0();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void u(sv5 sv5Var) {
        this.r = sv5Var;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void v() {
        ur.g(z19.a >= 21);
        ur.g(this.X);
        if (this.b0) {
            return;
        }
        this.b0 = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void w(t0 t0Var, int i2, int[] iArr) {
        com.google.android.exoplayer2.audio.d dVar;
        int i3;
        int i4;
        int intValue;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int a2;
        int[] iArr2;
        if ("audio/raw".equals(t0Var.l)) {
            ur.a(z19.w0(t0Var.Q));
            int g0 = z19.g0(t0Var.Q, t0Var.M);
            ImmutableList.a aVar = new ImmutableList.a();
            if (n0(t0Var.Q)) {
                aVar.j(this.g);
            } else {
                aVar.j(this.f);
                aVar.i(this.b.b());
            }
            com.google.android.exoplayer2.audio.d dVar2 = new com.google.android.exoplayer2.audio.d(aVar.k());
            if (dVar2.equals(this.v)) {
                dVar2 = this.v;
            }
            this.e.o(t0Var.S, t0Var.X);
            if (z19.a < 21 && t0Var.M == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i12 = 0; i12 < 6; i12++) {
                    iArr2[i12] = i12;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.m(iArr2);
            try {
                AudioProcessor.a a3 = dVar2.a(new AudioProcessor.a(t0Var.N, t0Var.M, t0Var.Q));
                int i13 = a3.c;
                int i14 = a3.a;
                int H = z19.H(a3.b);
                i3 = z19.g0(i13, a3.b);
                dVar = dVar2;
                i5 = i13;
                i4 = i14;
                intValue = H;
                z = this.k;
                i7 = g0;
                i6 = 0;
            } catch (AudioProcessor.UnhandledAudioFormatException e2) {
                throw new AudioSink.ConfigurationException(e2, t0Var);
            }
        } else {
            com.google.android.exoplayer2.audio.d dVar3 = new com.google.android.exoplayer2.audio.d(ImmutableList.x());
            int i15 = t0Var.N;
            if (p0(t0Var, this.z)) {
                dVar = dVar3;
                i3 = -1;
                i6 = 1;
                z = true;
                i4 = i15;
                i5 = ku4.f((String) ur.e(t0Var.l), t0Var.i);
                intValue = z19.H(t0Var.M);
            } else {
                Pair f2 = N().f(t0Var);
                if (f2 == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + t0Var, t0Var);
                }
                int intValue2 = ((Integer) f2.first).intValue();
                dVar = dVar3;
                i3 = -1;
                i4 = i15;
                intValue = ((Integer) f2.second).intValue();
                i5 = intValue2;
                z = this.k;
                i6 = 2;
            }
            i7 = i3;
        }
        if (i5 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i6 + ") for: " + t0Var, t0Var);
        }
        if (intValue == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i6 + ") for: " + t0Var, t0Var);
        }
        if (i2 != 0) {
            a2 = i2;
            i8 = i5;
            i9 = intValue;
            i10 = i3;
            i11 = i4;
        } else {
            i8 = i5;
            i9 = intValue;
            i10 = i3;
            i11 = i4;
            a2 = this.p.a(P(i4, intValue, i5), i5, i6, i3 != -1 ? i3 : 1, i4, t0Var.h, z ? 8.0d : 1.0d);
        }
        this.e0 = false;
        g gVar = new g(t0Var, i7, i6, i10, i11, i9, i8, a2, dVar, z);
        if (W()) {
            this.t = gVar;
        } else {
            this.u = gVar;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void x(boolean z) {
        this.D = z;
        g0(o0() ? u1.d : this.C);
    }

    private DefaultAudioSink(f fVar) {
        Context context = fVar.a;
        this.a = context;
        this.x = context != null ? com.google.android.exoplayer2.audio.b.c(context) : fVar.b;
        this.b = fVar.c;
        int i2 = z19.a;
        this.c = i2 >= 21 && fVar.d;
        this.k = i2 >= 23 && fVar.e;
        this.l = i2 >= 29 ? fVar.f : 0;
        this.p = fVar.g;
        pt0 pt0Var = new pt0(vl0.a);
        this.h = pt0Var;
        pt0Var.e();
        this.i = new com.google.android.exoplayer2.audio.g(new k());
        com.google.android.exoplayer2.audio.i iVar = new com.google.android.exoplayer2.audio.i();
        this.d = iVar;
        q qVar = new q();
        this.e = qVar;
        this.f = ImmutableList.A(new p(), iVar, qVar);
        this.g = ImmutableList.y(new o());
        this.O = 1.0f;
        this.z = com.google.android.exoplayer2.audio.a.g;
        this.Y = 0;
        this.Z = new u20(0, 0.0f);
        u1 u1Var = u1.d;
        this.B = new i(u1Var, 0L, 0L);
        this.C = u1Var;
        this.D = false;
        this.j = new ArrayDeque();
        this.n = new j(100L);
        this.o = new j(100L);
        this.q = fVar.h;
    }
}
