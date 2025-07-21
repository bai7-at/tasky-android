package defpackage;

import android.content.Context;
import androidx.lifecycle.u;
import androidx.navigation.NavController;

/* loaded from: classes.dex */
public class n25 extends NavController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n25(Context context) {
        super(context);
        zq3.h(context, "context");
    }

    @Override // androidx.navigation.NavController
    public final void n0(d44 d44Var) {
        zq3.h(d44Var, "owner");
        super.n0(d44Var);
    }

    @Override // androidx.navigation.NavController
    public final void o0(u uVar) {
        zq3.h(uVar, "viewModelStore");
        super.o0(uVar);
    }
}
