package kotlin.collections;

import defpackage.ak7;
import defpackage.an3;
import defpackage.cj3;
import defpackage.du8;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class CollectionsKt___CollectionsKt extends r {

    public static final class a implements ak7 {
        final /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        @Override // defpackage.ak7
        public Iterator iterator() {
            return this.a.iterator();
        }
    }

    public static Float A0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        Iterator it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it2.next()).floatValue();
        while (it2.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it2.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Comparable B0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        Iterator it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it2.next();
        while (it2.hasNext()) {
            Comparable comparable2 = (Comparable) it2.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float C0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        Iterator it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it2.next()).floatValue();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it2.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static List D0(Iterable iterable, Iterable iterable2) {
        zq3.h(iterable, "<this>");
        zq3.h(iterable2, "elements");
        Collection D = p.D(iterable2);
        if (D.isEmpty()) {
            return i.X0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!D.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List E0(Iterable iterable, Object obj) {
        zq3.h(iterable, "<this>");
        ArrayList arrayList = new ArrayList(i.w(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && zq3.c(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List F0(Collection collection, Iterable iterable) {
        zq3.h(collection, "<this>");
        zq3.h(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            i.B(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List G0(Collection collection, Object obj) {
        zq3.h(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List H0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return i.X0(iterable);
        }
        List Z0 = Z0(iterable);
        i.Y(Z0);
        return Z0;
    }

    public static Object I0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        if (iterable instanceof List) {
            return i.J0((List) iterable);
        }
        Iterator it2 = iterable.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it2.next();
        if (it2.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object J0(List list) {
        zq3.h(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object K0(List list) {
        zq3.h(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List L0(List list, an3 an3Var) {
        zq3.h(list, "<this>");
        zq3.h(an3Var, "indices");
        return an3Var.isEmpty() ? i.l() : i.X0(list.subList(an3Var.a().intValue(), an3Var.f().intValue() + 1));
    }

    public static List M0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List Z0 = Z0(iterable);
            i.z(Z0);
            return Z0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return i.X0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        d.F((Comparable[]) array);
        return d.e(array);
    }

    public static List N0(Iterable iterable, Comparator comparator) {
        zq3.h(iterable, "<this>");
        zq3.h(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List Z0 = Z0(iterable);
            i.A(Z0, comparator);
            return Z0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return i.X0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        d.G(array, comparator);
        return d.e(array);
    }

    public static Set O0(Iterable iterable, Iterable iterable2) {
        zq3.h(iterable, "<this>");
        zq3.h(iterable2, "other");
        Set b1 = i.b1(iterable);
        p.H(b1, iterable2);
        return b1;
    }

    public static List P0(Iterable iterable, int i) {
        zq3.h(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return i.l();
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return i.X0(iterable);
            }
            if (i == 1) {
                return i.e(i.j0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it2 = iterable.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return k.s(arrayList);
    }

    public static boolean[] Q0(Collection collection) {
        zq3.h(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            zArr[i] = ((Boolean) it2.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static byte[] R0(Collection collection) {
        zq3.h(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            bArr[i] = ((Number) it2.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static char[] S0(Collection collection) {
        zq3.h(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            cArr[i] = ((Character) it2.next()).charValue();
            i++;
        }
        return cArr;
    }

    public static final Collection T0(Iterable iterable, Collection collection) {
        zq3.h(iterable, "<this>");
        zq3.h(collection, "destination");
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            collection.add(it2.next());
        }
        return collection;
    }

    public static float[] U0(Collection collection) {
        zq3.h(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            fArr[i] = ((Number) it2.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static HashSet V0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        return (HashSet) T0(iterable, new HashSet(t.e(i.w(iterable, 12))));
    }

    public static int[] W0(Collection collection) {
        zq3.h(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            iArr[i] = ((Number) it2.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List X0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return k.s(Z0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return i.l();
        }
        if (size != 1) {
            return i.a1(collection);
        }
        return i.e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] Y0(Collection collection) {
        zq3.h(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            jArr[i] = ((Number) it2.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ak7 Z(Iterable iterable) {
        zq3.h(iterable, "<this>");
        return new a(iterable);
    }

    public static final List Z0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        return iterable instanceof Collection ? i.a1((Collection) iterable) : (List) T0(iterable, new ArrayList());
    }

    public static double a0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        Iterator it2 = iterable.iterator();
        double d = 0.0d;
        int i = 0;
        while (it2.hasNext()) {
            d += ((Number) it2.next()).longValue();
            i++;
            if (i < 0) {
                i.u();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static List a1(Collection collection) {
        zq3.h(collection, "<this>");
        return new ArrayList(collection);
    }

    public static List b0(Iterable iterable, int i) {
        zq3.h(iterable, "<this>");
        return e1(iterable, i, i, true);
    }

    public static Set b1(Iterable iterable) {
        zq3.h(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) T0(iterable, new LinkedHashSet());
    }

    public static boolean c0(Iterable iterable, Object obj) {
        zq3.h(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : i.o0(iterable, obj) >= 0;
    }

    public static Set c1(Iterable iterable) {
        zq3.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return d0.i((Set) T0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return b0.e();
        }
        if (size != 1) {
            return (Set) T0(iterable, new LinkedHashSet(t.e(collection.size())));
        }
        return b0.d(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static List d0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        return i.X0(i.b1(iterable));
    }

    public static Set d1(Iterable iterable, Iterable iterable2) {
        zq3.h(iterable, "<this>");
        zq3.h(iterable2, "other");
        Set b1 = i.b1(iterable);
        i.B(b1, iterable2);
        return b1;
    }

    public static List e0(Iterable iterable, int i) {
        ArrayList arrayList;
        zq3.h(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return i.X0(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i;
            if (size <= 0) {
                return i.l();
            }
            if (size == 1) {
                return i.e(i.v0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i < size2) {
                        arrayList.add(((List) iterable).get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return k.s(arrayList);
    }

    public static final List e1(Iterable iterable, int i, int i2, boolean z) {
        zq3.h(iterable, "<this>");
        SlidingWindowKt.a(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator b = SlidingWindowKt.b(iterable.iterator(), i, i2, z, false);
            while (b.hasNext()) {
                arrayList.add((List) b.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = uo6.i(i, size - i3);
            if (i4 < i && !z) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static List f0(List list, int i) {
        zq3.h(list, "<this>");
        if (i >= 0) {
            return i.P0(list, uo6.d(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static /* synthetic */ List f1(Iterable iterable, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return e1(iterable, i, i2, z);
    }

    public static Object g0(Iterable iterable, int i) {
        zq3.h(iterable, "<this>");
        if (iterable instanceof List) {
            return i.n0((List) iterable, i);
        }
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (Object obj : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        return null;
    }

    public static Iterable g1(final Iterable iterable) {
        zq3.h(iterable, "<this>");
        return new cj3(new qs2() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Iterator mo865invoke() {
                return iterable.iterator();
            }
        });
    }

    public static List h0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        return (List) i0(iterable, new ArrayList());
    }

    public static List h1(Iterable iterable, Iterable iterable2) {
        zq3.h(iterable, "<this>");
        zq3.h(iterable2, "other");
        Iterator it2 = iterable.iterator();
        Iterator it3 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(i.w(iterable, 10), i.w(iterable2, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            arrayList.add(du8.a(it2.next(), it3.next()));
        }
        return arrayList;
    }

    public static final Collection i0(Iterable iterable, Collection collection) {
        zq3.h(iterable, "<this>");
        zq3.h(collection, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static Object j0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        if (iterable instanceof List) {
            return i.k0((List) iterable);
        }
        Iterator it2 = iterable.iterator();
        if (it2.hasNext()) {
            return it2.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object k0(List list) {
        zq3.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object l0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it2 = iterable.iterator();
        if (it2.hasNext()) {
            return it2.next();
        }
        return null;
    }

    public static Object m0(List list) {
        zq3.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object n0(List list, int i) {
        zq3.h(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int o0(Iterable iterable, Object obj) {
        zq3.h(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                i.v();
            }
            if (zq3.c(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int p0(List list, Object obj) {
        zq3.h(list, "<this>");
        return list.indexOf(obj);
    }

    public static Set q0(Iterable iterable, Iterable iterable2) {
        zq3.h(iterable, "<this>");
        zq3.h(iterable2, "other");
        Set b1 = i.b1(iterable);
        p.O(b1, iterable2);
        return b1;
    }

    public static final Appendable r0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ss2 ss2Var) {
        zq3.h(iterable, "<this>");
        zq3.h(appendable, "buffer");
        zq3.h(charSequence, "separator");
        zq3.h(charSequence2, "prefix");
        zq3.h(charSequence3, "postfix");
        zq3.h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            kotlin.text.h.a(appendable, obj, ss2Var);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String t0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ss2 ss2Var) {
        zq3.h(iterable, "<this>");
        zq3.h(charSequence, "separator");
        zq3.h(charSequence2, "prefix");
        zq3.h(charSequence3, "postfix");
        zq3.h(charSequence4, "truncated");
        String sb = ((StringBuilder) r0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, ss2Var)).toString();
        zq3.g(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String u0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ss2 ss2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            ss2Var = null;
        }
        return t0(iterable, charSequence, charSequence5, charSequence6, i3, charSequence7, ss2Var);
    }

    public static Object v0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        if (iterable instanceof List) {
            return i.w0((List) iterable);
        }
        Iterator it2 = iterable.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = it2.next();
        }
        return next;
    }

    public static Object w0(List list) {
        zq3.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(i.n(list));
    }

    public static Object x0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = it2.next();
        }
        return next;
    }

    public static Object y0(List list) {
        zq3.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable z0(Iterable iterable) {
        zq3.h(iterable, "<this>");
        Iterator it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it2.next();
        while (it2.hasNext()) {
            Comparable comparable2 = (Comparable) it2.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }
}
