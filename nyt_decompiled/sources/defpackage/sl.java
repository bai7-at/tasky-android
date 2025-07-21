package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.Window;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class sl {
    public static final sl a = new sl();

    private sl() {
    }

    public static final void a() {
    }

    public static final void b() {
    }

    public static final String c(byte[] bArr) {
        zq3.h(bArr, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b = bArr[i];
            i++;
            z38 z38Var = z38.a;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            zq3.g(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        zq3.g(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    public static final String d() {
        Context l = w92.l();
        try {
            String str = l.getPackageManager().getPackageInfo(l.getPackageName(), 0).versionName;
            zq3.g(str, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static final View e(Activity activity) {
        if (c11.d(sl.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            c11.b(th, sl.class);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (kotlin.text.h.K(r0, "generic", false, 2, null) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            defpackage.zq3.g(r0, r1)
            java.lang.String r2 = "generic"
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r6 = kotlin.text.h.K(r0, r2, r3, r4, r5)
            if (r6 != 0) goto L73
            defpackage.zq3.g(r0, r1)
            java.lang.String r1 = "unknown"
            boolean r0 = kotlin.text.h.K(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            defpackage.zq3.g(r0, r1)
            java.lang.String r6 = "google_sdk"
            boolean r7 = kotlin.text.h.P(r0, r6, r3, r4, r5)
            if (r7 != 0) goto L73
            defpackage.zq3.g(r0, r1)
            java.lang.String r7 = "Emulator"
            boolean r7 = kotlin.text.h.P(r0, r7, r3, r4, r5)
            if (r7 != 0) goto L73
            defpackage.zq3.g(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = kotlin.text.h.P(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            defpackage.zq3.g(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = kotlin.text.h.P(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            defpackage.zq3.g(r0, r1)
            boolean r0 = kotlin.text.h.K(r0, r2, r3, r4, r5)
            if (r0 == 0) goto L6b
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "DEVICE"
            defpackage.zq3.g(r0, r1)
            boolean r0 = kotlin.text.h.K(r0, r2, r3, r4, r5)
            if (r0 != 0) goto L73
        L6b:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = defpackage.zq3.c(r6, r0)
            if (r0 == 0) goto L74
        L73:
            r3 = 1
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl.f():boolean");
    }

    public static final double g(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(g29.y()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }
}
