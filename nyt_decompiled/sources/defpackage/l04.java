package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.b80;
import defpackage.k04;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class l04 implements mv4, b80 {
    public static final b g = new b(null);
    private static final a h = new a();
    private final n04 b;
    private final k04 c;
    private final boolean d;
    private final LayoutDirection e;
    private final Orientation f;

    public static final class a implements b80.a {
        private final boolean a;

        a() {
        }

        @Override // b80.a
        public boolean a() {
            return this.a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class d implements b80.a {
        final /* synthetic */ Ref$ObjectRef b;
        final /* synthetic */ int c;

        d(Ref$ObjectRef ref$ObjectRef, int i) {
            this.b = ref$ObjectRef;
            this.c = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b80.a
        public boolean a() {
            return l04.this.x((k04.a) this.b.element, this.c);
        }
    }

    public l04(n04 n04Var, k04 k04Var, boolean z, LayoutDirection layoutDirection, Orientation orientation) {
        this.b = n04Var;
        this.c = k04Var;
        this.d = z;
        this.e = layoutDirection;
        this.f = orientation;
    }

    private final k04.a t(k04.a aVar, int i) {
        int b2 = aVar.b();
        int a2 = aVar.a();
        if (y(i)) {
            a2++;
        } else {
            b2--;
        }
        return this.c.a(b2, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x(k04.a aVar, int i) {
        if (z(i)) {
            return false;
        }
        if (y(i)) {
            if (aVar.a() >= this.b.a() - 1) {
                return false;
            }
        } else if (aVar.b() <= 0) {
            return false;
        }
        return true;
    }

    private final boolean y(int i) {
        b80.b.a aVar = b80.b.a;
        if (b80.b.h(i, aVar.c())) {
            return false;
        }
        if (!b80.b.h(i, aVar.b())) {
            if (b80.b.h(i, aVar.a())) {
                return this.d;
            }
            if (b80.b.h(i, aVar.d())) {
                if (this.d) {
                    return false;
                }
            } else if (b80.b.h(i, aVar.e())) {
                int i2 = c.a[this.e.ordinal()];
                if (i2 == 1) {
                    return this.d;
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.d) {
                    return false;
                }
            } else {
                if (!b80.b.h(i, aVar.f())) {
                    m04.c();
                    throw new KotlinNothingValueException();
                }
                int i3 = c.a[this.e.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return this.d;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (this.d) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean z(int i) {
        b80.b.a aVar = b80.b.a;
        if (!(b80.b.h(i, aVar.a()) ? true : b80.b.h(i, aVar.d()))) {
            if (!(b80.b.h(i, aVar.e()) ? true : b80.b.h(i, aVar.f()))) {
                if (!(b80.b.h(i, aVar.c()) ? true : b80.b.h(i, aVar.b()))) {
                    m04.c();
                    throw new KotlinNothingValueException();
                }
            } else if (this.f == Orientation.Vertical) {
                return true;
            }
        } else if (this.f == Orientation.Horizontal) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mv4
    public n76 getKey() {
        return BeyondBoundsLayoutKt.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, k04$a] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, k04$a] */
    @Override // defpackage.b80
    public Object l(int i, ss2 ss2Var) {
        if (this.b.a() <= 0 || !this.b.c()) {
            return ss2Var.invoke(h);
        }
        int e = y(i) ? this.b.e() : this.b.d();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = this.c.a(e, e);
        Object obj = null;
        while (obj == null && x((k04.a) ref$ObjectRef.element, i)) {
            ?? t = t((k04.a) ref$ObjectRef.element, i);
            this.c.e((k04.a) ref$ObjectRef.element);
            ref$ObjectRef.element = t;
            this.b.b();
            obj = ss2Var.invoke(new d(ref$ObjectRef, i));
        }
        this.c.e((k04.a) ref$ObjectRef.element);
        this.b.b();
        return obj;
    }

    @Override // defpackage.mv4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public b80 getValue() {
        return this;
    }
}
