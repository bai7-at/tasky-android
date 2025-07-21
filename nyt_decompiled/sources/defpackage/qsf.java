package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qsf {
    private final Map a;
    private final Map b;
    private final Map c;
    private final Map d;

    /* synthetic */ qsf(orf orfVar, nsf nsfVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = orfVar.a;
        this.a = new HashMap(map);
        map2 = orfVar.b;
        this.b = new HashMap(map2);
        map3 = orfVar.c;
        this.c = new HashMap(map3);
        map4 = orfVar.d;
        this.d = new HashMap(map4);
    }

    public final cbf a(lrf lrfVar, tdf tdfVar) {
        srf srfVar = new srf(lrfVar.getClass(), lrfVar.zzb(), null);
        if (this.b.containsKey(srfVar)) {
            return ((vnf) this.b.get(srfVar)).a(lrfVar, tdfVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + srfVar.toString() + " available");
    }
}
