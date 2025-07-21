package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.m62;

/* loaded from: classes2.dex */
public interface m62 {
    public static final a a = a.a;
    public static final m62 b = k02.c;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    public interface b extends m62 {
        @Override // defpackage.m62
        default m62 a(c cVar) {
            zq3.h(cVar, TransferTable.COLUMN_KEY);
            return zq3.c(getKey(), cVar) ? k02.c : this;
        }

        @Override // defpackage.m62
        default b b(c cVar) {
            zq3.h(cVar, TransferTable.COLUMN_KEY);
            if (!zq3.c(getKey(), cVar)) {
                return null;
            }
            zq3.f(this, "null cannot be cast to non-null type E of com.apollographql.apollo.api.ExecutionContext.Element.get");
            return this;
        }

        @Override // defpackage.m62
        default Object fold(Object obj, gt2 gt2Var) {
            zq3.h(gt2Var, "operation");
            return gt2Var.invoke(obj, this);
        }

        c getKey();
    }

    public interface c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static m62 d(m62 m62Var, b bVar) {
        zq3.h(m62Var, "acc");
        zq3.h(bVar, "element");
        m62 a2 = m62Var.a(bVar.getKey());
        return a2 == k02.c ? bVar : new cp0(a2, bVar);
    }

    m62 a(c cVar);

    b b(c cVar);

    default m62 c(m62 m62Var) {
        zq3.h(m62Var, "context");
        return m62Var == k02.c ? this : (m62) m62Var.fold(this, new gt2() { // from class: l62
            @Override // defpackage.gt2
            public final Object invoke(Object obj, Object obj2) {
                m62 d;
                d = m62.d((m62) obj, (m62.b) obj2);
                return d;
            }
        });
    }

    Object fold(Object obj, gt2 gt2Var);
}
