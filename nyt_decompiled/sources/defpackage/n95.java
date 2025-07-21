package defpackage;

import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import defpackage.l95;

/* loaded from: classes.dex */
public class n95 extends l95.f {
    int[] e = null;
    MediaSessionCompat.Token f;

    @Override // l95.f
    public void b(g95 g95Var) {
        m95.d(g95Var.a(), m95.b(m95.a(), this.e, this.f));
    }

    @Override // l95.f
    public RemoteViews e(g95 g95Var) {
        return null;
    }

    @Override // l95.f
    public RemoteViews f(g95 g95Var) {
        return null;
    }

    public n95 i(MediaSessionCompat.Token token) {
        this.f = token;
        return this;
    }

    public n95 j(int... iArr) {
        this.e = iArr;
        return this;
    }
}
