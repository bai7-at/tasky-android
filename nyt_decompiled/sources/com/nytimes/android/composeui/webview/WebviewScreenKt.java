package com.nytimes.android.composeui.webview;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebView;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import defpackage.sy4;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class WebviewScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014f  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.compose.material.DrawerState, androidx.compose.material.SnackbarHostState] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r50, final defpackage.qs2 r51, androidx.compose.ui.Modifier r52, defpackage.nn0 r53, boolean r54, android.webkit.WebView r55, java.util.Map r56, defpackage.gt2 r57, androidx.compose.foundation.layout.o r58, androidx.compose.runtime.Composer r59, final int r60, final int r61) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.composeui.webview.WebviewScreenKt.a(java.lang.String, qs2, androidx.compose.ui.Modifier, nn0, boolean, android.webkit.WebView, java.util.Map, gt2, androidx.compose.foundation.layout.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    private static final boolean d(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    private static final boolean f(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    public static final void l(WebView webView) {
        zq3.h(webView, "<this>");
        Context context = webView.getContext();
        zq3.g(context, "getContext(...)");
        String str = " nyt_android/" + n(context);
        webView.getSettings().setUserAgentString(webView.getSettings().getUserAgentString() + str);
    }

    public static final PackageInfo m(PackageManager packageManager, String str) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        zq3.h(packageManager, "<this>");
        zq3.h(str, "packageName");
        if (Build.VERSION.SDK_INT < 33) {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 0);
            zq3.e(packageInfo2);
            return packageInfo2;
        }
        of = PackageManager.PackageInfoFlags.of(0L);
        packageInfo = packageManager.getPackageInfo(str, of);
        zq3.e(packageInfo);
        return packageInfo;
    }

    public static final String n(Context context) {
        zq3.h(context, "<this>");
        StringBuilder sb = new StringBuilder();
        try {
            PackageManager packageManager = context.getPackageManager();
            zq3.g(packageManager, "getPackageManager(...)");
            String packageName = context.getPackageName();
            zq3.g(packageName, "getPackageName(...)");
            sb.append(m(packageManager, packageName).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            sb.append(DatasetUtils.UNKNOWN_IDENTITY_ID);
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
