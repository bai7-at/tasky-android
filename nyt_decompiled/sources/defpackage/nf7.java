package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.nytimes.android.sectionfront.SavedSectionFrontFragment;
import com.nytimes.android.sectionfront.c;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class nf7 {
    private final ss6 a;

    public nf7(ss6 ss6Var) {
        zq3.h(ss6Var, "recentlyViewedNavigator");
        this.a = ss6Var;
    }

    private final boolean a(String str, Context context, int i) {
        return h.w(context.getResources().getString(i), str, true);
    }

    private final Fragment c(String str, String str2, wg7 wg7Var) {
        fz1 fz1Var = new fz1();
        fz1Var.z1(wg7Var);
        return cf7.a(fz1Var, str, str2);
    }

    private final Fragment d(String str, String str2, wg7 wg7Var) {
        c cVar = new c();
        cVar.z1(wg7Var);
        return cf7.a(cVar, str, str2);
    }

    private final Fragment e() {
        return cf7.a(this.a.a(), "recent", "Recently Viewed");
    }

    private final Fragment f(String str, String str2) {
        return cf7.a(new SavedSectionFrontFragment(), str, str2);
    }

    private final boolean g(String str, Context context) {
        return a(str, context, jk6.sectionName_mostEmailed);
    }

    private final boolean h(String str, Context context) {
        return a(str, context, jk6.sectionName_Photo) || a(str, context, jk6.sectionName_Video);
    }

    private final boolean i(String str) {
        return str.contentEquals("recent");
    }

    public final Fragment b(Context context, String str, String str2, wg7 wg7Var) {
        zq3.h(context, "context");
        zq3.h(str, "sectionName");
        zq3.h(str2, "sectionTitle");
        zq3.h(wg7Var, "progressListener");
        return h(str, context) ? d(str, str2, wg7Var) : g(str, context) ? c(str, str2, wg7Var) : c97.c(str) ? f(str, str2) : i(str) ? e() : cf7.b(str, str2, wg7Var);
    }
}
