package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class wm0 {
    private static final byte[] a = {0, 0, 0, 1};
    private static final String[] b = {"", "A", "B", "C"};

    public static String a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static List b(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static String c(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        StringBuilder sb = new StringBuilder(z19.D("hvc1.%s%d.%X.%c%d", b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static byte[] d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    private static int e(byte[] bArr, int i) {
        int length = bArr.length - a.length;
        while (i <= length) {
            if (g(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static Pair f(byte[] bArr) {
        boolean z;
        yo5 yo5Var = new yo5(bArr);
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 3;
            if (i3 >= bArr.length) {
                z = false;
                break;
            }
            if (yo5Var.K() == 1 && (bArr[i3] & 240) == 32) {
                z = true;
                break;
            }
            yo5Var.U(yo5Var.f() - 2);
            i2++;
        }
        ur.b(z, "Invalid input: VOL not found.");
        xo5 xo5Var = new xo5(bArr);
        xo5Var.r((i2 + 4) * 8);
        xo5Var.r(1);
        xo5Var.r(8);
        if (xo5Var.g()) {
            xo5Var.r(4);
            xo5Var.r(3);
        }
        if (xo5Var.h(4) == 15) {
            xo5Var.r(8);
            xo5Var.r(8);
        }
        if (xo5Var.g()) {
            xo5Var.r(2);
            xo5Var.r(1);
            if (xo5Var.g()) {
                xo5Var.r(79);
            }
        }
        ur.b(xo5Var.h(2) == 0, "Only supports rectangular video object layer shape.");
        ur.a(xo5Var.g());
        int h = xo5Var.h(16);
        ur.a(xo5Var.g());
        if (xo5Var.g()) {
            ur.a(h > 0);
            for (int i4 = h - 1; i4 > 0; i4 >>= 1) {
                i++;
            }
            xo5Var.r(i);
        }
        ur.a(xo5Var.g());
        int h2 = xo5Var.h(13);
        ur.a(xo5Var.g());
        int h3 = xo5Var.h(13);
        ur.a(xo5Var.g());
        xo5Var.r(1);
        return Pair.create(Integer.valueOf(h2), Integer.valueOf(h3));
    }

    private static boolean g(byte[] bArr, int i) {
        if (bArr.length - i <= a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static Pair h(byte[] bArr) {
        yo5 yo5Var = new yo5(bArr);
        yo5Var.U(9);
        int H = yo5Var.H();
        yo5Var.U(20);
        return Pair.create(Integer.valueOf(yo5Var.L()), Integer.valueOf(H));
    }

    public static boolean i(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }

    public static byte[][] j(byte[] bArr) {
        if (!g(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            arrayList.add(Integer.valueOf(i));
            i = e(bArr, i + a.length);
        } while (i != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            int intValue2 = (i2 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i2 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i2] = bArr3;
            i2++;
        }
        return bArr2;
    }
}
