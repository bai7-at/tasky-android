package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.state.ToggleableState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class qg1 implements ik0 {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ qg1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }

    @Override // defpackage.ik0
    public x08 a(ToggleableState toggleableState, Composer composer, int i) {
        composer.z(544656267);
        if (b.G()) {
            b.S(544656267, i, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:414)");
        }
        ToggleableState toggleableState2 = ToggleableState.Off;
        x08 a2 = vt7.a(toggleableState == toggleableState2 ? this.b : this.a, di.k(toggleableState == toggleableState2 ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a2;
    }

    @Override // defpackage.ik0
    public x08 b(boolean z, ToggleableState toggleableState, Composer composer, int i) {
        long j;
        x08 o;
        composer.z(-1568341342);
        if (b.G()) {
            b.S(-1568341342, i, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:451)");
        }
        if (z) {
            int i2 = a.a[toggleableState.ordinal()];
            if (i2 == 1 || i2 == 2) {
                j = this.h;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.i;
            }
        } else {
            int i3 = a.a[toggleableState.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    j = this.k;
                } else if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            j = this.j;
        }
        long j2 = j;
        if (z) {
            composer.z(-796405227);
            o = vt7.a(j2, di.k(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.R();
        } else {
            composer.z(-796405041);
            o = y.o(nn0.j(j2), composer, 0);
            composer.R();
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o;
    }

    @Override // defpackage.ik0
    public x08 c(boolean z, ToggleableState toggleableState, Composer composer, int i) {
        long j;
        x08 o;
        composer.z(840901029);
        if (b.G()) {
            b.S(840901029, i, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:426)");
        }
        if (z) {
            int i2 = a.a[toggleableState.ordinal()];
            if (i2 == 1 || i2 == 2) {
                j = this.c;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.d;
            }
        } else {
            int i3 = a.a[toggleableState.ordinal()];
            if (i3 == 1) {
                j = this.e;
            } else if (i3 == 2) {
                j = this.g;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.f;
            }
        }
        long j2 = j;
        if (z) {
            composer.z(-2010643468);
            o = vt7.a(j2, di.k(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.R();
        } else {
            composer.z(-2010643282);
            o = y.o(nn0.j(j2), composer, 0);
            composer.R();
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o;
    }

    private qg1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
    }
}
