package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;

/* loaded from: classes.dex */
public final class ao9 implements bo9 {
    private final WindowManager a;
    private final Display b;
    private final Context c;

    public ao9(Context context) {
        zq3.i(context, "context");
        this.c = context;
        Object systemService = context.getApplicationContext().getSystemService("window");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
        }
        WindowManager windowManager = (WindowManager) systemService;
        this.a = windowManager;
        this.b = windowManager.getDefaultDisplay();
    }

    private final Float b() {
        try {
            return Float.valueOf(rn9.a(Settings.System.getInt(this.c.getContentResolver(), "screen_brightness") / 255.0f));
        } catch (Settings.SettingNotFoundException unused) {
            return null;
        }
    }

    private final Map c() {
        String str;
        Display.Mode mode;
        Display.Mode mode2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Resources resources = this.c.getResources();
        zq3.d(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        linkedHashMap.put("d_s_is_w", Integer.valueOf(displayMetrics.widthPixels));
        linkedHashMap.put("d_s_is_h", Integer.valueOf(displayMetrics.heightPixels));
        linkedHashMap.put("screen_d", Float.valueOf(displayMetrics.density));
        linkedHashMap.put("d_s_dpi", Integer.valueOf(displayMetrics.densityDpi));
        Display display = this.b;
        Integer num = null;
        linkedHashMap.put("d_s_mrr", display != null ? Integer.valueOf((int) display.getRefreshRate()) : null);
        Display display2 = this.b;
        linkedHashMap.put("d_s_cutout", Boolean.valueOf((display2 != null ? display2.getCutout() : null) != null));
        Display display3 = this.b;
        Integer valueOf = display3 != null ? Integer.valueOf(display3.getRotation()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            str = "portrait";
        } else if (valueOf != null && valueOf.intValue() == 1) {
            str = "landscape_left";
        } else if (valueOf != null && valueOf.intValue() == 2) {
            str = "portrait_upside_down";
        } else if (valueOf != null && valueOf.intValue() == 3) {
            str = "landscape_right";
        } else {
            str = "n:" + valueOf;
        }
        linkedHashMap.put("d_or", str);
        Display display4 = this.b;
        linkedHashMap.put("d_s_n", display4 != null ? display4.getName() : null);
        Display display5 = this.b;
        linkedHashMap.put("d_s_hdr", display5 != null ? Boolean.valueOf(display5.isHdr()) : null);
        Display display6 = this.b;
        linkedHashMap.put("screen_x", (display6 == null || (mode2 = display6.getMode()) == null) ? null : Integer.valueOf(mode2.getPhysicalWidth()));
        Display display7 = this.b;
        if (display7 != null && (mode = display7.getMode()) != null) {
            num = Integer.valueOf(mode.getPhysicalHeight());
        }
        linkedHashMap.put("screen_y", num);
        linkedHashMap.put("d_s_br", b());
        return linkedHashMap;
    }

    @Override // defpackage.bo9
    public Map a() {
        Map c = c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : c.entrySet()) {
            Object value = entry.getValue();
            if (value != null && !TextUtils.isEmpty(value.toString())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
