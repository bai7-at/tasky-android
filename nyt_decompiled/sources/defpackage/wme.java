package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class wme {
    private Integer a = null;
    private Integer b = null;
    private Integer c = null;
    private Integer d = null;
    private xme e = null;
    private yme f = yme.d;

    /* synthetic */ wme(vme vmeVar) {
    }

    public final wme a(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
        return this;
    }

    public final wme b(xme xmeVar) {
        this.e = xmeVar;
        return this;
    }

    public final wme c(int i) {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
        return this;
    }

    public final wme d(int i) {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
        return this;
    }

    public final wme e(int i) {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.d = Integer.valueOf(i);
        return this;
    }

    public final wme f(yme ymeVar) {
        this.f = ymeVar;
        return this;
    }

    public final ane g() {
        if (this.a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int intValue = num.intValue();
        xme xmeVar = this.e;
        if (xmeVar == xme.b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (xmeVar == xme.c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (xmeVar == xme.d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (xmeVar == xme.e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (xmeVar != xme.f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new ane(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue(), this.f, this.e, null);
    }
}
