package defpackage;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class mfb {
    private BigInteger a = BigInteger.ONE;
    private String b = "0";

    public final synchronized String a() {
        String bigInteger;
        bigInteger = this.a.toString();
        this.a = this.a.add(BigInteger.ONE);
        this.b = bigInteger;
        return bigInteger;
    }

    public final synchronized String b() {
        return this.b;
    }
}
