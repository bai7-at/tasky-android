package kotlin.io;

import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
public class FileSystemException extends IOException {
    private final File file;
    private final File other;
    private final String reason;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FileSystemException(java.io.File r2, java.io.File r3, java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "file"
            defpackage.zq3.h(r2, r0)
            java.lang.String r0 = defpackage.f62.a(r2, r3, r4)
            r1.<init>(r0)
            r1.file = r2
            r1.other = r3
            r1.reason = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileSystemException.<init>(java.io.File, java.io.File, java.lang.String):void");
    }
}
