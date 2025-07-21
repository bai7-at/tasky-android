package androidx.compose.runtime;

import defpackage.pm1;
import defpackage.qs2;
import defpackage.tw7;
import defpackage.vy4;
import defpackage.ww7;
import defpackage.x08;

/* loaded from: classes.dex */
abstract /* synthetic */ class z {
    private static final ww7 a = new ww7();
    private static final ww7 b = new ww7();

    public static final vy4 b() {
        ww7 ww7Var = b;
        vy4 vy4Var = (vy4) ww7Var.a();
        if (vy4Var != null) {
            return vy4Var;
        }
        vy4 vy4Var2 = new vy4(new pm1[0], 0);
        ww7Var.b(vy4Var2);
        return vy4Var2;
    }

    public static final x08 c(qs2 qs2Var) {
        return new DerivedSnapshotState(qs2Var, null);
    }

    public static final x08 d(tw7 tw7Var, qs2 qs2Var) {
        return new DerivedSnapshotState(qs2Var, tw7Var);
    }
}
