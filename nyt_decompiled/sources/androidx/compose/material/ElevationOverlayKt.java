package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import defpackage.bu1;
import defpackage.m76;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.zy1;

/* loaded from: classes.dex */
public abstract class ElevationOverlayKt {
    private static final m76 a = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.material.ElevationOverlayKt$LocalElevationOverlay$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final zy1 mo865invoke() {
            return d.a;
        }
    });
    private static final m76 b = CompositionLocalKt.d(null, new qs2() { // from class: androidx.compose.material.ElevationOverlayKt$LocalAbsoluteElevation$1
        public final float b() {
            return bu1.g(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            return bu1.d(b());
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j, float f, Composer composer, int i) {
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1613340891, i, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)");
        }
        long r = nn0.r(ColorsKt.b(j, composer, i & 14), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        return r;
    }

    public static final m76 c() {
        return b;
    }

    public static final m76 d() {
        return a;
    }
}
