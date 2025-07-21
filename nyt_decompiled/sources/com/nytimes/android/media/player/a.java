package com.nytimes.android.media.player;

import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.v1;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.player.p;
import defpackage.bq8;
import defpackage.d96;
import defpackage.if3;
import defpackage.iq8;
import defpackage.my;
import defpackage.qo4;
import defpackage.sb5;
import defpackage.uv5;

/* loaded from: classes4.dex */
public class a implements p, v1.d, AudioManager.OnAudioFocusChangeListener, VideoAdPlayer.VideoAdPlayerCallback, AdEvent.AdEventListener {
    private final m a;
    private b2 b;
    private final Context c;
    private final iq8 d;
    private final AudioManager e;
    private final WifiManager.WifiLock f;
    private final my g;
    private final VideoAdEvents h;
    private final d96 i;
    private boolean j;
    private p.a k;
    private if3 l;
    private NYTMediaItem m = null;
    private sb5 n;

    a(Application application, VideoAdEvents videoAdEvents, iq8 iq8Var, m mVar, d96 d96Var) {
        this.c = application;
        this.h = videoAdEvents;
        this.d = iq8Var;
        this.a = mVar;
        this.e = (AudioManager) application.getSystemService(AssetConstants.AUDIO_TYPE);
        this.f = ((WifiManager) application.getApplicationContext().getSystemService("wifi")).createWifiLock(1, "com.nytimes.android.media.WIFI_LOCK_TAG");
        this.g = new my(application, this);
        this.i = d96Var;
    }

    private boolean A0(NYTMediaItem nYTMediaItem, qo4 qo4Var, ViewGroup viewGroup) {
        return (viewGroup == null || !qo4Var.c() || nYTMediaItem.Q()) ? false : true;
    }

    private void q0(uv5 uv5Var) {
        b2 b2Var = this.b;
        if (b2Var == null) {
            return;
        }
        b2Var.H();
        View surface = uv5Var.getSurface();
        if (surface instanceof SurfaceView) {
            this.b.R((SurfaceView) surface);
        } else if (surface instanceof TextureView) {
            this.b.S((TextureView) surface);
        }
    }

    private float r0() {
        b2 b2Var = this.b;
        if (b2Var == null) {
            return 0.0f;
        }
        return b2Var.getVolume();
    }

    private void s0() {
        b2 a = new b2.a(this.c).b(this.d.a(this.c)).a();
        this.b = a;
        a.u(this);
        this.a.j(this.b);
    }

    private boolean t0(AdEvent adEvent) {
        return adEvent.getType() == AdEvent.AdEventType.LOG && adEvent.getAdData().containsKey("errorCode") && adEvent.getAdData().get("errorCode").equals("1009");
    }

    private void v0() {
        if3 if3Var = this.l;
        if (if3Var != null) {
            AdDisplayContainer h = if3Var.h();
            if (h != null) {
                h.getPlayer().removeCallback(this);
            }
            try {
                this.l.l();
                this.l = null;
            } catch (Exception e) {
                NYTLogger.i(e, "Error release video ads loader.", new Object[0]);
            }
        }
    }

