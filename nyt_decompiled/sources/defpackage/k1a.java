package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes3.dex */
abstract class k1a extends BaseImplementation.ApiMethodImpl {
    public k1a(GoogleApiClient googleApiClient) {
        super((Api<?>) fzc.c, googleApiClient);
    }

    protected abstract void a(uq9 uq9Var);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        a((uq9) ((px9) anyClient).getService());
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((k1a) obj);
    }
}
