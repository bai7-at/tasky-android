package defpackage;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
abstract class q74 {
    private static m74 a(m74 m74Var, m74 m74Var2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < m74Var.f() + m74Var2.f()) {
            Locale c = i < m74Var.f() ? m74Var.c(i) : m74Var2.c(i - m74Var.f());
            if (c != null) {
                linkedHashSet.add(c);
            }
            i++;
        }
        return m74.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static m74 b(m74 m74Var, m74 m74Var2) {
        return (m74Var == null || m74Var.e()) ? m74.d() : a(m74Var, m74Var2);
    }
}
