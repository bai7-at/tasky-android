package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.nytimes.android.font.FontScale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class zm2 {
    public static final a Companion = new a(null);
    private final SharedPreferences a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public zm2(SharedPreferences sharedPreferences) {
        zq3.h(sharedPreferences, "sharedPreferences");
        this.a = sharedPreferences;
    }

    public final Configuration a(Context context) {
        Display defaultDisplay;
        zq3.h(context, "baseContext");
        Configuration configuration = context.getResources().getConfiguration();
        configuration.fontScale = b(context);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        displayMetrics.scaledDensity = configuration.fontScale * displayMetrics.density;
        zq3.e(configuration);
        return configuration;
    }

    public final float b(Context context) {
        zq3.h(context, "baseContext");
        return e() ? d(context) : c().getScale();
    }

    public final FontScale c() {
        FontScale fontScale;
        float f = this.a.getFloat("com.nytimes.android.font.FontScale", FontScale.Default.getScale());
        FontScale[] values = FontScale.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                fontScale = null;
                break;
            }
            fontScale = values[i];
            if (fontScale.getScale() == f) {
                break;
            }
            i++;
        }
        return fontScale == null ? FontScale.Default : fontScale;
    }

    public final float d(Context context) {
        zq3.h(context, "context");
        return Settings.System.getFloat(context.getContentResolver(), "font_scale", 1.0f);
    }

    public final boolean e() {
        return this.a.getBoolean("com.nytimes.android.font.IsSystemSettingsEnabled", true);
    }

    public final void f(FontScale fontScale) {
        zq3.h(fontScale, "value");
        this.a.edit().putFloat("com.nytimes.android.font.FontScale", fontScale.getScale()).apply();
    }

    public final void g(boolean z) {
        this.a.edit().putBoolean("com.nytimes.android.font.IsSystemSettingsEnabled", z).apply();
    }
}
