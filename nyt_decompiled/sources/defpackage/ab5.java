package defpackage;

import java.math.BigInteger;
import kotlin.text.a;

/* loaded from: classes2.dex */
public abstract class ab5 {
    public static final String a(long j) {
        String l = Long.toString(j, a.a(16));
        zq3.g(l, "toString(...)");
        return l;
    }

    public static final String b(BigInteger bigInteger) {
        zq3.h(bigInteger, "<this>");
        return a(bigInteger.longValue());
    }
}
