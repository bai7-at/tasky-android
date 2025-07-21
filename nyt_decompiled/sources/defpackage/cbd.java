package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzcei;
import defpackage.h51;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class cbd implements g9d {
    private final Context a;
    private final bic b;
    private final Executor c;
    private final u0e d;

    public cbd(Context context, Executor executor, bic bicVar, u0e u0eVar) {
        this.a = context;
        this.b = bicVar;
        this.c = executor;
        this.d = u0eVar;
    }

    private static String d(v0e v0eVar) {
        try {
            return v0eVar.w.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.g9d
    public final j64 a(final g1e g1eVar, final v0e v0eVar) {
        String d = d(v0eVar);
        final Uri parse = d != null ? Uri.parse(d) : null;
        return zb.n(zb.h(null), new ake() { // from class: abd
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return cbd.this.c(parse, g1eVar, v0eVar, obj);
            }
        }, this.c);
    }

    @Override // defpackage.g9d
    public final boolean b(g1e g1eVar, v0e v0eVar) {
        Context context = this.a;
        return (context instanceof Activity) && tqa.g(context) && !TextUtils.isEmpty(d(v0eVar));
    }

    final /* synthetic */ j64 c(Uri uri, g1e g1eVar, v0e v0eVar, Object obj) {
        try {
            h51 a = new h51.b().a();
            a.a.setData(uri);
            zzc zzcVar = new zzc(a.a, null);
            final ugb ugbVar = new ugb();
            zgc c = this.b.c(new k1c(g1eVar, v0eVar, null), new chc(new iic() { // from class: bbd
                @Override // defpackage.iic
                public final void a(boolean z, Context context, m7c m7cVar) {
                    ugb ugbVar2 = ugb.this;
                    try {
                        dyf.k();
                        thf.a(context, (AdOverlayInfoParcel) ugbVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            ugbVar.c(new AdOverlayInfoParcel(zzcVar, null, c.h(), null, new zzcei(0, 0, false, false, false), null, null));
            this.d.a();
            return zb.h(c.i());
        } catch (Throwable th) {
            fgb.e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
