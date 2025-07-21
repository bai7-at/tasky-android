package com.nytimes.android.resourcedownloader.utils;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.lf2;
import defpackage.ss2;
import defpackage.yj0;
import defpackage.zq3;
import java.io.File;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.collections.d;

/* loaded from: classes4.dex */
public class FileSystemPersister {
    private final File a;
    private final String b;

    public FileSystemPersister(File file, String str) {
        zq3.h(file, "baseDir");
        zq3.h(str, "prefix");
        this.a = file;
        this.b = str;
    }

    private final File b(String str) {
        File file = new File(this.a, this.b + "/" + str);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        return file;
    }

    private final String c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(yj0.b);
        zq3.g(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        zq3.e(digest);
        return d.q0(digest, "", null, null, 0, null, new ss2() { // from class: com.nytimes.android.resourcedownloader.utils.FileSystemPersister$hash$1
            public final CharSequence b(byte b) {
                String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                zq3.g(format, "format(...)");
                return format;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).byteValue());
            }
        }, 30, null);
    }

    public final boolean a(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        return b(c(str)).delete();
    }

    public final String d(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        File b = b(c(str));
        if (b.exists()) {
            return lf2.g(b, null, 1, null);
        }
        return null;
    }

    public final String e(String str, String str2) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "raw");
        if (!this.a.exists()) {
            this.a.mkdir();
        }
        String c = c(str);
        lf2.i(b(c), str2, null, 2, null);
        return c;
    }
}
