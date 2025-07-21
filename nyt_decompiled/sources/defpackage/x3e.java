package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfiz;
import com.google.android.gms.internal.ads.zzfjc;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class x3e {
    private final HashMap a = new HashMap();

    public final w3e a(zzfiz zzfizVar, Context context, e3e e3eVar, d4e d4eVar) {
        w3e w3eVar = (w3e) this.a.get(zzfizVar);
        if (w3eVar != null) {
            return w3eVar;
        }
        j3e j3eVar = new j3e(zzfjc.t0(zzfizVar, context));
        w3e w3eVar2 = new w3e(j3eVar, new f4e(j3eVar, e3eVar, d4eVar));
        this.a.put(zzfizVar, w3eVar2);
        return w3eVar2;
    }
}
