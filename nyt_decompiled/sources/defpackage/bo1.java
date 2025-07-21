package defpackage;

import android.app.Application;
import android.content.Intent;
import com.nytimes.android.devsettings.home.DevSettingsActivity;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class bo1 {
    public static final bo1 a = new bo1();

    private bo1() {
    }

    public final Intent a(Application application) {
        zq3.h(application, "application");
        return new Intent(application, (Class<?>) DevSettingsActivity.class);
    }

    public final ho1 b() {
        return new xg1();
    }

    public final ho1 c(Map map) {
        Object next;
        zq3.h(map, "devSettingsMaterialThemes");
        Iterator it2 = map.entrySet().iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int intValue = ((Number) ((Map.Entry) next).getKey()).intValue();
                do {
                    Object next2 = it2.next();
                    int intValue2 = ((Number) ((Map.Entry) next2).getKey()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        ho1 ho1Var = entry != null ? (ho1) entry.getValue() : null;
        if (ho1Var != null) {
            return ho1Var;
        }
        throw new IllegalStateException("No DevSettingsMaterialThemes were provided");
    }
}
