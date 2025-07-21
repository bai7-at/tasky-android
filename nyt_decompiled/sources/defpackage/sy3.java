package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.nytimes.android.logging.NYTLogger;

/* loaded from: classes4.dex */
public abstract class sy3 {
    public static void a(String str, Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setData(Uri.parse(str));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            NYTLogger.i(e, "Unable to launch browser.", new Object[0]);
        }
    }
}
