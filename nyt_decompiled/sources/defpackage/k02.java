package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.m62;

/* loaded from: classes2.dex */
public final class k02 implements m62 {
    public static final k02 c = new k02();

    private k02() {
    }

    @Override // defpackage.m62
    public m62 a(m62.c cVar) {
        zq3.h(cVar, TransferTable.COLUMN_KEY);
        return this;
    }

    @Override // defpackage.m62
    public m62.b b(m62.c cVar) {
        zq3.h(cVar, TransferTable.COLUMN_KEY);
        return null;
    }

    @Override // defpackage.m62
    public m62 c(m62 m62Var) {
        zq3.h(m62Var, "context");
        return m62Var;
    }

    @Override // defpackage.m62
    public Object fold(Object obj, gt2 gt2Var) {
        zq3.h(gt2Var, "operation");
        return obj;
    }
}
