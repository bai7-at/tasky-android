package defpackage;

import android.content.Context;
import com.nytimes.subauth.ui.models.SubauthUiParams;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class u98 implements s98 {
    private final r98 a;

    public u98(r98 r98Var) {
        zq3.h(r98Var, "subauthUserUI");
        this.a = r98Var;
    }

    @Override // defpackage.s98
    public Flow E() {
        return this.a.l();
    }

    @Override // defpackage.s98
    public Flow P() {
        return this.a.h();
    }

    @Override // defpackage.s98
    public Flow R() {
        return this.a.i();
    }

    @Override // defpackage.s98
    public Flow w() {
        return this.a.j();
    }

    @Override // defpackage.s98
    public Object y(Context context, SubauthUiParams subauthUiParams, by0 by0Var) {
        return this.a.k(context, subauthUiParams, by0Var);
    }
}
