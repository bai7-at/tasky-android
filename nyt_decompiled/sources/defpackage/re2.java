package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.EncryptedFileReaderWriter;
import com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter;

/* loaded from: classes2.dex */
public interface re2 extends kf2, qe2 {
    public static final a b = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final re2 a(InternalLogger internalLogger, j12 j12Var) {
            zq3.h(internalLogger, "internalLogger");
            PlainFileReaderWriter plainFileReaderWriter = new PlainFileReaderWriter(internalLogger);
            return j12Var == null ? plainFileReaderWriter : new EncryptedFileReaderWriter(j12Var, plainFileReaderWriter, internalLogger);
        }
    }
}
