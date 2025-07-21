package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zue {
    private final Map a;
    private final Map b;
    private final Map c;
    private final Map d;

    /* synthetic */ zue(tue tueVar, yue yueVar) {
        this.a = new HashMap(tueVar.a);
        this.b = new HashMap(tueVar.b);
        this.c = new HashMap(tueVar.c);
        this.d = new HashMap(tueVar.d);
    }

    public final ble a(sue sueVar, dme dmeVar) {
        vue vueVar = new vue(sueVar.getClass(), sueVar.zzd(), null);
        if (this.b.containsKey(vueVar)) {
            return ((use) this.b.get(vueVar)).a(sueVar, dmeVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + vueVar.toString() + " available");
    }

    public final ple b(sue sueVar) {
        vue vueVar = new vue(sueVar.getClass(), sueVar.zzd(), null);
        if (this.d.containsKey(vueVar)) {
            return ((wte) this.d.get(vueVar)).a(sueVar);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + vueVar.toString() + " available");
    }

    public final sue c(ble bleVar, Class cls, dme dmeVar) {
        xue xueVar = new xue(bleVar.getClass(), cls, null);
        if (this.a.containsKey(xueVar)) {
            return ((yse) this.a.get(xueVar)).a(bleVar, dmeVar);
        }
        throw new GeneralSecurityException("No Key serializer for " + xueVar.toString() + " available");
    }

    public final sue d(ple pleVar, Class cls) {
        xue xueVar = new xue(pleVar.getClass(), cls, null);
        if (this.c.containsKey(xueVar)) {
            return ((aue) this.c.get(xueVar)).a(pleVar);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + xueVar.toString() + " available");
    }

    public final boolean i(sue sueVar) {
        return this.b.containsKey(new vue(sueVar.getClass(), sueVar.zzd(), null));
    }

    public final boolean j(sue sueVar) {
        return this.d.containsKey(new vue(sueVar.getClass(), sueVar.zzd(), null));
    }
}
