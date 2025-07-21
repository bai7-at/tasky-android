package defpackage;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import defpackage.qa3;
import java.math.BigInteger;
import java.util.Map;

/* loaded from: classes2.dex */
public class ab1 implements qa3.d {
    private final f80 a;

    public ab1(f80 f80Var) {
        this.a = f80Var;
    }

    @Override // qa3.d
    public void a(z51 z51Var, fj8 fj8Var) {
        BigInteger o = z51Var.o();
        String a = this.a.a(o);
        String c = this.a.c(o);
        fj8Var.put("x-datadog-trace-id", a);
        fj8Var.put("x-datadog-parent-id", z51Var.l().toString());
        String g = z51Var.g();
        if (g != null) {
            fj8Var.put("x-datadog-origin", g);
        }
        for (Map.Entry entry : z51Var.b()) {
            fj8Var.put("ot-baggage-" + ((String) entry.getKey()), qa3.d((String) entry.getValue()));
        }
        fj8Var.put("x-datadog-tags", "_dd.p.tid=" + c);
        fj8Var.put("x-datadog-sampling-priority", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }

    public ab1() {
        this(f80.a);
    }
}
