package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzflg;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v3d {
    private final aac a;
    private final z2d b;
    private final s6 c;
    private final s1e d;
    private final zzcei e;
    private final v7e f;
    private final q7e g;
    private final Context h;
    private final kke i;
    public j64 j;

    v3d(aac aacVar, z2d z2dVar, s6 s6Var, s1e s1eVar, zzcei zzceiVar, v7e v7eVar, q7e q7eVar, Context context, kke kkeVar) {
        this.a = aacVar;
        this.b = z2dVar;
        this.c = s6Var;
        this.d = s1eVar;
        this.e = zzceiVar;
        this.f = v7eVar;
        this.g = q7eVar;
        this.h = context;
        this.i = kkeVar;
    }

    final /* synthetic */ zzbym a(zzbze zzbzeVar, k5d k5dVar) {
        k5dVar.c.put("Content-Type", k5dVar.e);
        k5dVar.c.put("User-Agent", dyf.r().E(this.h, zzbzeVar.zzb.zza));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : k5dVar.c.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbym(k5dVar.a, k5dVar.b, bundle, k5dVar.d, k5dVar.f, zzbzeVar.zzd, zzbzeVar.zzh);
    }

    public final j64 c(final zzbze zzbzeVar, final JSONObject jSONObject, final v9b v9bVar) {
        this.a.F(zzbzeVar);
        w5e b = this.c.b(zzflg.PROXY, zb.m(this.c.b(zzflg.PREPARE_HTTP_REQUEST, zb.h(new r5d(jSONObject, v9bVar))).e(new s5d(zzbzeVar.zzg, this.g, e7e.a(this.h, 9))).a(), new gge() { // from class: r3d
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                return v3d.this.a(zzbzeVar, (k5d) obj);
            }
        }, this.i));
        final z2d z2dVar = this.b;
        Objects.requireNonNull(z2dVar);
        h5e a = b.f(new ake() { // from class: s3d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return z2d.this.c((zzbym) obj);
            }
        }).a();
        this.j = a;
        j64 n = zb.n(this.c.b(zzflg.PRE_PROCESS, a).e(new f5e() { // from class: q3d
            @Override // defpackage.f5e
            public final Object zza(Object obj) {
                return new x4d(l5d.a(new InputStreamReader((InputStream) obj)), jSONObject, v9bVar);
            }
        }).f(dyf.h().a(this.h, this.e, this.f).a("google.afma.response.normalize", x4d.d, b2b.c)).a(), new ake() { // from class: t3d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return v3d.this.d((InputStream) obj);
            }
        }, this.i);
        zb.r(n, new u3d(this), this.i);
        return n;
    }

    final /* synthetic */ j64 d(InputStream inputStream) {
        return zb.h(new g1e(new d1e(this.d), f1e.a(new InputStreamReader(inputStream))));
    }
}
