package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.n;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ok6;

/* loaded from: classes.dex */
public abstract class o {
    public static final String a(int i, Composer composer, int i2) {
        composer.z(-726638443);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-726638443, i2, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        composer.m(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) composer.m(AndroidCompositionLocals_androidKt.g())).getResources();
        n.a aVar = n.a;
        String string = n.i(i, aVar.e()) ? resources.getString(ok6.navigation_menu) : n.i(i, aVar.a()) ? resources.getString(ok6.close_drawer) : n.i(i, aVar.b()) ? resources.getString(ok6.close_sheet) : n.i(i, aVar.c()) ? resources.getString(ok6.default_error_message) : n.i(i, aVar.d()) ? resources.getString(ok6.dropdown_menu) : n.i(i, aVar.g()) ? resources.getString(ok6.range_start) : n.i(i, aVar.f()) ? resources.getString(ok6.range_end) : "";
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return string;
    }
}
