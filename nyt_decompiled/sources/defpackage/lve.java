package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class lve {
    private Integer a = null;
    private Integer b = null;
    private mve c = mve.e;

    /* synthetic */ lve(kve kveVar) {
    }

    public final lve a(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.a = Integer.valueOf(i);
        return this;
    }

    public final lve b(int i) {
        if (i >= 10 && i <= 16) {
            this.b = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
    }

    public final lve c(mve mveVar) {
        this.c = mveVar;
        return this;
    }

    public final ove d() {
        Integer num = this.a;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.c != null) {
            return new ove(num.intValue(), this.b.intValue(), this.c, null);
        }
        throw new GeneralSecurityException("variant not set");
    }
}
