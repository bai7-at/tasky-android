package defpackage;

import defpackage.s11;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
class zd2 implements d25 {
    private final File a;
    private final String b;
    private final String c;

    zd2(String str, String str2, File file) {
        this.b = str;
        this.c = str2;
        this.a = file;
    }

    private byte[] a() {
        byte[] bArr = new byte[8192];
        try {
            InputStream h = h();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (h == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (h != null) {
                            h.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = h.read(bArr);
                            if (read <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                h.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, read);
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // defpackage.d25
    public InputStream h() {
        if (this.a.exists() && this.a.isFile()) {
            try {
                return new FileInputStream(this.a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.d25
    public s11.d.b i() {
        byte[] a = a();
        if (a != null) {
            return s11.d.b.a().b(a).c(this.b).a();
        }
        return null;
    }

    @Override // defpackage.d25
    public String j() {
        return this.c;
    }
}
