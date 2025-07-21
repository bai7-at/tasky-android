package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.source.ads.a;
import defpackage.ur;
import defpackage.z19;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements com.google.android.exoplayer2.g {
    public static final a g = new a(null, new C0183a[0], 0, -9223372036854775807L, 0);
    private static final C0183a h = new C0183a(0).l(0);
    private static final String i = z19.t0(1);
    private static final String j = z19.t0(2);
    private static final String k = z19.t0(3);
    private static final String l = z19.t0(4);
    public static final g.a m = new g.a() { // from class: j7
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            a d;
            d = a.d(bundle);
            return d;
        }
    };
    public final Object a;
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    private final C0183a[] f;

    /* renamed from: com.google.android.exoplayer2.source.ads.a$a, reason: collision with other inner class name */
    public static final class C0183a implements com.google.android.exoplayer2.g {
        private static final String i = z19.t0(0);
        private static final String j = z19.t0(1);
        private static final String k = z19.t0(2);
        private static final String l = z19.t0(3);
        private static final String m = z19.t0(4);
        private static final String n = z19.t0(5);
        private static final String r = z19.t0(6);
        private static final String s = z19.t0(7);
        public static final g.a t = new g.a() { // from class: k7
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                a.C0183a f;
                f = a.C0183a.f(bundle);
                return f;
            }
        };
        public final long a;
        public final int b;
        public final int c;
        public final Uri[] d;
        public final int[] e;
        public final long[] f;
        public final long g;
        public final boolean h;

        public C0183a(long j2) {
            this(j2, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private static long[] d(long[] jArr, int i2) {
            int length = jArr.length;
            int max = Math.max(i2, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        private static int[] e(int[] iArr, int i2) {
            int length = iArr.length;
            int max = Math.max(i2, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C0183a f(Bundle bundle) {
            long j2 = bundle.getLong(i);
            int i2 = bundle.getInt(j);
            int i3 = bundle.getInt(s);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(k);
            int[] intArray = bundle.getIntArray(l);
            long[] longArray = bundle.getLongArray(m);
            long j3 = bundle.getLong(n);
            boolean z = bundle.getBoolean(r);
            if (intArray == null) {
                intArray = new int[0];
            }
            return new C0183a(j2, i2, i3, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j3, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean j() {
            return this.h && this.a == Long.MIN_VALUE && this.b == -1;
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putLong(i, this.a);
            bundle.putInt(j, this.b);
            bundle.putInt(s, this.c);
            bundle.putParcelableArrayList(k, new ArrayList<>(Arrays.asList(this.d)));
            bundle.putIntArray(l, this.e);
            bundle.putLongArray(m, this.f);
            bundle.putLong(n, this.g);
            bundle.putBoolean(r, this.h);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0183a.class != obj.getClass()) {
                return false;
            }
            C0183a c0183a = (C0183a) obj;
            return this.a == c0183a.a && this.b == c0183a.b && this.c == c0183a.c && Arrays.equals(this.d, c0183a.d) && Arrays.equals(this.e, c0183a.e) && Arrays.equals(this.f, c0183a.f) && this.g == c0183a.g && this.h == c0183a.h;
        }

        public int g() {
            return h(-1);
        }

        public int h(int i2) {
            int i3;
            int i4 = i2 + 1;
            while (true) {
                int[] iArr = this.e;
                if (i4 >= iArr.length || this.h || (i3 = iArr[i4]) == 0 || i3 == 1) {
                    break;
                }
                i4++;
            }
            return i4;
        }

        public int hashCode() {
            int i2 = ((this.b * 31) + this.c) * 31;
            long j2 = this.a;
            int hashCode = (((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e)) * 31) + Arrays.hashCode(this.f)) * 31;
            long j3 = this.g;
            return ((hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0);
        }

        public boolean i() {
            if (this.b == -1) {
                return true;
            }
            for (int i2 = 0; i2 < this.b; i2++) {
                int i3 = this.e[i2];
                if (i3 == 0 || i3 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean k() {
            return this.b == -1 || g() < this.b;
        }

        public C0183a l(int i2) {
            int[] e = e(this.e, i2);
            long[] d = d(this.f, i2);
            return new C0183a(this.a, i2, this.c, e, (Uri[]) Arrays.copyOf(this.d, i2), d, this.g, this.h);
        }

        public C0183a m(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.d;
            if (length < uriArr.length) {
                jArr = d(jArr, uriArr.length);
            } else if (this.b != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new C0183a(this.a, this.b, this.c, this.e, this.d, jArr, this.g, this.h);
        }

        public C0183a n(int i2, int i3) {
            int i4 = this.b;
            ur.a(i4 == -1 || i3 < i4);
            int[] e = e(this.e, i3 + 1);
            int i5 = e[i3];
            ur.a(i5 == 0 || i5 == 1 || i5 == i2);
            long[] jArr = this.f;
            if (jArr.length != e.length) {
                jArr = d(jArr, e.length);
            }
            long[] jArr2 = jArr;
            Uri[] uriArr = this.d;
            if (uriArr.length != e.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, e.length);
            }
            Uri[] uriArr2 = uriArr;
            e[i3] = i2;
            return new C0183a(this.a, this.b, this.c, e, uriArr2, jArr2, this.g, this.h);
        }

        public C0183a o(Uri uri, int i2) {
            int[] e = e(this.e, i2 + 1);
            long[] jArr = this.f;
            if (jArr.length != e.length) {
                jArr = d(jArr, e.length);
            }
            long[] jArr2 = jArr;
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.d, e.length);
            uriArr[i2] = uri;
            e[i2] = 1;
            return new C0183a(this.a, this.b, this.c, e, uriArr, jArr2, this.g, this.h);
        }

        public C0183a p() {
            if (this.b == -1) {
                return new C0183a(this.a, 0, this.c, new int[0], new Uri[0], new long[0], this.g, this.h);
            }
            int[] iArr = this.e;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = copyOf[i2];
                if (i3 == 1 || i3 == 0) {
                    copyOf[i2] = 2;
                }
            }
            return new C0183a(this.a, length, this.c, copyOf, this.d, this.f, this.g, this.h);
        }

        private C0183a(long j2, int i2, int i3, int[] iArr, Uri[] uriArr, long[] jArr, long j3, boolean z) {
            ur.a(iArr.length == uriArr.length);
            this.a = j2;
            this.b = i2;
            this.c = i3;
            this.e = iArr;
            this.d = uriArr;
            this.f = jArr;
            this.g = j3;
            this.h = z;
        }
    }

    public a(Object obj, long... jArr) {
        this(obj, c(jArr), 0L, -9223372036854775807L, 0);
    }

    private static C0183a[] c(long[] jArr) {
        int length = jArr.length;
        C0183a[] c0183aArr = new C0183a[length];
        for (int i2 = 0; i2 < length; i2++) {
            c0183aArr[i2] = new C0183a(jArr[i2]);
        }
        return c0183aArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a d(Bundle bundle) {
        C0183a[] c0183aArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(i);
        if (parcelableArrayList == null) {
            c0183aArr = new C0183a[0];
        } else {
            C0183a[] c0183aArr2 = new C0183a[parcelableArrayList.size()];
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                c0183aArr2[i2] = (C0183a) C0183a.t.a((Bundle) parcelableArrayList.get(i2));
            }
            c0183aArr = c0183aArr2;
        }
        String str = j;
        a aVar = g;
        return new a(null, c0183aArr, bundle.getLong(str, aVar.c), bundle.getLong(k, aVar.d), bundle.getInt(l, aVar.e));
    }

    private boolean j(long j2, long j3, int i2) {
        if (j2 == Long.MIN_VALUE) {
            return false;
        }
        C0183a e = e(i2);
        long j4 = e.a;
        return j4 == Long.MIN_VALUE ? j3 == -9223372036854775807L || (e.h && e.b == -1) || j2 < j3 : j2 < j4;
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (C0183a c0183a : this.f) {
            arrayList.add(c0183a.a());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(i, arrayList);
        }
        long j2 = this.c;
        a aVar = g;
        if (j2 != aVar.c) {
            bundle.putLong(j, j2);
        }
        long j3 = this.d;
        if (j3 != aVar.d) {
            bundle.putLong(k, j3);
        }
        int i2 = this.e;
        if (i2 != aVar.e) {
            bundle.putInt(l, i2);
        }
        return bundle;
    }

    public C0183a e(int i2) {
        int i3 = this.e;
        return i2 < i3 ? h : this.f[i2 - i3];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return z19.c(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && Arrays.equals(this.f, aVar.f);
    }

    public int f(long j2, long j3) {
        if (j2 == Long.MIN_VALUE) {
            return -1;
        }
        if (j3 != -9223372036854775807L && j2 >= j3) {
            return -1;
        }
        int i2 = this.e;
        while (i2 < this.b && ((e(i2).a != Long.MIN_VALUE && e(i2).a <= j2) || !e(i2).k())) {
            i2++;
        }
        if (i2 < this.b) {
            return i2;
        }
        return -1;
    }

    public int g(long j2, long j3) {
        int i2 = this.b - 1;
        int i3 = i2 - (i(i2) ? 1 : 0);
        while (i3 >= 0 && j(j2, j3, i3)) {
            i3--;
        }
        if (i3 < 0 || !e(i3).i()) {
            return -1;
        }
        return i3;
    }

    public boolean h(int i2, int i3) {
        C0183a e;
        int i4;
        return i2 < this.b && (i4 = (e = e(i2)).b) != -1 && i3 < i4 && e.e[i3] == 4;
    }

    public int hashCode() {
        int i2 = this.b * 31;
        Object obj = this.a;
        return ((((((((i2 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.e) * 31) + Arrays.hashCode(this.f);
    }

    public boolean i(int i2) {
        return i2 == this.b - 1 && e(i2).j();
    }

    public a k(int i2, int i3) {
        ur.a(i3 > 0);
        int i4 = i2 - this.e;
        C0183a[] c0183aArr = this.f;
        if (c0183aArr[i4].b == i3) {
            return this;
        }
        C0183a[] c0183aArr2 = (C0183a[]) z19.I0(c0183aArr, c0183aArr.length);
        c0183aArr2[i4] = this.f[i4].l(i3);
        return new a(this.a, c0183aArr2, this.c, this.d, this.e);
    }

    public a l(long[][] jArr) {
        ur.g(this.e == 0);
        C0183a[] c0183aArr = this.f;
        C0183a[] c0183aArr2 = (C0183a[]) z19.I0(c0183aArr, c0183aArr.length);
        for (int i2 = 0; i2 < this.b; i2++) {
            c0183aArr2[i2] = c0183aArr2[i2].m(jArr[i2]);
        }
        return new a(this.a, c0183aArr2, this.c, this.d, this.e);
    }

    public a m(int i2, int i3) {
        int i4 = i2 - this.e;
        C0183a[] c0183aArr = this.f;
        C0183a[] c0183aArr2 = (C0183a[]) z19.I0(c0183aArr, c0183aArr.length);
        c0183aArr2[i4] = c0183aArr2[i4].n(4, i3);
        return new a(this.a, c0183aArr2, this.c, this.d, this.e);
    }

    public a n(long j2) {
        return this.c == j2 ? this : new a(this.a, this.f, j2, this.d, this.e);
    }

    public a o(int i2, int i3, Uri uri) {
        int i4 = i2 - this.e;
        C0183a[] c0183aArr = this.f;
        C0183a[] c0183aArr2 = (C0183a[]) z19.I0(c0183aArr, c0183aArr.length);
        ur.g(!Uri.EMPTY.equals(uri) || c0183aArr2[i4].h);
        c0183aArr2[i4] = c0183aArr2[i4].o(uri, i3);
        return new a(this.a, c0183aArr2, this.c, this.d, this.e);
    }

    public a p(long j2) {
        return this.d == j2 ? this : new a(this.a, this.f, this.c, j2, this.e);
    }

    public a q(int i2, int i3) {
        int i4 = i2 - this.e;
        C0183a[] c0183aArr = this.f;
        C0183a[] c0183aArr2 = (C0183a[]) z19.I0(c0183aArr, c0183aArr.length);
        c0183aArr2[i4] = c0183aArr2[i4].n(3, i3);
        return new a(this.a, c0183aArr2, this.c, this.d, this.e);
    }

    public a r(int i2, int i3) {
        int i4 = i2 - this.e;
        C0183a[] c0183aArr = this.f;
        C0183a[] c0183aArr2 = (C0183a[]) z19.I0(c0183aArr, c0183aArr.length);
        c0183aArr2[i4] = c0183aArr2[i4].n(2, i3);
        return new a(this.a, c0183aArr2, this.c, this.d, this.e);
    }

    public a s(int i2) {
        int i3 = i2 - this.e;
        C0183a[] c0183aArr = this.f;
        C0183a[] c0183aArr2 = (C0183a[]) z19.I0(c0183aArr, c0183aArr.length);
        c0183aArr2[i3] = c0183aArr2[i3].p();
        return new a(this.a, c0183aArr2, this.c, this.d, this.e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.a);
        sb.append(", adResumePositionUs=");
        sb.append(this.c);
        sb.append(", adGroups=[");
        for (int i2 = 0; i2 < this.f.length; i2++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f[i2].a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < this.f[i2].e.length; i3++) {
                sb.append("ad(state=");
                int i4 = this.f[i2].e[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f[i2].f[i3]);
                sb.append(')');
                if (i3 < this.f[i2].e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < this.f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    private a(Object obj, C0183a[] c0183aArr, long j2, long j3, int i2) {
        this.a = obj;
        this.c = j2;
        this.d = j3;
        this.b = c0183aArr.length + i2;
        this.f = c0183aArr;
        this.e = i2;
    }
}
