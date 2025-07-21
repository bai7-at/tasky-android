package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
final class epa implements lsa {
    final /* synthetic */ SharedPreferences a;

    epa(kpa kpaVar, SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    @Override // defpackage.lsa
    public final String a(String str, String str2) {
        return this.a.getString(str, str2);
    }

    @Override // defpackage.lsa
    public final Double b(String str, double d) {
        try {
            return Double.valueOf(this.a.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.a.getString(str, String.valueOf(d)));
        }
    }

    @Override // defpackage.lsa
    public final Long c(String str, long j) {
        try {
            return Long.valueOf(this.a.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.a.getInt(str, (int) j));
        }
    }

    @Override // defpackage.lsa
    public final Boolean zza(String str, boolean z) {
        try {
            return Boolean.valueOf(this.a.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.a.getString(str, String.valueOf(z)));
        }
    }
}
