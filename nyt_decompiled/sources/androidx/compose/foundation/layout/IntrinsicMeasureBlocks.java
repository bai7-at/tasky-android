package androidx.compose.foundation.layout;

import defpackage.gt2;
import defpackage.it2;
import defpackage.xq3;
import java.util.List;

/* loaded from: classes.dex */
final class IntrinsicMeasureBlocks {
    public static final IntrinsicMeasureBlocks a = new IntrinsicMeasureBlocks();
    private static final it2 b = new it2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1
        public final Integer b(List list, int i2, int i3) {
            int p;
            AnonymousClass1 anonymousClass1 = new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.1
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.S(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            };
            AnonymousClass2 anonymousClass2 = new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.2
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.i(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            p = k.p(list, anonymousClass1, anonymousClass2, i2, i3, layoutOrientation, layoutOrientation);
            return Integer.valueOf(p);
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    };
    private static final it2 c = new it2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1
        public final Integer b(List list, int i2, int i3) {
            int p;
            p = k.p(list, new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.1
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.S(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            }, new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.2
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.i(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            }, i2, i3, LayoutOrientation.Vertical, LayoutOrientation.Horizontal);
            return Integer.valueOf(p);
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    };
    private static final it2 d = new it2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1
        public final Integer b(List list, int i2, int i3) {
            int p;
            p = k.p(list, new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.1
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.H(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            }, new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.2
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.V(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            }, i2, i3, LayoutOrientation.Horizontal, LayoutOrientation.Vertical);
            return Integer.valueOf(p);
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    };
    private static final it2 e = new it2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1
        public final Integer b(List list, int i2, int i3) {
            int p;
            AnonymousClass1 anonymousClass1 = new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.1
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.H(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            };
            AnonymousClass2 anonymousClass2 = new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.2
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.V(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            p = k.p(list, anonymousClass1, anonymousClass2, i2, i3, layoutOrientation, layoutOrientation);
            return Integer.valueOf(p);
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    };
    private static final it2 f = new it2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1
        public final Integer b(List list, int i2, int i3) {
            int p;
            AnonymousClass1 anonymousClass1 = new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.1
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.V(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            };
            AnonymousClass2 anonymousClass2 = new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.2
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.i(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            p = k.p(list, anonymousClass1, anonymousClass2, i2, i3, layoutOrientation, layoutOrientation);
            return Integer.valueOf(p);
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    };
    private static final it2 g = new it2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1
        public final Integer b(List list, int i2, int i3) {
            int p;
            p = k.p(list, new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.1
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.V(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            }, new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.2
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.i(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            }, i2, i3, LayoutOrientation.Vertical, LayoutOrientation.Horizontal);
            return Integer.valueOf(p);
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    };
    private static final it2 h = new it2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1
        public final Integer b(List list, int i2, int i3) {
            int p;
            p = k.p(list, new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.1
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.i(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            }, new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.2
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.V(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            }, i2, i3, LayoutOrientation.Horizontal, LayoutOrientation.Vertical);
            return Integer.valueOf(p);
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    };
    private static final it2 i = new it2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1
        public final Integer b(List list, int i2, int i3) {
            int p;
            AnonymousClass1 anonymousClass1 = new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.1
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.i(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            };
            AnonymousClass2 anonymousClass2 = new gt2() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.2
                public final Integer b(xq3 xq3Var, int i4) {
                    return Integer.valueOf(xq3Var.V(i4));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((xq3) obj, ((Number) obj2).intValue());
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            p = k.p(list, anonymousClass1, anonymousClass2, i2, i3, layoutOrientation, layoutOrientation);
            return Integer.valueOf(p);
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    };

    private IntrinsicMeasureBlocks() {
    }

    public final it2 a() {
        return h;
    }

    public final it2 b() {
        return f;
    }

    public final it2 c() {
        return d;
    }

    public final it2 d() {
        return b;
    }

    public final it2 e() {
        return i;
    }

    public final it2 f() {
        return g;
    }

    public final it2 g() {
        return e;
    }

    public final it2 h() {
        return c;
    }
}
