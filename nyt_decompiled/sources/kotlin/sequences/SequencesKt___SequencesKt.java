package kotlin.sequences;

import defpackage.ak7;
import defpackage.cg8;
import defpackage.cr8;
import defpackage.hw1;
import defpackage.lw1;
import defpackage.nh2;
import defpackage.ss2;
import defpackage.yu3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.text.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class SequencesKt___SequencesKt extends g {

    public static final class a implements Iterable, yu3 {
        final /* synthetic */ ak7 a;

        public a(ak7 ak7Var) {
            this.a = ak7Var;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.a.iterator();
        }
    }

    public static final class b implements ak7 {
        final /* synthetic */ ak7 a;
        final /* synthetic */ Comparator b;

        b(ak7 ak7Var, Comparator comparator) {
            this.a = ak7Var;
            this.b = comparator;
        }

        @Override // defpackage.ak7
        public Iterator iterator() {
            List x = SequencesKt___SequencesKt.x(this.a);
            i.A(x, this.b);
            return x.iterator();
        }
    }

    public static Iterable h(ak7 ak7Var) {
        zq3.h(ak7Var, "<this>");
        return new a(ak7Var);
    }

    public static ak7 i(ak7 ak7Var, int i) {
        zq3.h(ak7Var, "<this>");
        if (i >= 0) {
            return i == 0 ? ak7Var : ak7Var instanceof lw1 ? ((lw1) ak7Var).a(i) : new hw1(ak7Var, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static ak7 j(ak7 ak7Var, ss2 ss2Var) {
        zq3.h(ak7Var, "<this>");
        zq3.h(ss2Var, "predicate");
        return new nh2(ak7Var, true, ss2Var);
    }

    public static final ak7 k(ak7 ak7Var, ss2 ss2Var) {
        zq3.h(ak7Var, "<this>");
        zq3.h(ss2Var, "predicate");
        return new nh2(ak7Var, false, ss2Var);
    }

    public static ak7 l(ak7 ak7Var) {
        zq3.h(ak7Var, "<this>");
        ak7 k = k(ak7Var, new ss2() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterNotNull$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj == null);
            }
        });
        zq3.f(k, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return k;
    }

    public static Object m(ak7 ak7Var) {
        zq3.h(ak7Var, "<this>");
        Iterator it2 = ak7Var.iterator();
        if (it2.hasNext()) {
            return it2.next();
        }
        return null;
    }

    public static final Appendable n(ak7 ak7Var, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ss2 ss2Var) {
        zq3.h(ak7Var, "<this>");
        zq3.h(appendable, "buffer");
        zq3.h(charSequence, "separator");
        zq3.h(charSequence2, "prefix");
        zq3.h(charSequence3, "postfix");
        zq3.h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : ak7Var) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            h.a(appendable, obj, ss2Var);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String o(ak7 ak7Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ss2 ss2Var) {
        zq3.h(ak7Var, "<this>");
        zq3.h(charSequence, "separator");
        zq3.h(charSequence2, "prefix");
        zq3.h(charSequence3, "postfix");
        zq3.h(charSequence4, "truncated");
        String sb = ((StringBuilder) n(ak7Var, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, ss2Var)).toString();
        zq3.g(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String p(ak7 ak7Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ss2 ss2Var, int i2, Object obj) {
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
        return o(ak7Var, charSequence, charSequence5, charSequence6, i3, charSequence7, ss2Var);
    }

    public static Object q(ak7 ak7Var) {
        zq3.h(ak7Var, "<this>");
        Iterator it2 = ak7Var.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = it2.next();
        }
        return next;
    }

    public static ak7 r(ak7 ak7Var, ss2 ss2Var) {
        zq3.h(ak7Var, "<this>");
        zq3.h(ss2Var, "transform");
        return new cr8(ak7Var, ss2Var);
    }

    public static ak7 s(ak7 ak7Var, ss2 ss2Var) {
        zq3.h(ak7Var, "<this>");
        zq3.h(ss2Var, "transform");
        return d.l(new cr8(ak7Var, ss2Var));
    }

    public static ak7 t(ak7 ak7Var, Comparator comparator) {
        zq3.h(ak7Var, "<this>");
        zq3.h(comparator, "comparator");
        return new b(ak7Var, comparator);
    }

    public static ak7 u(ak7 ak7Var, ss2 ss2Var) {
        zq3.h(ak7Var, "<this>");
        zq3.h(ss2Var, "predicate");
        return new cg8(ak7Var, ss2Var);
    }

    public static final Collection v(ak7 ak7Var, Collection collection) {
        zq3.h(ak7Var, "<this>");
        zq3.h(collection, "destination");
        Iterator it2 = ak7Var.iterator();
        while (it2.hasNext()) {
            collection.add(it2.next());
        }
        return collection;
    }

    public static List w(ak7 ak7Var) {
        zq3.h(ak7Var, "<this>");
        Iterator it2 = ak7Var.iterator();
        if (!it2.hasNext()) {
            return i.l();
        }
        Object next = it2.next();
        if (!it2.hasNext()) {
            return i.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    public static final List x(ak7 ak7Var) {
        zq3.h(ak7Var, "<this>");
        return (List) v(ak7Var, new ArrayList());
    }

    public static Set y(ak7 ak7Var) {
        zq3.h(ak7Var, "<this>");
        Iterator it2 = ak7Var.iterator();
        if (!it2.hasNext()) {
            return b0.e();
        }
        Object next = it2.next();
        if (!it2.hasNext()) {
            return b0.d(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it2.hasNext()) {
            linkedHashSet.add(it2.next());
        }
        return linkedHashSet;
    }
}
