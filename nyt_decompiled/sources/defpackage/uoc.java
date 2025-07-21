package defpackage;

import android.graphics.Rect;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class uoc {
    private final Executor a;
    private final qxb b;
    private final vfc c;

    uoc(Executor executor, qxb qxbVar, vfc vfcVar) {
        this.a = executor;
        this.c = vfcVar;
        this.b = qxbVar;
    }

    public final void a(final wlb wlbVar) {
        if (wlbVar == null) {
            return;
        }
        this.c.M0(wlbVar.h());
        this.c.C0(new via() { // from class: qoc
            @Override // defpackage.via
            public final void R(uia uiaVar) {
                onb zzN = wlb.this.zzN();
                Rect rect = uiaVar.d;
                zzN.k0(rect.left, rect.top, false);
            }
        }, this.a);
        this.c.C0(new via() { // from class: roc
            @Override // defpackage.via
            public final void R(uia uiaVar) {
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != uiaVar.j ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                wlb.this.t("onAdVisibilityChanged", hashMap);
            }
        }, this.a);
        this.c.C0(this.b, this.a);
        this.b.n(wlbVar);
        wlbVar.e0("/trackActiveViewUnit", new uxa() { // from class: soc
            @Override // defpackage.uxa
            public final void a(Object obj, Map map) {
                uoc.this.b((wlb) obj, map);
            }
        });
        wlbVar.e0("/untrackActiveViewUnit", new uxa() { // from class: toc
            @Override // defpackage.uxa
            public final void a(Object obj, Map map) {
                uoc.this.c((wlb) obj, map);
            }
        });
    }

    final /* synthetic */ void b(wlb wlbVar, Map map) {
        this.b.c();
    }

    final /* synthetic */ void c(wlb wlbVar, Map map) {
        this.b.a();
    }
}
