package defpackage;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n2b implements u1b {
    private final w1b a;
    private final x1b b;
    private final r1b c;
    private final String d;

    n2b(r1b r1bVar, String str, x1b x1bVar, w1b w1bVar) {
        this.c = r1bVar;
        this.d = str;
        this.b = x1bVar;
        this.a = w1bVar;
    }

    static /* bridge */ /* synthetic */ void b(n2b n2bVar, l1b l1bVar, s1b s1bVar, Object obj, ugb ugbVar) {
        try {
            dyf.r();
            String uuid = UUID.randomUUID().toString();
            txa.o.c(uuid, new m2b(n2bVar, l1bVar, ugbVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", n2bVar.b.zzb(obj));
            s1bVar.M0(n2bVar.d, jSONObject);
        } catch (Exception e) {
            try {
                ugbVar.d(e);
                fgb.e("Unable to invokeJavascript", e);
            } finally {
                l1bVar.g();
            }
        }
    }

    @Override // defpackage.ake
    public final j64 zza(Object obj) {
        return zzb(obj);
    }

    @Override // defpackage.u1b
    public final j64 zzb(Object obj) {
        ugb ugbVar = new ugb();
        l1b b = this.c.b(null);
        pzc.k("callJs > getEngine: Promise created");
        b.e(new f2b(this, b, obj, ugbVar), new g2b(this, ugbVar, b));
        return ugbVar;
    }
}
