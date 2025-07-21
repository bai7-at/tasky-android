package androidx.paging;

import androidx.paging.d;
import defpackage.by0;
import defpackage.gt2;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class PageEvent {

    public static final class Insert extends PageEvent {
        public static final a g;
        private static final Insert h;
        private final LoadType a;
        private final List b;
        private final int c;
        private final int d;
        private final e e;
        private final e f;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Insert d(a aVar, List list, int i, int i2, e eVar, e eVar2, int i3, Object obj) {
                if ((i3 & 16) != 0) {
                    eVar2 = null;
                }
                return aVar.c(list, i, i2, eVar, eVar2);
            }

            public final Insert a(List list, int i, e eVar, e eVar2) {
                zq3.h(list, "pages");
                zq3.h(eVar, "sourceLoadStates");
                return new Insert(LoadType.APPEND, list, -1, i, eVar, eVar2, null);
            }

            public final Insert b(List list, int i, e eVar, e eVar2) {
                zq3.h(list, "pages");
                zq3.h(eVar, "sourceLoadStates");
                return new Insert(LoadType.PREPEND, list, i, -1, eVar, eVar2, null);
            }

            public final Insert c(List list, int i, int i2, e eVar, e eVar2) {
                zq3.h(list, "pages");
                zq3.h(eVar, "sourceLoadStates");
                return new Insert(LoadType.REFRESH, list, i, i2, eVar, eVar2, null);
            }

            public final Insert e() {
                return Insert.h;
            }

            private a() {
            }
        }

        static {
            a aVar = new a(null);
            g = aVar;
            List e = kotlin.collections.i.e(r.e.a());
            d.c.a aVar2 = d.c.b;
            h = a.d(aVar, e, 0, 0, new e(aVar2.b(), aVar2.a(), aVar2.a()), null, 16, null);
        }

        public /* synthetic */ Insert(LoadType loadType, List list, int i, int i2, e eVar, e eVar2, DefaultConstructorMarker defaultConstructorMarker) {
            this(loadType, list, i, i2, eVar, eVar2);
        }

        public static /* synthetic */ Insert e(Insert insert, LoadType loadType, List list, int i, int i2, e eVar, e eVar2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                loadType = insert.a;
            }
            if ((i3 & 2) != 0) {
                list = insert.b;
            }
            List list2 = list;
            if ((i3 & 4) != 0) {
                i = insert.c;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = insert.d;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                eVar = insert.e;
            }
            e eVar3 = eVar;
            if ((i3 & 32) != 0) {
                eVar2 = insert.f;
            }
            return insert.d(loadType, list2, i4, i5, eVar3, eVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
        /* JADX WARN: Type inference failed for: r12v6, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e5 -> B:10:0x00e9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0099 -> B:11:0x00bc). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(defpackage.gt2 r20, defpackage.by0 r21) {
            /*
                Method dump skipped, instructions count: 289
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.a(gt2, by0):java.lang.Object");
        }

        public final Insert d(LoadType loadType, List list, int i, int i2, e eVar, e eVar2) {
            zq3.h(loadType, "loadType");
            zq3.h(list, "pages");
            zq3.h(eVar, "sourceLoadStates");
            return new Insert(loadType, list, i, i2, eVar, eVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Insert)) {
                return false;
            }
            Insert insert = (Insert) obj;
            return this.a == insert.a && zq3.c(this.b, insert.b) && this.c == insert.c && this.d == insert.d && zq3.c(this.e, insert.e) && zq3.c(this.f, insert.f);
        }

        public final LoadType f() {
            return this.a;
        }

        public final e g() {
            return this.f;
        }

        public final List h() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d)) * 31) + this.e.hashCode()) * 31;
            e eVar = this.f;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public final int i() {
            return this.d;
        }

        public final int j() {
            return this.c;
        }

        public final e k() {
            return this.e;
        }

        public String toString() {
            List b;
            List b2;
            Iterator it2 = this.b.iterator();
            int i = 0;
            while (it2.hasNext()) {
                i += ((r) it2.next()).b().size();
            }
            int i2 = this.c;
            String valueOf = i2 != -1 ? String.valueOf(i2) : "none";
            int i3 = this.d;
            String valueOf2 = i3 != -1 ? String.valueOf(i3) : "none";
            e eVar = this.f;
            StringBuilder sb = new StringBuilder();
            sb.append("PageEvent.Insert for ");
            sb.append(this.a);
            sb.append(", with ");
            sb.append(i);
            sb.append(" items (\n                    |   first item: ");
            r rVar = (r) kotlin.collections.i.m0(this.b);
            sb.append((rVar == null || (b2 = rVar.b()) == null) ? null : kotlin.collections.i.m0(b2));
            sb.append("\n                    |   last item: ");
            r rVar2 = (r) kotlin.collections.i.y0(this.b);
            sb.append((rVar2 == null || (b = rVar2.b()) == null) ? null : kotlin.collections.i.y0(b));
            sb.append("\n                    |   placeholdersBefore: ");
            sb.append(valueOf);
            sb.append("\n                    |   placeholdersAfter: ");
            sb.append(valueOf2);
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.e);
            sb.append("\n                    ");
            String sb2 = sb.toString();
            if (eVar != null) {
                sb2 = sb2 + "|   mediatorLoadStates: " + eVar + '\n';
            }
            return kotlin.text.h.h(sb2 + "|)", null, 1, null);
        }

        private Insert(LoadType loadType, List list, int i, int i2, e eVar, e eVar2) {
            super(null);
            this.a = loadType;
            this.b = list;
            this.c = i;
            this.d = i2;
            this.e = eVar;
            this.f = eVar2;
            if (loadType != LoadType.APPEND && i < 0) {
                throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + i).toString());
            }
            if (loadType == LoadType.PREPEND || i2 >= 0) {
                if (loadType == LoadType.REFRESH && list.isEmpty()) {
                    throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
                }
            } else {
                throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + i2).toString());
            }
        }
    }

    public static final class a extends PageEvent {
        private final LoadType a;
        private final int b;
        private final int c;
        private final int d;

        /* renamed from: androidx.paging.PageEvent$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0101a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[LoadType.values().length];
                try {
                    iArr[LoadType.APPEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LoadType.PREPEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LoadType loadType, int i, int i2, int i3) {
            super(null);
            zq3.h(loadType, "loadType");
            this.a = loadType;
            this.b = i;
            this.c = i2;
            this.d = i3;
            if (loadType == LoadType.REFRESH) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            if (f() <= 0) {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + f()).toString());
            }
            if (i3 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("Invalid placeholdersRemaining " + i3).toString());
        }

        public final LoadType c() {
            return this.a;
        }

        public final int d() {
            return this.c;
        }

        public final int e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int f() {
            return (this.c - this.b) + 1;
        }

        public final int g() {
            return this.d;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d);
        }

        public String toString() {
            String str;
            int i = C0101a.a[this.a.ordinal()];
            if (i == 1) {
                str = "end";
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
                str = "front";
            }
            return kotlin.text.h.h("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.b + "\n                    |   maxPageOffset: " + this.c + "\n                    |   placeholdersRemaining: " + this.d + "\n                    |)", null, 1, null);
        }
    }

    public static final class b extends PageEvent {
        private final e a;
        private final e b;

        public /* synthetic */ b(e eVar, e eVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(eVar, (i & 2) != 0 ? null : eVar2);
        }

        public final e c() {
            return this.b;
        }

        public final e d() {
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
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            e eVar = this.b;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            e eVar = this.b;
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ";
            if (eVar != null) {
                str = str + "|   mediatorLoadStates: " + eVar + '\n';
            }
            return kotlin.text.h.h(str + "|)", null, 1, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, e eVar2) {
            super(null);
            zq3.h(eVar, "source");
            this.a = eVar;
            this.b = eVar2;
        }
    }

    public /* synthetic */ PageEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    static /* synthetic */ Object b(PageEvent pageEvent, gt2 gt2Var, by0 by0Var) {
        zq3.f(pageEvent, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.map>");
        return pageEvent;
    }

    public Object a(gt2 gt2Var, by0 by0Var) {
        return b(this, gt2Var, by0Var);
    }

    private PageEvent() {
    }
}
