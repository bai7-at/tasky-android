package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
class te2 {
    te2() {
    }

    public boolean a(File file) {
        return file.exists();
    }

    public File b(String str) {
        return new File(str);
    }

    public long c(File file) {
        return file.length();
    }
}
