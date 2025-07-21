package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class orf {
    private final Map a;
    private final Map b;
    private final Map c;
    private final Map d;

    public orf() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public final orf a(vnf vnfVar) {
        srf srfVar = new srf(vnfVar.d(), vnfVar.c(), null);
        if (this.b.containsKey(srfVar)) {
            vnf vnfVar2 = (vnf) this.b.get(srfVar);
            if (!vnfVar2.equals(vnfVar) || !vnfVar.equals(vnfVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(srfVar.toString()));
            }
        } else {
            this.b.put(srfVar, vnfVar);
        }
        return this;
    }

    public final orf b(eof eofVar) {
        xrf xrfVar = new xrf(eofVar.a(), eofVar.b(), null);
        if (this.a.containsKey(xrfVar)) {
            eof eofVar2 = (eof) this.a.get(xrfVar);
            if (!eofVar2.equals(eofVar) || !eofVar.equals(eofVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(xrfVar.toString()));
            }
        } else {
            this.a.put(xrfVar, eofVar);
        }
        return this;
    }

    public final orf c(nqf nqfVar) {
        srf srfVar = new srf(nqfVar.b(), nqfVar.a(), null);
        if (this.d.containsKey(srfVar)) {
            nqf nqfVar2 = (nqf) this.d.get(srfVar);
            if (!nqfVar2.equals(nqfVar) || !nqfVar.equals(nqfVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(srfVar.toString()));
            }
        } else {
            this.d.put(srfVar, nqfVar);
        }
        return this;
    }

    public final orf d(wqf wqfVar) {
        xrf xrfVar = new xrf(wqfVar.a(), wqfVar.b(), null);
        if (this.c.containsKey(xrfVar)) {
            wqf wqfVar2 = (wqf) this.c.get(xrfVar);
            if (!wqfVar2.equals(wqfVar) || !wqfVar.equals(wqfVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(xrfVar.toString()));
            }
        } else {
            this.c.put(xrfVar, wqfVar);
        }
        return this;
    }

    public orf(qsf qsfVar) {
        this.a = new HashMap(qsfVar.a);
        this.b = new HashMap(qsfVar.b);
        this.c = new HashMap(qsfVar.c);
        this.d = new HashMap(qsfVar.d);
    }
}
