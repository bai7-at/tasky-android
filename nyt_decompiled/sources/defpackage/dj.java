package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class dj {
    public static final dj a = new dj();

    private dj() {
    }

    public final File a(Context context) {
        zq3.h(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        zq3.g(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
