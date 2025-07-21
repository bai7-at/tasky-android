package defpackage;

import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

/* loaded from: classes3.dex */
final class tea extends yv9 {
    private final /* synthetic */ qg8 a;

    tea(z8a z8aVar, qg8 qg8Var) {
        this.a = qg8Var;
    }

    @Override // defpackage.tq9
    public final void J5(Status status, BeginSignInResult beginSignInResult) {
        TaskUtil.setResultOrApiException(status, beginSignInResult, this.a);
    }
}
