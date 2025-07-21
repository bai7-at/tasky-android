package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class dve {
    private ove a = null;
    private uze b = null;
    private Integer c = null;

    /* synthetic */ dve(cve cveVar) {
    }

    public final dve a(uze uzeVar) {
        this.b = uzeVar;
        return this;
    }

    public final dve b(Integer num) {
        this.c = num;
        return this;
    }

    public final dve c(ove oveVar) {
        this.a = oveVar;
        return this;
    }

    public final fve d() {
        uze uzeVar;
        tze b;
        ove oveVar = this.a;
        if (oveVar == null || (uzeVar = this.b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (oveVar.c() != uzeVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (oveVar.a() && this.c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.a.a() && this.c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.a.e() == mve.e) {
            b = tze.b(new byte[0]);
        } else if (this.a.e() == mve.d || this.a.e() == mve.c) {
            b = tze.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
        } else {
            if (this.a.e() != mve.b) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.a.e())));
            }
            b = tze.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
        }
        return new fve(this.a, this.b, b, this.c, null);
    }
}
