package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class xoe {
    private Integer a = null;
    private yoe b = yoe.d;

    /* synthetic */ xoe(woe woeVar) {
    }

    public final xoe a(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
        return this;
    }

    public final xoe b(yoe yoeVar) {
        this.b = yoeVar;
        return this;
    }

    public final ape c() {
        Integer num = this.a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.b != null) {
            return new ape(num.intValue(), this.b, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }
}
