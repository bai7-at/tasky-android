package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class j49 {

    public static final class a implements oi {
        private final List a;

        a(mi miVar, float f, float f2) {
            an3 u = uo6.u(0, miVar.b());
            ArrayList arrayList = new ArrayList(i.w(u, 10));
            Iterator it2 = u.iterator();
            while (it2.hasNext()) {
                arrayList.add(new cl2(f, f2, miVar.a(((qm3) it2).c())));
            }
            this.a = arrayList;
        }

        @Override // defpackage.oi
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public cl2 get(int i) {
            return (cl2) this.a.get(i);
        }
    }

    public static final class b implements oi {
        private final cl2 a;

        b(float f, float f2) {
            this.a = new cl2(f, f2, 0.0f, 4, null);
        }

        @Override // defpackage.oi
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public cl2 get(int i) {
            return this.a;
        }
    }

    public static final long b(l49 l49Var, long j) {
        return uo6.o(j - l49Var.c(), 0L, l49Var.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oi c(mi miVar, float f, float f2) {
        return miVar != null ? new a(miVar, f, f2) : new b(f, f2);
    }

    public static final mi d(i49 i49Var, long j, mi miVar, mi miVar2, mi miVar3) {
        return i49Var.g(j * 1000000, miVar, miVar2, miVar3);
    }
}
