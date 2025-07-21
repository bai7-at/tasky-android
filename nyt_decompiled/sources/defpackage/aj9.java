package defpackage;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;

/* loaded from: classes.dex */
public final class aj9 {
    public static final aj9 a = new aj9();

    private aj9() {
    }

    private final File c(Context context) {
        return new File(dj.a.a(context), "androidx.work.workdb");
    }

    public static final void d(Context context) {
        String str;
        String str2;
        String str3;
        zq3.h(context, "context");
        aj9 aj9Var = a;
        if (aj9Var.b(context).exists()) {
            h94 e = h94.e();
            str = bj9.a;
            e.a(str, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : aj9Var.e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        h94 e2 = h94.e();
                        str3 = bj9.a;
                        e2.k(str3, "Over-writing contents of " + file2);
                    }
                    String str4 = file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed";
                    h94 e3 = h94.e();
                    str2 = bj9.a;
                    e3.a(str2, str4);
                }
            }
        }
    }

    public final File a(Context context) {
        zq3.h(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        zq3.h(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        zq3.g(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map e(Context context) {
        String[] strArr;
        zq3.h(context, "context");
        File b = b(context);
        File a2 = a(context);
        strArr = bj9.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(strArr.length), 16));
        for (String str : strArr) {
            Pair a3 = du8.a(new File(b.getPath() + str), new File(a2.getPath() + str));
            linkedHashMap.put(a3.c(), a3.d());
        }
        return t.q(linkedHashMap, du8.a(b, a2));
    }
}
