package defpackage;

import android.os.Build;
import java.lang.reflect.Field;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;

/* loaded from: classes.dex */
public final class tn9 implements bo9 {
    @Override // defpackage.bo9
    public Map a() {
        Pair a = du8.a("os_bid", Build.ID);
        Pair a2 = du8.a("tgs", Build.TAGS);
        Pair a3 = du8.a("os_btype", Build.TYPE);
        Pair a4 = du8.a("os", "Android");
        Pair a5 = du8.a("osr", Build.VERSION.RELEASE);
        Field[] fields = Build.VERSION_CODES.class.getFields();
        int i = Build.VERSION.SDK_INT;
        Field field = fields[i];
        zq3.d(field, "VERSION_CODES::class.jav…ds[Build.VERSION.SDK_INT]");
        return t.m(a, a2, a3, a4, a5, du8.a("osn", field.getName()), du8.a("osv", String.valueOf(i)));
    }
}
