package defpackage;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.skydoves.balloon.Balloon;

/* loaded from: classes4.dex */
public abstract class mv6 {
    public static final Balloon.a a(Object obj, Context context, ss2 ss2Var, Composer composer, int i, int i2) {
        zq3.h(ss2Var, "block");
        composer.z(1887512655);
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            context = (Context) composer.m(AndroidCompositionLocals_androidKt.g());
        }
        if (b.G()) {
            b.S(1887512655, i, -1, "com.skydoves.balloon.compose.rememberBalloonBuilder (RememberBalloonBuilder.kt:42)");
        }
        composer.z(1157296644);
        boolean S = composer.S(obj);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new Balloon.a(context);
            ss2Var.invoke(A);
            composer.q(A);
        }
        composer.R();
        Balloon.a aVar = (Balloon.a) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return aVar;
    }
}
