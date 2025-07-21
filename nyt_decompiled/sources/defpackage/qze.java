package defpackage;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class qze implements ole {
    private static final byte[] e = {0};
    private final yxe a;
    private final int b;
    private final byte[] c;
    private final byte[] d;

    private qze(fve fveVar) {
        this.a = new nze(fveVar.d().d(ale.a()));
        this.b = fveVar.c().b();
        this.c = fveVar.b().c();
        if (fveVar.c().e().equals(mve.d)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public static ole a(fve fveVar) {
        return new qze(fveVar);
    }

    public static ole b(dwe dweVar) {
        return new qze(dweVar);
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArr2 = this.d;
        return bArr2.length > 0 ? rye.b(this.c, this.a.a(rye.b(bArr, bArr2), this.b)) : rye.b(this.c, this.a.a(bArr, this.b));
    }

    private qze(dwe dweVar) {
        String valueOf = String.valueOf(dweVar.d().f());
        this.a = new pze("HMAC".concat(valueOf), new SecretKeySpec(dweVar.e().d(ale.a()), "HMAC"));
        this.b = dweVar.d().b();
        this.c = dweVar.b().c();
        if (dweVar.d().g().equals(mwe.d)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public qze(yxe yxeVar, int i) {
        this.a = yxeVar;
        this.b = i;
        this.c = new byte[0];
        this.d = new byte[0];
        yxeVar.a(new byte[0], i);
    }
}
