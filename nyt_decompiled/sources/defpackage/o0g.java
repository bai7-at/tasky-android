package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public abstract class o0g extends czf {
    static final boolean l(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // defpackage.ss9
    public final boolean d(Activity activity, Configuration configuration) {
        if (!((Boolean) pla.c().a(mpa.J4)).booleanValue()) {
            return false;
        }
        if (((Boolean) pla.c().a(mpa.L4)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        kia.b();
        int z = tfb.z(activity, configuration.screenHeightDp);
        int z2 = tfb.z(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        dyf.r();
        DisplayMetrics U = wxf.U(windowManager);
        int i = U.heightPixels;
        int i2 = U.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) pla.c().a(mpa.H4)).intValue();
        return (l(i, z + dimensionPixelSize, round) && l(i2, z2, round)) ? false : true;
    }
}
