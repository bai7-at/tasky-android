package defpackage;

import com.nytimes.android.analytics.event.values.EnabledOrDisabled;

/* loaded from: classes3.dex */
public final class jq {
    private final jc a;

    public jq(jc jcVar) {
        zq3.h(jcVar, "analyticsClient");
        this.a = jcVar;
    }

    public final void a(String str, String str2, String str3, EnabledOrDisabled enabledOrDisabled) {
        b(str, str2, str3, enabledOrDisabled, null, null, null, null, null);
    }

    public final void b(String str, String str2, String str3, EnabledOrDisabled enabledOrDisabled, Long l, String str4, String str5, h90 h90Var, Integer num) {
        this.a.n(str2, str3 == null ? "" : str3, str, l != null ? l.toString() : null, enabledOrDisabled, num, str4, str5, h90Var != null ? h90Var.d() : null, h90Var != null ? h90Var.c() : null, h90Var != null ? h90Var.b() : null);
    }
}
