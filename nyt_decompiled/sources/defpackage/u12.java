package defpackage;

import com.nytimes.android.entitlements.ECommClientImpl;
import com.nytimes.android.entitlements.ReAuthLauncherImpl;
import com.nytimes.android.entitlements.a;

/* loaded from: classes4.dex */
public final class u12 {
    public static final u12 a = new u12();

    private u12() {
    }

    public final a a(ex1 ex1Var) {
        zq3.h(ex1Var, "eCommClientParam");
        return new ECommClientImpl(ex1Var);
    }

    public final fp6 b(z58 z58Var, id9 id9Var) {
        zq3.h(z58Var, "subauthClient");
        zq3.h(id9Var, "webActivityNavigator");
        return new ReAuthLauncherImpl(z58Var, id9Var);
    }
}
