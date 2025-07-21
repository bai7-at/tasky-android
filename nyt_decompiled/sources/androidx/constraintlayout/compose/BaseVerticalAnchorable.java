package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.c;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.bu1;
import defpackage.g59;
import defpackage.ss2;
import defpackage.u08;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseVerticalAnchorable implements g59 {
    private final List a;
    private final int b;

    public BaseVerticalAnchorable(List list, int i) {
        zq3.h(list, "tasks");
        this.a = list;
        this.b = i;
    }

    @Override // defpackage.g59
    public final void a(final c.C0069c c0069c, final float f, final float f2) {
        zq3.h(c0069c, "anchor");
        this.a.add(new ss2() { // from class: androidx.constraintlayout.compose.BaseVerticalAnchorable$linkTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(u08 u08Var) {
                int i;
                zq3.h(u08Var, TransferTable.COLUMN_STATE);
                LayoutDirection m = u08Var.m();
                AnchorFunctions anchorFunctions = AnchorFunctions.a;
                i = BaseVerticalAnchorable.this.b;
                int g = anchorFunctions.g(i, m);
                int g2 = anchorFunctions.g(c0069c.b(), m);
                ((androidx.constraintlayout.core.state.a) anchorFunctions.f()[g][g2].invoke(BaseVerticalAnchorable.this.c(u08Var), c0069c.a(), u08Var.m())).u(bu1.d(f)).w(bu1.d(f2));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((u08) obj);
                return ww8.a;
            }
        });
    }

    public abstract androidx.constraintlayout.core.state.a c(u08 u08Var);
}
