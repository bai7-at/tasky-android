package androidx.paging;

import defpackage.zq3;
import defpackage.zt5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class k {

    public static final class a extends k {
        private final int a;
        private final List b;
        private final int c;
        private final int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, List list, int i2, int i3) {
            super(null);
            zq3.h(list, "inserted");
            this.a = i;
            this.b = list;
            this.c = i2;
            this.d = i3;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a == aVar.a && zq3.c(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.a) + this.b.hashCode() + Integer.hashCode(this.c) + Integer.hashCode(this.d);
        }

        public String toString() {
            return kotlin.text.h.h("PagingDataEvent.Append loaded " + this.b.size() + " items (\n                    |   startIndex: " + this.a + "\n                    |   first item: " + kotlin.collections.i.m0(this.b) + "\n                    |   last item: " + kotlin.collections.i.y0(this.b) + "\n                    |   newPlaceholdersBefore: " + this.c + "\n                    |   oldPlaceholdersBefore: " + this.d + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class b extends k {
        private final int a;
        private final int b;
        private final int c;
        private final int d;

        public b(int i, int i2, int i3, int i4) {
            super(null);
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.a) + Integer.hashCode(this.b) + Integer.hashCode(this.c) + Integer.hashCode(this.d);
        }

        public String toString() {
            return kotlin.text.h.h("PagingDataEvent.DropAppend dropped " + this.b + " items (\n                    |   startIndex: " + this.a + "\n                    |   dropCount: " + this.b + "\n                    |   newPlaceholdersBefore: " + this.c + "\n                    |   oldPlaceholdersBefore: " + this.d + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class c extends k {
        private final int a;
        private final int b;
        private final int c;

        public c(int i, int i2, int i3) {
            super(null);
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.a == cVar.a && this.b == cVar.b && this.c == cVar.c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.a) + Integer.hashCode(this.b) + Integer.hashCode(this.c);
        }

        public String toString() {
            return kotlin.text.h.h("PagingDataEvent.DropPrepend dropped " + this.a + " items (\n                    |   dropCount: " + this.a + "\n                    |   newPlaceholdersBefore: " + this.b + "\n                    |   oldPlaceholdersBefore: " + this.c + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class d extends k {
        private final List a;
        private final int b;
        private final int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, int i, int i2) {
            super(null);
            zq3.h(list, "inserted");
            this.a = list;
            this.b = i;
            this.c = i2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (zq3.c(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + Integer.hashCode(this.b) + Integer.hashCode(this.c);
        }

        public String toString() {
            return kotlin.text.h.h("PagingDataEvent.Prepend loaded " + this.a.size() + " items (\n                    |   first item: " + kotlin.collections.i.m0(this.a) + "\n                    |   last item: " + kotlin.collections.i.y0(this.a) + "\n                    |   newPlaceholdersBefore: " + this.b + "\n                    |   oldPlaceholdersBefore: " + this.c + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class e extends k {
        private final zt5 a;
        private final zt5 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(zt5 zt5Var, zt5 zt5Var2) {
            super(null);
            zq3.h(zt5Var, "newList");
            zq3.h(zt5Var2, "previousList");
            this.a = zt5Var;
            this.b = zt5Var2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.a.f() == eVar.a.f() && this.a.j() == eVar.a.j() && this.a.a() == eVar.a.a() && this.a.c() == eVar.a.c() && this.b.f() == eVar.b.f() && this.b.j() == eVar.b.j() && this.b.a() == eVar.b.a() && this.b.c() == eVar.b.c()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + this.b.hashCode();
        }

        public String toString() {
            return kotlin.text.h.h("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: " + this.a.f() + "\n                    |       placeholdersAfter: " + this.a.j() + "\n                    |       size: " + this.a.a() + "\n                    |       dataCount: " + this.a.c() + "\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: " + this.b.f() + "\n                    |       placeholdersAfter: " + this.b.j() + "\n                    |       size: " + this.b.a() + "\n                    |       dataCount: " + this.b.c() + "\n                    |   )\n                    |", null, 1, null);
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private k() {
    }
}
