package androidx.compose.runtime.snapshots;

import defpackage.f64;
import defpackage.nw7;
import defpackage.yu3;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable, yu3 {
    public static final a e = new a(null);
    private static final SnapshotIdSet f = new SnapshotIdSet(0, 0, 0, null);
    private final long a;
    private final long b;
    private final int c;
    private final int[] d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SnapshotIdSet a() {
            return SnapshotIdSet.f;
        }

        private a() {
        }
    }

    private SnapshotIdSet(long j, long j2, int i, int[] iArr) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = iArr;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return kotlin.sequences.d.b(new SnapshotIdSet$iterator$1(this, null)).iterator();
    }

    public final SnapshotIdSet n(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = f;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i = snapshotIdSet.c;
        int i2 = this.c;
        if (i == i2) {
            int[] iArr = snapshotIdSet.d;
            int[] iArr2 = this.d;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.a & (~snapshotIdSet.a), this.b & (~snapshotIdSet.b), i2, iArr2);
            }
        }
        Iterator it2 = snapshotIdSet.iterator();
        while (it2.hasNext()) {
            this = this.o(((Number) it2.next()).intValue());
        }
        return this;
    }

    public final SnapshotIdSet o(int i) {
        int[] iArr;
        int b;
        int i2 = this.c;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.b;
            if ((j2 & j) != 0) {
                return new SnapshotIdSet(this.a, j2 & (~j), i2, this.d);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.a;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet((~j3) & j4, this.b, i2, this.d);
            }
        } else if (i3 < 0 && (iArr = this.d) != null && (b = nw7.b(iArr, i)) >= 0) {
            int length = iArr.length;
            int i4 = length - 1;
            if (i4 == 0) {
                return new SnapshotIdSet(this.a, this.b, this.c, null);
            }
            int[] iArr2 = new int[i4];
            if (b > 0) {
                kotlin.collections.d.i(iArr, iArr2, 0, 0, b);
            }
            if (b < i4) {
                kotlin.collections.d.i(iArr, iArr2, b, b + 1, length);
            }
            return new SnapshotIdSet(this.a, this.b, this.c, iArr2);
        }
        return this;
    }

    public final boolean p(int i) {
        int[] iArr;
        int i2 = i - this.c;
        if (i2 >= 0 && i2 < 64) {
            return (this.b & (1 << i2)) != 0;
        }
        if (i2 >= 64 && i2 < 128) {
            return (this.a & (1 << (i2 - 64))) != 0;
        }
        if (i2 <= 0 && (iArr = this.d) != null) {
            return nw7.b(iArr, i) >= 0;
        }
        return false;
    }

    public final int q(int i) {
        int c;
        int c2;
        int[] iArr = this.d;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.b;
        if (j != 0) {
            int i2 = this.c;
            c2 = nw7.c(j);
            return i2 + c2;
        }
        long j2 = this.a;
        if (j2 == 0) {
            return i;
        }
        int i3 = this.c + 64;
        c = nw7.c(j2);
        return i3 + c;
    }

    public final SnapshotIdSet t(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = f;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        int i = snapshotIdSet.c;
        int i2 = this.c;
        if (i == i2) {
            int[] iArr = snapshotIdSet.d;
            int[] iArr2 = this.d;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.a | snapshotIdSet.a, this.b | snapshotIdSet.b, i2, iArr2);
            }
        }
        if (this.d == null) {
            Iterator it2 = iterator();
            while (it2.hasNext()) {
                snapshotIdSet = snapshotIdSet.u(((Number) it2.next()).intValue());
            }
            return snapshotIdSet;
        }
        Iterator it3 = snapshotIdSet.iterator();
        while (it3.hasNext()) {
            this = this.u(((Number) it3.next()).intValue());
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(kotlin.collections.i.w(this, 10));
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(((Number) it2.next()).intValue()));
        }
        sb.append(f64.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }

    public final SnapshotIdSet u(int i) {
        int i2;
        int[] W0;
        int i3 = this.c;
        int i4 = i - i3;
        long j = 0;
        if (i4 >= 0 && i4 < 64) {
            long j2 = 1 << i4;
            long j3 = this.b;
            if ((j3 & j2) == 0) {
                return new SnapshotIdSet(this.a, j3 | j2, i3, this.d);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j4 = 1 << (i4 - 64);
            long j5 = this.a;
            if ((j5 & j4) == 0) {
                return new SnapshotIdSet(j4 | j5, this.b, i3, this.d);
            }
        } else if (i4 < 128) {
            int[] iArr = this.d;
            if (iArr == null) {
                return new SnapshotIdSet(this.a, this.b, i3, new int[]{i});
            }
            int b = nw7.b(iArr, i);
            if (b < 0) {
                int i5 = -(b + 1);
                int length = iArr.length;
                int[] iArr2 = new int[length + 1];
                kotlin.collections.d.i(iArr, iArr2, 0, 0, i5);
                kotlin.collections.d.i(iArr, iArr2, i5 + 1, i5, length);
                iArr2[i5] = i;
                return new SnapshotIdSet(this.a, this.b, this.c, iArr2);
            }
        } else if (!p(i)) {
            long j6 = this.a;
            long j7 = this.b;
            int i6 = this.c;
            int i7 = ((i + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j8 = j7;
            long j9 = j6;
            while (true) {
                if (i6 >= i7) {
                    i2 = i6;
                    break;
                }
                if (j8 != j) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr3 = this.d;
                        if (iArr3 != null) {
                            for (int i8 : iArr3) {
                                arrayList.add(Integer.valueOf(i8));
                            }
                        }
                    }
                    for (int i9 = 0; i9 < 64; i9++) {
                        if (((1 << i9) & j8) != 0) {
                            arrayList.add(Integer.valueOf(i9 + i6));
                        }
                    }
                    j = 0;
                }
                if (j9 == j) {
                    i2 = i7;
                    j8 = j;
                    break;
                }
                i6 += 64;
                j8 = j9;
                j9 = j;
            }
            return new SnapshotIdSet(j9, j8, i2, (arrayList == null || (W0 = kotlin.collections.i.W0(arrayList)) == null) ? this.d : W0).u(i);
        }
        return this;
    }
}
