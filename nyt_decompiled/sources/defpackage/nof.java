package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes3.dex */
final class nof extends q0f {
    private BaseImplementation.ResultHolder a;

    nof(BaseImplementation.ResultHolder resultHolder) {
        this.a = resultHolder;
    }

    @Override // defpackage.t0g
    public final void Q3(Status status) {
        this.a.setResult(status);
    }
}
