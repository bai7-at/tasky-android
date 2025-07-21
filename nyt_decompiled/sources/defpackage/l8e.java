package defpackage;

import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzfol;
import com.google.android.gms.internal.ads.zzfom;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l8e {
    private final zzfom a;
    private final zzfom b;
    private final zzfoi c;
    private final zzfol d;

    private l8e(zzfoi zzfoiVar, zzfol zzfolVar, zzfom zzfomVar, zzfom zzfomVar2, boolean z) {
        this.c = zzfoiVar;
        this.d = zzfolVar;
        this.a = zzfomVar;
        if (zzfomVar2 == null) {
            this.b = zzfom.NONE;
        } else {
            this.b = zzfomVar2;
        }
    }

    public static l8e a(zzfoi zzfoiVar, zzfol zzfolVar, zzfom zzfomVar, zzfom zzfomVar2, boolean z) {
        v9e.b(zzfolVar, "ImpressionType is null");
        v9e.b(zzfomVar, "Impression owner is null");
        if (zzfomVar == zzfom.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfoiVar == zzfoi.DEFINED_BY_JAVASCRIPT && zzfomVar == zzfom.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfolVar == zzfol.DEFINED_BY_JAVASCRIPT && zzfomVar == zzfom.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new l8e(zzfoiVar, zzfolVar, zzfomVar, zzfomVar2, true);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        q9e.e(jSONObject, "impressionOwner", this.a);
        q9e.e(jSONObject, "mediaEventsOwner", this.b);
        q9e.e(jSONObject, "creativeType", this.c);
        q9e.e(jSONObject, "impressionType", this.d);
        q9e.e(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
