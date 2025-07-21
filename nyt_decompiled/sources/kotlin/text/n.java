package kotlin.text;

import defpackage.zq3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class n extends m {
    public static Double i(String str) {
        zq3.h(str, "<this>");
        try {
            if (g.b.d(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float j(String str) {
        zq3.h(str, "<this>");
        try {
            if (g.b.d(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
