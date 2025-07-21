package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class jz8 {
    private final String[] a;
    private final int[] b;
    private final String[] c;
    private final int d;

    private jz8(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.a = strArr;
        this.b = iArr;
        this.c = strArr2;
        this.d = i;
    }

    public static jz8 b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new jz8(strArr, iArr, strArr2, c(str, strArr, iArr, strArr2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String str2;
        boolean z;
        strArr[0] = "";
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf("$", i);
            if (indexOf == -1) {
                strArr[i2] = strArr[i2] + str.substring(i);
                i = str.length();
            } else if (indexOf != i) {
                strArr[i2] = strArr[i2] + str.substring(i, indexOf);
                i = indexOf;
            } else if (str.startsWith("$$", i)) {
                strArr[i2] = strArr[i2] + "$";
                i += 2;
            } else {
                int i3 = i + 1;
                int indexOf2 = str.indexOf("$", i3);
                String substring = str.substring(i3, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i2] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith(QueryKeys.SUBDOMAIN) && !str2.endsWith(QueryKeys.SCROLL_POSITION_TOP) && !str2.endsWith("X")) {
                            str2 = str2 + QueryKeys.SUBDOMAIN;
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.hashCode();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        case false:
                            iArr[i2] = 2;
                            break;
                        case true:
                            iArr[i2] = 4;
                            break;
                        case true:
                            iArr[i2] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    strArr2[i2] = str2;
                }
                i2++;
                strArr[i2] = "";
                i = indexOf2 + 1;
            }
        }
        return i2;
    }

    public String a(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.d;
            if (i2 >= i3) {
                sb.append(this.a[i3]);
                return sb.toString();
            }
            sb.append(this.a[i2]);
            int i4 = this.b[i2];
            if (i4 == 1) {
                sb.append(str);
            } else if (i4 == 2) {
                sb.append(String.format(Locale.US, this.c[i2], Long.valueOf(j)));
            } else if (i4 == 3) {
                sb.append(String.format(Locale.US, this.c[i2], Integer.valueOf(i)));
            } else if (i4 == 4) {
                sb.append(String.format(Locale.US, this.c[i2], Long.valueOf(j2)));
            }
            i2++;
        }
    }
}
