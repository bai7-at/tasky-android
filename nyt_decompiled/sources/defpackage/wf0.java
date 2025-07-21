package defpackage;

import defpackage.s11;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
class wf0 implements d25 {
    private final byte[] a;
    private final String b;
    private final String c;

    wf0(String str, String str2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.a = bArr;
    }

    private byte[] a() {
        if (b()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean b() {
        byte[] bArr = this.a;
        return bArr == null || bArr.length == 0;
    }

    @Override // defpackage.d25
    public InputStream h() {
        if (b()) {
            return null;
        }
        return new ByteArrayInputStream(this.a);
    }

    @Override // defpackage.d25
    public s11.d.b i() {
        byte[] a = a();
        if (a == null) {
            return null;
        }
        return s11.d.b.a().b(a).c(this.b).a();
    }

    @Override // defpackage.d25
    public String j() {
        return this.c;
    }
}
