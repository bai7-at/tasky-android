package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.nytimes.android.growthui.common.models.DataConfigId;
import defpackage.k43;

/* loaded from: classes4.dex */
public final class hu6 implements cu6 {
    private final k43 a;
    private final String b;

    public hu6(DataConfigId dataConfigId, k43 k43Var) {
        zq3.h(dataConfigId, "dataConfigId");
        zq3.h(k43Var, "analytics");
        this.a = k43Var;
        this.b = l43.a(dataConfigId);
    }

    @Override // defpackage.cu6
    public void a() {
        k43.a.b(this.a, this.b, "and_SUBSCRIBE_CORE_HAWKEYE", "dismissible regi bundle", null, "Log In", null, null, 104, null);
    }

    @Override // defpackage.cu6
    public void b() {
        k43.a.b(this.a, this.b, "and_SUBSCRIBE_CORE_HAWKEYE", "dismissible regi bundle", null, "See subscription options", null, null, 104, null);
    }

    @Override // defpackage.cu6
    public void c(Fragment fragment) {
        zq3.h(fragment, "fragment");
        k43 k43Var = this.a;
        Context requireContext = fragment.requireContext();
        zq3.g(requireContext, "requireContext(...)");
        k43Var.a(requireContext, e44.a(fragment), this.b, "subscriptions");
    }

    @Override // defpackage.cu6
    public void d() {
        k43.a.a(this.a, this.b, "dismissible regi bundle", null, null, 12, null);
        k43.a.a(this.a, this.b, "and_SUBSCRIBE_CORE_HAWKEYE", "dismissible regi bundle", null, 8, null);
    }

    @Override // defpackage.cu6
    public void e() {
        k43.a.b(this.a, this.b, "and_SUBSCRIBE_CORE_HAWKEYE", "dismissible regi bundle", null, "Create a free account", null, null, 104, null);
    }
}
