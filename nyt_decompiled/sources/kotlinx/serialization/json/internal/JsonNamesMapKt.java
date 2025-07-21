package kotlinx.serialization.json.internal;

import com.facebook.AuthenticationTokenClaims;
import defpackage.at3;
import defpackage.du3;
import defpackage.hk7;
import defpackage.qs2;
import defpackage.wt3;
import defpackage.xt3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.t;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes5.dex */
public abstract class JsonNamesMapKt {
    private static final b.a a = new b.a();
    private static final b.a b = new b.a();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(SerialDescriptor serialDescriptor, at3 at3Var) {
        String str;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean d = d(at3Var, serialDescriptor);
        l(serialDescriptor, at3Var);
        int e = serialDescriptor.e();
        for (int i = 0; i < e; i++) {
            List g = serialDescriptor.g(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : g) {
                if (obj instanceof wt3) {
                    arrayList.add(obj);
                }
            }
            wt3 wt3Var = (wt3) kotlin.collections.i.K0(arrayList);
            if (wt3Var != null && (names = wt3Var.names()) != null) {
                for (String str2 : names) {
                    if (d) {
                        str2 = str2.toLowerCase(Locale.ROOT);
                        zq3.g(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    }
                    c(linkedHashMap, serialDescriptor, str2, i);
                }
            }
            if (d) {
                str = serialDescriptor.f(i).toLowerCase(Locale.ROOT);
                zq3.g(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            } else {
                str = null;
            }
            if (str != null) {
                c(linkedHashMap, serialDescriptor, str, i);
            }
        }
        return linkedHashMap.isEmpty() ? t.i() : linkedHashMap;
    }

    private static final void c(Map map, SerialDescriptor serialDescriptor, String str, int i) {
        String str2 = zq3.c(serialDescriptor.d(), hk7.b.a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.f(i) + " is already one of the names for " + str2 + ' ' + serialDescriptor.f(((Number) t.j(map, str)).intValue()) + " in " + serialDescriptor);
    }

    private static final boolean d(at3 at3Var, SerialDescriptor serialDescriptor) {
        return at3Var.e().e() && zq3.c(serialDescriptor.d(), hk7.b.a);
    }

    public static final Map e(final at3 at3Var, final SerialDescriptor serialDescriptor) {
        zq3.h(at3Var, "<this>");
        zq3.h(serialDescriptor, "descriptor");
        return (Map) du3.a(at3Var).b(serialDescriptor, a, new qs2() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt$deserializationNamesMap$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Map mo865invoke() {
                Map b2;
                b2 = JsonNamesMapKt.b(SerialDescriptor.this, at3Var);
                return b2;
            }
        });
    }

    public static final b.a f() {
        return a;
    }

    public static final String g(SerialDescriptor serialDescriptor, at3 at3Var, int i) {
        zq3.h(serialDescriptor, "<this>");
        zq3.h(at3Var, "json");
        l(serialDescriptor, at3Var);
        return serialDescriptor.f(i);
    }

    public static final int h(SerialDescriptor serialDescriptor, at3 at3Var, String str) {
        zq3.h(serialDescriptor, "<this>");
        zq3.h(at3Var, "json");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        if (d(at3Var, serialDescriptor)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            zq3.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return k(serialDescriptor, at3Var, lowerCase);
        }
        l(serialDescriptor, at3Var);
        int c = serialDescriptor.c(str);
        return (c == -3 && at3Var.e().l()) ? k(serialDescriptor, at3Var, str) : c;
    }

    public static final int i(SerialDescriptor serialDescriptor, at3 at3Var, String str, String str2) {
        zq3.h(serialDescriptor, "<this>");
        zq3.h(at3Var, "json");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "suffix");
        int h = h(serialDescriptor, at3Var, str);
        if (h != -3) {
            return h;
        }
        throw new SerializationException(serialDescriptor.i() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static /* synthetic */ int j(SerialDescriptor serialDescriptor, at3 at3Var, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return i(serialDescriptor, at3Var, str, str2);
    }

    private static final int k(SerialDescriptor serialDescriptor, at3 at3Var, String str) {
        Integer num = (Integer) e(at3Var, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final xt3 l(SerialDescriptor serialDescriptor, at3 at3Var) {
        zq3.h(serialDescriptor, "<this>");
        zq3.h(at3Var, "json");
        if (!zq3.c(serialDescriptor.d(), a.C0501a.a)) {
            return null;
        }
        at3Var.e().i();
        return null;
    }
}
