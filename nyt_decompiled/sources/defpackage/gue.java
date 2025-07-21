package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class gue {
    private final Map a;
    private final Map b;

    /* synthetic */ gue(fue fueVar) {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public final gue a(eue eueVar) {
        if (eueVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        iue iueVar = new iue(eueVar.c(), eueVar.d(), null);
        if (this.a.containsKey(iueVar)) {
            eue eueVar2 = (eue) this.a.get(iueVar);
            if (!eueVar2.equals(eueVar) || !eueVar.equals(eueVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(iueVar.toString()));
            }
        } else {
            this.a.put(iueVar, eueVar);
        }
        return this;
    }

    public final gue b(xle xleVar) {
        Map map = this.b;
        Class zzb = xleVar.zzb();
        if (map.containsKey(zzb)) {
            xle xleVar2 = (xle) this.b.get(zzb);
            if (!xleVar2.equals(xleVar) || !xleVar.equals(xleVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
            }
        } else {
            this.b.put(zzb, xleVar);
        }
        return this;
    }

    /* synthetic */ gue(kue kueVar, fue fueVar) {
        Map map;
        Map map2;
        map = kueVar.a;
        this.a = new HashMap(map);
        map2 = kueVar.b;
        this.b = new HashMap(map2);
    }
}
