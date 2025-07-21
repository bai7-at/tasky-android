package defpackage;

import androidx.activity.OnBackPressedDispatcher;

/* loaded from: classes.dex */
public abstract class ee5 {

    public static final class a extends ce5 {
        final /* synthetic */ ss2 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, ss2 ss2Var) {
            super(z);
            this.a = ss2Var;
        }

        @Override // defpackage.ce5
        public void handleOnBackPressed() {
            this.a.invoke(this);
        }
    }

    public static final ce5 a(OnBackPressedDispatcher onBackPressedDispatcher, d44 d44Var, boolean z, ss2 ss2Var) {
        zq3.h(onBackPressedDispatcher, "<this>");
        zq3.h(ss2Var, "onBackPressed");
        a aVar = new a(z, ss2Var);
        if (d44Var != null) {
            onBackPressedDispatcher.h(d44Var, aVar);
        } else {
            onBackPressedDispatcher.i(aVar);
        }
        return aVar;
    }

    public static /* synthetic */ ce5 b(OnBackPressedDispatcher onBackPressedDispatcher, d44 d44Var, boolean z, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            d44Var = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return a(onBackPressedDispatcher, d44Var, z, ss2Var);
    }
}
