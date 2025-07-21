package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.File;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b75 implements oe2 {
    @Override // defpackage.oe2
    public File a(File file) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        return null;
    }

    @Override // defpackage.oe2
    public File c(boolean z) {
        return null;
    }

    @Override // defpackage.oe2
    public File d() {
        return null;
    }

    @Override // defpackage.oe2
    public File e(Set set) {
        zq3.h(set, "excludeFiles");
        return null;
    }
}
