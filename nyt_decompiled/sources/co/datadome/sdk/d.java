package co.datadome.sdk;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
abstract class d {
    static AtomicBoolean a = new AtomicBoolean(false);

    static void a(String str) {
        if (a.get()) {
            Log.d("DataDome", str);
        }
    }
}
