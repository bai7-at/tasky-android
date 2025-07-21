package defpackage;

import android.content.Context;
import android.os.BatteryManager;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;

/* loaded from: classes.dex */
public final class in9 implements bo9 {
    private final BatteryManager a;

    public in9(Context context) {
        zq3.i(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("batterymanager");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.os.BatteryManager");
        }
        this.a = (BatteryManager) systemService;
    }

    private final Map b() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("d_b_ttfc", Long.valueOf(this.a.computeChargeTimeRemaining()));
        int intProperty = this.a.getIntProperty(6);
        if (intProperty == 2) {
            str = "charging";
        } else if (intProperty == 3) {
            str = "discharging";
        } else if (intProperty == 4) {
            str = "not_charging";
        } else if (intProperty != 5) {
            str = "n:" + intProperty;
        } else {
            str = "full";
        }
        linkedHashMap.put("d_b_state", str);
        linkedHashMap.put("d_b_c", Integer.valueOf(this.a.getIntProperty(1)));
        linkedHashMap.put("d_b_lvl", Integer.valueOf(this.a.getIntProperty(4)));
        linkedHashMap.put("d_b_e", Integer.valueOf(this.a.getIntProperty(5)));
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
