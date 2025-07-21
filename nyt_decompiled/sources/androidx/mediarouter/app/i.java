package androidx.mediarouter.app;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ProgressBar;
import defpackage.bf6;
import defpackage.cn6;
import defpackage.hc6;
import defpackage.jd6;
import defpackage.kv1;
import defpackage.mx0;
import defpackage.nc6;
import defpackage.qo0;

/* loaded from: classes.dex */
abstract class i {
    private static final int a = jd6.mr_dynamic_dialog_icon_light;

    static Context a(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, l(context));
        int p = p(contextThemeWrapper, hc6.mediaRouteTheme);
        return p != 0 ? new ContextThemeWrapper(contextThemeWrapper, p) : contextThemeWrapper;
    }

    static Context b(Context context, int i, boolean z) {
        if (i == 0) {
            i = p(context, !z ? nc6.dialogTheme : nc6.alertDialogTheme);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return p(contextThemeWrapper, hc6.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, l(contextThemeWrapper)) : contextThemeWrapper;
    }

    static int c(Context context) {
        int p = p(context, hc6.mediaRouteTheme);
        return p == 0 ? l(context) : p;
    }

    static int d(Context context) {
        int o = o(context, 0, nc6.colorPrimary);
        return qo0.e(o, o(context, 0, R.attr.colorBackground)) < 3.0d ? o(context, 0, nc6.colorAccent) : o;
    }

    static Drawable e(Context context) {
        return j(context, bf6.mr_cast_checkbox);
    }

    static int f(Context context, int i) {
        return qo0.e(-1, o(context, i, nc6.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    static Drawable g(Context context) {
        return i(context, hc6.mediaRouteDefaultIconDrawable);
    }

    static float h(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    private static Drawable i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable r = kv1.r(obtainStyledAttributes.getDrawable(0));
        if (r(context)) {
            kv1.n(r, mx0.c(context, a));
        }
        obtainStyledAttributes.recycle();
        return r;
    }

    private static Drawable j(Context context, int i) {
        Drawable r = kv1.r(mx0.e(context, i));
        if (r(context)) {
            kv1.n(r, mx0.c(context, a));
        }
        return r;
    }

    static Drawable k(Context context) {
        return j(context, bf6.mr_cast_mute_button);
    }

    private static int l(Context context) {
        return r(context) ? f(context, 0) == -570425344 ? cn6.Theme_MediaRouter_Light : cn6.Theme_MediaRouter_Light_DarkControlPanel : f(context, 0) == -570425344 ? cn6.Theme_MediaRouter_LightControlPanel : cn6.Theme_MediaRouter;
    }

    static Drawable m(Context context) {
        return i(context, hc6.mediaRouteSpeakerIconDrawable);
    }

    static Drawable n(Context context) {
        return i(context, hc6.mediaRouteSpeakerGroupIconDrawable);
    }

    private static int o(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    static int p(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    static Drawable q(Context context) {
        return i(context, hc6.mediaRouteTvIconDrawable);
    }

    private static boolean r(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(nc6.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    static void s(Context context, Dialog dialog) {
        dialog.getWindow().getDecorView().setBackgroundColor(mx0.c(context, r(context) ? jd6.mr_dynamic_dialog_background_light : jd6.mr_dynamic_dialog_background_dark));
    }

    static void t(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(mx0.c(context, r(context) ? jd6.mr_cast_progressbar_progress_and_thumb_light : jd6.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }

    static void u(Context context, View view, View view2, boolean z) {
        int o = o(context, 0, nc6.colorPrimary);
        int o2 = o(context, 0, nc6.colorPrimaryDark);
        if (z && f(context, 0) == -570425344) {
            o2 = o;
            o = -1;
        }
        view.setBackgroundColor(o);
        view2.setBackgroundColor(o2);
        view.setTag(Integer.valueOf(o));
        view2.setTag(Integer.valueOf(o2));
    }

    static void v(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int c;
        int c2;
        if (r(context)) {
            c = mx0.c(context, jd6.mr_cast_progressbar_progress_and_thumb_light);
            c2 = mx0.c(context, jd6.mr_cast_progressbar_background_light);
        } else {
            c = mx0.c(context, jd6.mr_cast_progressbar_progress_and_thumb_dark);
            c2 = mx0.c(context, jd6.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.j(c, c2);
    }

    static void w(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int f = f(context, 0);
        if (Color.alpha(f) != 255) {
            f = qo0.k(f, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.b(f);
    }
}
