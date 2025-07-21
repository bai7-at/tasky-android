package defpackage;

import androidx.activity.ComponentActivity;
import com.nytimes.android.growthui.common.models.DataConfigId;
import defpackage.k43;
import java.util.Locale;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class dv2 implements cy3 {
    private final k43 a;
    private final String b;

    public dv2(DataConfigId dataConfigId, k43 k43Var) {
        zq3.h(dataConfigId, "dataConfigId");
        zq3.h(k43Var, "analytics");
        this.a = k43Var;
        this.b = l43.a(dataConfigId);
    }

    private final void g() {
        k43.a.a(this.a, "wordlebot paywall", "lp as paywall", null, "paywall", 4, null);
    }

    @Override // defpackage.cy3
    public void a() {
        k43.a.b(this.a, this.b, "login", null, null, null, null, null, 124, null);
    }

    @Override // defpackage.cy3
    public void b(f46 f46Var) {
        zq3.h(f46Var, "tab");
        k43.a.a(this.a, this.b, "plp " + h46.a(f46Var), null, null, 12, null);
    }

    @Override // defpackage.cy3
    public void c(zc5 zc5Var, f46 f46Var) {
        String F;
        String str;
        zq3.h(zc5Var, "offer");
        if (h.I(ob8.b(zc5Var.d().a()), "month", true)) {
            F = "monthly";
        } else {
            String lowerCase = ob8.b(zc5Var.d().a()).toLowerCase(Locale.ROOT);
            zq3.g(lowerCase, "toLowerCase(...)");
            F = h.F(lowerCase, "year", "annual", false, 4, null);
        }
        k43 k43Var = this.a;
        String str2 = this.b;
        if (f46Var == null || (str = h46.a(f46Var)) == null) {
            str = "";
        }
        k43.a.b(k43Var, str2, h.c1(str + " " + F).toString(), null, null, null, null, null, 124, null);
    }

    @Override // defpackage.cy3
    public void d(f46 f46Var) {
        zq3.h(f46Var, "tab");
        k43.a.b(this.a, this.b, h46.a(f46Var) + " tab", null, null, null, null, null, 124, null);
    }

    @Override // defpackage.cy3
    public void e(n73 n73Var, f46 f46Var) {
        String str;
        String b;
        zq3.h(n73Var, "header");
        k43 k43Var = this.a;
        String str2 = this.b;
        String str3 = "";
        if (f46Var == null || (str = h46.b(f46Var)) == null) {
            str = "";
        }
        k43.a.a(k43Var, str2 + " " + str + " header", n73Var.a(), null, null, 12, null);
        k43 k43Var2 = this.a;
        String str4 = this.b;
        if (f46Var != null && (b = h46.b(f46Var)) != null) {
            str3 = b;
        }
        k43.a.a(k43Var2, str4 + " " + str3 + " subheader", n73Var.c(), null, null, 12, null);
    }

    @Override // defpackage.cy3
    public void f(ComponentActivity componentActivity, boolean z) {
        zq3.h(componentActivity, "activity");
        this.a.a(componentActivity, e44.a(componentActivity), this.b, "subscriptions");
        if (z) {
            g();
        }
    }
}
