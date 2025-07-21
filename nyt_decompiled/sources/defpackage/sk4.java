package defpackage;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w0;
import com.google.common.collect.ImmutableList;
import defpackage.ad;
import defpackage.pv5;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class sk4 implements ad, pv5.a {
    private boolean A;
    private final Context a;
    private final pv5 b;
    private final PlaybackSession c;
    private String i;
    private PlaybackMetrics.Builder j;
    private int k;
    private PlaybackException n;
    private b o;
    private b p;
    private b q;
    private t0 r;
    private t0 s;
    private t0 t;
    private boolean u;
    private int v;
    private boolean w;
    private int x;
    private int y;
    private int z;
    private final g2.d e = new g2.d();
    private final g2.b f = new g2.b();
    private final HashMap h = new HashMap();
    private final HashMap g = new HashMap();
    private final long d = SystemClock.elapsedRealtime();
    private int l = 0;
    private int m = 0;

    private static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    private static final class b {
        public final t0 a;
        public final int b;
        public final String c;

        public b(t0 t0Var, int i, String str) {
            this.a = t0Var;
            this.b = i;
            this.c = str;
        }
    }

    private sk4(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        yi1 yi1Var = new yi1();
        this.b = yi1Var;
        yi1Var.f(this);
    }

    private static Pair A0(String str) {
        String[] V0 = z19.V0(str, "-");
        return Pair.create(V0[0], V0.length >= 2 ? V0[1] : null);
    }

    private static int C0(Context context) {
        switch (l55.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int D0(w0 w0Var) {
        w0.h hVar = w0Var.b;
        if (hVar == null) {
            return 0;
        }
        int r0 = z19.r0(hVar.a, hVar.b);
        if (r0 == 0) {
            return 3;
        }
        if (r0 != 1) {
            return r0 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int E0(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    private void F0(ad.b bVar) {
        for (int i = 0; i < bVar.d(); i++) {
            int b2 = bVar.b(i);
            ad.a c = bVar.c(b2);
            if (b2 == 0) {
                this.b.a(c);
            } else if (b2 == 11) {
                this.b.c(c, this.k);
            } else {
                this.b.b(c);
            }
        }
    }

    private void G0(long j) {
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis;
        NetworkEvent build;
        int C0 = C0(this.a);
        if (C0 != this.m) {
            this.m = C0;
            PlaybackSession playbackSession = this.c;
            networkType = yj4.a().setNetworkType(C0);
            timeSinceCreatedMillis = networkType.setTimeSinceCreatedMillis(j - this.d);
            build = timeSinceCreatedMillis.build();
            playbackSession.reportNetworkEvent(build);
        }
    }

    private void H0(long j) {
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        PlaybackException playbackException = this.n;
        if (playbackException == null) {
            return;
        }
        a z0 = z0(playbackException, this.a, this.v == 4);
        PlaybackSession playbackSession = this.c;
        timeSinceCreatedMillis = cj4.a().setTimeSinceCreatedMillis(j - this.d);
        errorCode = timeSinceCreatedMillis.setErrorCode(z0.a);
        subErrorCode = errorCode.setSubErrorCode(z0.b);
        exception = subErrorCode.setException(playbackException);
        build = exception.build();
        playbackSession.reportPlaybackErrorEvent(build);
        this.A = true;
        this.n = null;
    }

    private void I0(v1 v1Var, ad.b bVar, long j) {
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        PlaybackStateEvent build;
        if (v1Var.w() != 2) {
            this.u = false;
        }
        if (v1Var.f() == null) {
            this.w = false;
        } else if (bVar.a(10)) {
            this.w = true;
        }
        int Q0 = Q0(v1Var);
        if (this.l != Q0) {
            this.l = Q0;
            this.A = true;
            PlaybackSession playbackSession = this.c;
            state = ri4.a().setState(this.l);
            timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(j - this.d);
            build = timeSinceCreatedMillis.build();
            playbackSession.reportPlaybackStateEvent(build);
        }
    }

    private void J0(v1 v1Var, ad.b bVar, long j) {
        if (bVar.a(2)) {
            h2 g = v1Var.g();
            boolean d = g.d(2);
            boolean d2 = g.d(1);
            boolean d3 = g.d(3);
            if (d || d2 || d3) {
                if (!d) {
                    O0(j, null, 0);
                }
                if (!d2) {
                    K0(j, null, 0);
                }
                if (!d3) {
                    M0(j, null, 0);
                }
            }
        }
        if (t0(this.o)) {
            b bVar2 = this.o;
            t0 t0Var = bVar2.a;
            if (t0Var.u != -1) {
                O0(j, t0Var, bVar2.b);
                this.o = null;
            }
        }
        if (t0(this.p)) {
            b bVar3 = this.p;
            K0(j, bVar3.a, bVar3.b);
            this.p = null;
        }
        if (t0(this.q)) {
            b bVar4 = this.q;
            M0(j, bVar4.a, bVar4.b);
            this.q = null;
        }
    }

    private void K0(long j, t0 t0Var, int i) {
        if (z19.c(this.s, t0Var)) {
            return;
        }
        if (this.s == null && i == 0) {
            i = 1;
        }
        this.s = t0Var;
        P0(0, j, t0Var, i);
    }

    private void L0(v1 v1Var, ad.b bVar) {
        DrmInitData x0;
        if (bVar.a(0)) {
            ad.a c = bVar.c(0);
            if (this.j != null) {
                N0(c.b, c.d);
            }
        }
        if (bVar.a(2) && this.j != null && (x0 = x0(v1Var.g().c())) != null) {
            ti4.a(z19.j(this.j)).setDrmType(y0(x0));
        }
        if (bVar.a(1011)) {
            this.z++;
        }
    }

    private void M0(long j, t0 t0Var, int i) {
        if (z19.c(this.t, t0Var)) {
            return;
        }
        if (this.t == null && i == 0) {
            i = 1;
        }
        this.t = t0Var;
        P0(2, j, t0Var, i);
    }

    private void N0(g2 g2Var, o.b bVar) {
        int g;
        PlaybackMetrics.Builder builder = this.j;
        if (bVar == null || (g = g2Var.g(bVar.a)) == -1) {
            return;
        }
        g2Var.k(g, this.f);
        g2Var.s(this.f.c, this.e);
        builder.setStreamType(D0(this.e.c));
        g2.d dVar = this.e;
        if (dVar.n != -9223372036854775807L && !dVar.l && !dVar.i && !dVar.i()) {
            builder.setMediaDurationMillis(this.e.g());
        }
        builder.setPlaybackType(this.e.i() ? 2 : 1);
        this.A = true;
    }

    private void O0(long j, t0 t0Var, int i) {
        if (z19.c(this.r, t0Var)) {
            return;
        }
        if (this.r == null && i == 0) {
            i = 1;
        }
        this.r = t0Var;
        P0(1, j, t0Var, i);
    }

    private void P0(int i, long j, t0 t0Var, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = nj4.a(i).setTimeSinceCreatedMillis(j - this.d);
        if (t0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(E0(i2));
            String str = t0Var.k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = t0Var.l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = t0Var.i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = t0Var.h;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = t0Var.t;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = t0Var.u;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = t0Var.M;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = t0Var.N;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = t0Var.c;
            if (str4 != null) {
                Pair A0 = A0(str4);
                timeSinceCreatedMillis.setLanguage((String) A0.first);
                Object obj = A0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = t0Var.w;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        PlaybackSession playbackSession = this.c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    private int Q0(v1 v1Var) {
        int w = v1Var.w();
        if (this.u) {
            return 5;
        }
        if (this.w) {
            return 13;
        }
        if (w == 4) {
            return 11;
        }
        if (w == 2) {
            int i = this.l;
            if (i == 0 || i == 2) {
                return 2;
            }
            if (v1Var.p()) {
                return v1Var.l() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (w == 3) {
            if (v1Var.p()) {
                return v1Var.l() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (w != 1 || this.l == 0) {
            return this.l;
        }
        return 12;
    }

    private boolean t0(b bVar) {
        return bVar != null && bVar.c.equals(this.b.getActiveSessionId());
    }

    public static sk4 u0(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager a2 = nk4.a(context.getSystemService("media_metrics"));
        if (a2 == null) {
            return null;
        }
        createPlaybackSession = a2.createPlaybackSession();
        return new sk4(context, createPlaybackSession);
    }

    private void v0() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.z);
            this.j.setVideoFramesDropped(this.x);
            this.j.setVideoFramesPlayed(this.y);
            Long l = (Long) this.g.get(this.i);
            this.j.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.h.get(this.i);
            this.j.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.j.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.c;
            build = this.j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.j = null;
        this.i = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.A = false;
    }

    private static int w0(int i) {
        switch (z19.W(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static DrmInitData x0(ImmutableList immutableList) {
        DrmInitData drmInitData;
        gx8 it2 = immutableList.iterator();
        while (it2.hasNext()) {
            h2.a aVar = (h2.a) it2.next();
            for (int i = 0; i < aVar.a; i++) {
                if (aVar.h(i) && (drmInitData = aVar.d(i).r) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    private static int y0(DrmInitData drmInitData) {
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            UUID uuid = drmInitData.e(i).uuid;
            if (uuid.equals(zf0.d)) {
                return 3;
            }
            if (uuid.equals(zf0.e)) {
                return 2;
            }
            if (uuid.equals(zf0.c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a z0(PlaybackException playbackException, Context context, boolean z) {
        int i;
        boolean z2;
        if (playbackException.errorCode == 1001) {
            return new a(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z2 = exoPlaybackException.f45type == 1;
            i = exoPlaybackException.rendererFormatSupport;
        } else {
            i = 0;
            z2 = false;
        }
        Throwable th = (Throwable) ur.e(playbackException.getCause());
        if (!(th instanceof IOException)) {
            if (z2 && (i == 0 || i == 1)) {
                return new a(35, 0);
            }
            if (z2 && i == 3) {
                return new a(15, 0);
            }
            if (z2 && i == 2) {
                return new a(23, 0);
            }
            if (th instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new a(13, z19.X(((MediaCodecRenderer.DecoderInitializationException) th).diagnosticInfo));
            }
            if (th instanceof MediaCodecDecoderException) {
                return new a(14, z19.X(((MediaCodecDecoderException) th).diagnosticInfo));
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof AudioSink.InitializationException) {
                return new a(17, ((AudioSink.InitializationException) th).audioTrackState);
            }
            if (th instanceof AudioSink.WriteException) {
                return new a(18, ((AudioSink.WriteException) th).errorCode);
            }
            if (z19.a < 16 || !(th instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new a(w0(errorCode), errorCode);
        }
        if (th instanceof HttpDataSource$InvalidResponseCodeException) {
            return new a(5, ((HttpDataSource$InvalidResponseCodeException) th).responseCode);
        }
        if ((th instanceof HttpDataSource$InvalidContentTypeException) || (th instanceof ParserException)) {
            return new a(z ? 10 : 11, 0);
        }
        boolean z3 = th instanceof HttpDataSource$HttpDataSourceException;
        if (z3 || (th instanceof UdpDataSource.UdpDataSourceException)) {
            if (l55.d(context).f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : (z3 && ((HttpDataSource$HttpDataSourceException) th).f47type == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (playbackException.errorCode == 1002) {
            return new a(21, 0);
        }
        if (!(th instanceof DrmSession.DrmSessionException)) {
            if (!(th instanceof FileDataSource.FileDataSourceException) || !(th.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) ur.e(th.getCause())).getCause();
            return (z19.a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th2 = (Throwable) ur.e(th.getCause());
        int i2 = z19.a;
        if (i2 < 21 || !(th2 instanceof MediaDrm.MediaDrmStateException)) {
            return (i2 < 23 || !(th2 instanceof MediaDrmResetException)) ? (i2 < 18 || !(th2 instanceof NotProvisionedException)) ? (i2 < 18 || !(th2 instanceof DeniedByServerException)) ? th2 instanceof UnsupportedDrmException ? new a(23, 0) : th2 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new a(28, 0) : new a(30, 0) : new a(29, 0) : new a(24, 0) : new a(27, 0);
        }
        int X = z19.X(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
        return new a(w0(X), X);
    }

    public LogSessionId B0() {
        LogSessionId sessionId;
        sessionId = this.c.getSessionId();
        return sessionId;
    }

    @Override // defpackage.ad
    public void C(ad.a aVar, v1.e eVar, v1.e eVar2, int i) {
        if (i == 1) {
            this.u = true;
        }
        this.k = i;
    }

    @Override // pv5.a
    public void D(ad.a aVar, String str) {
    }

    @Override // pv5.a
    public void G(ad.a aVar, String str, boolean z) {
        o.b bVar = aVar.d;
        if ((bVar == null || !bVar.b()) && str.equals(this.i)) {
            v0();
        }
        this.g.remove(str);
        this.h.remove(str);
    }

    @Override // defpackage.ad
    public void c0(ad.a aVar, int i, long j, long j2) {
        o.b bVar = aVar.d;
        if (bVar != null) {
            String e = this.b.e(aVar.b, (o.b) ur.e(bVar));
            Long l = (Long) this.h.get(e);
            Long l2 = (Long) this.g.get(e);
            this.h.put(e, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.g.put(e, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // defpackage.ad
    public void d0(ad.a aVar, pi4 pi4Var) {
        if (aVar.d == null) {
            return;
        }
        b bVar = new b((t0) ur.e(pi4Var.c), pi4Var.d, this.b.e(aVar.b, (o.b) ur.e(aVar.d)));
        int i = pi4Var.b;
        if (i != 0) {
            if (i == 1) {
                this.p = bVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.q = bVar;
                return;
            }
        }
        this.o = bVar;
    }

    @Override // defpackage.ad
    public void g(ad.a aVar, v64 v64Var, pi4 pi4Var, IOException iOException, boolean z) {
        this.v = pi4Var.a;
    }

    @Override // pv5.a
    public void n(ad.a aVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        o.b bVar = aVar.d;
        if (bVar == null || !bVar.b()) {
            v0();
            this.i = str;
            playerName = jk4.a().setPlayerName("ExoPlayerLib");
            playerVersion = playerName.setPlayerVersion("2.19.1");
            this.j = playerVersion;
            N0(aVar.b, aVar.d);
        }
    }

    @Override // defpackage.ad
    public void o(ad.a aVar, z89 z89Var) {
        b bVar = this.o;
        if (bVar != null) {
            t0 t0Var = bVar.a;
            if (t0Var.u == -1) {
                this.o = new b(t0Var.c().n0(z89Var.a).S(z89Var.b).G(), bVar.b, bVar.c);
            }
        }
    }

    @Override // defpackage.ad
    public void s0(v1 v1Var, ad.b bVar) {
        if (bVar.d() == 0) {
            return;
        }
        F0(bVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        L0(v1Var, bVar);
        H0(elapsedRealtime);
        J0(v1Var, bVar, elapsedRealtime);
        G0(elapsedRealtime);
        I0(v1Var, bVar, elapsedRealtime);
        if (bVar.a(1028)) {
            this.b.d(bVar.c(1028));
        }
    }

    @Override // defpackage.ad
    public void t(ad.a aVar, PlaybackException playbackException) {
        this.n = playbackException;
    }

    @Override // pv5.a
    public void u(ad.a aVar, String str, String str2) {
    }

    @Override // defpackage.ad
    public void v(ad.a aVar, wc1 wc1Var) {
        this.x += wc1Var.g;
        this.y += wc1Var.e;
    }
}
