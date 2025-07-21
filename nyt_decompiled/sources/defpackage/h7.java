package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.abra.models.AbraPackageKt;

/* loaded from: classes2.dex */
public final class h7 implements g7 {
    private final String a;
    private final String b;
    private final boolean c;
    private final long d;
    private final boolean e;

    public h7(SharedPreferences sharedPreferences) {
        zq3.h(sharedPreferences, "prefs");
        this.a = sharedPreferences.getString("ad_environment", null);
        this.b = sharedPreferences.getString("ad_keyword", null);
        this.c = sharedPreferences.getBoolean("ad_enabled", true);
        this.d = sharedPreferences.getLong("ad_stale_timer", AbraPackageKt.MS_IN_HOUR);
        this.e = sharedPreferences.getBoolean("ad_stale_toggle", false);
    }

    @Override // defpackage.g7
    public boolean a() {
        return this.e;
    }

    @Override // defpackage.g7
    public boolean b() {
        return this.c;
    }

    @Override // defpackage.g7
    public String c() {
        return this.b;
    }
}
