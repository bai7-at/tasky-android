package defpackage;

import io.reactivex.Flowable;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes4.dex */
public interface os6 {

    public static final class a {
        public static /* synthetic */ void a(os6 os6Var, z18 z18Var, OffsetDateTime offsetDateTime, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerViewedAsset");
            }
            if ((i & 2) != 0) {
                offsetDateTime = OffsetDateTime.now();
                zq3.g(offsetDateTime, "now(...)");
            }
            os6Var.a(z18Var, offsetDateTime);
        }
    }

    void a(z18 z18Var, OffsetDateTime offsetDateTime);

    Flowable b(int i);
}
