package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.player.MediaService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class z4 extends MediaBrowserCompat.b {
    private final Activity c;
    private final MediaBrowserCompat d;
    private final zh4 e;
    private final hb5 f;
    private final List g = new ArrayList();
    private boolean h = false;

    public z4(Activity activity, zh4 zh4Var, hb5 hb5Var) {
        this.c = activity;
        this.d = g(activity);
        this.e = zh4Var;
        this.f = hb5Var;
    }

    private void f(oz4 oz4Var) {
        this.g.add(oz4Var);
    }

    private MediaBrowserCompat g(Activity activity) {
        return new MediaBrowserCompat(activity, new ComponentName(activity, (Class<?>) MediaService.class), this, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        if (this.f.m()) {
            this.f.w();
        }
    }

    private boolean l() {
        MediaControllerCompat b = MediaControllerCompat.b(this.c);
        return (b == null || b.d() == null || b.c() == null || b.d().h() == 7) ? false : true;
    }

    @Override // android.support.v4.media.MediaBrowserCompat.b
    public void a() {
        try {
            NYTLogger.d("Connection to media browser started", new Object[0]);
            MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this.c, this.d.c());
            MediaControllerCompat.k(this.c, mediaControllerCompat);
            mediaControllerCompat.i(this.e);
            if (l()) {
                this.e.b(mediaControllerCompat.h());
                this.e.e(mediaControllerCompat.d());
                this.e.d(mediaControllerCompat.c());
            }
            Iterator it2 = this.g.iterator();
            while (it2.hasNext()) {
                ((oz4) it2.next()).call();
            }
            NYTLogger.d("Connection to media browser done", new Object[0]);
        } catch (Exception e) {
            NYTLogger.i(e, "Error connecting media controller", new Object[0]);
        }
        this.h = false;
    }

    @Override // android.support.v4.media.MediaBrowserCompat.b
    public void b() {
        NYTLogger.l("Connecting to media browser failed", new Object[0]);
        this.h = false;
    }

    @Override // android.support.v4.media.MediaBrowserCompat.b
    public void c() {
        NYTLogger.d("Connection to media browser suspended", new Object[0]);
        this.h = false;
    }

    public boolean h() {
        return this.d.d();
    }

    public void j(oz4 oz4Var) {
        if (h()) {
            oz4Var.call();
        } else {
            f(oz4Var);
        }
    }

    public void k() {
        j(new oz4() { // from class: y4
            @Override // defpackage.oz4
            public final void call() {
                z4.this.i();
            }
        });
    }

    public void m() {
        NYTLogger.d("Connection to media browser start invoked: connected" + h() + " connecting " + this.h, new Object[0]);
        if (h() || this.h) {
            return;
        }
        this.d.a();
        this.h = true;
    }

    public void n() {
        NYTLogger.d("Connection to media browser stop invoked: connected" + h() + " connecting " + this.h, new Object[0]);
        this.g.clear();
        this.d.b();
        MediaControllerCompat b = MediaControllerCompat.b(this.c);
        if (b != null) {
            b.l(this.e);
        }
    }
}
