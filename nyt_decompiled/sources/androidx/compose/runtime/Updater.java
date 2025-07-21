package androidx.compose.runtime;

import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class Updater {
    public static Composer a(Composer composer) {
        return composer;
    }

    public static final void b(Composer composer, final ss2 ss2Var) {
        if (composer.f()) {
            composer.v(ww8.a, new gt2() { // from class: androidx.compose.runtime.Updater$init$1
                {
                    super(2);
                }

                public final void b(Object obj, ww8 ww8Var) {
                    ss2.this.invoke(obj);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    b(obj, (ww8) obj2);
                    return ww8.a;
                }
            });
        }
    }

    public static final void c(Composer composer, Object obj, gt2 gt2Var) {
        if (composer.f() || !zq3.c(composer.A(), obj)) {
            composer.q(obj);
            composer.v(obj, gt2Var);
        }
    }
}
