package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import java.io.File;
import java.util.Set;

/* loaded from: classes2.dex */
public final class mt7 implements oe2 {
    private final File a;
    private final InternalLogger b;

    public mt7(File file, InternalLogger internalLogger) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        zq3.h(internalLogger, "internalLogger");
        this.a = file;
        this.b = internalLogger;
    }

    @Override // defpackage.oe2
    public File a(File file) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        return null;
    }

    @Override // defpackage.oe2
    public File c(boolean z) {
        File parentFile = this.a.getParentFile();
        if (parentFile != null) {
            FileExtKt.i(parentFile, this.b);
        }
        return this.a;
    }

    @Override // defpackage.oe2
    public File d() {
        return null;
    }

    @Override // defpackage.oe2
    public File e(Set set) {
        zq3.h(set, "excludeFiles");
        File parentFile = this.a.getParentFile();
        if (parentFile != null) {
            FileExtKt.i(parentFile, this.b);
        }
        if (set.contains(this.a)) {
            return null;
        }
        return this.a;
    }
}
