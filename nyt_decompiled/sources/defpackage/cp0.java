package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.m62;

/* loaded from: classes2.dex */
public final class cp0 implements m62 {
    private final m62 c;
    private final m62.b d;

    public cp0(m62 m62Var, m62.b bVar) {
        zq3.h(m62Var, "left");
        zq3.h(bVar, "element");
        this.c = m62Var;
        this.d = bVar;
    }

    @Override // defpackage.m62
    public m62 a(m62.c cVar) {
        zq3.h(cVar, TransferTable.COLUMN_KEY);
        if (this.d.b(cVar) != null) {
            return this.c;
        }
        m62 a = this.c.a(cVar);
        return a == this.c ? this : a == k02.c ? this.d : new cp0(a, this.d);
    }

    @Override // defpackage.m62
    public m62.b b(m62.c cVar) {
        zq3.h(cVar, TransferTable.COLUMN_KEY);
        while (true) {
            m62.b b = this.d.b(cVar);
            if (b != null) {
                return b;
            }
            m62 m62Var = this.c;
            if (!(m62Var instanceof cp0)) {
                return m62Var.b(cVar);
            }
            this = (cp0) m62Var;
        }
    }

    @Override // defpackage.m62
    public Object fold(Object obj, gt2 gt2Var) {
        zq3.h(gt2Var, "operation");
        return gt2Var.invoke(this.c.fold(obj, gt2Var), this.d);
    }
}
