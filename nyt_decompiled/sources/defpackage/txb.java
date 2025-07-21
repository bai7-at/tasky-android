package defpackage;

import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes3.dex */
public final class txb {
    private final k6e a;
    private final zuc b;
    private final g1e c;

    public txb(zuc zucVar, g1e g1eVar, k6e k6eVar) {
        this.a = k6eVar;
        this.b = zucVar;
        this.c = g1eVar;
    }

    private static String b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? QueryKeys.USER_ID : "ac" : "cb" : "cc" : "bb" : QueryKeys.HOST;
    }

    public final void a(long j, int i) {
        if (((Boolean) pla.c().a(mpa.z8)).booleanValue()) {
            k6e k6eVar = this.a;
            g1e g1eVar = this.c;
            j6e b = j6e.b("ad_closed");
            b.g(g1eVar.b.b);
            b.a("show_time", String.valueOf(j));
            b.a("ad_format", "app_open_ad");
            b.a("acr", b(i));
            k6eVar.a(b);
            return;
        }
        zuc zucVar = this.b;
        g1e g1eVar2 = this.c;
        yuc a = zucVar.a();
        a.e(g1eVar2.b.b);
        a.b("action", "ad_closed");
        a.b("show_time", String.valueOf(j));
        a.b("ad_format", "app_open_ad");
        a.b("acr", b(i));
        a.g();
    }
}
