package defpackage;

import android.view.ViewGroup;
import com.nytimes.android.view.mvp.BasePresenter;

/* loaded from: classes4.dex */
public class tv5 extends BasePresenter implements sb5 {
    @Override // defpackage.sb5
    public uv5 J() {
        return (uv5) M();
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void Q() {
    }

    @Override // defpackage.sb5
    public ViewGroup getAdOverlay() {
        if (M() == null) {
            return null;
        }
        return ((uv5) M()).getAdOverlay();
    }

    @Override // com.google.android.exoplayer2.v1.d
    public void n(z89 z89Var) {
        int i = z89Var.a;
        int i2 = z89Var.b;
        float f = i2 == 0 ? 1.0f : (i * z89Var.d) / i2;
        if (M() != null) {
            ((uv5) M()).setAspectRatio(f);
        }
    }
}
