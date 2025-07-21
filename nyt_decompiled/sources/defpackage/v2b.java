package defpackage;

import com.google.android.gms.internal.ads.zb;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v2b implements ake {
    private final w1b a;
    private final x1b b;
    private final String c = "google.afma.activeView.handleUpdate";
    private final j64 d;

    v2b(j64 j64Var, String str, x1b x1bVar, w1b w1bVar) {
        this.d = j64Var;
        this.b = x1bVar;
        this.a = w1bVar;
    }

    final /* synthetic */ j64 a(Object obj, s1b s1bVar) {
        ugb ugbVar = new ugb();
        dyf.r();
        String uuid = UUID.randomUUID().toString();
        txa.o.c(uuid, new u2b(this, ugbVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        s1bVar.M0(this.c, jSONObject);
        return ugbVar;
    }

    @Override // defpackage.ake
    public final j64 zza(Object obj) {
        return zzb(obj);
    }

    public final j64 zzb(final Object obj) {
        return zb.n(this.d, new ake() { // from class: t2b
            @Override // defpackage.ake
            public final j64 zza(Object obj2) {
                return v2b.this.a(obj, (s1b) obj2);
            }
        }, pgb.f);
    }
}
