package defpackage;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class fxe implements wve {
    private final fve a;

    public fxe(fve fveVar) {
        if (!gse.a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.a = fveVar;
    }
}
