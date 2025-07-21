package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ahb {
    private final Map a = new HashMap();
    private final List b = new ArrayList();
    private final Context c;

    ahb(Context context) {
        this.c = context;
    }

    final synchronized void b(String str) {
        try {
            if (this.a.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.c) : this.c.getSharedPreferences(str, 0);
            yfb yfbVar = new yfb(this, str);
            this.a.put(str, yfbVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(yfbVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        if (((Boolean) pla.c().a(mpa.U9)).booleanValue()) {
            dyf.r();
            Map W = wxf.W((String) pla.c().a(mpa.Y9));
            Iterator it2 = W.keySet().iterator();
            while (it2.hasNext()) {
                b((String) it2.next());
            }
            d(new ueb(W));
        }
    }

    final synchronized void d(ueb uebVar) {
        this.b.add(uebVar);
    }
}
