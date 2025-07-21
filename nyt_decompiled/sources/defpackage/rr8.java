package defpackage;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class rr8 {
    private final sy4 a;

    public /* synthetic */ rr8(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object a();

    public abstract Object b();

    public final void c(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }

    public abstract void d(Transition transition);

    private rr8() {
        this.a = b0.e(Boolean.FALSE, null, 2, null);
    }
}
