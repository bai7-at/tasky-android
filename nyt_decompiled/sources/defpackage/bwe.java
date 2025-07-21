package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class bwe {
    private owe a = null;
    private uze b = null;
    private Integer c = null;

    /* synthetic */ bwe(awe aweVar) {
    }

    public final bwe a(Integer num) {
        this.c = num;
        return this;
    }

    public final bwe b(uze uzeVar) {
        this.b = uzeVar;
        return this;
    }

    public final bwe c(owe oweVar) {
        this.a = oweVar;
        return this;
    }

    public final dwe d() {
        uze uzeVar;
        tze b;
        owe oweVar = this.a;
        if (oweVar == null || (uzeVar = this.b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (oweVar.c() != uzeVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (oweVar.a() && this.c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.a.a() && this.c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.a.g() == mwe.e) {
            b = tze.b(new byte[0]);
        } else if (this.a.g() == mwe.d || this.a.g() == mwe.c) {
            b = tze.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
        } else {
            if (this.a.g() != mwe.b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.a.g())));
            }
            b = tze.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
        }
        return new dwe(this.a, this.b, b, this.c, null);
    }
}
