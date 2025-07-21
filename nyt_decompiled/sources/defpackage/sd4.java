package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.nytimes.android.MainActivity;

/* loaded from: classes4.dex */
public final class sd4 implements td4 {
    @Override // defpackage.td4
    public Intent a(Context context, String str, String str2, String str3, boolean z) {
        zq3.h(context, "context");
        zq3.h(str, "assetUri");
        zq3.h(str3, "referringSource");
        return sn3.k(new sn3(MainActivity.class, context).a().b().c(str).d(str2).q(str3).p(z).l(), false, 1, null).e();
    }

    @Override // defpackage.td4
    public void b(Context context, Bundle bundle) {
        zq3.h(context, "context");
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(67108864);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        context.startActivity(intent);
    }

    @Override // defpackage.td4
    public Intent c(Context context, String str, String str2, String str3) {
        zq3.h(context, "context");
        zq3.h(str, "referringSource");
        return new sn3(MainActivity.class, context).q(str).c(str2).f("notificationSave").d(str3).e();
    }

    @Override // defpackage.td4
    public Intent d(Context context) {
        zq3.h(context, "context");
        return new sn3(MainActivity.class, context).a().e();
    }

    @Override // defpackage.td4
    public Intent e(Context context, String str, String str2) {
        zq3.h(context, "context");
        zq3.h(str, "pageName");
        zq3.h(str2, "referringSource");
        return new sn3(MainActivity.class, context).n(str).q(str2).e();
    }

    @Override // defpackage.td4
    public void f(Activity activity) {
        zq3.h(activity, "activity");
        FragmentManager supportFragmentManager = ((jk) activity).getSupportFragmentManager();
        zq3.g(supportFragmentManager, "getSupportFragmentManager(...)");
        if (supportFragmentManager.k0("settingsBottomSheet") == null) {
            nm7.Companion.a().show(supportFragmentManager, "settingsBottomSheet");
        }
    }
}
