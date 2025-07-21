package androidx.constraintlayout.compose;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.u08;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes.dex */
final class f extends BaseVerticalAnchorable {
    private final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Object obj, int i, List list) {
        super(list, i);
        zq3.h(obj, "id");
        zq3.h(list, "tasks");
        this.c = obj;
    }

    @Override // androidx.constraintlayout.compose.BaseVerticalAnchorable
    public androidx.constraintlayout.core.state.a c(u08 u08Var) {
        zq3.h(u08Var, TransferTable.COLUMN_STATE);
        androidx.constraintlayout.core.state.a b = u08Var.b(this.c);
        zq3.g(b, "state.constraints(id)");
        return b;
    }
}
