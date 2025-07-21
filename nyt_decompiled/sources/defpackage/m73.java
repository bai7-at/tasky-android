package defpackage;

import defpackage.qa3;
import java.util.Map;

/* loaded from: classes2.dex */
public class m73 implements qa3.d {
    @Override // qa3.d
    public void a(z51 z51Var, fj8 fj8Var) {
        fj8Var.put("Trace-ID", z51Var.o().toString());
        fj8Var.put("Span-ID", z51Var.l().toString());
        fj8Var.put("Parent_ID", z51Var.h().toString());
        for (Map.Entry entry : z51Var.b()) {
            fj8Var.put("Baggage-" + ((String) entry.getKey()), qa3.d((String) entry.getValue()));
        }
    }
}
