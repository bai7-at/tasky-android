package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
final class zle implements oue {
    final /* synthetic */ cne a;

    zle(cne cneVar) {
        this.a = cneVar;
    }

    @Override // defpackage.oue
    public final Boolean zza(String str, boolean z) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.a.e;
            return Boolean.valueOf(sharedPreferences2.getBoolean(str, z));
        } catch (ClassCastException unused) {
            sharedPreferences = this.a.e;
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z)));
        }
    }
}
