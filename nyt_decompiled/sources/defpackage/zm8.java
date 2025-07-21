package defpackage;

import android.content.Context;
import android.widget.Toast;

/* loaded from: classes4.dex */
public abstract class zm8 {
    public static void a(Context context, String str) {
        if (b(context)) {
            c(context, str);
        }
    }

    private static boolean b(Context context) {
        return "debug".equals(context.getString(kk6.com_nytimes_android_build_type));
    }

    public static void c(Context context, String str) {
        h(context, str, 1);
    }

    public static void d(Context context) {
        f(context, em6.no_network_message_more_section, 1);
    }

    public static void e(Context context, int i) {
        f(context, i, 0);
    }

    public static void f(Context context, int i, int i2) {
        h(context, context.getString(i), i2);
    }

    public static void g(Context context, String str) {
        h(context, str, 0);
    }

    private static void h(Context context, String str, int i) {
        if (context == null || str == null) {
            return;
        }
        Toast.makeText(context, str, i).show();
    }
}
