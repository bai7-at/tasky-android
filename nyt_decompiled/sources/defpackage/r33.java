package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
abstract class r33 {
    static gr3 a(Collection collection, int i) {
        Iterator it2 = collection.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            n33 n33Var = (n33) it2.next();
            int a = n33Var.a() + i2;
            if (a > i) {
                return n33Var.getItem(i - i2);
            }
            i2 = a;
        }
        throw new IndexOutOfBoundsException("Wanted item at " + i + " but there are only " + i2 + " items");
    }

    static int b(Collection collection) {
        Iterator it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += ((n33) it2.next()).a();
        }
        return i;
    }
}
