package defpackage;

import android.content.Context;
import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.gms.internal.ads.n1;

/* loaded from: classes3.dex */
public abstract class bbe {
    public static n1 a(Context context, String str, String str2) {
        return new abe(context, str, str2).b(CrashReportManager.TIME_WINDOW);
    }
}
