package defpackage;

import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import defpackage.oc;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
public abstract class cbb {
    private static final Set a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
    private static final List b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final List c = Arrays.asList(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "app", "am");
    private static final List d = Arrays.asList("_r", "_dbg");
    private static final List e = Arrays.asList((String[]) ArrayUtils.concat(s4f.a, s4f.b));
    private static final List f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle a(oc.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = cVar.b;
        if (str2 != null) {
            bundle.putString(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
        }
        Object obj = cVar.c;
        if (obj != null) {
            w2f.b(bundle, obj);
        }
        String str3 = cVar.d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.e);
        String str4 = cVar.f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = cVar.g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = cVar.h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = cVar.i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.j);
        String str6 = cVar.k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = cVar.l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.m);
        bundle.putBoolean("active", cVar.n);
        bundle.putLong("triggered_timestamp", cVar.o);
        return bundle;
    }

    public static oc.c b(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        oc.c cVar = new oc.c();
        cVar.a = (String) Preconditions.checkNotNull((String) w2f.a(bundle, "origin", String.class, null));
        cVar.b = (String) Preconditions.checkNotNull((String) w2f.a(bundle, AuthenticationTokenClaims.JSON_KEY_NAME, String.class, null));
        cVar.c = w2f.a(bundle, "value", Object.class, null);
        cVar.d = (String) w2f.a(bundle, "trigger_event_name", String.class, null);
        cVar.e = ((Long) w2f.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
        cVar.f = (String) w2f.a(bundle, "timed_out_event_name", String.class, null);
        cVar.g = (Bundle) w2f.a(bundle, "timed_out_event_params", Bundle.class, null);
        cVar.h = (String) w2f.a(bundle, "triggered_event_name", String.class, null);
        cVar.i = (Bundle) w2f.a(bundle, "triggered_event_params", Bundle.class, null);
        cVar.j = ((Long) w2f.a(bundle, "time_to_live", Long.class, 0L)).longValue();
        cVar.k = (String) w2f.a(bundle, "expired_event_name", String.class, null);
        cVar.l = (Bundle) w2f.a(bundle, "expired_event_params", Bundle.class, null);
        cVar.n = ((Boolean) w2f.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.m = ((Long) w2f.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
        cVar.o = ((Long) w2f.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        return cVar;
    }

    public static String c(String str) {
        String a2 = q3f.a(str);
        return a2 != null ? a2 : str;
    }

    public static void d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean e(String str, String str2, Bundle bundle) {
        char c2;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!i(str) || bundle == null) {
            return false;
        }
        Iterator it2 = d.iterator();
        while (it2.hasNext()) {
            if (bundle.containsKey((String) it2.next())) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode == 101200) {
            if (str.equals("fcm")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != 101230) {
            if (hashCode == 3142703 && str.equals("fiam")) {
                c2 = 2;
            }
            c2 = 65535;
        } else {
            if (str.equals("fdl")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (c2 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (c2 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }

    public static boolean f(oc.c cVar) {
        String str;
        if (cVar == null || (str = cVar.a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.c;
        if ((obj != null && i8f.a(obj) == null) || !i(str) || !j(str, cVar.b)) {
            return false;
        }
        String str2 = cVar.k;
        if (str2 != null && (!g(str2, cVar.l) || !e(str, cVar.k, cVar.l))) {
            return false;
        }
        String str3 = cVar.h;
        if (str3 != null && (!g(str3, cVar.i) || !e(str, cVar.h, cVar.i))) {
            return false;
        }
        String str4 = cVar.f;
        if (str4 != null) {
            return g(str4, cVar.g) && e(str, cVar.f, cVar.g);
        }
        return true;
    }

    public static boolean g(String str, Bundle bundle) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        Iterator it2 = d.iterator();
        while (it2.hasNext()) {
            if (bundle.containsKey((String) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(String str) {
        return !a.contains(str);
    }

    public static boolean i(String str) {
        return !c.contains(str);
    }

    public static boolean j(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (e.contains(str2)) {
            return false;
        }
        Iterator it2 = f.iterator();
        while (it2.hasNext()) {
            if (str2.matches((String) it2.next())) {
                return false;
            }
        }
        return true;
    }
}
