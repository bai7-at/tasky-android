package defpackage;

import android.view.View;
import coil.size.ViewSizeResolver;

/* loaded from: classes.dex */
public abstract class jb9 {
    public static final ViewSizeResolver a(View view, boolean z) {
        return new tr6(view, z);
    }

    public static /* synthetic */ ViewSizeResolver b(View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return a(view, z);
    }
}
