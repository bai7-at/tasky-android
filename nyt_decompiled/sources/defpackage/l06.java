package defpackage;

import androidx.activity.ComponentActivity;
import com.nytimes.android.growthui.common.models.DataConfigId;
import defpackage.k43;

/* loaded from: classes4.dex */
public final class l06 implements i06 {
    private final k43 a;
    private final String b;

    public l06(DataConfigId dataConfigId, k43 k43Var) {
        zq3.h(dataConfigId, "dataConfigId");
        zq3.h(k43Var, "analytics");
        this.a = k43Var;
        this.b = l43.a(dataConfigId);
    }

    private final void f() {
        k43 k43Var = this.a;
        String str = this.b;
        k43.a.a(k43Var, str, null, "error state", str + " page", 2, null);
    }

    private final void g() {
        k43 k43Var = this.a;
        String str = this.b;
        k43.a.a(k43Var, str, null, "success state", str + " page", 2, null);
    }

    @Override // defpackage.i06
    public void a(ComponentActivity componentActivity) {
        zq3.h(componentActivity, "activity");
        this.a.a(componentActivity, e44.a(componentActivity), this.b, "subscriptions");
    }

    @Override // defpackage.i06
    public void b() {
        k43 k43Var = this.a;
        String str = this.b;
        k43.a.b(k43Var, str, null, "learn more", "drop down", null, "tap", str + " page", 18, null);
    }

    @Override // defpackage.i06
    public void c() {
        k43 k43Var = this.a;
        String str = this.b;
        k43.a.b(k43Var, str, null, "continue without subscribing", "button", null, "tap", str + " page", 18, null);
    }

    @Override // defpackage.i06
    public void d() {
        k43 k43Var = this.a;
        String str = this.b;
        k43.a.b(k43Var, str, null, "subscribe now", "button", null, "tap", str + " page", 18, null);
    }

    @Override // defpackage.i06
    public void e(boolean z) {
        if (z) {
            f();
        } else {
            g();
        }
    }
}
