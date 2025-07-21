package androidx.paging;

import androidx.paging.s;
import defpackage.an3;
import defpackage.zq3;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class r {
    public static final a e = new a(null);
    private static final r f = new r(0, kotlin.collections.i.l());
    private final int[] a;
    private final List b;
    private final int c;
    private final List d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a() {
            return r.f;
        }

        private a() {
        }
    }

    public r(int[] iArr, List list, int i, List list2) {
        zq3.h(iArr, "originalPageOffsets");
        zq3.h(list, "data");
        this.a = iArr;
        this.b = list;
        this.c = i;
        this.d = list2;
        if (iArr.length == 0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        }
        if (list2 == null || list2.size() == list.size()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("If originalIndices (size = ");
        zq3.e(list2);
        sb.append(list2.size());
        sb.append(") is provided, it must be same length as data (size = ");
        sb.append(list.size());
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final List b() {
        return this.b;
    }

    public final List c() {
        return this.d;
    }

    public final int d() {
        return this.c;
    }

    public final int[] e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return Arrays.equals(this.a, rVar.a) && zq3.c(this.b, rVar.b) && this.c == rVar.c && zq3.c(this.d, rVar.d);
    }

    public final s.a f(int i, int i2, int i3, int i4, int i5) {
        an3 m;
        int i6 = this.c;
        List list = this.d;
        if (list != null && (m = kotlin.collections.i.m(list)) != null && m.q(i)) {
            i = ((Number) this.d.get(i)).intValue();
        }
        return new s.a(i6, i, i2, i3, i4, i5);
    }

    public int hashCode() {
        int hashCode = ((((Arrays.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c) * 31;
        List list = this.d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.a) + ", data=" + this.b + ", hintOriginalPageOffset=" + this.c + ", hintOriginalIndices=" + this.d + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(int i, List list) {
        this(new int[]{i}, list, i, null);
        zq3.h(list, "data");
    }
}
