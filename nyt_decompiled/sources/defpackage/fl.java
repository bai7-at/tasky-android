package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;

/* loaded from: classes3.dex */
public class fl {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final ko1 g;

    public fl(String str, String str2, String str3, String str4, String str5, String str6, ko1 ko1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = ko1Var;
    }

    public static fl a(Context context, df3 df3Var, String str, String str2, ko1 ko1Var) {
        String packageName = context.getPackageName();
        String g = df3Var.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new fl(str, str2, g, packageName, num, str3, ko1Var);
    }
}
