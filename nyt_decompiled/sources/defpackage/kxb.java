package defpackage;

import com.google.android.gms.internal.ads.zzcei;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kxb implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public kxb(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcei a = ((sob) this.a).a();
        JSONObject jSONObject = (JSONObject) this.b.zzb();
        String str = (String) this.c.zzb();
        boolean equals = "native".equals(str);
        dyf.r();
        return new ria(UUID.randomUUID().toString(), a, str, jSONObject, false, equals);
    }
}
