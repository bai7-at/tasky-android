package com.nytimes.android.media.notification;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.audio.AudioManager;
import com.nytimes.android.media.notification.NytMediaNotificationManager;
import com.nytimes.android.media.player.PlaybackCustomAction;
import defpackage.ax;
import defpackage.jh4;
import defpackage.nh4;
import defpackage.nz4;
import defpackage.r95;
import defpackage.vr6;

/* loaded from: classes4.dex */
public class NytMediaNotificationManager extends BroadcastReceiver {
    final nh4 a;
    final ax b;
    final r95 c;
    MediaControllerCompat d;
    private final AudioManager e;
    private final b f;
    private final com.nytimes.android.media.notification.a g;
    private MediaSessionCompat.Token h;
    private boolean i = false;

    public enum NotificationAction {
        PAUSE("com.nytimes.android.media.ACTION_PAUSE"),
        PLAY("com.nytimes.android.media.ACTION_PLAY"),
        REWIND("com.nytimes.android.media.ACTION_REWIND"),
        FASTFORWARD("com.nytimes.android.media.ACTION_FORWARD"),
        EXIT("com.nytimes.android.media.EXIT");

        final String value;

        NotificationAction(String str) {
            this.value = str;
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[NotificationAction.values().length];
            a = iArr;
            try {
                iArr[NotificationAction.PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[NotificationAction.PLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[NotificationAction.FASTFORWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[NotificationAction.REWIND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[NotificationAction.EXIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public NytMediaNotificationManager(nh4 nh4Var, ax axVar, AudioManager audioManager, jh4 jh4Var) {
        this.a = nh4Var;
        this.b = axVar;
        this.e = audioManager;
        this.f = new b(nh4Var, jh4Var);
        r95 d = r95.d(nh4Var);
        this.c = d;
        this.g = new com.nytimes.android.media.notification.a(this, d);
        k();
        d.b(7);
    }

    private IntentFilter d() {
        IntentFilter intentFilter = new IntentFilter();
        for (NotificationAction notificationAction : NotificationAction.values()) {
            intentFilter.addAction(notificationAction.name());
        }
        return intentFilter;
    }

    private void e() {
        MediaSessionCompat.Token token = this.h;
        if (token != null) {
            MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this.a, token);
            this.d = mediaControllerCompat;
            mediaControllerCompat.i(this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Notification notification) {
        if (notification != null) {
            this.c.f(7, notification);
            this.d.i(this.g);
            vr6.a(this.a, this, d());
            this.i = true;
            this.a.startForeground(7, notification);
        }
    }

    private boolean h(MediaSessionCompat.Token token) {
        MediaSessionCompat.Token token2 = this.h;
        return (token2 == null && token != null) || !(token2 == null || token2.equals(token));
    }

    void b(nz4 nz4Var) {
        c(this.d.c(), nz4Var);
    }

    void c(MediaMetadataCompat mediaMetadataCompat, nz4 nz4Var) {
        this.f.d(mediaMetadataCompat, this.d.d(), this.h, nz4Var);
    }

    public void g() {
        this.f.f();
    }

    public void i(MediaMetadataCompat mediaMetadataCompat) {
        c(mediaMetadataCompat, new nz4() { // from class: ib5
            @Override // defpackage.nz4
            public final void call(Object obj) {
                NytMediaNotificationManager.this.f((Notification) obj);
            }
        });
    }

    public void j() {
        MediaControllerCompat mediaControllerCompat = this.d;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.l(this.g);
            try {
                this.c.b(7);
                if (this.i) {
                    this.a.unregisterReceiver(this);
                }
            } catch (IllegalArgumentException e) {
                NYTLogger.i(e, "Error stopping notification", new Object[0]);
            }
            this.a.stopForeground(true);
        }
    }

    final void k() {
        MediaSessionCompat.Token i = this.a.i();
        if (h(i)) {
            MediaControllerCompat mediaControllerCompat = this.d;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.l(this.g);
            }
            this.h = i;
            e();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.d == null) {
            return;
        }
        int i = a.a[NotificationAction.valueOf(intent.getAction()).ordinal()];
        if (i == 1) {
            this.d.g().b();
            return;
        }
        if (i == 2) {
            this.d.g().c();
            return;
        }
        if (i == 3) {
            this.d.g().a();
            return;
        }
        if (i == 4) {
            this.d.g().d();
        } else {
            if (i != 5) {
                return;
            }
            this.d.g().f(PlaybackCustomAction.DISMISS_AUDIO.name(), null);
            this.e.l();
        }
    }
}
