package com.nytimes.android.media.player;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.audio.podcast.PodcastSource;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.notification.NytMediaNotificationManager;
import defpackage.ax;
import defpackage.qo4;
import defpackage.vw5;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes4.dex */
class l extends MediaSessionCompat.b {
    private final q f;
    private final PodcastSource g;
    private final vw5 h;
    private final NytMediaNotificationManager i;
    private final CompositeDisposable j = new CompositeDisposable();
    private final ax k;

    public l(q qVar, PodcastSource podcastSource, vw5 vw5Var, ax axVar, NytMediaNotificationManager nytMediaNotificationManager) {
        this.f = qVar;
        this.g = podcastSource;
        this.h = vw5Var;
        this.i = nytMediaNotificationManager;
        this.k = axVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(Throwable th) {
        NYTLogger.i(th, "Error playing media from id.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(Throwable th) {
        NYTLogger.g("Error searching for episode", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M(Throwable th) {
        NYTLogger.i(th, "Error getting next episode", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N(Throwable th) {
        NYTLogger.i(th, "Error playing previous episode", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(NYTMediaItem nYTMediaItem) {
        this.k.a(nYTMediaItem, null);
        this.f.x(nYTMediaItem, qo4.a(), null);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void A() {
        NYTMediaItem k = this.f.k();
        if (k == null) {
            return;
        }
        this.j.add(this.g.f(k.a()).subscribe(new g(this), new Consumer() { // from class: com.nytimes.android.media.player.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                l.N((Throwable) obj);
            }
        }));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void C() {
        this.f.t(null);
    }

    void J() {
        this.j.dispose();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void e(String str, Bundle bundle) {
        PlaybackCustomAction fromName = PlaybackCustomAction.fromName(str);
        if (fromName == null) {
            return;
        }
        NYTMediaItem g = this.f.g();
        if (fromName == PlaybackCustomAction.DISMISS_AUDIO && g != null && g.i() != null) {
            NytMediaNotificationManager nytMediaNotificationManager = this.i;
            if (nytMediaNotificationManager != null) {
                nytMediaNotificationManager.j();
            }
            C();
        }
        this.f.n(fromName);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void f() {
        this.f.o();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void h() {
        this.f.p();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void i() {
        this.f.q();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void j(String str, Bundle bundle) {
        this.j.add(this.g.c(str).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new g(this), new Consumer() { // from class: com.nytimes.android.media.player.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                l.K((Throwable) obj);
            }
        }));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void k(String str, Bundle bundle) {
        this.j.add(this.h.a(str).subscribe(new g(this), new Consumer() { // from class: com.nytimes.android.media.player.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                l.L((Throwable) obj);
            }
        }));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void r() {
        this.f.r();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void s(long j) {
        this.f.s(j);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void z() {
        NYTMediaItem k = this.f.k();
        if (k == null) {
            return;
        }
        this.j.add(this.g.a(k.a()).subscribe(new g(this), new Consumer() { // from class: com.nytimes.android.media.player.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                l.M((Throwable) obj);
            }
        }));
    }
}
