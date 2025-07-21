package defpackage;

import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
final class ed7 implements ct4 {
    private static final Logger d = Logger.getLogger(ed7.class.getName());
    private static final Pattern e = Pattern.compile("([A-Za-z]){1}([A-Za-z0-9\\_\\-\\./]){0,254}");
    private static final ct4 f = et4.a().get("noop");
    private final lm3 a;
    private final ft4 b;
    private final nt4 c;

    ed7(ft4 ft4Var, lm3 lm3Var, List list) {
        this.a = lm3Var;
        this.b = ft4Var;
        this.c = nt4.b(lm3Var, list);
    }

    public String toString() {
        return "SdkMeter{instrumentationScopeInfo=" + this.a + "}";
    }
}
