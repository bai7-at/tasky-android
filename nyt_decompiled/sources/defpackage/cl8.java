package defpackage;

/* loaded from: classes.dex */
public final class cl8 {
    private final int a;
    private final long[] b;
    private final Object[] c;

    public cl8(int i, long[] jArr, Object[] objArr) {
        this.a = i;
        this.b = jArr;
        this.c = objArr;
    }

    private final int a(long j) {
        int i = this.a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long j2 = this.b[0];
            if (j2 == j) {
                return 0;
            }
            return j2 > j ? -2 : -1;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j3 = this.b[i3] - j;
            if (j3 < 0) {
                i2 = i3 + 1;
            } else {
                if (j3 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final Object b(long j) {
        int a = a(j);
        if (a >= 0) {
            return this.c[a];
        }
        return null;
    }

    public final cl8 c(long j, Object obj) {
        int i = this.a;
        int i2 = 0;
        int i3 = 0;
        for (Object obj2 : this.c) {
            if (obj2 != null) {
                i3++;
            }
        }
        int i4 = i3 + 1;
        long[] jArr = new long[i4];
        Object[] objArr = new Object[i4];
        if (i4 > 1) {
            int i5 = 0;
            while (true) {
                if (i2 >= i4 || i5 >= i) {
                    break;
                }
                long j2 = this.b[i5];
                Object obj3 = this.c[i5];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr[i2] = obj;
                    i2++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i2] = j2;
                    objArr[i2] = obj3;
                    i2++;
                }
                i5++;
            }
            if (i5 == i) {
                jArr[i3] = j;
                objArr[i3] = obj;
            } else {
                while (i2 < i4) {
                    long j3 = this.b[i5];
                    Object obj4 = this.c[i5];
                    if (obj4 != null) {
                        jArr[i2] = j3;
                        objArr[i2] = obj4;
                        i2++;
                    }
                    i5++;
                }
            }
        } else {
            jArr[0] = j;
            objArr[0] = obj;
        }
        return new cl8(i4, jArr, objArr);
    }

    public final boolean d(long j, Object obj) {
        int a = a(j);
        if (a < 0) {
            return false;
        }
        this.c[a] = obj;
        return true;
    }
}
