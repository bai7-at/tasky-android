package defpackage;

import android.content.Context;
import android.media.AudioFormat;

/* loaded from: classes3.dex */
public final class ltf {
    private Boolean a;

    public ltf(Context context) {
    }

    public final wpf a(l6a l6aVar, waf wafVar) {
        l6aVar.getClass();
        wafVar.getClass();
        int i = khe.a;
        if (i < 29 || l6aVar.z == -1) {
            return wpf.d;
        }
        if (this.a == null) {
            this.a = Boolean.FALSE;
        }
        String str = l6aVar.l;
        str.getClass();
        int a = qcb.a(str, l6aVar.i);
        if (a == 0 || i < khe.u(a)) {
            return wpf.d;
        }
        int v = khe.v(l6aVar.y);
        if (v == 0) {
            return wpf.d;
        }
        try {
            AudioFormat K = khe.K(l6aVar.z, v, a);
            return i >= 31 ? jtf.a(K, wafVar.a().a, false) : htf.a(K, wafVar.a().a, false);
        } catch (IllegalArgumentException unused) {
            return wpf.d;
        }
    }
}
