package defpackage;

import java.math.BigInteger;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class f80 {
    public static final f80 a = new f80();
    private static final BigInteger b = new BigInteger("ffffffffffffffff", 16);

    private f80() {
    }

    public final String a(BigInteger bigInteger) {
        zq3.h(bigInteger, "traceId");
        try {
            String bigInteger2 = bigInteger.and(b).toString();
            zq3.g(bigInteger2, "{\n            traceId.an…ASK).toString()\n        }");
            return bigInteger2;
        } catch (ArithmeticException | NumberFormatException unused) {
            return "";
        }
    }

    public final String b(BigInteger bigInteger) {
        zq3.h(bigInteger, "traceId");
        try {
            String bigInteger2 = bigInteger.and(b).toString(16);
            zq3.g(bigInteger2, "traceId.and(LONG_MASK).toString(HEX_RADIX)");
            return h.p0(bigInteger2, 16, '0');
        } catch (ArithmeticException | NumberFormatException | IllegalArgumentException unused) {
            return "";
        }
    }

    public final String c(BigInteger bigInteger) {
        zq3.h(bigInteger, "traceId");
        try {
            String bigInteger2 = bigInteger.shiftRight(64).toString(16);
            zq3.g(bigInteger2, "traceId.shiftRight(LONG_…SIZE).toString(HEX_RADIX)");
            return h.p0(bigInteger2, 16, '0');
        } catch (ArithmeticException | NumberFormatException | IllegalArgumentException unused) {
            return "";
        }
    }
}
