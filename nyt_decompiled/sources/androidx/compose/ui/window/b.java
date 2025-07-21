package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import kotlin.collections.i;

/* loaded from: classes.dex */
final class b extends c {
    @Override // defpackage.wz5
    public void c(View view, int i, int i2) {
        view.setSystemGestureExclusionRects(i.r(new Rect(0, 0, i, i2)));
    }
}
