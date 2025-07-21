package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class ipe extends ime {
    private final npe a;
    private final uze b;
    private final tze c;
    private final Integer d;

    private ipe(npe npeVar, uze uzeVar, tze tzeVar, Integer num) {
        this.a = npeVar;
        this.b = uzeVar;
        this.c = tzeVar;
        this.d = num;
    }

    public static ipe a(mpe mpeVar, uze uzeVar, Integer num) {
        tze b;
        mpe mpeVar2 = mpe.d;
        if (mpeVar != mpeVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + mpeVar.toString() + " the value of idRequirement must be non-null");
        }
        if (mpeVar == mpeVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (uzeVar.a() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + uzeVar.a());
        }
        npe c = npe.c(mpeVar);
        if (c.b() == mpeVar2) {
            b = tze.b(new byte[0]);
        } else if (c.b() == mpe.c) {
            b = tze.b(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (c.b() != mpe.b) {
                throw new IllegalStateException("Unknown Variant: ".concat(c.b().toString()));
            }
            b = tze.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new ipe(c, uzeVar, b, num);
    }

    public final npe b() {
        return this.a;
    }

    public final tze c() {
        return this.c;
    }

    public final uze d() {
        return this.b;
    }

    public final Integer e() {
        return this.d;
    }
}
