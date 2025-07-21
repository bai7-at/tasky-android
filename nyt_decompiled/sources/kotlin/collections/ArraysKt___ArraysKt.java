package kotlin.collections;

import defpackage.ak7;
import defpackage.an3;
import defpackage.cj3;
import defpackage.du8;
import defpackage.no;
import defpackage.oo;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.yu3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class ArraysKt___ArraysKt extends kotlin.collections.g {

    public static final class a implements Iterable, yu3 {
        final /* synthetic */ Object[] a;

        public a(Object[] objArr) {
            this.a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return no.a(this.a);
        }
    }

    public static final class b implements Iterable, yu3 {
        final /* synthetic */ byte[] a;

        public b(byte[] bArr) {
            this.a = bArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return oo.b(this.a);
        }
    }

    public static final class c implements Iterable, yu3 {
        final /* synthetic */ short[] a;

        public c(short[] sArr) {
            this.a = sArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return oo.h(this.a);
        }
    }

    public static final class d implements Iterable, yu3 {
        final /* synthetic */ int[] a;

        public d(int[] iArr) {
            this.a = iArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return oo.f(this.a);
        }
    }

    public static final class e implements Iterable, yu3 {
        final /* synthetic */ long[] a;

        public e(long[] jArr) {
            this.a = jArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return oo.g(this.a);
        }
    }

    public static final class f implements Iterable, yu3 {
        final /* synthetic */ float[] a;

        public f(float[] fArr) {
            this.a = fArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return oo.e(this.a);
        }
    }

    public static final class g implements Iterable, yu3 {
        final /* synthetic */ double[] a;

        public g(double[] dArr) {
            this.a = dArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return oo.d(this.a);
        }
    }

    public static final class h implements Iterable, yu3 {
        final /* synthetic */ boolean[] a;

        public h(boolean[] zArr) {
            this.a = zArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return oo.a(this.a);
        }
    }

    public static final class i implements Iterable, yu3 {
        final /* synthetic */ char[] a;

        public i(char[] cArr) {
            this.a = cArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return oo.c(this.a);
        }
    }

    public static final class j implements ak7 {
        final /* synthetic */ Object[] a;

        public j(Object[] objArr) {
            this.a = objArr;
        }

        @Override // defpackage.ak7
        public Iterator iterator() {
            return no.a(this.a);
        }
    }

    public static final Collection A0(Object[] objArr, Collection collection) {
        zq3.h(objArr, "<this>");
        zq3.h(collection, "destination");
        for (Object obj : objArr) {
            collection.add(obj);
        }
        return collection;
    }

    public static HashSet B0(Object[] objArr) {
        zq3.h(objArr, "<this>");
        return (HashSet) A0(objArr, new HashSet(t.e(objArr.length)));
    }

    public static List C0(Object[] objArr) {
        zq3.h(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? kotlin.collections.d.E0(objArr) : kotlin.collections.i.e(objArr[0]) : kotlin.collections.i.l();
    }

    public static List D0(int[] iArr) {
        zq3.h(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    public static List E0(Object[] objArr) {
        zq3.h(objArr, "<this>");
        return new ArrayList(k.i(objArr));
    }

    public static Set F0(Object[] objArr) {
        zq3.h(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) A0(objArr, new LinkedHashSet(t.e(objArr.length))) : b0.d(objArr[0]) : b0.e();
    }

    public static Iterable G0(final Object[] objArr) {
        zq3.h(objArr, "<this>");
        return new cj3(new qs2() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Iterator mo865invoke() {
                return no.a(objArr);
            }
        });
    }

    public static List H0(Object[] objArr, Object[] objArr2) {
        zq3.h(objArr, "<this>");
        zq3.h(objArr2, "other");
        int min = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(du8.a(objArr[i2], objArr2[i2]));
        }
        return arrayList;
    }

    public static Iterable I(byte[] bArr) {
        zq3.h(bArr, "<this>");
        return bArr.length == 0 ? kotlin.collections.i.l() : new b(bArr);
    }

    public static Iterable J(char[] cArr) {
        zq3.h(cArr, "<this>");
        return cArr.length == 0 ? kotlin.collections.i.l() : new i(cArr);
    }

    public static Iterable K(double[] dArr) {
        zq3.h(dArr, "<this>");
        return dArr.length == 0 ? kotlin.collections.i.l() : new g(dArr);
    }

    public static Iterable L(float[] fArr) {
        zq3.h(fArr, "<this>");
        return fArr.length == 0 ? kotlin.collections.i.l() : new f(fArr);
    }

    public static Iterable M(int[] iArr) {
        zq3.h(iArr, "<this>");
        return iArr.length == 0 ? kotlin.collections.i.l() : new d(iArr);
    }

    public static Iterable N(long[] jArr) {
        zq3.h(jArr, "<this>");
        return jArr.length == 0 ? kotlin.collections.i.l() : new e(jArr);
    }

    public static Iterable O(Object[] objArr) {
        zq3.h(objArr, "<this>");
        return objArr.length == 0 ? kotlin.collections.i.l() : new a(objArr);
    }

    public static Iterable P(short[] sArr) {
        zq3.h(sArr, "<this>");
        return sArr.length == 0 ? kotlin.collections.i.l() : new c(sArr);
    }

    public static Iterable Q(boolean[] zArr) {
        zq3.h(zArr, "<this>");
        return zArr.length == 0 ? kotlin.collections.i.l() : new h(zArr);
    }

    public static ak7 R(Object[] objArr) {
        zq3.h(objArr, "<this>");
        return objArr.length == 0 ? kotlin.sequences.d.e() : new j(objArr);
    }

    public static boolean S(byte[] bArr, byte b2) {
        zq3.h(bArr, "<this>");
        return g0(bArr, b2) >= 0;
    }

    public static boolean T(char[] cArr, char c2) {
        zq3.h(cArr, "<this>");
        return h0(cArr, c2) >= 0;
    }

    public static boolean U(int[] iArr, int i2) {
        zq3.h(iArr, "<this>");
        return kotlin.collections.d.i0(iArr, i2) >= 0;
    }

    public static boolean V(long[] jArr, long j2) {
        zq3.h(jArr, "<this>");
        return j0(jArr, j2) >= 0;
    }

    public static boolean W(Object[] objArr, Object obj) {
        zq3.h(objArr, "<this>");
        return kotlin.collections.d.k0(objArr, obj) >= 0;
    }

    public static boolean X(short[] sArr, short s) {
        zq3.h(sArr, "<this>");
        return l0(sArr, s) >= 0;
    }

    public static List Y(Object[] objArr) {
        zq3.h(objArr, "<this>");
        return (List) Z(objArr, new ArrayList());
    }

    public static final Collection Z(Object[] objArr, Collection collection) {
        zq3.h(objArr, "<this>");
        zq3.h(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static Object a0(Object[] objArr) {
        zq3.h(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static an3 b0(int[] iArr) {
        zq3.h(iArr, "<this>");
        return new an3(0, kotlin.collections.d.c0(iArr));
    }

    public static int c0(int[] iArr) {
        zq3.h(iArr, "<this>");
        return iArr.length - 1;
    }

    public static int d0(long[] jArr) {
        zq3.h(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int e0(Object[] objArr) {
        zq3.h(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object f0(Object[] objArr, int i2) {
        zq3.h(objArr, "<this>");
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public static final int g0(byte[] bArr, byte b2) {
        zq3.h(bArr, "<this>");
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (b2 == bArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final int h0(char[] cArr, char c2) {
        zq3.h(cArr, "<this>");
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (c2 == cArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int i0(int[] iArr, int i2) {
        zq3.h(iArr, "<this>");
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i2 == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    public static final int j0(long[] jArr, long j2) {
        zq3.h(jArr, "<this>");
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (j2 == jArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int k0(Object[] objArr, Object obj) {
        zq3.h(objArr, "<this>");
        int i2 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i2 < length2) {
            if (zq3.c(obj, objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final int l0(short[] sArr, short s) {
        zq3.h(sArr, "<this>");
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (s == sArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final Appendable m0(byte[] bArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, ss2 ss2Var) {
        zq3.h(bArr, "<this>");
        zq3.h(appendable, "buffer");
        zq3.h(charSequence, "separator");
        zq3.h(charSequence2, "prefix");
        zq3.h(charSequence3, "postfix");
        zq3.h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i3 = 0;
        for (byte b2 : bArr) {
            i3++;
            if (i3 > 1) {
                appendable.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (ss2Var != null) {
                appendable.append((CharSequence) ss2Var.invoke(Byte.valueOf(b2)));
            } else {
                appendable.append(String.valueOf((int) b2));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final Appendable n0(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, ss2 ss2Var) {
        zq3.h(objArr, "<this>");
        zq3.h(appendable, "buffer");
        zq3.h(charSequence, "separator");
        zq3.h(charSequence2, "prefix");
        zq3.h(charSequence3, "postfix");
        zq3.h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                appendable.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            kotlin.text.h.a(appendable, obj, ss2Var);
        }
        if (i2 >= 0 && i3 > i2) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String o0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, ss2 ss2Var) {
        zq3.h(bArr, "<this>");
        zq3.h(charSequence, "separator");
        zq3.h(charSequence2, "prefix");
        zq3.h(charSequence3, "postfix");
        zq3.h(charSequence4, "truncated");
        String sb = ((StringBuilder) m0(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, ss2Var)).toString();
        zq3.g(sb, "toString(...)");
        return sb;
    }

    public static final String p0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, ss2 ss2Var) {
        zq3.h(objArr, "<this>");
        zq3.h(charSequence, "separator");
        zq3.h(charSequence2, "prefix");
        zq3.h(charSequence3, "postfix");
        zq3.h(charSequence4, "truncated");
        String sb = ((StringBuilder) n0(objArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, ss2Var)).toString();
        zq3.g(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String q0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, ss2 ss2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            ss2Var = null;
        }
        return o0(bArr, charSequence, charSequence5, charSequence6, i4, charSequence7, ss2Var);
    }

    public static /* synthetic */ String r0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, ss2 ss2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            ss2Var = null;
        }
        return p0(objArr, charSequence, charSequence5, charSequence6, i4, charSequence7, ss2Var);
    }

    public static Object s0(Object[] objArr) {
        zq3.h(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[kotlin.collections.d.e0(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int t0(Object[] objArr, Object obj) {
        zq3.h(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i3 = length2 - 1;
                    if (zq3.c(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    length2 = i3;
                }
            }
        }
        return -1;
    }

    public static Integer u0(int[] iArr) {
        zq3.h(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int c0 = kotlin.collections.d.c0(iArr);
        int i3 = 1;
        if (1 <= c0) {
            while (true) {
                int i4 = iArr[i3];
                if (i2 < i4) {
                    i2 = i4;
                }
                if (i3 == c0) {
                    break;
                }
                i3++;
            }
        }
        return Integer.valueOf(i2);
    }

    public static Integer v0(int[] iArr) {
        zq3.h(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int c0 = kotlin.collections.d.c0(iArr);
        int i3 = 1;
        if (1 <= c0) {
            while (true) {
                int i4 = iArr[i3];
                if (i2 > i4) {
                    i2 = i4;
                }
                if (i3 == c0) {
                    break;
                }
                i3++;
            }
        }
        return Integer.valueOf(i2);
    }

    public static char w0(char[] cArr) {
        zq3.h(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object x0(Object[] objArr) {
        zq3.h(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static int y0(int[] iArr) {
        zq3.h(iArr, "<this>");
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        return i2;
    }

    public static List z0(Object[] objArr, int i2) {
        zq3.h(objArr, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.i.l();
        }
        if (i2 >= objArr.length) {
            return kotlin.collections.d.C0(objArr);
        }
        if (i2 == 1) {
            return kotlin.collections.i.e(objArr[0]);
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        for (Object obj : objArr) {
            arrayList.add(obj);
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return arrayList;
    }
}
