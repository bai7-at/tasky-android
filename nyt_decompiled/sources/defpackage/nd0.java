package defpackage;

import com.nytimes.android.eventtracker.buffer.UploadStatus;
import com.nytimes.android.eventtracker.buffer.ValidationStatus;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public interface nd0 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final long b = TimeUnit.DAYS.toMillis(7);

        private a() {
        }

        public final long a() {
            return b;
        }
    }

    public static final class b {
        public static /* synthetic */ Object a(nd0 nd0Var, long j, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteArchivedEvents");
            }
            if ((i & 1) != 0) {
                j = System.currentTimeMillis() - nd0.Companion.a();
            }
            return nd0Var.f(j, by0Var);
        }

        public static Object b(nd0 nd0Var, by0 by0Var) {
            return nd0Var.h(UploadStatus.PENDING, ValidationStatus.INVALID, by0Var);
        }

        public static /* synthetic */ Object c(nd0 nd0Var, UploadStatus uploadStatus, ValidationStatus validationStatus, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUploadCount");
            }
            if ((i & 1) != 0) {
                uploadStatus = UploadStatus.PENDING;
            }
            if ((i & 2) != 0) {
                validationStatus = ValidationStatus.INVALID;
            }
            return nd0Var.g(uploadStatus, validationStatus, by0Var);
        }
    }

    Object a(by0 by0Var);

    Object b(by0 by0Var);

    Object c(md0 md0Var, by0 by0Var);

    Object d(String str, by0 by0Var);

    Object e(md0 md0Var, by0 by0Var);

    Object f(long j, by0 by0Var);

    Object g(UploadStatus uploadStatus, ValidationStatus validationStatus, by0 by0Var);

    Object h(UploadStatus uploadStatus, ValidationStatus validationStatus, by0 by0Var);
}
