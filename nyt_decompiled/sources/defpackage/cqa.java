package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class cqa {
    private final Map a = new HashMap();
    private final eqa b;

    public cqa(eqa eqaVar) {
        this.b = eqaVar;
    }

    public final eqa a() {
        return this.b;
    }

    public final void b(String str, bqa bqaVar) {
        this.a.put(str, bqaVar);
    }

    public final void c(String str, String str2, long j) {
        bqa bqaVar = (bqa) this.a.get(str2);
        String[] strArr = {str};
        if (bqaVar != null) {
            this.b.e(bqaVar, j, strArr);
        }
        this.a.put(str, new bqa(j, null, null));
    }
}
