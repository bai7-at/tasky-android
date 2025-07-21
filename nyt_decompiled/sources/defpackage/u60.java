package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter;

/* loaded from: classes2.dex */
public interface u60 extends kf2, t60 {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final u60 a(InternalLogger internalLogger, j12 j12Var) {
            zq3.h(internalLogger, "internalLogger");
            PlainBatchFileReaderWriter plainBatchFileReaderWriter = new PlainBatchFileReaderWriter(internalLogger);
            return j12Var == null ? plainBatchFileReaderWriter : new h12(j12Var, plainBatchFileReaderWriter, internalLogger);
        }
    }
}
