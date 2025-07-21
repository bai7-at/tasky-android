package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class x92 {
    public static final x92 a = new x92();
    private static final HashSet b = b0.f("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    private x92() {
    }

    public static final boolean a(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "packageName");
        String str2 = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        zq3.g(str2, "brand");
        if (h.K(str2, "generic", false, 2, null) && (i & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return false;
            }
            zq3.g(signatureArr, "packageInfo.signatures");
            if (signatureArr.length == 0) {
                return false;
            }
            Signature[] signatureArr2 = packageInfo.signatures;
            zq3.g(signatureArr2, "packageInfo.signatures");
            for (Signature signature : signatureArr2) {
                HashSet hashSet = b;
                g29 g29Var = g29.a;
                byte[] byteArray = signature.toByteArray();
                zq3.g(byteArray, "it.toByteArray()");
                if (!i.c0(hashSet, g29.B0(byteArray))) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
