package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class e12 {
    private final List a = new ArrayList();

    private static final class a {
        private final Class a;
        final b12 b;

        a(Class cls, b12 b12Var) {
            this.a = cls;
            this.b = b12Var;
        }

        boolean a(Class cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, b12 b12Var) {
        this.a.add(new a(cls, b12Var));
    }

    public synchronized b12 b(Class cls) {
        for (a aVar : this.a) {
            if (aVar.a(cls)) {
                return aVar.b;
            }
        }
        return null;
    }
}
