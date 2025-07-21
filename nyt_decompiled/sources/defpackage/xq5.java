package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class xq5 {
    public static final a Companion = new a(null);
    private final SharedPreferences a;
    private final String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public xq5(Context context, SharedPreferences sharedPreferences) {
        String str = "NOT_FOUND";
        zq3.h(context, "context");
        zq3.h(sharedPreferences, "sharedPreferences");
        this.a = sharedPreferences;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                String str2 = packageInfo.versionName;
                if (str2 != null) {
                    str = str2;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.b = str;
    }

    private final String b(String str) {
        String string = this.a.getString(str, null);
        return string == null ? "NOT_FOUND" : string;
    }

    public final boolean a(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        return zq3.c(this.b, b(str));
    }

    public final void c(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        this.a.edit().putString(str, this.b).apply();
    }
}
