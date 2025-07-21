package defpackage;

import android.content.Context;
import android.content.Intent;
import defpackage.e5;

/* loaded from: classes.dex */
public final class h5 extends e5 {
    @Override // defpackage.e5
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "input");
        return g5.a.a(new String[]{str});
    }

    @Override // defpackage.e5
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public e5.a b(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "input");
        if (mx0.a(context, str) == 0) {
            return new e5.a(Boolean.TRUE);
        }
        return null;
    }

    @Override // defpackage.e5
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean c(int i, Intent intent) {
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (intArrayExtra[i2] == 0) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        return Boolean.valueOf(z);
    }
}
