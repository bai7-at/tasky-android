package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bu1;
import defpackage.dg4;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class Arrangement {
    public static final Arrangement a = new Arrangement();
    private static final e b = new k();
    private static final e c = new d();
    private static final m d = new l();
    private static final m e = new b();
    private static final f f = new c();
    private static final f g = new i();
    private static final f h = new h();
    private static final f i = new g();

    public static final class a {
        public static final a a = new a();
        private static final e b = new b();
        private static final e c = new C0027a();
        private static final e d = new c();
        private static final e e = new e();
        private static final e f = new f();
        private static final e g = new d();

        /* renamed from: androidx.compose.foundation.layout.Arrangement$a$a, reason: collision with other inner class name */
        public static final class C0027a implements e {
            C0027a() {
            }

            @Override // androidx.compose.foundation.layout.Arrangement.e
            public void b(fm1 fm1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.a.h(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        public static final class b implements e {
            b() {
            }

            @Override // androidx.compose.foundation.layout.Arrangement.e
            public void b(fm1 fm1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.a.i(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        public static final class c implements e {
            c() {
            }

            @Override // androidx.compose.foundation.layout.Arrangement.e
            public void b(fm1 fm1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.a.j(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        public static final class d implements e {
            d() {
            }

            @Override // androidx.compose.foundation.layout.Arrangement.e
            public void b(fm1 fm1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.a.k(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        public static final class e implements e {
            e() {
            }

            @Override // androidx.compose.foundation.layout.Arrangement.e
            public void b(fm1 fm1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.a.l(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        public static final class f implements e {
            f() {
            }

            @Override // androidx.compose.foundation.layout.Arrangement.e
            public void b(fm1 fm1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.a.m(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final f a(float f2) {
            return new j(f2, false, null, 0 == true ? 1 : 0);
        }
    }

    public static final class b implements m {
        b() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.m
        public void c(fm1 fm1Var, int i, int[] iArr, int[] iArr2) {
            Arrangement.a.j(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    public static final class c implements f {
        private final float a = bu1.g(0);

        c() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.m
        public float a() {
            return this.a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e
        public void b(fm1 fm1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.a.h(i, iArr, iArr2, false);
            } else {
                Arrangement.a.h(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.m
        public void c(fm1 fm1Var, int i, int[] iArr, int[] iArr2) {
            Arrangement.a.h(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    public static final class d implements e {
        d() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e
        public void b(fm1 fm1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.a.j(i, iArr, iArr2, false);
            } else {
                Arrangement.a.i(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    public interface e {
        default float a() {
            return bu1.g(0);
        }

        void b(fm1 fm1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);
    }

    public interface f extends e, m {
    }

    public static final class g implements f {
        private final float a = bu1.g(0);

        g() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.m
        public float a() {
            return this.a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e
        public void b(fm1 fm1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.a.k(i, iArr, iArr2, false);
            } else {
                Arrangement.a.k(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.m
        public void c(fm1 fm1Var, int i, int[] iArr, int[] iArr2) {
            Arrangement.a.k(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    public static final class h implements f {
        private final float a = bu1.g(0);

        h() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.m
        public float a() {
            return this.a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e
        public void b(fm1 fm1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.a.l(i, iArr, iArr2, false);
            } else {
                Arrangement.a.l(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.m
        public void c(fm1 fm1Var, int i, int[] iArr, int[] iArr2) {
            Arrangement.a.l(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    public static final class i implements f {
        private final float a = bu1.g(0);

        i() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.m
        public float a() {
            return this.a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e
        public void b(fm1 fm1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.a.m(i, iArr, iArr2, false);
            } else {
                Arrangement.a.m(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.m
        public void c(fm1 fm1Var, int i, int[] iArr, int[] iArr2) {
            Arrangement.a.m(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    public static final class j implements f {
        private final float a;
        private final boolean b;
        private final gt2 c;
        private final float d;

        public /* synthetic */ j(float f, boolean z, gt2 gt2Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, z, gt2Var);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.m
        public float a() {
            return this.d;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e
        public void b(fm1 fm1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i2;
            int i3;
            if (iArr.length == 0) {
                return;
            }
            int l0 = fm1Var.l0(this.a);
            boolean z = this.b && layoutDirection == LayoutDirection.Rtl;
            Arrangement arrangement = Arrangement.a;
            if (z) {
                int length = iArr.length - 1;
                i2 = 0;
                i3 = 0;
                while (-1 < length) {
                    int i4 = iArr[length];
                    int min = Math.min(i2, i - i4);
                    iArr2[length] = min;
                    int min2 = Math.min(l0, (i - min) - i4);
                    int i5 = iArr2[length] + i4 + min2;
                    length--;
                    i3 = min2;
                    i2 = i5;
                }
            } else {
                int length2 = iArr.length;
                int i6 = 0;
                i2 = 0;
                i3 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr[i6];
                    int min3 = Math.min(i2, i - i8);
                    iArr2[i7] = min3;
                    int min4 = Math.min(l0, (i - min3) - i8);
                    int i9 = iArr2[i7] + i8 + min4;
                    i6++;
                    i7++;
                    i3 = min4;
                    i2 = i9;
                }
            }
            int i10 = i2 - i3;
            gt2 gt2Var = this.c;
            if (gt2Var == null || i10 >= i) {
                return;
            }
            int intValue = ((Number) gt2Var.invoke(Integer.valueOf(i - i10), layoutDirection)).intValue();
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + intValue;
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.m
        public void c(fm1 fm1Var, int i, int[] iArr, int[] iArr2) {
            b(fm1Var, i, iArr, LayoutDirection.Ltr, iArr2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return bu1.j(this.a, jVar.a) && this.b == jVar.b && zq3.c(this.c, jVar.c);
        }

        public int hashCode() {
            int k = ((bu1.k(this.a) * 31) + Boolean.hashCode(this.b)) * 31;
            gt2 gt2Var = this.c;
            return k + (gt2Var == null ? 0 : gt2Var.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) bu1.l(this.a));
            sb.append(", ");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }

        private j(float f, boolean z, gt2 gt2Var) {
            this.a = f;
            this.b = z;
            this.c = gt2Var;
            this.d = f;
        }
    }

    public static final class k implements e {
        k() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e
        public void b(fm1 fm1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.a.i(iArr, iArr2, false);
            } else {
                Arrangement.a.j(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    public static final class l implements m {
        l() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.m
        public void c(fm1 fm1Var, int i, int[] iArr, int[] iArr2) {
            Arrangement.a.i(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    public interface m {
        default float a() {
            return bu1.g(0);
        }

        void c(fm1 fm1Var, int i, int[] iArr, int[] iArr2);
    }

    private Arrangement() {
    }

    public final m a() {
        return e;
    }

    public final f b() {
        return f;
    }

    public final e c() {
        return c;
    }

    public final f d() {
        return h;
    }

    public final f e() {
        return g;
    }

    public final e f() {
        return b;
    }

    public final m g() {
        return d;
    }

    public final void h(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = dg4.d(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = dg4.d(f2);
            f2 += i8;
        }
    }

    public final void i(int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        if (!z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i6 = iArr[length2];
            iArr2[length2] = i2;
            i2 += i6;
        }
    }

    public final void j(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = i2 - i4;
        if (!z) {
            int length = iArr.length;
            int i7 = 0;
            while (i3 < length) {
                int i8 = iArr[i3];
                iArr2[i7] = i6;
                i6 += i8;
                i3++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i9 = iArr[length2];
            iArr2[length2] = i6;
            i6 += i9;
        }
    }

    public final void k(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = !(iArr.length == 0) ? (i2 - i4) / iArr.length : 0.0f;
        float f2 = length / 2;
        if (z) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = dg4.d(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = dg4.d(f2);
            f2 += i8 + length;
            i3++;
            i7++;
        }
    }

    public final void l(int i2, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float max = (i2 - i4) / Math.max(kotlin.collections.d.c0(iArr), 1);
        float f2 = (z && iArr.length == 1) ? max : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = dg4.d(f2);
                f2 += i6 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = dg4.d(f2);
            f2 += i8 + max;
            i3++;
            i7++;
        }
    }

    public final void m(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = dg4.d(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = dg4.d(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }

    public final f n(float f2) {
        return new j(f2, true, new gt2() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$1
            public final Integer b(int i2, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.a.k().a(0, i2, layoutDirection));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((Number) obj).intValue(), (LayoutDirection) obj2);
            }
        }, null);
    }

    public final e o(float f2, final Alignment.b bVar) {
        return new j(f2, true, new gt2() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$2
            {
                super(2);
            }

            public final Integer b(int i2, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.b.this.a(0, i2, layoutDirection));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((Number) obj).intValue(), (LayoutDirection) obj2);
            }
        }, null);
    }

    public final m p(float f2, final Alignment.c cVar) {
        return new j(f2, false, new gt2() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$3
            {
                super(2);
            }

            public final Integer b(int i2, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.c.this.a(0, i2));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((Number) obj).intValue(), (LayoutDirection) obj2);
            }
        }, null);
    }
}
