package defpackage;

import java.util.Set;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes2.dex */
public abstract class ma4 {
    public static final a a;
    private static final Set b;
    private static final String c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set b() {
            return b0.j("ads_management", "create_event", "rsvp_event");
        }

        public final boolean c(String str) {
            if (str != null) {
                return h.K(str, "publish", false, 2, null) || h.K(str, "manage", false, 2, null) || ma4.b.contains(str);
            }
            return false;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        a = aVar;
        b = aVar.b();
        String cls = ma4.class.toString();
        zq3.g(cls, "LoginManager::class.java.toString()");
        c = cls;
    }
}
