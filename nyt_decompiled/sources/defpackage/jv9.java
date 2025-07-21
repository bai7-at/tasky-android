package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;

/* loaded from: classes3.dex */
public final class jv9 {
    public final String a;

    private jv9(int i, int i2, String str) {
        this.a = str;
    }

    public static jv9 a(b9e b9eVar) {
        String str;
        b9eVar.l(2);
        int B = b9eVar.B();
        int i = B >> 1;
        int i2 = B & 1;
        int B2 = b9eVar.B() >> 3;
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
        int i3 = B2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i3 >= 10 ? InstructionFileId.DOT : ".0");
        sb.append(i3);
        return new jv9(i, i3, sb.toString());
    }
}
