package androidx.navigation;

import androidx.navigation.Navigator;
import com.facebook.AuthenticationTokenClaims;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class k {
    public static final a b = new a(null);
    private static final Map c = new LinkedHashMap();
    private final Map a = new LinkedHashMap();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class cls) {
            zq3.h(cls, "navigatorClass");
            String str = (String) k.c.get(cls);
            if (str == null) {
                Navigator.b bVar = (Navigator.b) cls.getAnnotation(Navigator.b.class);
                str = bVar != null ? bVar.value() : null;
                if (!b(str)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + cls.getSimpleName()).toString());
                }
                k.c.put(cls, str);
            }
            zq3.e(str);
            return str;
        }

        public final boolean b(String str) {
            return str != null && str.length() > 0;
        }

        private a() {
        }
    }

    public final Navigator b(Navigator navigator) {
        zq3.h(navigator, "navigator");
        return c(b.a(navigator.getClass()), navigator);
    }

    public Navigator c(String str, Navigator navigator) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(navigator, "navigator");
        if (!b.b(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Navigator navigator2 = (Navigator) this.a.get(str);
        if (zq3.c(navigator2, navigator)) {
            return navigator;
        }
        boolean z = false;
        if (navigator2 != null && navigator2.c()) {
            z = true;
        }
        if (z) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        }
        if (!navigator.c()) {
            return (Navigator) this.a.put(str, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final Navigator d(Class cls) {
        zq3.h(cls, "navigatorClass");
        return e(b.a(cls));
    }

    public Navigator e(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        if (!b.b(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Navigator navigator = (Navigator) this.a.get(str);
        if (navigator != null) {
            return navigator;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public final Map f() {
        return t.v(this.a);
    }
}
