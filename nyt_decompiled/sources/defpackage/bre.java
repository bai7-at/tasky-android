package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class bre extends ime {
    private final hre a;
    private final uze b;
    private final tze c;
    private final Integer d;

    private bre(hre hreVar, uze uzeVar, tze tzeVar, Integer num) {
        this.a = hreVar;
        this.b = uzeVar;
        this.c = tzeVar;
        this.d = num;
    }

    public static bre a(gre greVar, uze uzeVar, Integer num) {
        tze b;
        gre greVar2 = gre.d;
        if (greVar != greVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + greVar.toString() + " the value of idRequirement must be non-null");
        }
        if (greVar == greVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (uzeVar.a() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + uzeVar.a());
        }
        hre c = hre.c(greVar);
        if (c.b() == greVar2) {
            b = tze.b(new byte[0]);
        } else if (c.b() == gre.c) {
            b = tze.b(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (c.b() != gre.b) {
                throw new IllegalStateException("Unknown Variant: ".concat(c.b().toString()));
            }
            b = tze.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new bre(c, uzeVar, b, num);
    }

    public final hre b() {
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
