package defpackage;

import org.threeten.bp.Instant;
import org.threeten.bp.ZoneId;

/* loaded from: classes4.dex */
public interface ub1 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final Instant a() {
            Instant now = Instant.now();
            zq3.g(now, "now(...)");
            return now;
        }

        public final ZoneId b() {
            ZoneId systemDefault = ZoneId.systemDefault();
            zq3.g(systemDefault, "systemDefault(...)");
            return systemDefault;
        }
    }
}
