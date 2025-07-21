package androidx.compose.material3;

import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import defpackage.bu1;
import defpackage.d37;
import defpackage.e01;
import defpackage.j01;
import defpackage.jp7;
import defpackage.m76;
import defpackage.no7;
import defpackage.qs2;
import defpackage.qt6;
import defpackage.zf4;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class ShapesKt {
    private static final m76 a = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.material3.ShapesKt$LocalShapes$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final jp7 mo865invoke() {
            return new jp7(null, null, null, null, null, 31, null);
        }
    });

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            try {
                iArr[ShapeKeyTokens.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraLargeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraSmallTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShapeKeyTokens.CornerFull.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeEnd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ShapeKeyTokens.CornerMedium.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ShapeKeyTokens.CornerNone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ShapeKeyTokens.CornerSmall.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            a = iArr;
        }
    }

    public static final e01 a(e01 e01Var) {
        float f = (float) 0.0d;
        return e01.d(e01Var, j01.b(bu1.g(f)), null, null, j01.b(bu1.g(f)), 6, null);
    }

    public static final no7 b(jp7 jp7Var, ShapeKeyTokens shapeKeyTokens) {
        switch (a.a[shapeKeyTokens.ordinal()]) {
            case 1:
                return jp7Var.a();
            case 2:
                return e(jp7Var.a());
            case 3:
                return jp7Var.b();
            case 4:
                return e(jp7Var.b());
            case 5:
                return d37.f();
            case 6:
                return jp7Var.c();
            case 7:
                return a(jp7Var.c());
            case 8:
                return e(jp7Var.c());
            case 9:
                return jp7Var.d();
            case 10:
                return qt6.a();
            case 11:
                return jp7Var.e();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final m76 c() {
        return a;
    }

    public static final no7 d(ShapeKeyTokens shapeKeyTokens, Composer composer, int i) {
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1629172543, i, -1, "androidx.compose.material3.<get-value> (Shapes.kt:192)");
        }
        no7 b = b(zf4.a.b(composer, 6), shapeKeyTokens);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        return b;
    }

    public static final e01 e(e01 e01Var) {
        float f = (float) 0.0d;
        return e01.d(e01Var, null, null, j01.b(bu1.g(f)), j01.b(bu1.g(f)), 3, null);
    }
}
