package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.c;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.bu1;
import defpackage.ca3;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.u08;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseHorizontalAnchorable implements ca3 {
    private final List a;
    private final int b;

    public BaseHorizontalAnchorable(List list, int i) {
        zq3.h(list, "tasks");
        this.a = list;
        this.b = i;
    }

    @Override // defpackage.ca3
    public final void a(final c.b bVar, final float f, final float f2) {
        zq3.h(bVar, "anchor");
        this.a.add(new ss2() { // from class: androidx.constraintlayout.compose.BaseHorizontalAnchorable$linkTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(u08 u08Var) {
                int i;
                zq3.h(u08Var, TransferTable.COLUMN_STATE);
                androidx.constraintlayout.core.state.a c = BaseHorizontalAnchorable.this.c(u08Var);
                BaseHorizontalAnchorable baseHorizontalAnchorable = BaseHorizontalAnchorable.this;
                c.b bVar2 = bVar;
                float f3 = f;
                float f4 = f2;
                gt2[][] e = AnchorFunctions.a.e();
                i = baseHorizontalAnchorable.b;
                ((androidx.constraintlayout.core.state.a) e[i][bVar2.b()].invoke(c, bVar2.a())).u(bu1.d(f3)).w(bu1.d(f4));
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
