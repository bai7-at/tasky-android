package defpackage;

import java.io.File;
import java.util.Set;

/* loaded from: classes2.dex */
public interface oe2 {

    public static final class a {
        public static /* synthetic */ File a(oe2 oe2Var, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWritableFile");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return oe2Var.c(z);
        }
    }

    File a(File file);

    File c(boolean z);

    File d();

    File e(Set set);
}
