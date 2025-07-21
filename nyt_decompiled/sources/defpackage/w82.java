package defpackage;

import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes2.dex */
public final class w82 {
    private final String a;
    private final File b;

    public w82(File file, String str) {
        zq3.h(file, "root");
        zq3.h(str, "pathValue");
        this.a = str;
        File file2 = new File(file, str);
        this.b = file2;
        if (!file2.exists() || !file2.isDirectory()) {
            y19.a.a(file2);
            return;
        }
        throw new FileNotFoundException("expecting a file at " + str + ", instead found a directory");
    }

    public final void a() {
        if (!this.b.delete()) {
            throw new IllegalStateException(zq3.q("unable to delete ", this.b));
        }
    }

    public final boolean b() {
        return this.b.exists();
    }

    public final sd0 c() {
        if (this.b.exists()) {
            return wd5.d(wd5.k(this.b));
        }
        throw new FileNotFoundException(this.a);
    }
}
