package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class aoe {
    private noe a = null;
    private uze b = null;
    private Integer c = null;

    /* synthetic */ aoe(zne zneVar) {
    }

    public final aoe a(Integer num) {
        this.c = num;
        return this;
    }

    public final aoe b(uze uzeVar) {
        this.b = uzeVar;
        return this;
    }

    public final aoe c(noe noeVar) {
        this.a = noeVar;
        return this;
    }

    public final coe d() {
        uze uzeVar;
        tze b;
        noe noeVar = this.a;
        if (noeVar == null || (uzeVar = this.b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (noeVar.b() != uzeVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (noeVar.a() && this.c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.a.a() && this.c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.a.d() == loe.d) {
            b = tze.b(new byte[0]);
        } else if (this.a.d() == loe.c) {
            b = tze.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
        } else {
            if (this.a.d() != loe.b) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.a.d())));
            }
            b = tze.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
        }
        return new coe(this.a, this.b, b, this.c, null);
    }
}
