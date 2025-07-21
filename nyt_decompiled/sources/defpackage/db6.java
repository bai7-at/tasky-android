package defpackage;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

/* loaded from: classes3.dex */
public final class db6 {
    private Mode a;
    private ErrorCorrectionLevel b;
    private c59 c;
    private int d = -1;
    private of0 e;

    public static boolean b(int i) {
        return i >= 0 && i < 8;
    }

    public of0 a() {
        return this.e;
    }

    public void c(ErrorCorrectionLevel errorCorrectionLevel) {
        this.b = errorCorrectionLevel;
    }

    public void d(int i) {
        this.d = i;
    }

    public void e(of0 of0Var) {
        this.e = of0Var;
    }

    public void f(Mode mode) {
        this.a = mode;
    }

    public void g(c59 c59Var) {
        this.c = c59Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
