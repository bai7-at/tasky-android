package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class dr5 {
    public final String a;
    public final long b;
    public final List c;
    public final List d;
    public final xm1 e;

    public dr5(String str, long j, List list, List list2) {
        this(str, j, list, list2, null);
    }

    public int a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((f8) this.c.get(i2)).b == i) {
                return i2;
            }
        }
        return -1;
    }

    public dr5(String str, long j, List list, List list2, xm1 xm1Var) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = xm1Var;
    }
}
