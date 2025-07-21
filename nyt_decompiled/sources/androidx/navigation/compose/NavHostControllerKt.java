package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.y;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavController;
import androidx.navigation.Navigator;
import defpackage.ea7;
import defpackage.fa7;
import defpackage.gt2;
import defpackage.n25;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.x08;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class NavHostControllerKt {
    private static final ea7 a(final Context context) {
        return SaverKt.a(new gt2() { // from class: androidx.navigation.compose.NavHostControllerKt$NavControllerSaver$1
            @Override // defpackage.gt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Bundle invoke(fa7 fa7Var, n25 n25Var) {
                return n25Var.k0();
            }
        }, new ss2() { // from class: androidx.navigation.compose.NavHostControllerKt$NavControllerSaver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n25 invoke(Bundle bundle) {
                n25 c;
                c = NavHostControllerKt.c(context);
                c.i0(bundle);
                return c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n25 c(Context context) {
        n25 n25Var = new n25(context);
        n25Var.I().b(new a(n25Var.I()));
        n25Var.I().b(new b());
        n25Var.I().b(new c());
        return n25Var;
    }

    public static final x08 d(NavController navController, Composer composer, int i) {
        composer.z(-120375203);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-120375203, i, -1, "androidx.navigation.compose.currentBackStackEntryAsState (NavHostController.kt:41)");
        }
        x08 a = y.a(navController.D(), null, null, composer, 56, 2);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return a;
    }

    public static final n25 e(Navigator[] navigatorArr, Composer composer, int i) {
        composer.z(-312215566);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-312215566, i, -1, "androidx.navigation.compose.rememberNavController (NavHostController.kt:57)");
        }
        final Context context = (Context) composer.m(AndroidCompositionLocals_androidKt.g());
        n25 n25Var = (n25) RememberSaveableKt.b(Arrays.copyOf(navigatorArr, navigatorArr.length), a(context), null, new qs2() { // from class: androidx.navigation.compose.NavHostControllerKt$rememberNavController$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n25 mo865invoke() {
                n25 c;
                c = NavHostControllerKt.c(context);
                return c;
            }
        }, composer, 72, 4);
        for (Navigator navigator : navigatorArr) {
            n25Var.I().b(navigator);
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return n25Var;
    }
}
