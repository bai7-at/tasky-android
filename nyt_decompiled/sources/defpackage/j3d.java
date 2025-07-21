package defpackage;

import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzecf;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class j3d {
    private final kke a;
    private final kke b;
    private final b4d c;

    j3d(kke kkeVar, kke kkeVar2, b4d b4dVar) {
        this.a = kkeVar;
        this.b = kkeVar2;
        this.c = b4dVar;
    }

    final /* synthetic */ j64 a(zzbyi zzbyiVar) {
        return this.c.c(zzbyiVar, ((Long) pla.c().a(mpa.Wa)).longValue());
    }

    public final j64 b(final zzbyi zzbyiVar) {
        j64 f;
        String str = zzbyiVar.zzb;
        dyf.r();
        if (wxf.b(str)) {
            f = zb.g(new zzecf(1, "Ads signal service force local"));
        } else {
            f = zb.f(zb.k(new zje() { // from class: b3d
                @Override // defpackage.zje
                public final j64 zza() {
                    return j3d.this.a(zzbyiVar);
                }
            }, this.a), ExecutionException.class, new ake() { // from class: c3d
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    Throwable th = (ExecutionException) obj;
                    if (th.getCause() != null) {
                        th = th.getCause();
                    }
                    return zb.g(th);
                }
            }, this.b);
        }
        return zb.n(zb.f(vb.C(f), zzecf.class, new ake() { // from class: d3d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return zb.h(null);
            }
        }, this.b), new ake() { // from class: i3d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return zb.h(jSONObject);
                }
                try {
                    dyf.r();
                    jSONObject = new JSONObject(wxf.m(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e) {
                    dyf.q().w(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return zb.h(jSONObject);
            }
        }, this.b);
    }
}
