package defpackage;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class yfb implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final String a;
    final /* synthetic */ ahb b;

    public yfb(ahb ahbVar, String str) {
        this.b = ahbVar;
        this.a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<ueb> list;
        synchronized (this.b) {
            try {
                list = this.b.b;
                for (ueb uebVar : list) {
                    String str2 = this.a;
                    Map map = uebVar.a;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        dyf.q().i().p(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
