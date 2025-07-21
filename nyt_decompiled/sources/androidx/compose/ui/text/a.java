package androidx.compose.ui.text;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.au8;
import defpackage.jy7;
import defpackage.no5;
import defpackage.tp0;
import defpackage.zq3;
import defpackage.zy8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a implements CharSequence {
    private final String a;
    private final List b;
    private final List c;
    private final List d;

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d(Integer.valueOf(((b) obj).f()), Integer.valueOf(((b) obj2).f()));
        }
    }

    public a(String str, List list, List list2, List list3) {
        List N0;
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        if (list2 == null || (N0 = kotlin.collections.i.N0(list2, new c())) == null) {
            return;
        }
        int size = N0.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) N0.get(i2);
            if (bVar.f() < i) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            if (bVar.d() > this.a.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + bVar.f() + ", " + bVar.d() + ") is out of boundary").toString());
            }
            i = bVar.d();
        }
    }

    public char a(int i) {
        return this.a.charAt(i);
    }

    public final List b() {
        return this.d;
    }

    public int c() {
        return this.a.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return a(i);
    }

    public final List d() {
        List list = this.c;
        return list == null ? kotlin.collections.i.l() : list;
    }

    public final List e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d);
    }

    public final List f() {
        List list = this.b;
        return list == null ? kotlin.collections.i.l() : list;
    }

    public final List g() {
        return this.b;
    }

    public final List h(int i, int i2) {
        List l;
        List list = this.d;
        if (list != null) {
            l = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                b bVar = (b) obj;
                if ((bVar.e() instanceof String) && androidx.compose.ui.text.b.l(i, i2, bVar.f(), bVar.d())) {
                    l.add(obj);
                }
            }
        } else {
            l = kotlin.collections.i.l();
        }
        zq3.f(l, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return l;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.d;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final List i(String str, int i, int i2) {
        List l;
        List list = this.d;
        if (list != null) {
            l = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                b bVar = (b) obj;
                if ((bVar.e() instanceof String) && zq3.c(str, bVar.g()) && androidx.compose.ui.text.b.l(i, i2, bVar.f(), bVar.d())) {
                    l.add(obj);
                }
            }
        } else {
            l = kotlin.collections.i.l();
        }
        zq3.f(l, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return l;
    }

    public final String j() {
        return this.a;
    }

    public final List k(int i, int i2) {
        List l;
        List list = this.d;
        if (list != null) {
            l = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                b bVar = (b) obj;
                if ((bVar.e() instanceof au8) && androidx.compose.ui.text.b.l(i, i2, bVar.f(), bVar.d())) {
                    l.add(obj);
                }
            }
        } else {
            l = kotlin.collections.i.l();
        }
        zq3.f(l, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return l;
    }

    public final List l(int i, int i2) {
        List l;
        List list = this.d;
        if (list != null) {
            l = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                b bVar = (b) obj;
                if ((bVar.e() instanceof zy8) && androidx.compose.ui.text.b.l(i, i2, bVar.f(), bVar.d())) {
                    l.add(obj);
                }
            }
        } else {
            l = kotlin.collections.i.l();
        }
        zq3.f(l, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return l;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    public final boolean m(String str, int i, int i2) {
        List list = this.d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = (b) list.get(i3);
            if ((bVar.e() instanceof String) && zq3.c(str, bVar.g()) && androidx.compose.ui.text.b.l(i, i2, bVar.f(), bVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final a n(a aVar) {
        C0064a c0064a = new C0064a(this);
        c0064a.g(aVar);
        return c0064a.o();
    }

    @Override // java.lang.CharSequence
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public a subSequence(int i, int i2) {
        List h;
        List h2;
        List h3;
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
        }
        if (i == 0 && i2 == this.a.length()) {
            return this;
        }
        String substring = this.a.substring(i, i2);
        zq3.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        h = androidx.compose.ui.text.b.h(this.b, i, i2);
        h2 = androidx.compose.ui.text.b.h(this.c, i, i2);
        h3 = androidx.compose.ui.text.b.h(this.d, i, i2);
        return new a(substring, h, h2, h3);
    }

    public final a p(long j) {
        return subSequence(i.l(j), i.k(j));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.a;
    }

    public static final class b {
        private final Object a;
        private final int b;
        private final int c;
        private final String d;

        public b(Object obj, int i, int i2, String str) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = str;
            if (i > i2) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public final Object a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final int d() {
            return this.c;
        }

        public final Object e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && zq3.c(this.d, bVar.d);
        }

        public final int f() {
            return this.b;
        }

        public final String g() {
            return this.d;
        }

        public int hashCode() {
            Object obj = this.a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
        }

        public b(Object obj, int i, int i2) {
            this(obj, i, i2, "");
        }
    }

    /* renamed from: androidx.compose.ui.text.a$a, reason: collision with other inner class name */
    public static final class C0064a implements Appendable {
        private final StringBuilder a;
        private final List b;
        private final List c;
        private final List d;
        private final List e;

        public C0064a(int i) {
            this.a = new StringBuilder(i);
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }

        public final void a(String str, String str2, int i, int i2) {
            this.d.add(new C0065a(str2, i, i2, str));
        }

        public final void b(no5 no5Var, int i, int i2) {
            this.c.add(new C0065a(no5Var, i, i2, null, 8, null));
        }

        public final void c(jy7 jy7Var, int i, int i2) {
            this.b.add(new C0065a(jy7Var, i, i2, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C0064a append(char c) {
            this.a.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0064a append(CharSequence charSequence) {
            if (charSequence instanceof a) {
                g((a) charSequence);
            } else {
                this.a.append(charSequence);
            }
            return this;
        }

        @Override // java.lang.Appendable
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0064a append(CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof a) {
                h((a) charSequence, i, i2);
            } else {
                this.a.append(charSequence, i, i2);
            }
            return this;
        }

        public final void g(a aVar) {
            int length = this.a.length();
            this.a.append(aVar.j());
            List g = aVar.g();
            if (g != null) {
                int size = g.size();
                for (int i = 0; i < size; i++) {
                    b bVar = (b) g.get(i);
                    c((jy7) bVar.e(), bVar.f() + length, bVar.d() + length);
                }
            }
            List e = aVar.e();
            if (e != null) {
                int size2 = e.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    b bVar2 = (b) e.get(i2);
                    b((no5) bVar2.e(), bVar2.f() + length, bVar2.d() + length);
                }
            }
            List b = aVar.b();
            if (b != null) {
                int size3 = b.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    b bVar3 = (b) b.get(i3);
                    this.d.add(new C0065a(bVar3.e(), bVar3.f() + length, bVar3.d() + length, bVar3.g()));
                }
            }
        }

        public final void h(a aVar, int i, int i2) {
            List k;
            List j;
            List i3;
            int length = this.a.length();
            this.a.append((CharSequence) aVar.j(), i, i2);
            k = androidx.compose.ui.text.b.k(aVar, i, i2);
            if (k != null) {
                int size = k.size();
                for (int i4 = 0; i4 < size; i4++) {
                    b bVar = (b) k.get(i4);
                    c((jy7) bVar.e(), bVar.f() + length, bVar.d() + length);
                }
            }
            j = androidx.compose.ui.text.b.j(aVar, i, i2);
            if (j != null) {
                int size2 = j.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    b bVar2 = (b) j.get(i5);
                    b((no5) bVar2.e(), bVar2.f() + length, bVar2.d() + length);
                }
            }
            i3 = androidx.compose.ui.text.b.i(aVar, i, i2);
            if (i3 != null) {
                int size3 = i3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    b bVar3 = (b) i3.get(i6);
                    this.d.add(new C0065a(bVar3.e(), bVar3.f() + length, bVar3.d() + length, bVar3.g()));
                }
            }
        }

        public final void i(String str) {
            this.a.append(str);
        }

        public final void j() {
            if (this.e.isEmpty()) {
                throw new IllegalStateException("Nothing to pop.");
            }
            ((C0065a) this.e.remove(r0.size() - 1)).a(this.a.length());
        }

        public final void k(int i) {
            if (i < this.e.size()) {
                while (this.e.size() - 1 >= i) {
                    j();
                }
            } else {
                throw new IllegalStateException((i + " should be less than " + this.e.size()).toString());
            }
        }

        public final int l(String str, String str2) {
            C0065a c0065a = new C0065a(str2, this.a.length(), 0, str, 4, null);
            this.e.add(c0065a);
            this.d.add(c0065a);
            return this.e.size() - 1;
        }

        public final int m(no5 no5Var) {
            C0065a c0065a = new C0065a(no5Var, this.a.length(), 0, null, 12, null);
            this.e.add(c0065a);
            this.c.add(c0065a);
            return this.e.size() - 1;
        }

        public final int n(jy7 jy7Var) {
            C0065a c0065a = new C0065a(jy7Var, this.a.length(), 0, null, 12, null);
            this.e.add(c0065a);
            this.b.add(c0065a);
            return this.e.size() - 1;
        }

        public final a o() {
            String sb = this.a.toString();
            List list = this.b;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((C0065a) list.get(i)).b(this.a.length()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List list2 = this.c;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(((C0065a) list2.get(i2)).b(this.a.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            List list3 = this.d;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList3.add(((C0065a) list3.get(i3)).b(this.a.length()));
            }
            return new a(sb, arrayList, arrayList2, arrayList3.isEmpty() ? null : arrayList3);
        }

        /* renamed from: androidx.compose.ui.text.a$a$a, reason: collision with other inner class name */
        private static final class C0065a {
            private final Object a;
            private final int b;
            private int c;
            private final String d;

            public C0065a(Object obj, int i, int i2, String str) {
                this.a = obj;
                this.b = i;
                this.c = i2;
                this.d = str;
            }

            public final void a(int i) {
                this.c = i;
            }

            public final b b(int i) {
                int i2 = this.c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    return new b(this.a, this.b, i, this.d);
                }
                throw new IllegalStateException("Item.end should be set first");
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0065a)) {
                    return false;
                }
                C0065a c0065a = (C0065a) obj;
                return zq3.c(this.a, c0065a.a) && this.b == c0065a.b && this.c == c0065a.c && zq3.c(this.d, c0065a.d);
            }

            public int hashCode() {
                Object obj = this.a;
                return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
            }

            public /* synthetic */ C0065a(Object obj, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i, (i3 & 4) != 0 ? RecyclerView.UNDEFINED_DURATION : i2, (i3 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ C0064a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        public C0064a(a aVar) {
            this(0, 1, null);
            g(aVar);
        }
    }

    public /* synthetic */ a(String str, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }

    public /* synthetic */ a(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.i.l() : list, (i & 4) != 0 ? kotlin.collections.i.l() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.lang.String r3, java.util.List r4, java.util.List r5) {
        /*
            r2 = this;
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            r4 = r1
        La:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L15
            r5 = r1
        L15:
            java.util.List r5 = (java.util.List) r5
            r2.<init>(r3, r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.a.<init>(java.lang.String, java.util.List, java.util.List):void");
    }
}
