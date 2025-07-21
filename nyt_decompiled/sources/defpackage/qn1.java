package defpackage;

import com.datadog.opentracing.a;
import com.datadog.opentracing.b;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public class qn1 implements zo6 {
    private static final BigInteger c = new BigInteger("1111111111111111111");
    private static final BigDecimal d = new BigDecimal(b.t);
    private static final BigInteger e = new BigInteger("2").pow(64);
    private final BigInteger a;
    private final double b;

    public qn1(double d2) {
        this.b = d2;
        this.a = new BigDecimal(d2).multiply(d).toBigInteger();
    }

    @Override // defpackage.z77
    public boolean b(a aVar) {
        double d2 = this.b;
        if (d2 == 1.0d) {
            return true;
        }
        return d2 != 0.0d && aVar.v().multiply(c).mod(e).compareTo(this.a) < 0;
    }

    @Override // defpackage.zo6
    public double c() {
        return this.b;
    }
}
