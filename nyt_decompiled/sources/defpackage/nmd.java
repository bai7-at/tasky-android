package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class nmd implements gqd {
    private final Context a;
    private final kke b;

    nmd(Context context, kke kkeVar) {
        this.a = context;
        this.b = kkeVar;
    }

    final /* synthetic */ mmd a() {
        Bundle bundle;
        dyf.r();
        String string = !((Boolean) pla.c().a(mpa.c6)).booleanValue() ? "" : this.a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) pla.c().a(mpa.e6)).booleanValue() ? this.a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        dyf.r();
        Context context = this.a;
        if (((Boolean) pla.c().a(mpa.d6)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new mmd(string, string2, bundle, null);
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 18;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.b.j(new Callable() { // from class: kmd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nmd.this.a();
            }
        });
    }
}
