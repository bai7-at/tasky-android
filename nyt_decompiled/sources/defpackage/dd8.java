package defpackage;

import okio.ByteString;

/* loaded from: classes.dex */
public abstract class dd8 {
    private static final ByteString a;
    private static final ByteString b;

    static {
        ByteString.a aVar = ByteString.c;
        a = aVar.d("<svg");
        b = aVar.d("<");
    }

    public static final boolean a(tc1 tc1Var, sd0 sd0Var) {
        return sd0Var.W(0L, b) && r.a(sd0Var, a, 0L, 1024L) != -1;
    }
}
