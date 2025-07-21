package defpackage;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class gxe implements wve {
    private final dwe a;

    public gxe(dwe dweVar) {
        if (!gse.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = dweVar;
    }
}
