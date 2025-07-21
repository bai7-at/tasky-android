package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.amazonaws.services.s3.internal.Constants;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.source.ads.a;
import com.google.android.exoplayer2.source.ads.b;
import com.google.android.exoplayer2.v1;
import com.google.common.collect.HashBiMap;
import defpackage.jf3;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
final class v7 implements v1.d {
    private boolean A;
    private boolean B;
    private int C;
    private AdMediaInfo D;
    private b E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int I;
    private b J;
    private long K;
    private long L;
    private long M;
    private boolean N;
    private long O;
    private final jf3.a a;
    private final jf3.b b;
    private final List c;
    private final com.google.android.exoplayer2.upstream.b d;
    private final Object e;
    private final g2.b f;
    private final Handler g;
    private final c h;
    private final List i;
    private final List j;
    private final Runnable k;
    private final c80 l;
    private final AdDisplayContainer m;
    private final AdsLoader n;
    private final Runnable o;
    private Object p;
    private v1 q;
    private VideoProgressUpdate r;
    private VideoProgressUpdate s;
    private int t;
    private AdsManager u;
    private boolean v;
    private AdsMediaSource.AdLoadException w;
    private g2 x;
    private long y;
    private com.google.android.exoplayer2.source.ads.a z;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdEvent.AdEventType.values().length];
            a = iArr;
            try {
                iArr[AdEvent.AdEventType.AD_BREAK_FETCH_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AdEvent.AdEventType.TAPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AdEvent.AdEventType.CLICKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AdEvent.AdEventType.CONTENT_RESUME_REQUESTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[AdEvent.AdEventType.LOG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public int hashCode() {
            return (this.a * 31) + this.b;
        }

        public String toString() {
            return "(" + this.a + ", " + this.b + ')';
        }
    }

    private final class c implements AdsLoader.AdsLoadedListener, ContentProgressProvider, AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, VideoAdPlayer {
        private c() {
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            v7.this.j.add(videoAdPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
        public VideoProgressUpdate getAdProgress() {
            throw new IllegalStateException("Unexpected call to getAdProgress when using preloading");
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider
        public VideoProgressUpdate getContentProgress() {
            VideoProgressUpdate N0 = v7.this.N0();
            if (v7.this.a.o) {
                a84.b("AdTagLoader", "Content progress: " + jf3.d(N0));
            }
            if (v7.this.O != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() - v7.this.O >= 4000) {
                    v7.this.O = -9223372036854775807L;
                    v7.this.R0(new IOException("Ad preloading timed out"));
                    v7.this.f1();
                }
            } else if (v7.this.M != -9223372036854775807L && v7.this.q != null && v7.this.q.w() == 2 && v7.this.a1()) {
                v7.this.O = SystemClock.elapsedRealtime();
            }
            return N0;
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VolumeProvider
        public int getVolume() {
            return v7.this.P0();
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
            try {
                v7.this.b1(adMediaInfo, adPodInfo);
            } catch (RuntimeException e) {
                v7.this.e1("loadAd", e);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
        public void onAdError(AdErrorEvent adErrorEvent) {
            AdError error = adErrorEvent.getError();
            if (v7.this.a.o) {
                a84.c("AdTagLoader", "onAdError", error);
            }
            if (v7.this.u == null) {
                v7.this.p = null;
                v7.this.z = new com.google.android.exoplayer2.source.ads.a(v7.this.e, new long[0]);
                v7.this.r1();
            } else if (jf3.e(error)) {
                try {
                    v7.this.R0(error);
                } catch (RuntimeException e) {
                    v7.this.e1("onAdError", e);
                }
            }
            if (v7.this.w == null) {
                v7.this.w = AdsMediaSource.AdLoadException.c(error);
            }
            v7.this.f1();
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
        public void onAdEvent(AdEvent adEvent) {
            AdEvent.AdEventType type2 = adEvent.getType();
            if (v7.this.a.o && type2 != AdEvent.AdEventType.AD_PROGRESS) {
                a84.b("AdTagLoader", "onAdEvent: " + type2);
            }
            try {
                v7.this.Q0(adEvent);
            } catch (RuntimeException e) {
                v7.this.e1("onAdEvent", e);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdsLoader.AdsLoadedListener
        public void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent) {
            AdsManager adsManager = adsManagerLoadedEvent.getAdsManager();
            if (!z19.c(v7.this.p, adsManagerLoadedEvent.getUserRequestContext())) {
                adsManager.destroy();
                return;
            }
            v7.this.p = null;
            v7.this.u = adsManager;
            adsManager.addAdErrorListener(this);
            if (v7.this.a.k != null) {
                adsManager.addAdErrorListener(v7.this.a.k);
            }
            adsManager.addAdEventListener(this);
            if (v7.this.a.l != null) {
                adsManager.addAdEventListener(v7.this.a.l);
            }
            try {
                v7.this.z = new com.google.android.exoplayer2.source.ads.a(v7.this.e, jf3.a(adsManager.getAdCuePoints()));
                v7.this.r1();
            } catch (RuntimeException e) {
                v7.this.e1("onAdsManagerLoaded", e);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void pauseAd(AdMediaInfo adMediaInfo) {
            try {
                v7.this.h1(adMediaInfo);
            } catch (RuntimeException e) {
                v7.this.e1("pauseAd", e);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void playAd(AdMediaInfo adMediaInfo) {
            try {
                v7.this.j1(adMediaInfo);
            } catch (RuntimeException e) {
                v7.this.e1("playAd", e);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void release() {
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            v7.this.j.remove(videoAdPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void stopAd(AdMediaInfo adMediaInfo) {
            try {
                v7.this.p1(adMediaInfo);
            } catch (RuntimeException e) {
                v7.this.e1("stopAd", e);
            }
        }

        /* synthetic */ c(v7 v7Var, a aVar) {
            this();
        }
    }

    public v7(Context context, jf3.a aVar, jf3.b bVar, List list, com.google.android.exoplayer2.upstream.b bVar2, Object obj, ViewGroup viewGroup) {
        this.a = aVar;
        this.b = bVar;
        ImaSdkSettings imaSdkSettings = aVar.n;
        if (imaSdkSettings == null) {
            imaSdkSettings = bVar.c();
            if (aVar.o) {
                imaSdkSettings.setDebugMode(true);
            }
        }
        imaSdkSettings.setPlayerType("google/exo.ext.ima");
        imaSdkSettings.setPlayerVersion("2.19.1");
        this.c = list;
        this.d = bVar2;
        this.e = obj;
        this.f = new g2.b();
        this.g = z19.v(jf3.c(), null);
        c cVar = new c(this, null);
        this.h = cVar;
        this.i = new ArrayList();
        ArrayList arrayList = new ArrayList(1);
        this.j = arrayList;
        VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback = aVar.m;
        if (videoAdPlayerCallback != null) {
            arrayList.add(videoAdPlayerCallback);
        }
        this.k = new Runnable() { // from class: t7
            @Override // java.lang.Runnable
            public final void run() {
                v7.this.s1();
            }
        };
        this.l = HashBiMap.j();
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.r = videoProgressUpdate;
        this.s = videoProgressUpdate;
        this.K = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.M = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.x = g2.a;
        this.z = com.google.android.exoplayer2.source.ads.a.g;
        this.o = new Runnable() { // from class: u7
            @Override // java.lang.Runnable
            public final void run() {
                v7.this.S0();
            }
        };
        if (viewGroup != null) {
            this.m = bVar.b(viewGroup, cVar);
        } else {
            this.m = bVar.f(context, cVar);
        }
        Collection<CompanionAdSlot> collection = aVar.j;
        if (collection != null) {
            this.m.setCompanionSlots(collection);
        }
        this.n = l1(context, imaSdkSettings, this.m);
    }

    private void F0() {
        AdsManager adsManager = this.u;
        if (adsManager != null) {
            adsManager.removeAdErrorListener(this.h);
            AdErrorEvent.AdErrorListener adErrorListener = this.a.k;
            if (adErrorListener != null) {
                this.u.removeAdErrorListener(adErrorListener);
            }
            this.u.removeAdEventListener(this.h);
            AdEvent.AdEventListener adEventListener = this.a.l;
            if (adEventListener != null) {
                this.u.removeAdEventListener(adEventListener);
            }
            this.u.destroy();
            this.u = null;
        }
    }

    private void G0() {
        if (this.F || this.y == -9223372036854775807L || this.M != -9223372036854775807L) {
            return;
        }
        long M0 = M0((v1) ur.e(this.q), this.x, this.f);
        if (BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT + M0 < this.y) {
            return;
        }
        int g = this.z.g(z19.D0(M0), z19.D0(this.y));
        if (g == -1 || this.z.e(g).a == Long.MIN_VALUE || !this.z.e(g).k()) {
            n1();
        }
    }

    private int I0(AdPodInfo adPodInfo) {
        return adPodInfo.getPodIndex() == -1 ? this.z.b - 1 : J0(adPodInfo.getTimeOffset());
    }

    private int J0(double d) {
        long round = Math.round(((float) d) * 1000000.0d);
        int i = 0;
        while (true) {
            com.google.android.exoplayer2.source.ads.a aVar = this.z;
            if (i >= aVar.b) {
                throw new IllegalStateException("Failed to find cue point");
            }
            long j = aVar.e(i).a;
            if (j != Long.MIN_VALUE && Math.abs(j - round) < 1000) {
                return i;
            }
            i++;
        }
    }

    private String K0(AdMediaInfo adMediaInfo) {
        b bVar = (b) this.l.get(adMediaInfo);
        StringBuilder sb = new StringBuilder();
        sb.append("AdMediaInfo[");
        sb.append(adMediaInfo == null ? Constants.NULL_VERSION_ID : adMediaInfo.getUrl());
        sb.append(", ");
        sb.append(bVar);
        sb.append("]");
        return sb.toString();
    }

    private VideoProgressUpdate L0() {
        v1 v1Var = this.q;
        if (v1Var == null) {
            return this.s;
        }
        if (this.C == 0 || !this.G) {
            return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        }
        long duration = v1Var.getDuration();
        return duration == -9223372036854775807L ? VideoProgressUpdate.VIDEO_TIME_NOT_READY : new VideoProgressUpdate(this.q.z(), duration);
    }

    private static long M0(v1 v1Var, g2 g2Var, g2.b bVar) {
        long t = v1Var.t();
        return g2Var.v() ? t : t - g2Var.k(v1Var.q(), bVar).r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VideoProgressUpdate N0() {
        boolean z = this.y != -9223372036854775807L;
        long j = this.M;
        if (j != -9223372036854775807L) {
            this.N = true;
        } else {
            v1 v1Var = this.q;
            if (v1Var == null) {
                return this.r;
            }
            if (this.K != -9223372036854775807L) {
                j = this.L + (SystemClock.elapsedRealtime() - this.K);
            } else {
                if (this.C != 0 || this.G || !z) {
                    return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
                }
                j = M0(v1Var, this.x, this.f);
            }
        }
        return new VideoProgressUpdate(j, z ? this.y : -1L);
    }

    private int O0() {
        v1 v1Var = this.q;
        if (v1Var == null) {
            return -1;
        }
        long D0 = z19.D0(M0(v1Var, this.x, this.f));
        int g = this.z.g(D0, z19.D0(this.y));
        return g == -1 ? this.z.f(D0, z19.D0(this.y)) : g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int P0() {
        v1 v1Var = this.q;
        return v1Var == null ? this.t : v1Var.j(22) ? (int) (v1Var.getVolume() * 100.0f) : v1Var.g().d(1) ? 100 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void Q0(AdEvent adEvent) {
        if (this.u == null) {
        }
        int i = 0;
        switch (a.a[adEvent.getType().ordinal()]) {
            case 1:
                String str = (String) ur.e(adEvent.getAdData().get("adBreakTime"));
                if (this.a.o) {
                    a84.b("AdTagLoader", "Fetch error for ad at " + str + " seconds");
                }
                double parseDouble = Double.parseDouble(str);
                c1(parseDouble == -1.0d ? this.z.b - 1 : J0(parseDouble));
                break;
            case 2:
                this.B = true;
                i1();
                break;
            case 3:
                while (i < this.i.size()) {
                    ((b.a) this.i.get(i)).x();
                    i++;
                }
                break;
            case 4:
                while (i < this.i.size()) {
                    ((b.a) this.i.get(i)).v();
                    i++;
                }
                break;
            case 5:
                this.B = false;
                m1();
                break;
            case 6:
                a84.g("AdTagLoader", "AdEvent: " + adEvent.getAdData());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(Exception exc) {
        int O0 = O0();
        if (O0 == -1) {
            a84.k("AdTagLoader", "Unable to determine ad group index for ad group load error", exc);
            return;
        }
        c1(O0);
        if (this.w == null) {
            this.w = AdsMediaSource.AdLoadException.b(exc, O0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0() {
        R0(new IOException("Ad loading timed out"));
        f1();
    }

    private void T0(int i, int i2, Exception exc) {
        if (this.a.o) {
            a84.c("AdTagLoader", "Prepare error for ad " + i2 + " in group " + i, exc);
        }
        if (this.u == null) {
            a84.j("AdTagLoader", "Ignoring ad prepare error after release");
            return;
        }
        if (this.C == 0) {
            this.K = SystemClock.elapsedRealtime();
            long h1 = z19.h1(this.z.e(i).a);
            this.L = h1;
            if (h1 == Long.MIN_VALUE) {
                this.L = this.y;
            }
            this.J = new b(i, i2);
        } else {
            AdMediaInfo adMediaInfo = (AdMediaInfo) ur.e(this.D);
            if (i2 > this.I) {
                for (int i3 = 0; i3 < this.j.size(); i3++) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) this.j.get(i3)).onEnded(adMediaInfo);
                }
            }
            this.I = this.z.e(i).g();
            for (int i4 = 0; i4 < this.j.size(); i4++) {
                ((VideoAdPlayer.VideoAdPlayerCallback) this.j.get(i4)).onError((AdMediaInfo) ur.e(adMediaInfo));
            }
        }
        this.z = this.z.m(i, i2);
        r1();
    }

    private void U0(boolean z, int i) {
        if (this.G && this.C == 1) {
            boolean z2 = this.H;
            if (!z2 && i == 2) {
                this.H = true;
                AdMediaInfo adMediaInfo = (AdMediaInfo) ur.e(this.D);
                for (int i2 = 0; i2 < this.j.size(); i2++) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) this.j.get(i2)).onBuffering(adMediaInfo);
                }
                q1();
            } else if (z2 && i == 3) {
                this.H = false;
                s1();
            }
        }
        int i3 = this.C;
        if (i3 == 0 && i == 2 && z) {
            G0();
            return;
        }
        if (i3 == 0 || i != 4) {
            return;
        }
        AdMediaInfo adMediaInfo2 = this.D;
        if (adMediaInfo2 == null) {
            a84.j("AdTagLoader", "onEnded without ad media info");
        } else {
            for (int i4 = 0; i4 < this.j.size(); i4++) {
                ((VideoAdPlayer.VideoAdPlayerCallback) this.j.get(i4)).onEnded(adMediaInfo2);
            }
        }
        if (this.a.o) {
            a84.b("AdTagLoader", "VideoAdPlayerCallback.onEnded in onPlaybackStateChanged");
        }
    }

    private void X0() {
        v1 v1Var = this.q;
        if (this.u == null || v1Var == null) {
            return;
        }
        if (!this.G && !v1Var.c()) {
            G0();
            if (!this.F && !this.x.v()) {
                long M0 = M0(v1Var, this.x, this.f);
                this.x.k(v1Var.q(), this.f);
                if (this.f.i(z19.D0(M0)) != -1) {
                    this.N = false;
                    this.M = M0;
                }
            }
        }
        boolean z = this.G;
        int i = this.I;
        boolean c2 = v1Var.c();
        this.G = c2;
        int s = c2 ? v1Var.s() : -1;
        this.I = s;
        if (z && s != i) {
            AdMediaInfo adMediaInfo = this.D;
            if (adMediaInfo == null) {
                a84.j("AdTagLoader", "onEnded without ad media info");
            } else {
                b bVar = (b) this.l.get(adMediaInfo);
                int i2 = this.I;
                if (i2 == -1 || (bVar != null && bVar.b < i2)) {
                    for (int i3 = 0; i3 < this.j.size(); i3++) {
                        ((VideoAdPlayer.VideoAdPlayerCallback) this.j.get(i3)).onEnded(adMediaInfo);
                    }
                    if (this.a.o) {
                        a84.b("AdTagLoader", "VideoAdPlayerCallback.onEnded in onTimelineChanged/onPositionDiscontinuity");
                    }
                }
            }
        }
        if (!this.F && !z && this.G && this.C == 0) {
            a.C0183a e = this.z.e(v1Var.i());
            if (e.a == Long.MIN_VALUE) {
                n1();
            } else {
                this.K = SystemClock.elapsedRealtime();
                long h1 = z19.h1(e.a);
                this.L = h1;
                if (h1 == Long.MIN_VALUE) {
                    this.L = this.y;
                }
            }
        }
        if (Z0()) {
            this.g.removeCallbacks(this.o);
            this.g.postDelayed(this.o, this.a.a);
        }
    }

    private static boolean Y0(com.google.android.exoplayer2.source.ads.a aVar) {
        int i = aVar.b;
        if (i == 1) {
            long j = aVar.e(0).a;
            return (j == 0 || j == Long.MIN_VALUE) ? false : true;
        }
        if (i == 2) {
            return (aVar.e(0).a == 0 && aVar.e(1).a == Long.MIN_VALUE) ? false : true;
        }
        return true;
    }

    private boolean Z0() {
        int i;
        v1 v1Var = this.q;
        if (v1Var == null || (i = v1Var.i()) == -1) {
            return false;
        }
        a.C0183a e = this.z.e(i);
        int s = v1Var.s();
        int i2 = e.b;
        return i2 == -1 || i2 <= s || e.e[s] == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a1() {
        int O0;
        v1 v1Var = this.q;
        if (v1Var == null || (O0 = O0()) == -1) {
            return false;
        }
        a.C0183a e = this.z.e(O0);
        int i = e.b;
        return (i == -1 || i == 0 || e.e[0] == 0) && z19.h1(e.a) - M0(v1Var, this.x, this.f) < this.a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
        if (this.u == null) {
            if (this.a.o) {
                a84.b("AdTagLoader", "loadAd after release " + K0(adMediaInfo) + ", ad pod " + adPodInfo);
                return;
            }
            return;
        }
        int I0 = I0(adPodInfo);
        int adPosition = adPodInfo.getAdPosition() - 1;
        b bVar = new b(I0, adPosition);
        this.l.g(adMediaInfo, bVar);
        if (this.a.o) {
            a84.b("AdTagLoader", "loadAd " + K0(adMediaInfo));
        }
        if (this.z.h(I0, adPosition)) {
            return;
        }
        v1 v1Var = this.q;
        if (v1Var != null && v1Var.i() == I0 && this.q.s() == adPosition) {
            this.g.removeCallbacks(this.o);
        }
        com.google.android.exoplayer2.source.ads.a k = this.z.k(bVar.a, Math.max(adPodInfo.getTotalAds(), this.z.e(bVar.a).e.length));
        this.z = k;
        a.C0183a e = k.e(bVar.a);
        for (int i = 0; i < adPosition; i++) {
            if (e.e[i] == 0) {
                this.z = this.z.m(I0, i);
            }
        }
        this.z = this.z.o(bVar.a, bVar.b, Uri.parse(adMediaInfo.getUrl()));
        r1();
    }

    private void c1(int i) {
        a.C0183a e = this.z.e(i);
        if (e.b == -1) {
            com.google.android.exoplayer2.source.ads.a k = this.z.k(i, Math.max(1, e.e.length));
            this.z = k;
            e = k.e(i);
        }
        for (int i2 = 0; i2 < e.b; i2++) {
            if (e.e[i2] == 0) {
                if (this.a.o) {
                    a84.b("AdTagLoader", "Removing ad " + i2 + " in ad group " + i);
                }
                this.z = this.z.m(i, i2);
            }
        }
        r1();
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
    }

    private void d1(long j, long j2) {
        AdsManager adsManager = this.u;
        if (this.v || adsManager == null) {
            return;
        }
        this.v = true;
        AdsRenderingSettings o1 = o1(j, j2);
        if (o1 == null) {
            F0();
        } else {
            adsManager.init(o1);
            adsManager.start();
            if (this.a.o) {
                a84.b("AdTagLoader", "Initialized with ads rendering settings: " + o1);
            }
        }
        r1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1(String str, Exception exc) {
        String str2 = "Internal error in " + str;
        a84.e("AdTagLoader", str2, exc);
        int i = 0;
        while (true) {
            com.google.android.exoplayer2.source.ads.a aVar = this.z;
            if (i >= aVar.b) {
                break;
            }
            this.z = aVar.s(i);
            i++;
        }
        r1();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            ((b.a) this.i.get(i2)).y(AdsMediaSource.AdLoadException.d(new RuntimeException(str2, exc)), this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1() {
        if (this.w != null) {
            for (int i = 0; i < this.i.size(); i++) {
                ((b.a) this.i.get(i)).y(this.w, this.d);
            }
            this.w = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1(AdMediaInfo adMediaInfo) {
        if (this.a.o) {
            a84.b("AdTagLoader", "pauseAd " + K0(adMediaInfo));
        }
        if (this.u == null || this.C == 0) {
            return;
        }
        if (this.a.o && !adMediaInfo.equals(this.D)) {
            a84.j("AdTagLoader", "Unexpected pauseAd for " + K0(adMediaInfo) + ", expected " + K0(this.D));
        }
        this.C = 2;
        for (int i = 0; i < this.j.size(); i++) {
            ((VideoAdPlayer.VideoAdPlayerCallback) this.j.get(i)).onPause(adMediaInfo);
        }
    }

    private void i1() {
        this.C = 0;
        if (this.N) {
            this.M = -9223372036854775807L;
            this.N = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(AdMediaInfo adMediaInfo) {
        if (this.a.o) {
            a84.b("AdTagLoader", "playAd " + K0(adMediaInfo));
        }
        if (this.u == null) {
            return;
        }
        if (this.C == 1) {
            a84.j("AdTagLoader", "Unexpected playAd without stopAd");
        }
        int i = 0;
        if (this.C == 0) {
            this.K = -9223372036854775807L;
            this.L = -9223372036854775807L;
            this.C = 1;
            this.D = adMediaInfo;
            this.E = (b) ur.e((b) this.l.get(adMediaInfo));
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                ((VideoAdPlayer.VideoAdPlayerCallback) this.j.get(i2)).onPlay(adMediaInfo);
            }
            b bVar = this.J;
            if (bVar != null && bVar.equals(this.E)) {
                this.J = null;
                while (i < this.j.size()) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) this.j.get(i)).onError(adMediaInfo);
                    i++;
                }
            }
            s1();
        } else {
            this.C = 1;
            ur.g(adMediaInfo.equals(this.D));
            while (i < this.j.size()) {
                ((VideoAdPlayer.VideoAdPlayerCallback) this.j.get(i)).onResume(adMediaInfo);
                i++;
            }
        }
        v1 v1Var = this.q;
        if (v1Var == null || !v1Var.p()) {
            ((AdsManager) ur.e(this.u)).pause();
        }
    }

    private AdsLoader l1(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
        AdsLoader a2 = this.b.a(context, imaSdkSettings, adDisplayContainer);
        a2.addAdErrorListener(this.h);
        AdErrorEvent.AdErrorListener adErrorListener = this.a.k;
        if (adErrorListener != null) {
            a2.addAdErrorListener(adErrorListener);
        }
        a2.addAdsLoadedListener(this.h);
        try {
            AdsRequest b2 = jf3.b(this.b, this.d);
            Object obj = new Object();
            this.p = obj;
            b2.setUserRequestContext(obj);
            Boolean bool = this.a.g;
            if (bool != null) {
                b2.setContinuousPlayback(bool.booleanValue());
            }
            int i = this.a.b;
            if (i != -1) {
                b2.setVastLoadTimeout(i);
            }
            b2.setContentProgressProvider(this.h);
            a2.requestAds(b2);
            return a2;
        } catch (IOException e) {
            this.z = new com.google.android.exoplayer2.source.ads.a(this.e, new long[0]);
            r1();
            this.w = AdsMediaSource.AdLoadException.c(e);
            f1();
            return a2;
        }
    }

    private void m1() {
        b bVar = this.E;
        if (bVar != null) {
            this.z = this.z.s(bVar.a);
            r1();
        }
    }

    private void n1() {
        int i = 0;
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            ((VideoAdPlayer.VideoAdPlayerCallback) this.j.get(i2)).onContentComplete();
        }
        this.F = true;
        if (this.a.o) {
            a84.b("AdTagLoader", "adsLoader.contentComplete");
        }
        while (true) {
            com.google.android.exoplayer2.source.ads.a aVar = this.z;
            if (i >= aVar.b) {
                r1();
                return;
            } else {
                if (aVar.e(i).a != Long.MIN_VALUE) {
                    this.z = this.z.s(i);
                }
                i++;
            }
        }
    }

    private AdsRenderingSettings o1(long j, long j2) {
        AdsRenderingSettings d = this.b.d();
        d.setEnablePreloading(true);
        List<String> list = this.a.h;
        if (list == null) {
            list = this.c;
        }
        d.setMimeTypes(list);
        int i = this.a.c;
        if (i != -1) {
            d.setLoadVideoTimeout(i);
        }
        int i2 = this.a.f;
        if (i2 != -1) {
            d.setBitrateKbps(i2 / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
        }
        d.setFocusSkipButtonWhenAvailable(this.a.d);
        Set<UiElement> set = this.a.i;
        if (set != null) {
            d.setUiElements(set);
        }
        int g = this.z.g(z19.D0(j), z19.D0(j2));
        if (g != -1) {
            if (this.z.e(g).a != z19.D0(j) && !this.a.e) {
                g++;
            } else if (Y0(this.z)) {
                this.M = j;
            }
            if (g > 0) {
                for (int i3 = 0; i3 < g; i3++) {
                    this.z = this.z.s(i3);
                }
                com.google.android.exoplayer2.source.ads.a aVar = this.z;
                if (g == aVar.b) {
                    return null;
                }
                long j3 = aVar.e(g).a;
                long j4 = this.z.e(g - 1).a;
                if (j3 == Long.MIN_VALUE) {
                    d.setPlayAdsAfterTime((j4 / 1000000.0d) + 1.0d);
                } else {
                    d.setPlayAdsAfterTime(((j3 + j4) / 2.0d) / 1000000.0d);
                }
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p1(AdMediaInfo adMediaInfo) {
        if (this.a.o) {
            a84.b("AdTagLoader", "stopAd " + K0(adMediaInfo));
        }
        if (this.u == null) {
            return;
        }
        if (this.C == 0) {
            b bVar = (b) this.l.get(adMediaInfo);
            if (bVar != null) {
                this.z = this.z.r(bVar.a, bVar.b);
                r1();
                return;
            }
            return;
        }
        this.C = 0;
        q1();
        ur.e(this.E);
        b bVar2 = this.E;
        int i = bVar2.a;
        int i2 = bVar2.b;
        if (this.z.h(i, i2)) {
            return;
        }
        this.z = this.z.q(i, i2).n(0L);
        r1();
        if (this.G) {
            return;
        }
        this.D = null;
        this.E = null;
    }

    private void q1() {
        this.g.removeCallbacks(this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1() {
        for (int i = 0; i < this.i.size(); i++) {
            ((b.a) this.i.get(i)).w(this.z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s1() {
        VideoProgressUpdate L0 = L0();
        if (this.a.o) {
            a84.b("AdTagLoader", "Ad progress: " + jf3.d(L0));
        }
        AdMediaInfo adMediaInfo = (AdMediaInfo) ur.e(this.D);
        for (int i = 0; i < this.j.size(); i++) {
            ((VideoAdPlayer.VideoAdPlayerCallback) this.j.get(i)).onAdProgress(adMediaInfo, L0);
        }
        this.g.removeCallbacks(this.k);
        this.g.postDelayed(this.k, 200L);
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void A(v1.e eVar, v1.e eVar2, int i) {
        X0();
    }

    public void C0(v1 v1Var) {
        b bVar;
        this.q = v1Var;
        v1Var.u(this);
        boolean p = v1Var.p();
        E(v1Var.m(), 1);
        AdsManager adsManager = this.u;
        if (com.google.android.exoplayer2.source.ads.a.g.equals(this.z) || adsManager == null || !this.B) {
            return;
        }
        int g = this.z.g(z19.D0(M0(v1Var, this.x, this.f)), z19.D0(this.y));
        if (g != -1 && (bVar = this.E) != null && bVar.a != g) {
            if (this.a.o) {
                a84.b("AdTagLoader", "Discarding preloaded ad " + this.E);
            }
            adsManager.discardAdBreak();
        }
        if (p) {
            adsManager.resume();
        }
    }

    public void D0(b.a aVar, c8 c8Var) {
        boolean isEmpty = this.i.isEmpty();
        this.i.add(aVar);
        if (!isEmpty) {
            if (com.google.android.exoplayer2.source.ads.a.g.equals(this.z)) {
                return;
            }
            aVar.w(this.z);
            return;
        }
        this.t = 0;
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.s = videoProgressUpdate;
        this.r = videoProgressUpdate;
        f1();
        if (!com.google.android.exoplayer2.source.ads.a.g.equals(this.z)) {
            aVar.w(this.z);
        } else if (this.u != null) {
            this.z = new com.google.android.exoplayer2.source.ads.a(this.e, jf3.a(this.u.getAdCuePoints()));
            r1();
        }
        Iterator it2 = c8Var.b().iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void E(g2 g2Var, int i) {
        if (g2Var.v()) {
            return;
        }
        this.x = g2Var;
        v1 v1Var = (v1) ur.e(this.q);
        long j = g2Var.k(v1Var.q(), this.f).d;
        this.y = z19.h1(j);
        com.google.android.exoplayer2.source.ads.a aVar = this.z;
        if (j != aVar.d) {
            this.z = aVar.p(j);
            r1();
        }
        d1(M0(v1Var, g2Var, this.f), this.y);
        X0();
    }

    public void E0() {
        v1 v1Var = (v1) ur.e(this.q);
        if (!com.google.android.exoplayer2.source.ads.a.g.equals(this.z) && this.B) {
            AdsManager adsManager = this.u;
            if (adsManager != null) {
                adsManager.pause();
            }
            this.z = this.z.n(this.G ? z19.D0(v1Var.z()) : 0L);
        }
        this.t = P0();
        this.s = L0();
        this.r = N0();
        v1Var.e(this);
        this.q = null;
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void F(int i) {
        v1 v1Var = this.q;
        if (this.u == null || v1Var == null) {
            return;
        }
        if (i == 2 && !v1Var.c() && a1()) {
            this.O = SystemClock.elapsedRealtime();
        } else if (i == 3) {
            this.O = -9223372036854775807L;
        }
        U0(v1Var.p(), i);
    }

    public AdDisplayContainer H0() {
        return this.m;
    }

    public void V0(int i, int i2) {
        b bVar = new b(i, i2);
        if (this.a.o) {
            a84.b("AdTagLoader", "Prepared ad " + bVar);
        }
        AdMediaInfo adMediaInfo = (AdMediaInfo) this.l.p().get(bVar);
        if (adMediaInfo != null) {
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                ((VideoAdPlayer.VideoAdPlayerCallback) this.j.get(i3)).onLoaded(adMediaInfo);
            }
            return;
        }
        a84.j("AdTagLoader", "Unexpected prepared ad " + bVar);
    }

    public void W0(int i, int i2, IOException iOException) {
        if (this.q == null) {
            return;
        }
        try {
            T0(i, i2, iOException);
        } catch (RuntimeException e) {
            e1("handlePrepareError", e);
        }
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void Y(PlaybackException playbackException) {
        if (this.C != 0) {
            AdMediaInfo adMediaInfo = (AdMediaInfo) ur.e(this.D);
            for (int i = 0; i < this.j.size(); i++) {
                ((VideoAdPlayer.VideoAdPlayerCallback) this.j.get(i)).onError(adMediaInfo);
            }
        }
    }

    public void g1(long j, long j2) {
        d1(j, j2);
    }

    public void k1(b.a aVar) {
        this.i.remove(aVar);
        if (this.i.isEmpty()) {
            this.m.unregisterAllFriendlyObstructions();
        }
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void o0(boolean z, int i) {
        v1 v1Var;
        AdsManager adsManager = this.u;
        if (adsManager == null || (v1Var = this.q) == null) {
            return;
        }
        int i2 = this.C;
        if (i2 == 1 && !z) {
            adsManager.pause();
        } else if (i2 == 2 && z) {
            adsManager.resume();
        } else {
            U0(z, v1Var.w());
        }
    }

    public void release() {
        if (this.A) {
            return;
        }
        this.A = true;
        this.p = null;
        F0();
        this.n.removeAdsLoadedListener(this.h);
        this.n.removeAdErrorListener(this.h);
        AdErrorEvent.AdErrorListener adErrorListener = this.a.k;
        if (adErrorListener != null) {
            this.n.removeAdErrorListener(adErrorListener);
        }
        this.n.release();
        int i = 0;
        this.B = false;
        this.C = 0;
        this.D = null;
        q1();
        this.E = null;
        this.w = null;
        while (true) {
            com.google.android.exoplayer2.source.ads.a aVar = this.z;
            if (i >= aVar.b) {
                r1();
                return;
            } else {
                this.z = aVar.s(i);
                i++;
            }
        }
    }
}
