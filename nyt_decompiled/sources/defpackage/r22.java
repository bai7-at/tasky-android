package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;

/* loaded from: classes3.dex */
public abstract class r22 {
    private static final int[] a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[][] b = {new int[]{228, 48, 15, ContentType.SHORT_FORM_ON_DEMAND, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, 116, 255, 110, 61}, new int[]{175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, AdvertisementType.ON_DEMAND_POST_ROLL, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, AdvertisementType.ON_DEMAND_POST_ROLL, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, 195, 244, 9, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{AdvertisementType.ON_DEMAND_PRE_ROLL, AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, 17, 138, 110, AdvertisementType.ON_DEMAND_POST_ROLL, 141, 136, 120, 151, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL, 168, 93, 255}, new int[]{245, 127, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, ContentType.LONG_FORM_ON_DEMAND}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, ContentType.SHORT_FORM_ON_DEMAND, 57, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL, 205, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, AdvertisementType.ON_DEMAND_POST_ROLL, 92, 253, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, AdvertisementType.BRANDED_DURING_LIVE, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, AdvertisementType.BRANDED_AS_CONTENT, 117, 203, 29, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL, 144, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, 107, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, 185, ContentType.LONG_FORM_ON_DEMAND, 134, 230, 245, 63, 197, 190, 250, 106, 185, AdvertisementType.LIVE, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, AdvertisementType.ON_DEMAND_POST_ROLL, 136, 248, 180, AdvertisementType.BRANDED_AS_CONTENT, 197, 158, 177, 68, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, 93, AdvertisementType.ON_DEMAND_POST_ROLL, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 220, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL, 96, 210, AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL, AdvertisementType.ON_DEMAND_PRE_ROLL, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};
    private static final int[] c = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
    private static final int[] d = new int[255];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            d[i2] = i;
            c[i] = i2;
            i <<= 1;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    private static String a(CharSequence charSequence, int i) {
        return b(charSequence, 0, charSequence.length(), i);
    }

    private static String b(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 0;
        while (true) {
            int[] iArr = a;
            if (i6 >= iArr.length) {
                i6 = -1;
                break;
            }
            if (iArr[i6] == i3) {
                break;
            }
            i6++;
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i3)));
        }
        int[] iArr2 = b[i6];
        char[] cArr = new char[i3];
        for (int i7 = 0; i7 < i3; i7++) {
            cArr[i7] = 0;
        }
        for (int i8 = i; i8 < i + i2; i8++) {
            int i9 = i3 - 1;
            int charAt = cArr[i9] ^ charSequence.charAt(i8);
            while (i9 > 0) {
                if (charAt == 0 || (i5 = iArr2[i9]) == 0) {
                    cArr[i9] = cArr[i9 - 1];
                } else {
                    char c2 = cArr[i9 - 1];
                    int[] iArr3 = d;
                    int[] iArr4 = c;
                    cArr[i9] = (char) (iArr3[(iArr4[charAt] + iArr4[i5]) % 255] ^ c2);
                }
                i9--;
            }
            if (charAt == 0 || (i4 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = d;
                int[] iArr6 = c;
                cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[i4]) % 255];
            }
        }
        char[] cArr2 = new char[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            cArr2[i10] = cArr[(i3 - i10) - 1];
        }
        return String.valueOf(cArr2);
    }

    public static String c(String str, jd8 jd8Var) {
        if (str.length() != jd8Var.a()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb = new StringBuilder(jd8Var.a() + jd8Var.c());
        sb.append(str);
        int f = jd8Var.f();
        if (f == 1) {
            sb.append(a(str, jd8Var.c()));
        } else {
            sb.setLength(sb.capacity());
            int[] iArr = new int[f];
            int[] iArr2 = new int[f];
            int[] iArr3 = new int[f];
            int i = 0;
            while (i < f) {
                int i2 = i + 1;
                iArr[i] = jd8Var.b(i2);
                iArr2[i] = jd8Var.d(i2);
                iArr3[i] = 0;
                if (i > 0) {
                    iArr3[i] = iArr3[i - 1] + iArr[i];
                }
                i = i2;
            }
            for (int i3 = 0; i3 < f; i3++) {
                StringBuilder sb2 = new StringBuilder(iArr[i3]);
                for (int i4 = i3; i4 < jd8Var.a(); i4 += f) {
                    sb2.append(str.charAt(i4));
                }
                String a2 = a(sb2.toString(), iArr2[i3]);
                int i5 = i3;
                int i6 = 0;
                while (i5 < iArr2[i3] * f) {
                    sb.setCharAt(jd8Var.a() + i5, a2.charAt(i6));
                    i5 += f;
                    i6++;
                }
            }
        }
        return sb.toString();
    }
}
