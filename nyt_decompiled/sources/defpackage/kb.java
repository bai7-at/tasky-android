package defpackage;

import androidx.activity.ComponentActivity;
import com.nytimes.android.growthui.common.models.DataConfigId;
import defpackage.k43;
import java.util.Locale;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class kb implements cy3 {
    private final k43 a;
    private final String b;

    public kb(DataConfigId dataConfigId, k43 k43Var) {
        zq3.h(dataConfigId, "dataConfigId");
        zq3.h(k43Var, "analytics");
        this.a = k43Var;
        this.b = l43.a(dataConfigId);
    }

    @Override // defpackage.cy3
    public void a() {
        k43.a.b(this.a, "login", "login on plp", null, "link", "button", "tap", null, 68, null);
    }

    @Override // defpackage.cy3
    public void b(f46 f46Var) {
        zq3.h(f46Var, "tab");
    }

    @Override // defpackage.cy3
    public void c(zc5 zc5Var, f46 f46Var) {
        String F;
        zq3.h(zc5Var, "offer");
        if (h.I(ob8.b(zc5Var.d().a()), "month", true)) {
            F = "monthly";
        } else {
            String lowerCase = ob8.b(zc5Var.d().a()).toLowerCase(Locale.ROOT);
            zq3.g(lowerCase, "toLowerCase(...)");
            F = h.F(lowerCase, "year", "annual", false, 4, null);
        }
        k43 k43Var = this.a;
        String str = this.b;
        k43.a.b(k43Var, str, h.c1(str + " " + F).toString(), null, "button", null, "tap", null, 84, null);
    }

    @Override // defpackage.cy3
    public void d(f46 f46Var) {
        zq3.h(f46Var, "tab");
    }

    @Override // defpackage.cy3
    public void e(n73 n73Var, f46 f46Var) {
        zq3.h(n73Var, "header");
        k43.a.a(this.a, "aa header", n73Var.a(), null, null, 12, null);
        k43.a.a(this.a, "aa subheader", n73Var.c(), null, null, 12, null);
    }

    @Override // defpackage.cy3
    public void f(ComponentActivity componentActivity, boolean z) {
        zq3.h(componentActivity, "activity");
        this.a.a(componentActivity, e44.a(componentActivity), "product landing page", "subscriptions");
        k43.a.a(this.a, "ada", "product landing page", null, null, 12, null);
    }
}
