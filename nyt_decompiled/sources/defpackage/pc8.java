package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class pc8 {
    public static final pc8 a = new pc8();

    private pc8() {
    }

    public static final File a(Context context) {
        zq3.h(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        zq3.g(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
