package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;

/* loaded from: classes.dex */
public final class zp5 {
    private final ArrayList a = new ArrayList();
    private float[] b = new float[64];

    public final zp5 a(String str) {
        int i;
        char charAt;
        int i2;
        this.a.clear();
        int length = str.length();
        int i3 = 0;
        while (i3 < length && zq3.j(str.charAt(i3), 32) <= 0) {
            i3++;
        }
        while (length > i3 && zq3.j(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i4 = 0;
        while (i3 < length) {
            while (true) {
                i = i3 + 1;
                charAt = str.charAt(i3);
                int i5 = charAt | ' ';
                if ((i5 - 97) * (i5 - 122) <= 0 && i5 != 101) {
                    break;
                }
                if (i >= length) {
                    charAt = 0;
                    break;
                }
                i3 = i;
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i4 = 0;
                    while (true) {
                        if (i >= length || zq3.j(str.charAt(i), 32) > 0) {
                            long a = ja2.a(str, i, length);
                            i2 = (int) (a >>> 32);
                            float intBitsToFloat = Float.intBitsToFloat((int) (a & 4294967295L));
                            if (!Float.isNaN(intBitsToFloat)) {
                                float[] fArr = this.b;
                                int i6 = i4 + 1;
                                fArr[i4] = intBitsToFloat;
                                if (i6 >= fArr.length) {
                                    float[] fArr2 = new float[i6 * 2];
                                    this.b = fArr2;
                                    d.h(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i4 = i6;
                            }
                            while (i2 < length && str.charAt(i2) == ',') {
                                i2++;
                            }
                            if (i2 >= length || Float.isNaN(intBitsToFloat)) {
                                break;
                            }
                            i = i2;
                        } else {
                            i++;
                        }
                    }
                    i = i2;
                }
                vp5.a(charAt, this.a, this.b, i4);
            }
            i3 = i;
        }
        return this;
    }

    public final List b() {
        return this.a;
    }
}
