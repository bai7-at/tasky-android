package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public interface di8 {
    x08 a(boolean z, Composer composer, int i);

    x08 b(boolean z, boolean z2, Composer composer, int i);

    x08 c(boolean z, Composer composer, int i);

    x08 d(boolean z, boolean z2, eo3 eo3Var, Composer composer, int i);

    x08 e(boolean z, Composer composer, int i);

    x08 f(boolean z, Composer composer, int i);

    default x08 g(boolean z, boolean z2, eo3 eo3Var, Composer composer, int i) {
        composer.z(-1036335134);
        if (b.G()) {
            b.S(-1036335134, i, -1, "androidx.compose.material.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:128)");
        }
        x08 b = b(z, z2, composer, (i & WebSocketProtocol.PAYLOAD_SHORT) | ((i >> 3) & 896));
        if (b.G()) {
            b.R();
        }
        composer.R();
        return b;
    }

    x08 h(boolean z, boolean z2, eo3 eo3Var, Composer composer, int i);

    x08 i(boolean z, boolean z2, eo3 eo3Var, Composer composer, int i);
}
