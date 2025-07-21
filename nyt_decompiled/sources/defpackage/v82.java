package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes4.dex */
class v82 {
    private final String a;
    private final File b;

    v82(File file, String str) {
        this.a = str;
        File file2 = new File(file, str);
        this.b = file2;
        if (file2.exists() && file2.isDirectory()) {
            throw new FileNotFoundException(String.format("expecting a file at %s, instead found a directory", str));
        }
        new b29().a(file2);
    }

    public void a() {
        if (this.b.delete()) {
            return;
        }
        throw new IllegalStateException("unable to delete " + this.b);
    }

    public boolean b() {
        return this.b.exists();
    }

    public long c() {
        return this.b.lastModified();
    }

    public sd0 d() {
        if (this.b.exists()) {
            return wd5.d(wd5.k(this.b));
        }
        throw new FileNotFoundException(this.a);
    }

    public void e(sd0 sd0Var) {
        File createTempFile = File.createTempFile("new", "tmp", this.b.getParentFile());
        qd0 qd0Var = null;
        try {
            try {
                qd0Var = wd5.c(wd5.f(createTempFile));
                qd0Var.I0(sd0Var);
                if (createTempFile.renameTo(this.b)) {
                    createTempFile.delete();
                    qd0Var.close();
                    sd0Var.close();
                } else {
                    throw new IOException("unable to move tmp file to " + this.b.getPath());
                }
            } catch (Exception e) {
                throw new IOException("unable to write to file", e);
            }
        } catch (Throwable th) {
            createTempFile.delete();
            if (qd0Var != null) {
                qd0Var.close();
            }
            sd0Var.close();
            throw th;
        }
    }
}
