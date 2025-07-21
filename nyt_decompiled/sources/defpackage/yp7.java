package defpackage;

import java.io.File;

/* loaded from: classes4.dex */
public final class yp7 {
    private final File a;
    private final File b;
    private final String c;
    private final String d;

    public yp7(File file, File file2, String str, String str2) {
        this.a = file;
        this.b = file2;
        this.c = str;
        this.d = str2;
    }

    public final String a() {
        return this.d;
    }

    public final File b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final File d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp7)) {
            return false;
        }
        yp7 yp7Var = (yp7) obj;
        return zq3.c(this.a, yp7Var.a) && zq3.c(this.b, yp7Var.b) && zq3.c(this.c, yp7Var.c) && zq3.c(this.d, yp7Var.d);
    }

    public int hashCode() {
        File file = this.a;
        int hashCode = (file == null ? 0 : file.hashCode()) * 31;
        File file2 = this.b;
        int hashCode2 = (hashCode + (file2 == null ? 0 : file2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ShareInstagramStories(backgroundLocalFile=" + this.a + ", stickerLocalFile=" + this.b + ", backgroundTopHex=" + this.c + ", backgroundBottomHex=" + this.d + ")";
    }
}
