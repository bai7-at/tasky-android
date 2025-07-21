package defpackage;

import android.util.Base64;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.File;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class ge2 {
    private final File a;

    public ge2(File file) {
        zq3.h(file, "baseDir");
        this.a = file;
    }

    private final String a(String str) {
        String encodeToString = Base64.encodeToString(h.t(str), 3);
        zq3.g(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public final File b(Class cls, String str) {
        zq3.h(cls, "clazz");
        zq3.h(str, TransferTable.COLUMN_KEY);
        String name = cls.getName();
        zq3.g(name, "getName(...)");
        String a = a(name);
        String a2 = a(str);
        File file = new File(this.a, a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, a2);
    }

    public final String c(Class cls, String str) {
        zq3.h(cls, "clazz");
        zq3.h(str, TransferTable.COLUMN_KEY);
        File b = b(cls, str);
        if (b.exists()) {
            return lf2.g(b, null, 1, null);
        }
        return null;
    }

    public final void d(Class cls, String str, String str2) {
        zq3.h(cls, "clazz");
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "content");
        lf2.i(b(cls, str), str2, null, 2, null);
    }
}
