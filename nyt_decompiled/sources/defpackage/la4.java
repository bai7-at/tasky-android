package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.login.LoginClient;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class la4 {
    public static final a d = new a(null);
    private static final ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
    private final String a;
    private final kq3 b;
    private String c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle b(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }

        private a() {
        }
    }

    public la4(Context context, String str) {
        PackageInfo packageInfo;
        zq3.h(context, "context");
        zq3.h(str, "applicationId");
        this.a = str;
        this.b = new kq3(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final String a() {
        if (c11.d(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public final void b(String str, String str2, String str3, String str4, String str5, Map map, String str6) {
        if (c11.d(this)) {
            return;
        }
        try {
            Bundle b = d.b(str);
            if (str3 != null) {
                b.putString("2_result", str3);
            }
            if (str4 != null) {
                b.putString("5_error_message", str4);
            }
            if (str5 != null) {
                b.putString("4_error_code", str5);
            }
            if (map != null && !map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                b.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            b.putString("3_method", str2);
            this.b.g(str6, b);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (c11.d(this)) {
            return;
        }
        try {
            Bundle b = d.b(str);
            b.putString("3_method", str2);
            this.b.g(str3, b);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void d(String str, String str2, String str3) {
        if (c11.d(this)) {
            return;
        }
        try {
            Bundle b = d.b(str);
            b.putString("3_method", str2);
            this.b.g(str3, b);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void e(String str, String str2, String str3) {
        if (c11.d(this)) {
            return;
        }
        try {
            Bundle b = d.b("");
            b.putString("2_result", LoginClient.Result.Code.ERROR.getLoggingValue());
            b.putString("5_error_message", str2);
            b.putString("3_method", str3);
            this.b.g(str, b);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }
}
