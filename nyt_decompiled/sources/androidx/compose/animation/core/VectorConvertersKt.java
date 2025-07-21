package androidx.compose.animation.core;

import defpackage.bu1;
import defpackage.dg4;
import defpackage.du1;
import defpackage.du7;
import defpackage.eu1;
import defpackage.fd5;
import defpackage.hd5;
import defpackage.hn3;
import defpackage.hu8;
import defpackage.ii;
import defpackage.in3;
import defpackage.ji;
import defpackage.kt6;
import defpackage.li;
import defpackage.om3;
import defpackage.ss2;
import defpackage.vm3;
import defpackage.wk2;
import defpackage.wm3;
import defpackage.zt7;

/* loaded from: classes.dex */
public abstract class VectorConvertersKt {
    private static final hu8 a = a(new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        public final ii b(float f2) {
            return new ii(f2);
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).floatValue());
        }
    }, new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke(ii iiVar) {
            return Float.valueOf(iiVar.f());
        }
    });
    private static final hu8 b = a(new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        public final ii b(int i2) {
            return new ii(i2);
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }, new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(ii iiVar) {
            return Integer.valueOf((int) iiVar.f());
        }
    });
    private static final hu8 c = a(new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        public final ii b(float f2) {
            return new ii(f2);
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((bu1) obj).n());
        }
    }, new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        public final float b(ii iiVar) {
            return bu1.g(iiVar.f());
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return bu1.d(b((ii) obj));
        }
    });
    private static final hu8 d = a(new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        public final ji b(long j) {
            return new ji(eu1.g(j), eu1.h(j));
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((eu1) obj).k());
        }
    }, new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        public final long b(ji jiVar) {
            return du1.a(bu1.g(jiVar.f()), bu1.g(jiVar.g()));
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return eu1.c(b((ji) obj));
        }
    });
    private static final hu8 e = a(new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        public final ji b(long j) {
            return new ji(zt7.i(j), zt7.g(j));
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((zt7) obj).m());
        }
    }, new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        public final long b(ji jiVar) {
            return du7.a(jiVar.f(), jiVar.g());
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return zt7.c(b((ji) obj));
        }
    });
    private static final hu8 f = a(new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        public final ji b(long j) {
            return new ji(fd5.o(j), fd5.p(j));
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((fd5) obj).x());
        }
    }, new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        public final long b(ji jiVar) {
            return hd5.a(jiVar.f(), jiVar.g());
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return fd5.d(b((ji) obj));
        }
    });
    private static final hu8 g = a(new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        public final ji b(long j) {
            return new ji(vm3.j(j), vm3.k(j));
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((vm3) obj).n());
        }
    }, new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        public final long b(ji jiVar) {
            return wm3.a(dg4.d(jiVar.f()), dg4.d(jiVar.g()));
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return vm3.b(b((ji) obj));
        }
    });
    private static final hu8 h = a(new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        public final ji b(long j) {
            return new ji(hn3.g(j), hn3.f(j));
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((hn3) obj).j());
        }
    }, new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        public final long b(ji jiVar) {
            return in3.a(dg4.d(jiVar.f()), dg4.d(jiVar.g()));
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return hn3.b(b((ji) obj));
        }
    });
    private static final hu8 i = a(new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final li invoke(kt6 kt6Var) {
            return new li(kt6Var.i(), kt6Var.l(), kt6Var.j(), kt6Var.e());
        }
    }, new ss2() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kt6 invoke(li liVar) {
            return new kt6(liVar.f(), liVar.g(), liVar.h(), liVar.i());
        }
    });

    public static final hu8 a(ss2 ss2Var, ss2 ss2Var2) {
        return new a(ss2Var, ss2Var2);
    }

    public static final hu8 b(bu1.a aVar) {
        return c;
    }

    public static final hu8 c(eu1.a aVar) {
        return d;
    }

    public static final hu8 d(wk2 wk2Var) {
        return a;
    }

    public static final hu8 e(om3 om3Var) {
        return b;
    }

    public static final hu8 f(vm3.a aVar) {
        return g;
    }

    public static final hu8 g(hn3.a aVar) {
        return h;
    }

    public static final hu8 h(fd5.a aVar) {
        return f;
    }

    public static final hu8 i(kt6.a aVar) {
        return i;
    }

    public static final hu8 j(zt7.a aVar) {
        return e;
    }

    public static final float k(float f2, float f3, float f4) {
        return (f2 * (1 - f4)) + (f3 * f4);
    }
}
