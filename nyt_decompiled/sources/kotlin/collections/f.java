package kotlin.collections;

import defpackage.bw8;
import defpackage.ev8;
import defpackage.iv8;
import defpackage.mv8;
import defpackage.qv8;
import defpackage.zq3;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class f extends e {
    public static boolean d(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!d.d((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof iv8) && (obj2 instanceof iv8)) {
                    if (!ev8.c(((iv8) obj).z(), ((iv8) obj2).z())) {
                        return false;
                    }
                } else if ((obj instanceof bw8) && (obj2 instanceof bw8)) {
                    if (!ev8.a(((bw8) obj).z(), ((bw8) obj2).z())) {
                        return false;
                    }
                } else if ((obj instanceof mv8) && (obj2 instanceof mv8)) {
                    if (!ev8.b(((mv8) obj).z(), ((mv8) obj2).z())) {
                        return false;
                    }
                } else if ((obj instanceof qv8) && (obj2 instanceof qv8)) {
                    if (!ev8.d(((qv8) obj).z(), ((qv8) obj2).z())) {
                        return false;
                    }
                } else if (!zq3.c(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
