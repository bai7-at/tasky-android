package defpackage;

import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ep0 implements h84 {
    private final h84[] a;

    public ep0(h84... h84VarArr) {
        zq3.h(h84VarArr, "handlers");
        this.a = h84VarArr;
    }

    @Override // defpackage.h84
    public void a(int i, String str, Throwable th, Map map, Set set, Long l) {
        zq3.h(str, "message");
        zq3.h(map, "attributes");
        zq3.h(set, "tags");
        for (h84 h84Var : this.a) {
            h84Var.a(i, str, th, map, set, l);
        }
    }
}
