package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class ue2 {
    private final File a;
    private final File b;
    private final File c;
    private final File d;
    private final File e;

    public ue2(Context context) {
        File p = p(new File(context.getFilesDir(), ".com.google.firebase.crashlytics.files.v1"));
        this.a = p;
        this.b = p(new File(p, "open-sessions"));
        this.c = p(new File(p, "reports"));
        this.d = p(new File(p, "priority-reports"));
        this.e = p(new File(p, "native-reports"));
    }

    private File m(String str) {
        return q(new File(this.b, str));
    }

    private static synchronized File p(File file) {
        synchronized (ue2.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                    m94.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                    file.delete();
                }
                if (!file.mkdirs()) {
                    m94.f().d("Could not create Crashlytics-specific directory: " + file);
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static File q(File file) {
        file.mkdirs();
        return file;
    }

    static boolean r(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                r(file2);
            }
        }
        return file.delete();
    }

    private static List s(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    public void a() {
        File[] fileArr = {new File(this.a.getParent(), ".com.google.firebase.crashlytics"), new File(this.a.getParent(), ".com.google.firebase.crashlytics-ndk")};
        for (int i = 0; i < 2; i++) {
            File file = fileArr[i];
            if (file.exists() && r(file)) {
                m94.f().b("Deleted legacy Crashlytics files from " + file.getPath());
            }
        }
    }

    public boolean b(String str) {
        return r(new File(this.b, str));
    }

    public List c() {
        return s(this.b.list());
    }

    public File d(String str) {
        return new File(this.a, str);
    }

    public List e(FilenameFilter filenameFilter) {
        return s(this.a.listFiles(filenameFilter));
    }

    public File f(String str) {
        return new File(this.e, str);
    }

    public List g() {
        return s(this.e.listFiles());
    }

    public File h(String str) {
        return q(new File(m(str), "native"));
    }

    public File i(String str) {
        return new File(this.d, str);
    }

    public List j() {
        return s(this.d.listFiles());
    }

    public File k(String str) {
        return new File(this.c, str);
    }

    public List l() {
        return s(this.c.listFiles());
    }

    public File n(String str, String str2) {
        return new File(m(str), str2);
    }

    public List o(String str, FilenameFilter filenameFilter) {
        return s(m(str).listFiles(filenameFilter));
    }
}
