package defpackage;

import androidx.datastore.preferences.core.MutablePreferences;
import com.facebook.AuthenticationTokenClaims;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes.dex */
public abstract class s16 {

    public static final class a {
        private final String a;

        public a(String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return zq3.c(this.a, ((a) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return this.a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract boolean b(a aVar);

    public abstract Object c(a aVar);

    public final MutablePreferences d() {
        return new MutablePreferences(t.x(a()), false);
    }

    public final s16 e() {
        return new MutablePreferences(t.x(a()), true);
    }
}
