package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import defpackage.gh5;
import defpackage.m80;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Code128Writer extends gh5 {

    private enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int f(CharSequence charSequence, int i, int i2) {
        CType g;
        CType g2;
        char charAt;
        CType g3 = g(charSequence, i);
        CType cType = CType.ONE_DIGIT;
        if (g3 == cType) {
            return 100;
        }
        CType cType2 = CType.UNCODABLE;
        if (g3 == cType2) {
            return (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || charAt >= '`'))) ? 100 : 101;
        }
        if (i2 == 99) {
            return 99;
        }
        if (i2 != 100) {
            if (g3 == CType.FNC_1) {
                g3 = g(charSequence, i + 1);
            }
            return g3 == CType.TWO_DIGITS ? 99 : 100;
        }
        CType cType3 = CType.FNC_1;
        if (g3 == cType3 || (g = g(charSequence, i + 2)) == cType2 || g == cType) {
            return 100;
        }
        if (g == cType3) {
            return g(charSequence, i + 3) == CType.TWO_DIGITS ? 99 : 100;
        }
        int i3 = i + 4;
        while (true) {
            g2 = g(charSequence, i3);
            if (g2 != CType.TWO_DIGITS) {
                break;
            }
            i3 += 2;
        }
        return g2 == CType.ONE_DIGIT ? 100 : 99;
    }

    private static CType g(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return CType.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return CType.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        return (charAt2 < '0' || charAt2 > '9') ? CType.ONE_DIGIT : CType.TWO_DIGITS;
    }

    @Override // defpackage.gh5, defpackage.pl9
    public m80 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // defpackage.gh5
    public boolean[] c(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = 103;
            if (i3 >= length) {
                int[][] iArr = a.a;
                arrayList.add(iArr[i4 % 103]);
                arrayList.add(iArr[106]);
                int i8 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i9 : iArr2) {
                        i8 += i9;
                    }
                }
                boolean[] zArr = new boolean[i8];
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    i += gh5.b(zArr, i, (int[]) it2.next(), true);
                }
                return zArr;
            }
            int f = f(str, i3, i5);
            int i10 = 100;
            if (f == i5) {
                switch (str.charAt(i3)) {
                    case 241:
                        i10 = 102;
                        break;
                    case 242:
                        i10 = 97;
                        break;
                    case 243:
                        i10 = 96;
                        break;
                    case 244:
                        if (i5 == 101) {
                            i10 = 101;
                            break;
                        }
                        break;
                    default:
                        if (i5 != 100) {
                            if (i5 != 101) {
                                i10 = Integer.parseInt(str.substring(i3, i3 + 2));
                                i3++;
                                break;
                            } else {
                                char charAt2 = str.charAt(i3);
                                i10 = charAt2 - ' ';
                                if (i10 < 0) {
                                    i10 = charAt2 + '@';
                                    break;
                                }
                            }
                        } else {
                            i10 = str.charAt(i3) - ' ';
                            break;
                        }
                        break;
                }
                i3++;
            } else {
                if (i5 != 0) {
                    i7 = f;
                } else if (f == 100) {
                    i7 = 104;
                } else if (f != 101) {
                    i7 = 105;
                }
                i10 = i7;
                i5 = f;
            }
            arrayList.add(a.a[i10]);
            i4 += i10 * i6;
            if (i3 != 0) {
                i6++;
            }
        }
    }
}
