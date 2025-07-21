package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class wpd implements fqd {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;

    wpd(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3, String str2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = str2;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) pla.c().a(mpa.B3));
        bundle.putInt("target_api", this.e);
        bundle.putInt("dv", this.f);
        bundle.putInt("lv", this.g);
        if (((Boolean) pla.c().a(mpa.V5)).booleanValue() && !TextUtils.isEmpty(this.h)) {
            bundle.putString("ev", this.h);
        }
        Bundle a = f2e.a(bundle, "sdk_env");
        a.putBoolean("mf", ((Boolean) vra.a.e()).booleanValue());
        a.putBoolean("instant_app", this.a);
        a.putBoolean("lite", this.b);
        a.putBoolean("is_privileged_process", this.d);
        bundle.putBundle("sdk_env", a);
        Bundle a2 = f2e.a(a, "build_meta");
        a2.putString("cl", "610756093");
        a2.putString("rapid_rc", "dev");
        a2.putString("rapid_rollup", "HEAD");
        a.putBundle("build_meta", a2);
    }
}
