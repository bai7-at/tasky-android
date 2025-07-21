package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.comscore.android.util.AndroidTcfDataLoader;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ldb implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context a;
    private final SharedPreferences b;
    private final hie c;
    private final ceb d;
    private String e = "-1";
    private int f = -1;

    ldb(Context context, hie hieVar, ceb cebVar) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        this.c = hieVar;
        this.a = context;
        this.d = cebVar;
    }

    private final void b() {
        this.c.m(true);
        wv9.c(this.a);
    }

    private final void c(String str, int i) {
        Context context;
        boolean z = true;
        if (!((Boolean) pla.c().a(mpa.w0)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z = false;
        }
        this.c.m(z);
        if (((Boolean) pla.c().a(mpa.j6)).booleanValue() && z && (context = this.a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    final void a() {
        this.b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.b, "gad_has_consent_for_cookies");
        if (!((Boolean) pla.c().a(mpa.y0)).booleanValue()) {
            onSharedPreferenceChanged(this.b, AndroidTcfDataLoader.IABTCF_PURPOSE_CONSENTS);
        } else {
            onSharedPreferenceChanged(this.b, AndroidTcfDataLoader.IABTCF_GDPR_APPLIES);
            onSharedPreferenceChanged(this.b, "IABTCF_TCString");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z;
        if (((Boolean) pla.c().a(mpa.y0)).booleanValue()) {
            if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                if (i != this.c.zzb()) {
                    b();
                }
                this.c.zzE(i);
                return;
            }
            if (Objects.equals(str, AndroidTcfDataLoader.IABTCF_GDPR_APPLIES) || Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, AndroidTcfDataLoader.IABTCF_PURPOSE_CONSENTS)) {
                String string = sharedPreferences.getString(str, "-1");
                if (string != null && !string.equals(this.c.C(str))) {
                    b();
                }
                this.c.e(str, string);
                return;
            }
            return;
        }
        String string2 = sharedPreferences.getString(AndroidTcfDataLoader.IABTCF_PURPOSE_CONSENTS, "-1");
        int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        String valueOf = String.valueOf(str);
        int hashCode = valueOf.hashCode();
        if (hashCode != -2004976699) {
            if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                z = true;
            }
            z = -1;
        } else {
            if (valueOf.equals(AndroidTcfDataLoader.IABTCF_PURPOSE_CONSENTS)) {
                z = false;
            }
            z = -1;
        }
        if (!z) {
            if (string2.equals("-1") || this.e.equals(string2)) {
                return;
            }
            this.e = string2;
            c(string2, i2);
            return;
        }
        if (!z) {
            return;
        }
        if (!((Boolean) pla.c().a(mpa.w0)).booleanValue() || i2 == -1 || this.f == i2) {
            return;
        }
        this.f = i2;
        c(string2, i2);
    }
}
