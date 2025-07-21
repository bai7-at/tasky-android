package com.nytimes.android.media.player;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.NytMediaButtonReceiver;
import com.nytimes.android.media.analytics.AudioPlaybackEventTracker;
import com.nytimes.android.media.analytics.AudioSessionEventTracker;
import com.nytimes.android.media.audio.AudioManager;
import com.nytimes.android.media.audio.podcast.PodcastSource;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.notification.NytMediaNotificationManager;
import com.nytimes.android.media.player.MediaService;
import com.nytimes.android.media.player.q;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.ax;
import defpackage.b99;
import defpackage.bp0;
import defpackage.ci4;
import defpackage.jh4;
import defpackage.nh4;
import defpackage.ni4;
import defpackage.oh4;
import defpackage.ov5;
import defpackage.qo4;
import defpackage.qq3;
import defpackage.ro4;
import defpackage.sb5;
import defpackage.vw5;
import defpackage.w89;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

/* loaded from: classes4.dex */
public class MediaService extends c implements q.b {
    AudioManager audioManager;
    AudioPlaybackEventTracker audioPlaybackEventTracker;
    AudioSessionEventTracker audioSessionEventTracker;
    bp0 comScoreWrapper;
    ax eventReporter;
    ci4 historyWatcher;
    qq3 internalPreferences;
    MediaSessionCompat l;
    q m;
    jh4 mediaActivityLauncher;
    l n;
    NetworkStatus networkStatus;
    ov5 playbackPositionManager;
    a player;
    vw5 podcastSearchResolver;
    PodcastSource podcastSource;
    NytMediaNotificationManager r;
    private final CompositeDisposable s = new CompositeDisposable();
    private d t;
    private e u;
    w89 videoEventReporter;
    b99 videoViewershipAnalyticsTracker;

    private static String G(Context context) {
        return DeviceUtils.G(context) ? "tablet" : "mobile";
    }

    private void H() {
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this, "com.nytimes.android.media.NYTMediaPlaybackService", new ComponentName(getApplicationContext(), (Class<?>) NytMediaButtonReceiver.class), null);
        this.l = mediaSessionCompat;
        x(mediaSessionCompat.d());
        this.l.l(3);
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I(nh4.l lVar, Throwable th) {
        lVar.g(null);
        NYTLogger.i(th, "Error getting podcast items", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J(nh4.l lVar, List list) {
        lVar.g(ni4.a(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(nh4.l lVar, Throwable th) {
        NYTLogger.i(th, "Error getting episode for podcast", new Object[0]);
        lVar.g(null);
    }

    private void N() {
        Context applicationContext = getApplicationContext();
        this.l.o(PendingIntent.getActivity(applicationContext, 101, new Intent(applicationContext, (Class<?>) this.mediaActivityLauncher.a()), 201326592));
    }

    public void E(sb5 sb5Var) {
        this.m.d(sb5Var);
    }

    public long F() {
        return this.m.h();
    }

    public ro4 L() {
        return this.m.l();
    }

    public void M(NYTMediaItem nYTMediaItem, qo4 qo4Var, sb5 sb5Var) {
        this.u.h();
        this.m.x(nYTMediaItem, qo4Var, sb5Var);
    }

    @Override // com.nytimes.android.media.player.q.b
    public void a(boolean z) {
        this.l.k(z);
    }

    @Override // com.nytimes.android.media.player.q.b
    public void b(MediaMetadataCompat mediaMetadataCompat) {
        this.l.m(mediaMetadataCompat);
    }

    @Override // com.nytimes.android.media.player.q.b
    public void c(PlaybackStateCompat playbackStateCompat) {
        this.l.n(playbackStateCompat);
    }

    @Override // com.nytimes.android.media.player.q.b
    public void d(MediaMetadataCompat mediaMetadataCompat) {
        this.r.i(mediaMetadataCompat);
    }

    @Override // com.nytimes.android.media.player.q.b
    public void e(MediaMetadataCompat mediaMetadataCompat) {
        this.comScoreWrapper.d();
        this.l.h(true);
        this.u.j();
        if (this.m.v()) {
            return;
        }
        startForegroundService(new Intent(getApplicationContext(), (Class<?>) MediaService.class));
        d(mediaMetadataCompat);
    }

    @Override // com.nytimes.android.media.player.q.b
    public void f() {
        this.comScoreWrapper.f();
        this.l.h(false);
        this.u.k();
        stopForeground(false);
    }

    @Override // defpackage.nh4
    public nh4.e l(String str, int i, Bundle bundle) {
        return new nh4.e("MEDIA_ROOT", null);
    }

    @Override // defpackage.nh4
    public void m(String str, final nh4.l lVar) {
        if ("MEDIA_ROOT".equals(str)) {
            lVar.a();
            this.s.add(this.podcastSource.b().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: xn4
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    nh4.l.this.g((List) obj);
                }
            }, new Consumer() { // from class: yn4
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MediaService.I(nh4.l.this, (Throwable) obj);
                }
            }));
        } else {
            if (!this.podcastSource.e(str)) {
                lVar.g(null);
                return;
            }
            lVar.a();
            this.s.add(this.podcastSource.d(str).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: zn4
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MediaService.J(nh4.l.this, (List) obj);
                }
            }, new Consumer() { // from class: ao4
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MediaService.K(nh4.l.this, (Throwable) obj);
                }
            }));
        }
    }

    @Override // defpackage.nh4, android.app.Service
    public IBinder onBind(Intent intent) {
        return "com.nytimes.android.media.PLAY_VIDEO".equals(intent.getAction()) ? this.t : super.onBind(intent);
    }

    @Override // com.nytimes.android.media.player.c, defpackage.nh4, android.app.Service
    public void onCreate() {
        super.onCreate();
        String G = G(this);
        this.t = new d(this);
        q qVar = new q(this, this.player, this.videoEventReporter, this.historyWatcher, this.playbackPositionManager, this.audioPlaybackEventTracker, G);
        this.m = qVar;
        this.u = new e(qVar, this.videoViewershipAnalyticsTracker, this.audioSessionEventTracker, G);
        H();
        try {
            this.r = new NytMediaNotificationManager(this, this.eventReporter, this.audioManager, this.mediaActivityLauncher);
        } catch (RemoteException e) {
            NYTLogger.i(e, "Error creating media notification", new Object[0]);
        }
        l lVar = new l(this.m, this.podcastSource, this.podcastSearchResolver, this.eventReporter, this.r);
        this.n = lVar;
        this.l.i(lVar);
        this.m.C(null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.l.g();
        this.u.k();
        this.m.t(null);
        this.r.j();
        this.r.g();
        this.n.J();
        this.s.dispose();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 1;
        }
        if ("com.nytimes.android.media.ACTION_COMMAND".equals(intent.getAction())) {
            if (!"com.nytimes.android.media.COMMAND_PAUSE".equals(intent.getStringExtra("com.nytimes.android.media.COMMAND_TYPE"))) {
                return 1;
            }
            this.m.p();
            return 1;
        }
        if (!this.internalPreferences.a()) {
            return 1;
        }
        oh4.c(this.l, intent);
        return 1;
    }
}
