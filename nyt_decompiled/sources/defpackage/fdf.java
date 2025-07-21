package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
final class fdf extends q0f {
    private final /* synthetic */ i6f a;

    fdf(i6f i6fVar) {
        this.a = i6fVar;
    }

    @Override // defpackage.t0g
    public final void Q3(Status status) {
        this.a.setResult((i6f) vhe.b(status));
    }

    @Override // defpackage.q0f, defpackage.t0g
    public final void Y1(Status status, Credential credential) {
        this.a.setResult((i6f) new vhe(status, credential));
    }
}
