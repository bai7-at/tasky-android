package defpackage;

import java.io.File;
import kotlin.text.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class pf2 extends of2 {
    public static boolean m(File file) {
        zq3.h(file, "<this>");
        while (true) {
            boolean z = true;
            for (File file2 : of2.l(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static String n(File file) {
        zq3.h(file, "<this>");
        String name = file.getName();
        zq3.g(name, "getName(...)");
        return h.R0(name, '.', "");
    }

    public static final File o(File file, File file2) {
        zq3.h(file, "<this>");
        zq3.h(file2, "relative");
        if (mf2.b(file2)) {
            return file2;
        }
        String file3 = file.toString();
        zq3.g(file3, "toString(...)");
        if (file3.length() != 0) {
            char c = File.separatorChar;
            if (!h.S(file3, c, false, 2, null)) {
                return new File(file3 + c + file2);
            }
        }
        return new File(file3 + file2);
    }

    public static File p(File file, String str) {
        zq3.h(file, "<this>");
        zq3.h(str, "relative");
        return o(file, new File(str));
    }
}
