package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class qne {
    private Integer a = null;
    private Integer b = null;
    private Integer c = null;
    private rne d = rne.d;

    /* synthetic */ qne(pne pneVar) {
    }

    public final qne a(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
        return this;
    }

    public final qne b(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
        return this;
    }

    public final qne c(int i) {
        this.c = 16;
        return this;
    }

    public final qne d(rne rneVar) {
        this.d = rneVar;
        return this;
    }

    public final tne e() {
        Integer num = this.a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        int intValue2 = this.b.intValue();
        this.c.intValue();
        return new tne(intValue, intValue2, 16, this.d, null);
    }
}
