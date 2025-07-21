package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzce;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class fof implements xgf, iof {
    private boolean B;
    private int H;
    private int L;
    private int M;
    private boolean N;
    private final Context a;
    private final lof b;
    private final PlaybackSession c;
    private String i;
    private PlaybackMetrics.Builder j;
    private int k;
    private zzce n;
    private cof r;
    private cof s;
    private cof t;
    private l6a u;
    private l6a w;
    private l6a x;
    private boolean y;
    private final l0c e = new l0c();
    private final fyb f = new fyb();
    private final HashMap h = new HashMap();
    private final HashMap g = new HashMap();
    private final long d = SystemClock.elapsedRealtime();
    private int l = 0;
    private int m = 0;

    private fof(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        znf znfVar = new znf(znf.i);
        this.b = znfVar;
        znfVar.e(this);
    }

    public static fof i(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager a = nk4.a(context.getSystemService("media_metrics"));
        if (a == null) {
            return null;
        }
        createPlaybackSession = a.createPlaybackSession();
        return new fof(context, createPlaybackSession);
    }

    private static int r(int i) {
        switch (khe.x(i)) {
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

    private final void s() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.N) {
            builder.setAudioUnderrunCount(this.M);
            this.j.setVideoFramesDropped(this.H);
            this.j.setVideoFramesPlayed(this.L);
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
        this.M = 0;
        this.H = 0;
        this.L = 0;
        this.u = null;
        this.w = null;
        this.x = null;
        this.N = false;
    }

    private final void t(long j, l6a l6aVar, int i) {
        if (khe.f(this.w, l6aVar)) {
            return;
        }
        int i2 = this.w == null ? 1 : 0;
        this.w = l6aVar;
        x(0, j, l6aVar, i2);
    }

    private final void u(long j, l6a l6aVar, int i) {
        if (khe.f(this.x, l6aVar)) {
            return;
        }
        int i2 = this.x == null ? 1 : 0;
        this.x = l6aVar;
        x(2, j, l6aVar, i2);
    }

    private final void v(n1c n1cVar, zzf zzfVar) {
        int a;
        PlaybackMetrics.Builder builder = this.j;
        if (zzfVar == null || (a = n1cVar.a(zzfVar.a)) == -1) {
            return;
        }
        int i = 0;
        n1cVar.d(a, this.f, false);
        n1cVar.e(this.f.c, this.e, 0L);
        rra rraVar = this.e.c.b;
        if (rraVar != null) {
            int B = khe.B(rraVar.a);
            i = B != 0 ? B != 1 ? B != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        l0c l0cVar = this.e;
        if (l0cVar.m != -9223372036854775807L && !l0cVar.k && !l0cVar.h && !l0cVar.b()) {
            builder.setMediaDurationMillis(khe.I(this.e.m));
        }
        builder.setPlaybackType(true != this.e.b() ? 1 : 2);
        this.N = true;
    }

    private final void w(long j, l6a l6aVar, int i) {
        if (khe.f(this.u, l6aVar)) {
            return;
        }
        int i2 = this.u == null ? 1 : 0;
        this.u = l6aVar;
        x(1, j, l6aVar, i2);
    }

    private final void x(int i, long j, l6a l6aVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = nj4.a(i).setTimeSinceCreatedMillis(j - this.d);
        if (l6aVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = l6aVar.k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = l6aVar.l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = l6aVar.i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = l6aVar.h;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = l6aVar.q;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = l6aVar.r;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = l6aVar.y;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = l6aVar.z;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = l6aVar.c;
            if (str4 != null) {
                int i8 = khe.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = l6aVar.s;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.N = true;
        PlaybackSession playbackSession = this.c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    private final boolean y(cof cofVar) {
        if (cofVar != null) {
            return cofVar.c.equals(this.b.zze());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01ed, code lost:
    
        if (r9 != 1) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xgf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.frb r19, defpackage.vgf r20) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fof.a(frb, vgf):void");
    }

    @Override // defpackage.iof
    public final void b(tgf tgfVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        zzf zzfVar = tgfVar.d;
        if (zzfVar == null || !zzfVar.b()) {
            s();
            this.i = str;
            playerName = jk4.a().setPlayerName("AndroidXMedia3");
            playerVersion = playerName.setPlayerVersion("1.2.1");
            this.j = playerVersion;
            v(tgfVar.b, tgfVar.d);
        }
    }

    @Override // defpackage.xgf
    public final /* synthetic */ void c(tgf tgfVar, l6a l6aVar, g8f g8fVar) {
    }

    @Override // defpackage.xgf
    public final /* synthetic */ void d(tgf tgfVar, int i, long j) {
    }

    @Override // defpackage.iof
    public final void e(tgf tgfVar, String str, boolean z) {
        zzf zzfVar = tgfVar.d;
        if ((zzfVar == null || !zzfVar.b()) && str.equals(this.i)) {
            s();
        }
        this.g.remove(str);
        this.h.remove(str);
    }

    public final LogSessionId f() {
        LogSessionId sessionId;
        sessionId = this.c.getSessionId();
        return sessionId;
    }

    @Override // defpackage.xgf
    public final /* synthetic */ void g(tgf tgfVar, int i) {
    }

    @Override // defpackage.xgf
    public final void h(tgf tgfVar, zzce zzceVar) {
        this.n = zzceVar;
    }

    @Override // defpackage.xgf
    public final /* synthetic */ void j(tgf tgfVar, Object obj, long j) {
    }

    @Override // defpackage.xgf
    public final void k(tgf tgfVar, int i, long j, long j2) {
        zzf zzfVar = tgfVar.d;
        if (zzfVar != null) {
            lof lofVar = this.b;
            n1c n1cVar = tgfVar.b;
            HashMap hashMap = this.h;
            String c = lofVar.c(n1cVar, zzfVar);
            Long l = (Long) hashMap.get(c);
            Long l2 = (Long) this.g.get(c);
            this.h.put(c, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.g.put(c, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // defpackage.xgf
    public final void l(tgf tgfVar, mzf mzfVar, vzf vzfVar, IOException iOException, boolean z) {
    }

    @Override // defpackage.xgf
    public final void m(tgf tgfVar, zpb zpbVar, zpb zpbVar2, int i) {
        if (i == 1) {
            this.y = true;
            i = 1;
        }
        this.k = i;
    }

    @Override // defpackage.xgf
    public final void n(tgf tgfVar, wmc wmcVar) {
        cof cofVar = this.r;
        if (cofVar != null) {
            l6a l6aVar = cofVar.a;
            if (l6aVar.r == -1) {
                x3a b = l6aVar.b();
                b.C(wmcVar.a);
                b.i(wmcVar.b);
                this.r = new cof(b.D(), 0, cofVar.c);
            }
        }
    }

    @Override // defpackage.xgf
    public final void o(tgf tgfVar, e8f e8fVar) {
        this.H += e8fVar.g;
        this.L += e8fVar.e;
    }

    @Override // defpackage.xgf
    public final /* synthetic */ void p(tgf tgfVar, l6a l6aVar, g8f g8fVar) {
    }

    @Override // defpackage.xgf
    public final void q(tgf tgfVar, vzf vzfVar) {
        zzf zzfVar = tgfVar.d;
        if (zzfVar == null) {
            return;
        }
        l6a l6aVar = vzfVar.b;
        l6aVar.getClass();
        cof cofVar = new cof(l6aVar, 0, this.b.c(tgfVar.b, zzfVar));
        int i = vzfVar.a;
        if (i != 0) {
            if (i == 1) {
                this.s = cofVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.t = cofVar;
                return;
            }
        }
        this.r = cofVar;
    }
}
