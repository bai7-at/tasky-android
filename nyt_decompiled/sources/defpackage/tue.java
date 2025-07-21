package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class tue {
    private final Map a;
    private final Map b;
    private final Map c;
    private final Map d;

    public tue() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public final tue a(use useVar) {
        vue vueVar = new vue(useVar.d(), useVar.c(), null);
        if (this.b.containsKey(vueVar)) {
            use useVar2 = (use) this.b.get(vueVar);
            if (!useVar2.equals(useVar) || !useVar.equals(useVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(vueVar.toString()));
            }
        } else {
            this.b.put(vueVar, useVar);
        }
        return this;
    }

    public final tue b(yse yseVar) {
        xue xueVar = new xue(yseVar.c(), yseVar.d(), null);
        if (this.a.containsKey(xueVar)) {
            yse yseVar2 = (yse) this.a.get(xueVar);
            if (!yseVar2.equals(yseVar) || !yseVar.equals(yseVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(xueVar.toString()));
            }
        } else {
            this.a.put(xueVar, yseVar);
        }
        return this;
    }

    public final tue c(wte wteVar) {
        vue vueVar = new vue(wteVar.d(), wteVar.c(), null);
        if (this.d.containsKey(vueVar)) {
            wte wteVar2 = (wte) this.d.get(vueVar);
            if (!wteVar2.equals(wteVar) || !wteVar.equals(wteVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(vueVar.toString()));
            }
        } else {
            this.d.put(vueVar, wteVar);
        }
        return this;
    }

    public final tue d(aue aueVar) {
        xue xueVar = new xue(aueVar.c(), aueVar.d(), null);
        if (this.c.containsKey(xueVar)) {
            aue aueVar2 = (aue) this.c.get(xueVar);
            if (!aueVar2.equals(aueVar) || !aueVar.equals(aueVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(xueVar.toString()));
            }
        } else {
            this.c.put(xueVar, aueVar);
        }
        return this;
    }

    public tue(zue zueVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zueVar.a;
        this.a = new HashMap(map);
        map2 = zueVar.b;
        this.b = new HashMap(map2);
        map3 = zueVar.c;
        this.c = new HashMap(map3);
        map4 = zueVar.d;
        this.d = new HashMap(map4);
    }
}
