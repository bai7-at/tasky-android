package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.streaming.ContentDeliveryAdvertisementCapability;
import com.comscore.streaming.ContentDeliveryComposition;
import com.comscore.streaming.ContentDistributionModel;
import com.google.android.gms.internal.ads.zzbbb;
import com.nytimes.android.comments.comments.mvi.ViewingCommentsActivityKt;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class vhb extends xhb implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map w;
    private final wib c;
    private final xib d;
    private final boolean e;
    private int f;
    private int g;
    private MediaPlayer h;
    private Uri i;
    private int j;
    private int k;
    private int l;
    private uib m;
    private final boolean n;
    private int r;
    private whb s;
    private boolean t;
    private Integer u;

    static {
        HashMap hashMap = new HashMap();
        w = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(Integer.valueOf(ViewingCommentsActivityKt.ANIMATION_TRANSITION_DURATION_MILLIS), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(Integer.valueOf(ContentDeliveryComposition.CLEAN), "MEDIA_INFO_BUFFERING_START");
        hashMap.put(Integer.valueOf(ContentDeliveryComposition.EMBED), "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(Integer.valueOf(ContentDeliveryAdvertisementCapability.NONE), "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(Integer.valueOf(ContentDeliveryAdvertisementCapability.DYNAMIC_LOAD), "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(Integer.valueOf(ContentDistributionModel.TV_AND_ONLINE), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(Integer.valueOf(ContentDistributionModel.EXCLUSIVELY_ONLINE), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public vhb(Context context, wib wibVar, boolean z, boolean z2, vib vibVar, xib xibVar) {
        super(context);
        this.f = 0;
        this.g = 0;
        this.t = false;
        this.u = null;
        setSurfaceTextureListener(this);
        this.c = wibVar;
        this.d = xibVar;
        this.n = z;
        this.e = z2;
        xibVar.a(this);
    }

    private final void D() {
        pzc.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.i == null || surfaceTexture == null) {
            return;
        }
        E(false);
        try {
            dyf.m();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.h = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.h.setOnCompletionListener(this);
            this.h.setOnErrorListener(this);
            this.h.setOnInfoListener(this);
            this.h.setOnPreparedListener(this);
            this.h.setOnVideoSizeChangedListener(this);
            this.l = 0;
            if (this.n) {
                uib uibVar = new uib(getContext());
                this.m = uibVar;
                uibVar.c(surfaceTexture, getWidth(), getHeight());
                this.m.start();
                SurfaceTexture a = this.m.a();
                if (a != null) {
                    surfaceTexture = a;
                } else {
                    this.m.d();
                    this.m = null;
                }
            }
            this.h.setDataSource(getContext(), this.i);
            dyf.n();
            this.h.setSurface(new Surface(surfaceTexture));
            this.h.setAudioStreamType(3);
            this.h.setScreenOnWhilePlaying(true);
            this.h.prepareAsync();
            F(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            fgb.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.i)), e);
            onError(this.h, 1, 0);
        }
    }

    private final void E(boolean z) {
        pzc.k("AdMediaPlayerView release");
        uib uibVar = this.m;
        if (uibVar != null) {
            uibVar.d();
            this.m = null;
        }
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.h.release();
            this.h = null;
            F(0);
            if (z) {
                this.g = 0;
            }
        }
    }

    private final void F(int i) {
        if (i == 3) {
            this.d.c();
            this.b.b();
        } else if (this.f == 3) {
            this.d.e();
            this.b.c();
        }
        this.f = i;
    }

    private final void G(float f) {
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer == null) {
            fgb.g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final boolean H() {
        int i;
        return (this.h == null || (i = this.f) == -1 || i == 0 || i == 1) ? false : true;
    }

    static /* bridge */ /* synthetic */ void K(vhb vhbVar, MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) pla.c().a(mpa.Q1)).booleanValue() || vhbVar.c == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap hashMap = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    vhbVar.u = valueOf;
                                    hashMap.put("bitRate", String.valueOf(valueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    hashMap.put("resolution", format2.getInteger("width") + QueryKeys.SCROLL_POSITION_TOP + format2.getInteger("height"));
                                }
                                if (format2.containsKey("mime")) {
                                    hashMap.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    hashMap.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                hashMap.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                hashMap.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (hashMap.isEmpty()) {
                    return;
                }
                vhbVar.c.t("onMetadataEvent", hashMap);
            }
        } catch (RuntimeException e) {
            dyf.q().w(e, "AdMediaPlayerView.reportMetadata");
        }
    }

    final /* synthetic */ void c(int i) {
        whb whbVar = this.s;
        if (whbVar != null) {
            whbVar.onWindowVisibilityChanged(i);
        }
    }

    @Override // defpackage.xhb
    public final int i() {
        if (H()) {
            return this.h.getCurrentPosition();
        }
        return 0;
    }

    @Override // defpackage.xhb
    public final int k() {
        if (H()) {
            return this.h.getMetrics().getInt("android.media.mediaplayer.dropped");
        }
        return -1;
    }

    @Override // defpackage.xhb
    public final int l() {
        if (H()) {
            return this.h.getDuration();
        }
        return -1;
    }

    @Override // defpackage.xhb
    public final int m() {
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // defpackage.xhb
    public final int n() {
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // defpackage.xhb
    public final long o() {
        return 0L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.l = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        pzc.k("AdMediaPlayerView completion");
        F(5);
        this.g = 5;
        wxf.l.post(new ohb(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = w;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        fgb.g("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        F(-1);
        this.g = -1;
        wxf.l.post(new phb(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = w;
        pzc.k("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r1 > r6) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.j
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.k
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.j
            if (r2 <= 0) goto L7a
            int r2 = r5.k
            if (r2 <= 0) goto L7a
            uib r2 = r5.m
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.j
            int r1 = r0 * r7
            int r2 = r5.k
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L7a
        L42:
            r0 = r2
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.k
            int r0 = r0 * r6
            int r2 = r5.j
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.j
            int r1 = r1 * r7
            int r2 = r5.k
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.j
            int r4 = r5.k
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L40
        L7a:
            r5.setMeasuredDimension(r0, r1)
            uib r5 = r5.m
            if (r5 == 0) goto L84
            r5.b(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhb.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        pzc.k("AdMediaPlayerView prepared");
        F(2);
        this.d.b();
        wxf.l.post(new nhb(this, mediaPlayer));
        this.j = mediaPlayer.getVideoWidth();
        this.k = mediaPlayer.getVideoHeight();
        int i = this.r;
        if (i != 0) {
            u(i);
        }
        if (this.e && H() && this.h.getCurrentPosition() > 0 && this.g != 3) {
            pzc.k("AdMediaPlayerView nudging MediaPlayer");
            G(0.0f);
            this.h.start();
            int currentPosition = this.h.getCurrentPosition();
            long currentTimeMillis = dyf.b().currentTimeMillis();
            while (H() && this.h.getCurrentPosition() == currentPosition && dyf.b().currentTimeMillis() - currentTimeMillis <= 250) {
            }
            this.h.pause();
            zzn();
        }
        fgb.f("AdMediaPlayerView stream dimensions: " + this.j + " x " + this.k);
        if (this.g == 3) {
            t();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        pzc.k("AdMediaPlayerView surface created");
        D();
        wxf.l.post(new qhb(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        pzc.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null && this.r == 0) {
            this.r = mediaPlayer.getCurrentPosition();
        }
        uib uibVar = this.m;
        if (uibVar != null) {
            uibVar.d();
        }
        wxf.l.post(new shb(this));
        E(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        pzc.k("AdMediaPlayerView surface changed");
        int i3 = this.g;
        boolean z = false;
        if (this.j == i && this.k == i2) {
            z = true;
        }
        if (this.h != null && i3 == 3 && z) {
            int i4 = this.r;
            if (i4 != 0) {
                u(i4);
            }
            t();
        }
        uib uibVar = this.m;
        if (uibVar != null) {
            uibVar.b(i, i2);
        }
        wxf.l.post(new rhb(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.d.f(this);
        this.a.a(surfaceTexture, this.s);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        pzc.k("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.j = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.k = videoHeight;
        if (this.j == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        pzc.k("AdMediaPlayerView window visibility changed to " + i);
        wxf.l.post(new Runnable() { // from class: mhb
            @Override // java.lang.Runnable
            public final void run() {
                vhb.this.c(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // defpackage.xhb
    public final long p() {
        if (this.u != null) {
            return (q() * this.l) / 100;
        }
        return -1L;
    }

    @Override // defpackage.xhb
    public final long q() {
        if (this.u != null) {
            return l() * this.u.intValue();
        }
        return -1L;
    }

    @Override // defpackage.xhb
    public final String r() {
        return "MediaPlayer".concat(true != this.n ? "" : " spherical");
    }

    @Override // defpackage.xhb
    public final void s() {
        pzc.k("AdMediaPlayerView pause");
        if (H() && this.h.isPlaying()) {
            this.h.pause();
            F(4);
            wxf.l.post(new uhb(this));
        }
        this.g = 4;
    }

    @Override // defpackage.xhb
    public final void t() {
        pzc.k("AdMediaPlayerView play");
        if (H()) {
            this.h.start();
            F(3);
            this.a.b();
            wxf.l.post(new thb(this));
        }
        this.g = 3;
    }

    @Override // android.view.View
    public final String toString() {
        return vhb.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // defpackage.xhb
    public final void u(int i) {
        pzc.k("AdMediaPlayerView seek " + i);
        if (!H()) {
            this.r = i;
        } else {
            this.h.seekTo(i);
            this.r = 0;
        }
    }

    @Override // defpackage.xhb
    public final void v(whb whbVar) {
        this.s = whbVar;
    }

    @Override // defpackage.xhb
    public final void w(String str) {
        Uri parse = Uri.parse(str);
        zzbbb t0 = zzbbb.t0(parse);
        if (t0 == null || t0.zza != null) {
            if (t0 != null) {
                parse = Uri.parse(t0.zza);
            }
            this.i = parse;
            this.r = 0;
            D();
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.xhb
    public final void x() {
        pzc.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.h.release();
            this.h = null;
            F(0);
            this.g = 0;
        }
        this.d.d();
    }

    @Override // defpackage.xhb
    public final void y(float f, float f2) {
        uib uibVar = this.m;
        if (uibVar != null) {
            uibVar.e(f, f2);
        }
    }

    @Override // defpackage.xhb, defpackage.zib
    public final void zzn() {
        G(this.b.a());
    }
}
