package defpackage;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class ybf {
    public static xbf a(String str) {
        xbf xbfVar = (xbf) rdf.j().get(str);
        if (xbfVar != null) {
            return xbfVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
