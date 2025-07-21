package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ktf extends guf {
    private final int a;
    private final itf b;

    private ktf(int i, itf itfVar) {
        this.a = i;
        this.b = itfVar;
    }

    public static ktf b(int i, itf itfVar) {
        if (i >= 10 && i <= 16) {
            return new ktf(i, itfVar);
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
    }

    public final int a() {
        itf itfVar = this.b;
        if (itfVar == itf.e) {
            return this.a;
        }
        if (itfVar == itf.b || itfVar == itf.c || itfVar == itf.d) {
            return this.a + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean c() {
        return this.b != itf.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ktf)) {
            return false;
        }
        ktf ktfVar = (ktf) obj;
        return ktfVar.a() == a() && ktfVar.b == this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + this.b.toString() + ", " + this.a + "-byte tags)";
    }
}
