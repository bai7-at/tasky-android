package defpackage;

import android.content.Context;
import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.gms.internal.pal.g1;

/* loaded from: classes3.dex */
public abstract class r2f {
    public static g1 a(Context context, String str, String str2) {
        return new p2f(context, str, str2).b(CrashReportManager.TIME_WINDOW);
    }
}
