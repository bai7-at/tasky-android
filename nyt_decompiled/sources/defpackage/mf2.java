package defpackage;

import java.io.File;
import kotlin.text.h;

/* loaded from: classes5.dex */
abstract class mf2 {
    private static final int a(String str) {
        int a0;
        char c = File.separatorChar;
        int a02 = h.a0(str, c, 0, false, 4, null);
        if (a02 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (a0 = h.a0(str, c, 2, false, 4, null)) < 0) {
                return 1;
            }
            int a03 = h.a0(str, c, a0 + 1, false, 4, null);
            return a03 >= 0 ? a03 + 1 : str.length();
        }
        if (a02 > 0 && str.charAt(a02 - 1) == ':') {
            return a02 + 1;
        }
        if (a02 == -1 && h.S(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final boolean b(File file) {
        zq3.h(file, "<this>");
        String path = file.getPath();
        zq3.g(path, "getPath(...)");
        return a(path) > 0;
    }
}
