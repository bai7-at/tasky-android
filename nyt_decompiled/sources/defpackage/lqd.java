package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class lqd implements fqd {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final ArrayList h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final String m;
    public final long n;
    public final boolean o;
    public final String p;
    public final int q;

    public lqd(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z6, String str6, long j, boolean z7, String str7, int i) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = str2;
        this.h = arrayList;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = z6;
        this.m = str6;
        this.n = j;
        this.o = z7;
        this.p = str7;
        this.q = i;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.a);
        bundle.putBoolean("coh", this.b);
        bundle.putString("gl", this.c);
        bundle.putBoolean("simulator", this.d);
        bundle.putBoolean("is_latchsky", this.e);
        bundle.putInt("build_api_level", this.q);
        if (!((Boolean) pla.c().a(mpa.ya)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f);
        }
        bundle.putString("hl", this.g);
        if (!this.h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.h);
        }
        bundle.putString("mv", this.i);
        bundle.putString("submodel", this.m);
        Bundle a = f2e.a(bundle, "device");
        bundle.putBundle("device", a);
        a.putString("build", this.k);
        a.putLong("remaining_data_partition_space", this.n);
        Bundle a2 = f2e.a(a, "browser");
        a.putBundle("browser", a2);
        a2.putBoolean("is_browser_custom_tabs_capable", this.l);
        if (!TextUtils.isEmpty(this.j)) {
            Bundle a3 = f2e.a(a, "play_store");
            a.putBundle("play_store", a3);
            a3.putString("package_version", this.j);
        }
        if (((Boolean) pla.c().a(mpa.Ma)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.o);
        }
        if (!TextUtils.isEmpty(this.p)) {
            bundle.putString("v_unity", this.p);
        }
        if (((Boolean) pla.c().a(mpa.Ja)).booleanValue()) {
            f2e.g(bundle, "gotmt_l", true, ((Boolean) pla.c().a(mpa.Ga)).booleanValue());
            f2e.g(bundle, "gotmt_i", true, ((Boolean) pla.c().a(mpa.Fa)).booleanValue());
        }
    }
}
