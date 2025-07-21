package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;

/* loaded from: classes.dex */
public final class on9 implements bo9 {
    private final Context a;
    private final String b;

    public on9(Context context, String str) {
        zq3.i(context, "context");
        zq3.i(str, "appVersion");
        this.a = context;
        this.b = str;
    }

    @Override // defpackage.bo9
    public Map a() {
        Resources resources = this.a.getResources();
        zq3.d(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Pair a = du8.a("ddv", "1.14.4");
        Pair a2 = du8.a("ddvc", this.b);
        Pair a3 = du8.a("os", "Android");
        Pair a4 = du8.a("osr", Build.VERSION.RELEASE);
        Field[] fields = Build.VERSION_CODES.class.getFields();
        int i = Build.VERSION.SDK_INT;
        Field field = fields[i];
        zq3.d(field, "VERSION_CODES::class.jav…ds[Build.VERSION.SDK_INT]");
        return t.m(a, a2, a3, a4, du8.a("osn", field.getName()), du8.a("osv", String.valueOf(i)), du8.a("screen_x", Integer.valueOf(displayMetrics.widthPixels)), du8.a("screen_y", Integer.valueOf(displayMetrics.heightPixels)), du8.a("screen_d", String.valueOf(displayMetrics.density)), du8.a("camera", nn9.c.a(this.a)), du8.a("mdl", Build.MODEL), du8.a("prd", Build.PRODUCT), du8.a("mnf", Build.MANUFACTURER), du8.a("dev", Build.DEVICE), du8.a("hrd", Build.HARDWARE), du8.a("fgp", Build.FINGERPRINT), du8.a("tgs", Build.TAGS));
    }
}
