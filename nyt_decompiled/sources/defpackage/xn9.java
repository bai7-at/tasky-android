package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;

/* loaded from: classes.dex */
public final class xn9 implements bo9 {
    private final PowerManager a;

    public xn9(Context context) {
        zq3.i(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("power");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.os.PowerManager");
        }
        this.a = (PowerManager) systemService;
    }

    private final Map b() {
        String str;
        boolean isDeviceLightIdleMode;
        boolean isLowPowerStandbyEnabled;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = Build.VERSION.SDK_INT;
        int currentThermalStatus = this.a.getCurrentThermalStatus();
        if (currentThermalStatus == 1) {
            str = "light";
        } else if (currentThermalStatus == 2) {
            str = "moderate";
        } else if (currentThermalStatus == 3) {
            str = "severe";
        } else if (currentThermalStatus == 4) {
            str = "critical";
        } else if (currentThermalStatus == 5) {
            str = "emergency";
        } else if (currentThermalStatus == 6) {
            str = "shutdown";
        } else {
            str = "n:" + currentThermalStatus;
        }
        linkedHashMap.put("d_p_thermal", str);
        linkedHashMap.put("d_p_idle", Boolean.valueOf(this.a.isDeviceIdleMode()));
        if (i >= 33) {
            isDeviceLightIdleMode = this.a.isDeviceLightIdleMode();
            linkedHashMap.put("d_p_lidle", Boolean.valueOf(isDeviceLightIdleMode));
            isLowPowerStandbyEnabled = this.a.isLowPowerStandbyEnabled();
            linkedHashMap.put("d_p_low", Boolean.valueOf(isLowPowerStandbyEnabled));
        }
        linkedHashMap.put("d_p_save", Boolean.valueOf(this.a.isPowerSaveMode()));
        return linkedHashMap;
    }

    @Override // defpackage.bo9
    public Map a() {
        Map b = b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : b.entrySet()) {
            Object value = entry.getValue();
            if (value != null && !TextUtils.isEmpty(value.toString())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
