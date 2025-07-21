package defpackage;

import androidx.compose.ui.input.pointer.PointerInteropFilter;

/* loaded from: classes.dex */
public final class hy6 implements ss2 {
    private PointerInteropFilter a;

    public void b(boolean z) {
        PointerInteropFilter pointerInteropFilter = this.a;
        if (pointerInteropFilter == null) {
            return;
        }
        pointerInteropFilter.t(z);
    }

    public final void c(PointerInteropFilter pointerInteropFilter) {
        this.a = pointerInteropFilter;
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Boolean) obj).booleanValue());
        return ww8.a;
    }
}
