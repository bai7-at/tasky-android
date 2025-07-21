package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ph8 {
    public static final a b = new a(null);
    private static final ph8 c = new ph8(0);
    private static final ph8 d = new ph8(1);
    private static final ph8 e = new ph8(2);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ph8 a(List list) {
            Integer num = 0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                num = Integer.valueOf(num.intValue() | ((ph8) list.get(i)).e());
            }
            return new ph8(num.intValue());
        }

        public final ph8 b() {
            return ph8.e;
        }

        public final ph8 c() {
            return ph8.c;
        }

        public final ph8 d() {
            return ph8.d;
        }

        private a() {
        }
    }

    public ph8(int i) {
        this.a = i;
    }

    public final boolean d(ph8 ph8Var) {
        int i = this.a;
        return (ph8Var.a | i) == i;
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph8) && this.a == ((ph8) obj).a;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        if (this.a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.a & d.a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.a & e.a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + e64.e(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
