package androidx.compose.runtime;

import defpackage.gt2;
import defpackage.py1;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.x08;

/* loaded from: classes.dex */
abstract /* synthetic */ class SnapshotStateKt__ProduceStateKt {
    public static final x08 a(Object obj, gt2 gt2Var, Composer composer, int i) {
        composer.z(10454275);
        if (b.G()) {
            b.S(10454275, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        composer.z(-492369756);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = b0.e(obj, null, 2, null);
            composer.q(A);
        }
        composer.R();
        sy4 sy4Var = (sy4) A;
        py1.d(ww8.a, new SnapshotStateKt__ProduceStateKt$produceState$1(gt2Var, sy4Var, null), composer, 70);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return sy4Var;
    }

    public static final x08 b(Object obj, Object obj2, Object obj3, gt2 gt2Var, Composer composer, int i) {
        composer.z(-1703169085);
        if (b.G()) {
            b.S(-1703169085, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        composer.z(-492369756);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = b0.e(obj, null, 2, null);
            composer.q(A);
        }
        composer.R();
        sy4 sy4Var = (sy4) A;
        py1.e(obj2, obj3, new SnapshotStateKt__ProduceStateKt$produceState$3(gt2Var, sy4Var, null), composer, 584);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return sy4Var;
    }
}
