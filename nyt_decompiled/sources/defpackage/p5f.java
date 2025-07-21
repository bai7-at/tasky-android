package defpackage;

import android.util.Log;

/* loaded from: classes3.dex */
final class p5f extends d6f {
    p5f(w5f w5fVar, String str, Double d, boolean z) {
        super(w5fVar, "measurement.test.double_flag", d, true, null);
    }

    @Override // defpackage.d6f
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + super.c() + ": " + ((String) obj));
            return null;
        }
    }
}
