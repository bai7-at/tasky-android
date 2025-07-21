package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class f8 {
    public final long a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public f8(long j, int i, List list, List list2, List list3, List list4) {
        this.a = j;
        this.b = i;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = Collections.unmodifiableList(list3);
        this.f = Collections.unmodifiableList(list4);
    }
}