    private void w0() {
        AudioManager audioManager = this.e;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this);
        }
    }

    private void x0() {
        AudioManager audioManager = this.e;
        if (audioManager != null) {
            audioManager.requestAudioFocus(this, 3, 1);
        }
    }

    private void y0() {
        stop();
        NYTMediaItem nYTMediaItem = this.m;
        if (nYTMediaItem != null) {
            a0(nYTMediaItem, this.n, qo4.a(), false);
        }
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void B(int i) {
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void C(boolean z) {
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void E(g2 g2Var, int i) {
    }

    @Override // com.nytimes.android.media.player.p
    public void L() {
        u0(true);
    }

    @Override // com.nytimes.android.media.player.p
    public void M(p.a aVar) {
        this.k = aVar;
    }

    @Override // com.nytimes.android.media.player.p
    public long O() {
        b2 b2Var = this.b;
        if (b2Var == null || b2Var.getDuration() == -9223372036854775807L) {
            return 0L;
        }
        return this.b.getDuration();
    }

    @Override // com.nytimes.android.media.player.p
    public void P(boolean z) {
        if (!z) {
            x0();
        }
        b2 b2Var = this.b;
        if (b2Var != null) {
            b2Var.T(z ? 0.0f : 1.0f);
        }
    }

    @Override // com.nytimes.android.media.player.p
    public void T(NYTMediaItem nYTMediaItem, qo4 qo4Var, ViewGroup viewGroup) {
        if (this.b == null) {
            s0();
        }
        this.j = true;
        this.m = nYTMediaItem;
        if (qo4Var.b()) {
            u0(qo4Var.d());
        } else {
            pause();
        }
        v0();
        if (A0(nYTMediaItem, qo4Var, viewGroup) && this.a.b(nYTMediaItem) != null) {
            this.l = new if3.b(this.c).b(this).d(this).c(true).a();
        }
        this.b.O(this.a.h(nYTMediaItem, this.l, viewGroup, this.i));
        this.b.M();
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void U(int i) {
    }

    @Override // com.nytimes.android.media.player.p
    public int V() {
        b2 b2Var = this.b;
        if (b2Var == null) {
            return 1;
        }
        int w = b2Var.w();
        if (w != 2) {
            return w != 3 ? w != 4 ? 0 : 2 : this.b.p() ? 3 : 2;
        }
        return 6;
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void W(h2 h2Var) {
        b2 b2Var = this.b;
        if (b2Var == null) {
            return;
        }
        bq8 J = b2Var.J();
        boolean z = false;
        for (int i = 0; i < J.a; i++) {
            if (this.b.L(i) == 3 && J.a(i) != null) {
                z = true;
            }
        }
        p.a aVar = this.k;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void Y(PlaybackException playbackException) {
        String message;
        NYTLogger.i(playbackException, "ExoPlayer error.", new Object[0]);
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            int i = exoPlaybackException.f45type;
            if (i == 0) {
                message = exoPlaybackException.m().getMessage();
            } else if (i == 1) {
                message = exoPlaybackException.l().getMessage();
            } else if (i != 2) {
                message = "Unknown Error: " + playbackException;
            } else {
                message = exoPlaybackException.n().getMessage();
            }
            p.a aVar = this.k;
            if (aVar != null) {
                aVar.c(message);
            }
        }
    }

    @Override // com.nytimes.android.media.player.p
    public void a0(NYTMediaItem nYTMediaItem, sb5 sb5Var, qo4 qo4Var, boolean z) {
        if (this.b == null) {
            s0();
        }
        this.n = sb5Var;
        if (nYTMediaItem.Q()) {
            z0(0.0f);
        } else {
            z0(1.0f);
        }
        if (nYTMediaItem.y()) {
            this.b.Q(2);
        } else {
            this.b.Q(0);
        }
        n0(sb5Var);
        T(nYTMediaItem, qo4Var, (sb5Var == null || !z) ? null : sb5Var.getAdOverlay());
    }

    @Override // com.nytimes.android.media.player.p
    public PlaybackVolume b0() {
        b2 b2Var = this.b;
        return (b2Var == null || b2Var.getVolume() != 1.0f) ? PlaybackVolume.OFF : PlaybackVolume.ON;
    }

    @Override // com.nytimes.android.media.player.p
    public boolean c() {
        b2 b2Var = this.b;
        return b2Var != null && b2Var.c();
    }

    @Override // com.nytimes.android.media.player.p
    public long c0() {
        b2 b2Var = this.b;
        if (b2Var == null || b2Var.getDuration() == -9223372036854775807L) {
            return 0L;
        }
        return this.b.I();
    }

    @Override // com.nytimes.android.media.player.p
    public void d0() {
        b2 b2Var = this.b;
        if (b2Var != null) {
            long z = b2Var.z() + 10000;
            b2 b2Var2 = this.b;
            b2Var2.E(Math.min(z, b2Var2.getDuration()));
        }
    }

    @Override // com.nytimes.android.media.player.p
    public void e0(long j) {
        b2 b2Var = this.b;
        if (b2Var != null) {
            b2Var.E(j);
        }
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void i0(int i) {
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void j0(boolean z, int i) {
        p.a aVar = this.k;
        if (aVar == null) {
            return;
        }
        if (i == 1 || i == 2 || i == 3) {
            aVar.b();
        } else {
            if (i != 4) {
                return;
            }
            aVar.onCompleted();
        }
    }

    @Override // com.nytimes.android.media.player.p
    public boolean l0() {
        b2 b2Var = this.b;
        return b2Var != null && b2Var.p();
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void m(u1 u1Var) {
    }

    @Override // com.nytimes.android.media.player.p
    public long m0() {
        b2 b2Var = this.b;
        if (b2Var == null) {
            return 0L;
        }
        return b2Var.z();
    }

    @Override // com.nytimes.android.media.player.p
    public void n0(sb5 sb5Var) {
        sb5 sb5Var2 = this.n;
        if (sb5Var2 == null || sb5Var2.J() == null || this.b == null) {
            return;
        }
        q0(this.n.J());
        this.b.u(this.n);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
    public void onAdEvent(AdEvent adEvent) {
        if (t0(adEvent)) {
            y0();
        }
        if (adEvent.getType() == AdEvent.AdEventType.TAPPED) {
            this.h.a();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public void onAdProgress(AdMediaInfo adMediaInfo, VideoProgressUpdate videoProgressUpdate) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r6 != 4) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAudioFocusChange(int r6) {
        /*
            r5 = this;
            r0 = -3
            r1 = -1
            r2 = -2
            r3 = 1
            if (r6 == r0) goto L25
            if (r6 == r2) goto L16
            if (r6 == r1) goto L16
            if (r6 == r3) goto L16
            r0 = 2
            if (r6 == r0) goto L16
            r0 = 3
            if (r6 == r0) goto L25
            r0 = 4
            if (r6 == r0) goto L16
            goto L2b
        L16:
            float r0 = r5.r0()
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.z0(r0)
            goto L2b
        L25:
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            r5.z0(r0)
        L2b:
            r0 = 0
            if (r6 == r2) goto L43
            if (r6 == r1) goto L3d
            if (r6 == r3) goto L33
            goto L54
        L33:
            boolean r6 = r5.j
            if (r6 == 0) goto L54
            r5.L()
            r5.j = r0
            goto L54
        L3d:
            r5.j = r0
            r5.pause()
            goto L54
        L43:
            com.google.android.exoplayer2.b2 r6 = r5.b
            if (r6 == 0) goto L4e
            boolean r6 = r6.p()
            if (r6 == 0) goto L4e
            goto L4f
        L4e:
            r3 = r0
        L4f:
            r5.j = r3
            r5.pause()
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.media.player.a.onAudioFocusChange(int):void");
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public void onBuffering(AdMediaInfo adMediaInfo) {
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public void onContentComplete() {
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public void onEnded(AdMediaInfo adMediaInfo) {
        p.a aVar = this.k;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public void onError(AdMediaInfo adMediaInfo) {
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public void onLoaded(AdMediaInfo adMediaInfo) {
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public void onPause(AdMediaInfo adMediaInfo) {
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public void onPlay(AdMediaInfo adMediaInfo) {
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public void onResume(AdMediaInfo adMediaInfo) {
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public void onVolumeChanged(AdMediaInfo adMediaInfo, int i) {
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void p0(boolean z) {
    }

    @Override // com.nytimes.android.media.player.p
    public void pause() {
        this.g.b();
        b2 b2Var = this.b;
        if (b2Var != null) {
            b2Var.P(false);
        }
        if (this.f.isHeld()) {
            this.f.release();
        }
    }

    @Override // com.nytimes.android.media.player.p
    public void q() {
        b2 b2Var = this.b;
        if (b2Var != null) {
            this.b.E(Math.max(b2Var.z() - 10000, 0L));
        }
    }

    @Override // com.nytimes.android.media.player.p
    public void stop() {
        w0();
        this.g.b();
        this.j = false;
        b2 b2Var = this.b;
        if (b2Var != null) {
            b2Var.H();
            this.b.N();
            this.b.e(this);
            sb5 sb5Var = this.n;
            if (sb5Var != null) {
                this.b.e(sb5Var);
            }
            this.b = null;
            this.a.j(null);
        }
        if (this.f.isHeld()) {
            this.f.release();
        }
        v0();
    }

    public void u0(boolean z) {
        if (z) {
            x0();
        }
        this.g.a();
        b2 b2Var = this.b;
        if (b2Var != null) {
            b2Var.P(true);
        }
        if (this.f.isHeld()) {
            return;
        }
        this.f.acquire();
    }

    public void z0(float f) {
        b2 b2Var = this.b;
        if (b2Var != null) {
            b2Var.T(f);
        }
    }
}
