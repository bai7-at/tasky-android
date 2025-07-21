package defpackage;

import android.content.res.Resources;
import com.nytimes.android.utils.AppPreferences;

/* loaded from: classes4.dex */
public class tm {
    private final AppPreferences a;
    private final Resources b;
    private final g00 c;
    private final String d;
    private final String e;
    private final String f;

    public tm(AppPreferences appPreferences, Resources resources, g00 g00Var) {
        this.b = resources;
        this.a = appPreferences;
        this.d = resources.getString(el6.feed_url_production);
        this.e = resources.getString(el6.feed_url_staging);
        this.f = resources.getString(ql6.com_nytimes_android_phoenix_beta_CONTENT_ENV);
        this.c = g00Var;
    }

    public String a(String str) {
        return this.c.a(str);
    }

    public String b() {
        return this.c.b();
    }

    public String c() {
        return this.a.l(this.b.getString(jl6.key_bna_ringtone), null);
    }

    public boolean d() {
        return this.a.n("BRAZIL_DISCLAIMER_ACCEPTED", false);
    }

    public void e() {
        this.a.f("BRAZIL_DISCLAIMER_ACCEPTED", true);
    }

    public void f(String str) {
        this.a.d(this.b.getString(jl6.key_bna_ringtone), str);
    }

    public boolean g() {
        return this.c.d();
    }
}
