package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class kue {
    private final Map a;
    private final Map b;

    /* synthetic */ kue(gue gueVar, jue jueVar) {
        this.a = new HashMap(gueVar.a);
        this.b = new HashMap(gueVar.b);
    }

    public final Class a(Class cls) {
        if (this.b.containsKey(cls)) {
            return ((xle) this.b.get(cls)).zza();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls.toString() + " available");
    }

    public final Object b(ble bleVar, Class cls) {
        iue iueVar = new iue(bleVar.getClass(), cls, null);
        if (this.a.containsKey(iueVar)) {
            return ((eue) this.a.get(iueVar)).a(bleVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + iueVar.toString() + " available");
    }

    public final Object c(wle wleVar, Class cls) {
        if (!this.b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        xle xleVar = (xle) this.b.get(cls);
        if (wleVar.c().equals(xleVar.zza()) && xleVar.zza().equals(wleVar.c())) {
            return xleVar.a(wleVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
