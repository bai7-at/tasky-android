package defpackage;

import defpackage.t91;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class u91 {
    private static final t91.a b = new a();
    private final Map a = new HashMap();

    class a implements t91.a {
        a() {
        }

        @Override // t91.a
        public Class a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // t91.a
        public t91 b(Object obj) {
            return new b(obj);
        }
    }

    private static final class b implements t91 {
        private final Object a;

        b(Object obj) {
            this.a = obj;
        }

        @Override // defpackage.t91
        public Object a() {
            return this.a;
        }

        @Override // defpackage.t91
        public void b() {
        }
    }

    public synchronized t91 a(Object obj) {
        t91.a aVar;
        try {
            z06.d(obj);
            aVar = (t91.a) this.a.get(obj.getClass());
            if (aVar == null) {
                Iterator it2 = this.a.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    t91.a aVar2 = (t91.a) it2.next();
                    if (aVar2.a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar.b(obj);
    }

    public synchronized void b(t91.a aVar) {
        this.a.put(aVar.a(), aVar);
    }
}
