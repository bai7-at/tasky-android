package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class poe {
    private ape a = null;
    private uze b = null;
    private Integer c = null;

    /* synthetic */ poe(ooe ooeVar) {
    }

    public final poe a(Integer num) {
        this.c = num;
        return this;
    }

    public final poe b(uze uzeVar) {
        this.b = uzeVar;
        return this;
    }

    public final poe c(ape apeVar) {
        this.a = apeVar;
        return this;
    }

    public final roe d() {
        uze uzeVar;
        tze b;
        ape apeVar = this.a;
        if (apeVar == null || (uzeVar = this.b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (apeVar.b() != uzeVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (apeVar.a() && this.c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.a.a() && this.c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.a.c() == yoe.d) {
            b = tze.b(new byte[0]);
        } else if (this.a.c() == yoe.c) {
            b = tze.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
        } else {
            if (this.a.c() != yoe.b) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.a.c())));
            }
            b = tze.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
        }
        return new roe(this.a, this.b, b, this.c, null);
    }
}
