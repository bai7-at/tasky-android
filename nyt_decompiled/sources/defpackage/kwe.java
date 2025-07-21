package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class kwe {
    private Integer a = null;
    private Integer b = null;
    private lwe c = null;
    private mwe d = mwe.e;

    /* synthetic */ kwe(jwe jweVar) {
    }

    public final kwe a(lwe lweVar) {
        this.c = lweVar;
        return this;
    }

    public final kwe b(int i) {
        this.a = Integer.valueOf(i);
        return this;
    }

    public final kwe c(int i) {
        this.b = Integer.valueOf(i);
        return this;
    }

    public final kwe d(mwe mweVar) {
        this.d = mweVar;
        return this;
    }

    public final owe e() {
        Integer num = this.a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.a));
        }
        Integer num2 = this.b;
        int intValue = num2.intValue();
        lwe lweVar = this.c;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (lweVar == lwe.b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (lweVar == lwe.c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (lweVar == lwe.d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (lweVar == lwe.e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (lweVar != lwe.f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new owe(this.a.intValue(), this.b.intValue(), this.d, this.c, null);
    }
}
