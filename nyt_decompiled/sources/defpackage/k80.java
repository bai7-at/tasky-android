package defpackage;

import android.view.View;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class k80 extends gr3 {
    public abstract void A(f99 f99Var, int i);

    public void B(f99 f99Var, int i, List list) {
        A(f99Var, i);
    }

    @Override // defpackage.gr3
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public u33 l(View view) {
        return new u33(D(view));
    }

    protected abstract f99 D(View view);

    @Override // defpackage.gr3
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void j(u33 u33Var, int i, List list) {
        B(u33Var.L, i, list);
    }
}
