package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc0;
import defpackage.d35;
import defpackage.ea7;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.g35;
import defpackage.hd5;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.u49;

/* loaded from: classes.dex */
public abstract class SheetDefaultsKt {
    private static final float a = bu1.g(22);

    public static final class a implements d35 {
        final /* synthetic */ SheetState a;
        final /* synthetic */ ss2 b;
        final /* synthetic */ Orientation c;

        a(SheetState sheetState, ss2 ss2Var, Orientation orientation) {
            this.a = sheetState;
            this.b = ss2Var;
            this.c = orientation;
        }

        private final float a(long j) {
            return this.c == Orientation.Horizontal ? fd5.o(j) : fd5.p(j);
        }

        private final long b(float f) {
            Orientation orientation = this.c;
            float f2 = orientation == Orientation.Horizontal ? f : 0.0f;
            if (orientation != Orientation.Vertical) {
                f = 0.0f;
            }
            return hd5.a(f2, f);
        }

        private final float c(long j) {
            return this.c == Orientation.Horizontal ? u49.h(j) : u49.i(j);
        }

        @Override // defpackage.d35
        public Object Q0(long j, long j2, by0 by0Var) {
            this.b.invoke(cc0.b(c(j2)));
            return u49.b(j2);
        }

        @Override // defpackage.d35
        public long b1(long j, int i) {
            float a = a(j);
            return (a >= 0.0f || !g35.e(i, g35.a.a())) ? fd5.b.c() : b(this.a.e().n(a));
        }

        @Override // defpackage.d35
        public Object o0(long j, by0 by0Var) {
            float c = c(j);
            float o = this.a.o();
            float d = this.a.e().o().d();
            if (c >= 0.0f || o <= d) {
                j = u49.b.a();
            } else {
                this.b.invoke(cc0.b(c));
            }
            return u49.b(j);
        }

        @Override // defpackage.d35
        public long r0(long j, long j2, int i) {
            return g35.e(i, g35.a.a()) ? b(this.a.e().n(a(j2))) : fd5.b.c();
        }
    }

    public static final d35 a(SheetState sheetState, Orientation orientation, ss2 ss2Var) {
        return new a(sheetState, ss2Var, orientation);
    }

    public static final SheetState c(boolean z, ss2 ss2Var, SheetValue sheetValue, boolean z2, Composer composer, int i, int i2) {
        composer.z(1032784200);
        final boolean z3 = (i2 & 1) != 0 ? false : z;
        final ss2 ss2Var2 = (i2 & 2) != 0 ? new ss2() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(SheetValue sheetValue2) {
                return Boolean.TRUE;
            }
        } : ss2Var;
        final SheetValue sheetValue2 = (i2 & 4) != 0 ? SheetValue.Hidden : sheetValue;
        final boolean z4 = (i2 & 8) != 0 ? false : z2;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1032784200, i, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:480)");
        }
        final fm1 fm1Var = (fm1) composer.m(CompositionLocalsKt.e());
        Object[] objArr = {Boolean.valueOf(z3), ss2Var2};
        ea7 a2 = SheetState.e.a(z3, ss2Var2, fm1Var);
        composer.z(1097108455);
        boolean S = ((((i & 14) ^ 6) > 4 && composer.a(z3)) || (i & 6) == 4) | composer.S(fm1Var) | ((((i & 896) ^ 384) > 256 && composer.S(sheetValue2)) || (i & 384) == 256) | ((((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && composer.S(ss2Var2)) || (i & 48) == 32) | ((((i & 7168) ^ 3072) > 2048 && composer.a(z4)) || (i & 3072) == 2048);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new qs2() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SheetState mo865invoke() {
                    return new SheetState(z3, fm1Var, sheetValue2, ss2Var2, z4);
                }
            };
            composer.q(A);
        }
        composer.R();
        SheetState sheetState = (SheetState) RememberSaveableKt.b(objArr, a2, null, (qs2) A, composer, 0, 4);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return sheetState;
    }
}
