package androidx.core.view;

import android.view.View;
import defpackage.ak7;
import kotlin.sequences.d;

/* loaded from: classes.dex */
public abstract class ViewKt {
    public static final ak7 a(View view) {
        return d.b(new ViewKt$allViews$1(view, null));
    }

    public static final ak7 b(View view) {
        return d.f(view.getParent(), ViewKt$ancestors$1.a);
    }
}
