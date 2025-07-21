package com.nytimes.android.media.notification;

import android.app.Notification;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.notification.a;
import com.nytimes.android.media.player.o;
import defpackage.nz4;
import defpackage.r95;

/* loaded from: classes4.dex */
public class a extends MediaControllerCompat.a {
    final r95 d;
    private final NytMediaNotificationManager e;

    public a(NytMediaNotificationManager nytMediaNotificationManager, r95 r95Var) {
        this.e = nytMediaNotificationManager;
        this.d = r95Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Notification notification) {
        if (notification != null) {
            this.d.f(7, notification);
        }
    }

    private void q() {
        this.e.b(new nz4() { // from class: wh4
            @Override // defpackage.nz4
            public final void call(Object obj) {
                a.this.p((Notification) obj);
            }
        });
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.a
    public void d(MediaMetadataCompat mediaMetadataCompat) {
        super.d(mediaMetadataCompat);
        if (mediaMetadataCompat == null) {
            this.e.j();
            return;
        }
        try {
            if (o.a(mediaMetadataCompat).i() != null) {
                q();
            }
        } catch (IllegalStateException e) {
            NYTLogger.i(e, "Error converting media metadata", new Object[0]);
        }
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.a
    public void e(PlaybackStateCompat playbackStateCompat) {
        super.e(playbackStateCompat);
        if (playbackStateCompat.h() == 0 || playbackStateCompat.h() == 7) {
            this.e.j();
        } else {
            q();
        }
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.a
    public void i() {
        super.i();
        try {
            this.e.k();
        } catch (RemoteException e) {
            NYTLogger.i(e, "Error updating session token", new Object[0]);
        }
    }
}
