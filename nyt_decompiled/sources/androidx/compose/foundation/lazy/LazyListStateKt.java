package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import defpackage.bu1;
import defpackage.ea7;
import defpackage.k14;
import defpackage.qs2;
import defpackage.sg4;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes.dex */
public abstract class LazyListStateKt {
    private static final float a = bu1.g(1);
    private static final k14 b = new k14(null, 0, false, 0.0f, new a(), 0.0f, false, i.l(), 0, 0, 0, false, Orientation.Vertical, 0, 0);

    public static final class a implements sg4 {
        private final int a;
        private final int b;
        private final Map c = t.i();

        a() {
        }

        @Override // defpackage.sg4
        public void e() {
        }

        @Override // defpackage.sg4
        public Map f() {
            return this.c;
        }

        @Override // defpackage.sg4
        public int getHeight() {
            return this.b;
        }

        @Override // defpackage.sg4
        public int getWidth() {
            return this.a;
        }
    }

    public static final LazyListState c(final int i, final int i2, Composer composer, int i3, int i4) {
        composer.z(1470655220);
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1470655220, i3, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:77)");
        }
        Object[] objArr = new Object[0];
        ea7 a2 = LazyListState.B.a();
        composer.z(2079514038);
        boolean d = composer.d(i) | composer.d(i2);
        Object A = composer.A();
        if (d || A == Composer.a.a()) {
            A = new qs2() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$rememberLazyListState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final LazyListState mo865invoke() {
                    return new LazyListState(i, i2);
                }
            };
            composer.q(A);
        }
        composer.R();
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.b(objArr, a2, null, (qs2) A, composer, 72, 4);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return lazyListState;
    }
}
