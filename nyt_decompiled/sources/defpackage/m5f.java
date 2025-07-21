package defpackage;

import android.util.Log;

/* loaded from: classes3.dex */
final class m5f extends d6f {
    m5f(w5f w5fVar, String str, Boolean bool, boolean z) {
        super(w5fVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d6f
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (g0f.c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (g0f.d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.c() + ": " + ((String) obj));
        return null;
    }
}
