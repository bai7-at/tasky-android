package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class koe {
    private Integer a = null;
    private Integer b = null;
    private Integer c = null;
    private loe d = loe.d;

    /* synthetic */ koe(joe joeVar) {
    }

    public final koe a(int i) {
        this.b = 12;
        return this;
    }

    public final koe b(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
        return this;
    }

    public final koe c(int i) {
        this.c = 16;
        return this;
    }

    public final koe d(loe loeVar) {
        this.d = loeVar;
        return this;
    }

    public final noe e() {
        Integer num = this.a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        this.b.intValue();
        this.c.intValue();
        return new noe(intValue, 12, 16, this.d, null);
    }
}
