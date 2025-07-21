package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public interface kk9 {
    List a(String str);

    void b(jk9 jk9Var);

    default void c(String str, Set set) {
        zq3.h(str, "id");
        zq3.h(set, "tags");
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            b(new jk9((String) it2.next(), str));
        }
    }
}
