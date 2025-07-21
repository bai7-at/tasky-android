package com.nytimes.android.abra.io;

import defpackage.lf2;
import defpackage.zq3;
import java.io.File;

/* loaded from: classes2.dex */
public final class FileHelper {
    public final boolean doesFileExist(String str) {
        zq3.h(str, "path");
        return new File(str).exists();
    }

    public final long lastModified(String str) {
        zq3.h(str, "path");
        return new File(str).lastModified();
    }

    public final String readText(String str) {
        zq3.h(str, "path");
        return lf2.g(new File(str), null, 1, null);
    }
}
