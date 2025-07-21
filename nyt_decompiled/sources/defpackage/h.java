package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.c;

/* loaded from: classes5.dex */
public abstract class h {
    public static final void a(we2 we2Var, jp5 jp5Var, boolean z) {
        zq3.h(we2Var, "<this>");
        zq3.h(jp5Var, "dir");
        c cVar = new c();
        for (jp5 jp5Var2 = jp5Var; jp5Var2 != null && !we2Var.j(jp5Var2); jp5Var2 = jp5Var2.i()) {
            cVar.addFirst(jp5Var2);
        }
        if (z && cVar.isEmpty()) {
            throw new IOException(jp5Var + " already exists.");
        }
        Iterator<E> it2 = cVar.iterator();
        while (it2.hasNext()) {
            we2Var.f((jp5) it2.next());
        }
    }

    public static final boolean b(we2 we2Var, jp5 jp5Var) {
        zq3.h(we2Var, "<this>");
        zq3.h(jp5Var, "path");
        return we2Var.m(jp5Var) != null;
    }

    public static final ne2 c(we2 we2Var, jp5 jp5Var) {
        zq3.h(we2Var, "<this>");
        zq3.h(jp5Var, "path");
        ne2 m = we2Var.m(jp5Var);
        if (m != null) {
            return m;
        }
        throw new FileNotFoundException("no such file: " + jp5Var);
    }
}
