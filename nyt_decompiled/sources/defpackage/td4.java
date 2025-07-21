package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes4.dex */
public interface td4 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    Intent a(Context context, String str, String str2, String str3, boolean z);

    void b(Context context, Bundle bundle);

    Intent c(Context context, String str, String str2, String str3);

    Intent d(Context context);

    Intent e(Context context, String str, String str2);

    void f(Activity activity);
}
