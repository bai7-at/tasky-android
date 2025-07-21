package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class ome {
    private ane a = null;
    private uze b = null;
    private uze c = null;
    private Integer d = null;

    /* synthetic */ ome(nme nmeVar) {
    }

    public final ome a(uze uzeVar) {
        this.b = uzeVar;
        return this;
    }

    public final ome b(uze uzeVar) {
        this.c = uzeVar;
        return this;
    }

    public final ome c(Integer num) {
        this.d = num;
        return this;
    }

    public final ome d(ane aneVar) {
        this.a = aneVar;
        return this;
    }

    public final qme e() {
        tze b;
        ane aneVar = this.a;
        if (aneVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        uze uzeVar = this.b;
        if (uzeVar == null || this.c == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (aneVar.b() != uzeVar.a()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (aneVar.c() != this.c.a()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.a.a() && this.d == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.a.a() && this.d != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.a.g() == yme.d) {
            b = tze.b(new byte[0]);
        } else if (this.a.g() == yme.c) {
            b = tze.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.d.intValue()).array());
        } else {
            if (this.a.g() != yme.b) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.a.g())));
            }
            b = tze.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.d.intValue()).array());
        }
        return new qme(this.a, this.b, this.c, b, this.d, null);
    }
}
