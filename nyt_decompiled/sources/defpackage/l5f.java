package defpackage;

import android.util.Log;

/* loaded from: classes3.dex */
final class l5f extends d6f {
    l5f(w5f w5fVar, String str, Long l, boolean z) {
        super(w5fVar, str, l, true, null);
    }

    @Override // defpackage.d6f
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + super.c() + ": " + ((String) obj));
            return null;
        }
    }
}
