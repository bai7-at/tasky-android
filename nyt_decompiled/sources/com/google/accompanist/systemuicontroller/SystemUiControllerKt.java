package com.google.accompanist.systemuicontroller;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.fq1;
import defpackage.lg;
import defpackage.nn0;
import defpackage.ss2;
import defpackage.ve8;
import defpackage.wn0;
import defpackage.zq3;

/* loaded from: classes2.dex */
public abstract class SystemUiControllerKt {
    private static final long a = wn0.e(0.0f, 0.0f, 0.0f, 0.3f, null, 16, null);
    private static final ss2 b = new ss2() { // from class: com.google.accompanist.systemuicontroller.SystemUiControllerKt$BlackScrimmed$1
        public final long b(long j) {
            long j2;
            j2 = SystemUiControllerKt.a;
            return wn0.g(j2, j);
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return nn0.j(b(((nn0) obj).B()));
        }
    };

    private static final Window c(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            zq3.g(context, "baseContext");
        }
        return ((Activity) context).getWindow();
    }

    private static final Window d(Composer composer, int i) {
        composer.z(1009281237);
        if (b.G()) {
            b.S(1009281237, i, -1, "com.google.accompanist.systemuicontroller.findWindow (SystemUiController.kt:191)");
        }
        ViewParent parent = ((View) composer.m(AndroidCompositionLocals_androidKt.k())).getParent();
        fq1 fq1Var = parent instanceof fq1 ? (fq1) parent : null;
        Window window = fq1Var != null ? fq1Var.getWindow() : null;
        if (window == null) {
            Context context = ((View) composer.m(AndroidCompositionLocals_androidKt.k())).getContext();
            zq3.g(context, "LocalView.current.context");
            window = c(context);
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return window;
    }

    public static final ve8 e(Window window, Composer composer, int i, int i2) {
        composer.z(-715745933);
        if ((i2 & 1) != 0) {
            window = d(composer, 0);
        }
        if (b.G()) {
            b.S(-715745933, i, -1, "com.google.accompanist.systemuicontroller.rememberSystemUiController (SystemUiController.kt:183)");
        }
        View view = (View) composer.m(AndroidCompositionLocals_androidKt.k());
        composer.z(511388516);
        boolean S = composer.S(view) | composer.S(window);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new lg(view, window);
            composer.q(A);
        }
        composer.R();
        lg lgVar = (lg) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return lgVar;
    }
}
