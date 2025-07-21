package defpackage;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ywb {
    private final String a;
    private final s2b b;
    private final Executor c;
    private gxb d;
    private final uxa e = new vwb(this);
    private final uxa f = new xwb(this);

    public ywb(String str, s2b s2bVar, Executor executor) {
        this.a = str;
        this.b = s2bVar;
        this.c = executor;
    }

    static /* bridge */ /* synthetic */ boolean g(ywb ywbVar, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(ywbVar.a);
    }

    public final void c(gxb gxbVar) {
        this.b.b("/updateActiveView", this.e);
        this.b.b("/untrackActiveViewUnit", this.f);
        this.d = gxbVar;
    }

    public final void d(wlb wlbVar) {
        wlbVar.e0("/updateActiveView", this.e);
        wlbVar.e0("/untrackActiveViewUnit", this.f);
    }

    public final void e() {
        this.b.c("/updateActiveView", this.e);
        this.b.c("/untrackActiveViewUnit", this.f);
    }

    public final void f(wlb wlbVar) {
        wlbVar.n0("/updateActiveView", this.e);
        wlbVar.n0("/untrackActiveViewUnit", this.f);
    }
}
