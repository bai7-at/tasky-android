package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.util.Mimetypes;
import com.google.android.gms.ads.internal.client.zzq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class gmc {
    private final urc a;
    private final cqc b;
    private final qxb c;
    private final zkc d;

    public gmc(urc urcVar, cqc cqcVar, qxb qxbVar, zkc zkcVar) {
        this.a = urcVar;
        this.b = cqcVar;
        this.c = qxbVar;
        this.d = zkcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a() {
        wlb a = this.a.a(zzq.H0(), null, null);
        ((View) a).setVisibility(8);
        a.e0("/sendMessageToSdk", new uxa() { // from class: bmc
            @Override // defpackage.uxa
            public final void a(Object obj, Map map) {
                gmc.this.b((wlb) obj, map);
            }
        });
        a.e0("/adMuted", new uxa() { // from class: cmc
            @Override // defpackage.uxa
            public final void a(Object obj, Map map) {
                gmc.this.c((wlb) obj, map);
            }
        });
        this.b.j(new WeakReference(a), "/loadHtml", new uxa() { // from class: dmc
            @Override // defpackage.uxa
            public final void a(Object obj, final Map map) {
                wlb wlbVar = (wlb) obj;
                onb zzN = wlbVar.zzN();
                final gmc gmcVar = gmc.this;
                zzN.N(new mnb() { // from class: amc
                    @Override // defpackage.mnb
                    public final void a(boolean z, int i, String str, String str2) {
                        gmc.this.d(map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    wlbVar.loadData(str, Mimetypes.MIMETYPE_HTML, Constants.DEFAULT_ENCODING);
                } else {
                    wlbVar.loadDataWithBaseURL(str2, str, Mimetypes.MIMETYPE_HTML, Constants.DEFAULT_ENCODING, null);
                }
            }
        });
        this.b.j(new WeakReference(a), "/showOverlay", new uxa() { // from class: emc
            @Override // defpackage.uxa
            public final void a(Object obj, Map map) {
                gmc.this.e((wlb) obj, map);
            }
        });
        this.b.j(new WeakReference(a), "/hideOverlay", new uxa() { // from class: fmc
            @Override // defpackage.uxa
            public final void a(Object obj, Map map) {
                gmc.this.f((wlb) obj, map);
            }
        });
        return (View) a;
    }

    final /* synthetic */ void b(wlb wlbVar, Map map) {
        this.b.g("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(wlb wlbVar, Map map) {
        this.d.zzg();
    }

    final /* synthetic */ void d(Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.b.g("sendMessageToNativeJs", hashMap);
    }

    final /* synthetic */ void e(wlb wlbVar, Map map) {
        fgb.f("Showing native ads overlay.");
        wlbVar.h().setVisibility(0);
        this.c.l(true);
    }

    final /* synthetic */ void f(wlb wlbVar, Map map) {
        fgb.f("Hiding native ads overlay.");
        wlbVar.h().setVisibility(8);
        this.c.l(false);
    }
}
