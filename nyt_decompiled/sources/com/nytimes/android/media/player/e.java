package com.nytimes.android.media.player;

import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.media.analytics.AudioSessionEventTracker;
import com.nytimes.android.media.common.AudioType;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.player.e;
import defpackage.b99;
import defpackage.el4;

/* loaded from: classes4.dex */
public class e {
    private final q a;
    private final b99 b;
    private final AudioSessionEventTracker c;
    private final Handler d = new Handler();
    private final Runnable e = new Runnable() { // from class: dl4
        @Override // java.lang.Runnable
        public final void run() {
            e.this.b();
        }
    };
    private final String f;

    e(q qVar, b99 b99Var, AudioSessionEventTracker audioSessionEventTracker, String str) {
        this.a = qVar;
        this.b = b99Var;
        this.c = audioSessionEventTracker;
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        NYTMediaItem g = this.a.g();
        if (g != null) {
            PlaybackStateCompat j = this.a.j();
            long a = el4.a(j);
            long q = g.q();
            boolean i = i(g, j, a);
            if (i && g.i() == null) {
                this.b.b(g, null, a, q);
            }
            if (i && c(g)) {
                this.c.d(g, this.a.m(), a, q, this.f);
            }
        }
        f();
    }

    private static boolean c(NYTMediaItem nYTMediaItem) {
        return nYTMediaItem.i() == AudioType.AUDIO || nYTMediaItem.i() == AudioType.PODCAST;
    }

    private boolean d(NYTMediaItem nYTMediaItem, PlaybackStateCompat playbackStateCompat) {
        return (playbackStateCompat.h() == 3 || playbackStateCompat.h() == 6) && !nYTMediaItem.O();
    }

    private boolean e(NYTMediaItem nYTMediaItem, long j) {
        return (j == -111 || nYTMediaItem.q() == 0) ? false : true;
    }

    private void f() {
        g();
        this.d.postDelayed(this.e, 1000L);
    }

    private void g() {
        this.d.removeCallbacks(this.e);
    }

    private boolean i(NYTMediaItem nYTMediaItem, PlaybackStateCompat playbackStateCompat, long j) {
        return nYTMediaItem != null && playbackStateCompat != null && d(nYTMediaItem, playbackStateCompat) && e(nYTMediaItem, j);
    }

    void h() {
        this.b.a();
        this.c.g();
    }

    public void j() {
        f();
    }

    public void k() {
        g();
    }
}
