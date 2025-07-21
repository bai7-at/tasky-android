package defpackage;

import java.math.BigInteger;
import kotlin.text.h;

/* loaded from: classes2.dex */
public abstract class zx7 {
    public static final String a(wx7 wx7Var) {
        BigInteger o;
        String bigInteger;
        String p0;
        zq3.h(wx7Var, "<this>");
        z51 z51Var = wx7Var instanceof z51 ? (z51) wx7Var : null;
        return (z51Var == null || (o = z51Var.o()) == null || (bigInteger = o.toString(16)) == null || (p0 = h.p0(bigInteger, 32, '0')) == null) ? "" : p0;
    }
}
