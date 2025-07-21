package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public abstract class ea1 {
    public static final File a(Context context, String str) {
        zq3.h(context, "<this>");
        zq3.h(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), zq3.q("datastore/", str));
    }
}
