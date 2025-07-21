package defpackage;

import com.google.android.gms.internal.ads.zzcei;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ujc implements v3f {
    private final l4f a;
    private final l4f b;

    public ujc(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcei a = ((sob) this.a).a();
        dyf.r();
        return new ria(UUID.randomUUID().toString(), a, "native", new JSONObject(), false, true);
    }
}
