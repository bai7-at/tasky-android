package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.mb6;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes3.dex */
class nb6 implements me2 {
    private static final Charset d = Charset.forName(Constants.DEFAULT_ENCODING);
    private final File a;
    private final int b;
    private mb6 c;

    class a implements mb6.d {
        final /* synthetic */ byte[] a;
        final /* synthetic */ int[] b;

        a(byte[] bArr, int[] iArr) {
            this.a = bArr;
            this.b = iArr;
        }

        @Override // mb6.d
        public void a(InputStream inputStream, int i) {
            try {
                inputStream.read(this.a, this.b[0], i);
                int[] iArr = this.b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    private static class b {
        public final byte[] a;
        public final int b;

        b(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    nb6(File file, int i) {
        this.a = file;
        this.b = i;
    }

    private void f(long j, String str) {
        if (this.c == null) {
            return;
        }
        if (str == null) {
            str = Constants.NULL_VERSION_ID;
        }
        try {
            int i = this.b / 4;
            if (str.length() > i) {
                str = "..." + str.substring(str.length() - i);
            }
            this.c.i(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(d));
            while (!this.c.C() && this.c.F0() > this.b) {
                this.c.f0();
            }
        } catch (IOException e) {
            m94.f().e("There was a problem writing to the Crashlytics log.", e);
        }
    }

    private b g() {
        if (!this.a.exists()) {
            return null;
        }
        h();
        mb6 mb6Var = this.c;
        if (mb6Var == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[mb6Var.F0()];
        try {
            this.c.r(new a(bArr, iArr));
        } catch (IOException e) {
            m94.f().e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.c == null) {
            try {
                this.c = new mb6(this.a);
            } catch (IOException e) {
                m94.f().e("Could not open log file: " + this.a, e);
            }
        }
    }

    @Override // defpackage.me2
    public void a() {
        CommonUtils.e(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override // defpackage.me2
    public String b() {
        byte[] c = c();
        if (c != null) {
            return new String(c, d);
        }
        return null;
    }

    @Override // defpackage.me2
    public byte[] c() {
        b g = g();
        if (g == null) {
            return null;
        }
        int i = g.b;
        byte[] bArr = new byte[i];
        System.arraycopy(g.a, 0, bArr, 0, i);
        return bArr;
    }

    @Override // defpackage.me2
    public void d() {
        a();
        this.a.delete();
    }

    @Override // defpackage.me2
    public void e(long j, String str) {
        h();
        f(j, str);
    }
}
