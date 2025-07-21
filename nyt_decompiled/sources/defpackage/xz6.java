package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class xz6 {
    private final List a = new ArrayList();

    private static final class a {
        private final Class a;
        final wz6 b;

        a(Class cls, wz6 wz6Var) {
            this.a = cls;
            this.b = wz6Var;
        }

        boolean a(Class cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, wz6 wz6Var) {
        this.a.add(new a(cls, wz6Var));
    }

    public synchronized wz6 b(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.a.get(i);
            if (aVar.a(cls)) {
                return aVar.b;
            }
        }
        return null;
    }
}
