package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.sy4;
import defpackage.tw7;
import defpackage.x08;
import java.util.Collection;

/* loaded from: classes.dex */
abstract /* synthetic */ class b0 {
    public static final SnapshotStateList a() {
        return new SnapshotStateList();
    }

    public static final SnapshotStateList b(Object... objArr) {
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(kotlin.collections.d.C0(objArr));
        return snapshotStateList;
    }

    public static final androidx.compose.runtime.snapshots.k c() {
        return new androidx.compose.runtime.snapshots.k();
    }

    public static final sy4 d(Object obj, tw7 tw7Var) {
        return ActualAndroid_androidKt.d(obj, tw7Var);
    }

    public static /* synthetic */ sy4 e(Object obj, tw7 tw7Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            tw7Var = y.q();
        }
        return y.i(obj, tw7Var);
    }

    public static final x08 f(Object obj, Composer composer, int i) {
        composer.z(-1058319986);
        if (b.G()) {
            b.S(-1058319986, i, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:303)");
        }
        composer.z(-492369756);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = e(obj, null, 2, null);
            composer.q(A);
        }
        composer.R();
        sy4 sy4Var = (sy4) A;
        sy4Var.setValue(obj);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return sy4Var;
    }

    public static final SnapshotStateList g(Collection collection) {
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }
}
