package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;

/* loaded from: classes2.dex */
public final class it1 {
    public final int a;
    public final int b;
    public final String c;

    private it1(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public static it1 a(yo5 yo5Var) {
        String str;
        yo5Var.V(2);
        int H = yo5Var.H();
        int i = H >> 1;
        int H2 = ((yo5Var.H() >> 3) & 31) | ((H & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(H2 >= 10 ? InstructionFileId.DOT : ".0");
        sb.append(H2);
        return new it1(i, H2, sb.toString());
    }
}
