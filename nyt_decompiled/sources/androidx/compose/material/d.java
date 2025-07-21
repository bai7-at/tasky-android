package androidx.compose.material;

import androidx.compose.runtime.Composer;
import defpackage.ag4;
import defpackage.bu1;
import defpackage.ro0;
import defpackage.wn0;
import defpackage.zy1;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
final class d implements zy1 {
    public static final d a = new d();

    private d() {
    }

    @Override // defpackage.zy1
    public long a(long j, float f, Composer composer, int i) {
        long b;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1687113661, i, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)");
        }
        ro0 a2 = ag4.a.a(composer, 6);
        if (bu1.f(f, bu1.g(0)) > 0 && !a2.o()) {
            b = ElevationOverlayKt.b(j, f, composer, i & WebSocketProtocol.PAYLOAD_SHORT);
            j = wn0.g(b, j);
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        return j;
    }
}
