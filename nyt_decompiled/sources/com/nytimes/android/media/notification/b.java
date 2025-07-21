package com.nytimes.android.media.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.image.loader.internals.ImageSource;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.notification.NytMediaNotificationManager;
import com.nytimes.android.media.player.o;
import defpackage.ie6;
import defpackage.jh4;
import defpackage.l95;
import defpackage.mx0;
import defpackage.n95;
import defpackage.nl6;
import defpackage.nz4;
import defpackage.og3;
import defpackage.qd6;
import defpackage.te6;
import defpackage.uy6;

/* loaded from: classes4.dex */
public class b {
    private final Context a;
    private final jh4 b;
    private final PendingIntent c = b(NytMediaNotificationManager.NotificationAction.PAUSE.name());
    private final PendingIntent d = b(NytMediaNotificationManager.NotificationAction.PLAY.name());
    private final PendingIntent e = b(NytMediaNotificationManager.NotificationAction.REWIND.name());
    private final PendingIntent f = b(NytMediaNotificationManager.NotificationAction.FASTFORWARD.name());
    private final PendingIntent g = b(NytMediaNotificationManager.NotificationAction.EXIT.name());
    private uy6 h;

    class a implements uy6 {
        final /* synthetic */ l95.e a;
        final /* synthetic */ nz4 b;

        a(l95.e eVar, nz4 nz4Var) {
            this.a = eVar;
            this.b = nz4Var;
        }

        @Override // defpackage.uy6
        public void a(Drawable drawable) {
            this.a.r(((BitmapDrawable) drawable).getBitmap());
            this.b.call(this.a.c());
        }

        @Override // defpackage.uy6
        public void b(Bitmap bitmap, ImageSource imageSource) {
            this.a.r(bitmap);
            this.b.call(this.a.c());
        }

        @Override // defpackage.uy6
        public void c(Exception exc, Drawable drawable) {
            this.a.r(((BitmapDrawable) drawable).getBitmap());
            this.b.call(this.a.c());
            NYTLogger.h(exc);
        }
    }

    public b(Context context, jh4 jh4Var) {
        this.a = context;
        this.b = jh4Var;
    }

    private void a(l95.e eVar, int i) {
        String string;
        int i2;
        PendingIntent pendingIntent;
        if (i == 3) {
            string = this.a.getString(nl6.pause_label);
            i2 = te6.ic_notification_pause_24;
            pendingIntent = this.c;
        } else {
            string = this.a.getString(nl6.play_label);
            i2 = te6.ic_notification_play_24;
            pendingIntent = this.d;
        }
        eVar.b(new l95.a(i2, string, pendingIntent));
    }

    private PendingIntent b(String str) {
        Intent intent = new Intent(str);
        intent.setPackage(this.a.getPackageName());
        return PendingIntent.getBroadcast(this.a, 100, intent, 335544320);
    }

    private PendingIntent c() {
        Intent intent = new Intent(this.a, (Class<?>) this.b.a());
        intent.setFlags(536870912);
        return PendingIntent.getActivity(this.a, 100, intent, 335544320);
    }

    private void e(CharSequence charSequence, Uri uri, MediaSessionCompat.Token token, int i, nz4 nz4Var) {
        l95.e eVar = new l95.e(this.a, "media-control");
        eVar.a(te6.ic_notification_rewind_24, this.a.getString(nl6.rewind_label), this.e);
        a(eVar, i);
        eVar.a(te6.ic_notification_fastforward_24, this.a.getString(nl6.forward_label), this.f);
        eVar.A(new n95().j(0, 1, 2).i(token)).i(mx0.c(this.a, qd6.ds_notification_black)).j(true).y(ie6.t_logo_white_notification).D(1).k(c()).o(this.g).m(charSequence).x(false).v(i == 3).q("Media").g(0);
        this.h = new a(eVar, nz4Var);
        if (uri != null) {
            og3.c().b(uri).l(te6.t_logo_media_notification_large_placeholder).k(te6.t_logo_media_notification_large_placeholder).d(this.h);
        } else {
            eVar.r(((BitmapDrawable) mx0.e(this.a, te6.t_logo_media_notification_large_placeholder)).getBitmap());
            nz4Var.call(eVar.c());
        }
    }

    void d(MediaMetadataCompat mediaMetadataCompat, PlaybackStateCompat playbackStateCompat, MediaSessionCompat.Token token, nz4 nz4Var) {
        NYTMediaItem a2;
        NYTLogger.l("Updating notification metadata: " + mediaMetadataCompat, new Object[0]);
        if (mediaMetadataCompat != null) {
            try {
                a2 = o.a(mediaMetadataCompat);
            } catch (IllegalStateException e) {
                NYTLogger.i(e, "error converting metadata", new Object[0]);
            }
            if (a2 != null || playbackStateCompat == null || a2.i() == null) {
                nz4Var.call(null);
            }
            MediaDescriptionCompat d = mediaMetadataCompat.d();
            if (d == null) {
                nz4Var.call(null);
                return;
            } else {
                e(d.g(), d.c(), token, playbackStateCompat.h(), nz4Var);
                return;
            }
        }
        a2 = null;
        if (a2 != null) {
        }
        nz4Var.call(null);
    }

    void f() {
        this.h = null;
    }
}
