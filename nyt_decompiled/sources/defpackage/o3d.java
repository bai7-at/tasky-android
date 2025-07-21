package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzflg;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o3d {
    private final kke a;
    private final j3d b;
    private final s6 c;

    o3d(kke kkeVar, j3d j3dVar, s6 s6Var) {
        this.a = kkeVar;
        this.b = j3dVar;
        this.c = s6Var;
    }

    public final j64 a(final zzbze zzbzeVar) {
        w5e b = this.c.b(zzflg.GMS_SIGNALS, zb.m(zb.h(null), new gge() { // from class: l3d
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                zzbze zzbzeVar2 = zzbze.this;
                return new zzbyi(zzbzeVar2.zzc, zzbzeVar2.zzd, zzbzeVar2.zzf, ehe.c(zzbzeVar2.zza.getString("ms")), -1, zzbzeVar2.zzh, zzbzeVar2.zze, zzbzeVar2.zzk, zzbzeVar2.zzl);
            }
        }, this.a));
        final j3d j3dVar = this.b;
        Objects.requireNonNull(j3dVar);
        return zb.m(b.f(new ake() { // from class: m3d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return j3d.this.b((zzbyi) obj);
            }
        }).a(), new gge() { // from class: n3d
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbzeVar.zza;
                if (bundle == null) {
                    return jSONObject;
                }
                try {
                    JSONObject j = kia.b().j(bundle);
                    try {
                        kia.b().m(jSONObject, j);
                        return jSONObject;
                    } catch (JSONException unused) {
                        return j;
                    }
                } catch (JSONException unused2) {
                    return jSONObject;
                }
            }
        }, this.a);
    }
}
