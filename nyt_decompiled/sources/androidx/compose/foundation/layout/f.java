package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class f {
    public static final b a = new b(null);
    private static final f b = a.e;
    private static final f c = e.e;
    private static final f d = c.e;

    private static final class a extends f {
        public static final a e = new a();

        private a() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.f
        public int a(int i, LayoutDirection layoutDirection, androidx.compose.ui.layout.l lVar, int i2) {
            return i / 2;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Alignment.b bVar) {
            return new d(bVar);
        }

        public final f b(Alignment.c cVar) {
            return new C0028f(cVar);
        }

        private b() {
        }
    }

    private static final class c extends f {
        public static final c e = new c();

        private c() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.f
        public int a(int i, LayoutDirection layoutDirection, androidx.compose.ui.layout.l lVar, int i2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return i;
            }
            return 0;
        }
    }

    private static final class d extends f {
        private final Alignment.b e;

        public d(Alignment.b bVar) {
            super(null);
            this.e = bVar;
        }

        @Override // androidx.compose.foundation.layout.f
        public int a(int i, LayoutDirection layoutDirection, androidx.compose.ui.layout.l lVar, int i2) {
            return this.e.a(0, i, layoutDirection);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.e, ((d) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.e + ')';
        }
    }

    private static final class e extends f {
        public static final e e = new e();

        private e() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.f
        public int a(int i, LayoutDirection layoutDirection, androidx.compose.ui.layout.l lVar, int i2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return 0;
            }
            return i;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.f$f, reason: collision with other inner class name */
    private static final class C0028f extends f {
        private final Alignment.c e;

        public C0028f(Alignment.c cVar) {
            super(null);
            this.e = cVar;
        }

        @Override // androidx.compose.foundation.layout.f
        public int a(int i, LayoutDirection layoutDirection, androidx.compose.ui.layout.l lVar, int i2) {
            return this.e.a(0, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0028f) && zq3.c(this.e, ((C0028f) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.e + ')';
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(int i, LayoutDirection layoutDirection, androidx.compose.ui.layout.l lVar, int i2);

    public Integer b(androidx.compose.ui.layout.l lVar) {
        return null;
    }

    public boolean c() {
        return false;
    }

    private f() {
    }
}
