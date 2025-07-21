package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
final class heb {
    private final Map a = new HashMap();
    private final List b = new ArrayList();
    private final Context c;
    private final pdb d;

    heb(Context context, pdb pdbVar) {
        this.c = context;
        this.d = pdbVar;
    }

    final /* synthetic */ void b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.d.d();
        }
    }

    final synchronized void c(String str) {
        try {
            if (this.a.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.c) : this.c.getSharedPreferences(str, 0);
            geb gebVar = new geb(this, str);
            this.a.put(str, gebVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(gebVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void d(feb febVar) {
        this.b.add(febVar);
    }
}
