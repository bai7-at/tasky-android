package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes3.dex */
abstract class klf extends BaseImplementation.ApiMethodImpl {
    klf(GoogleApiClient googleApiClient) {
        super((Api<?>) qz.f, googleApiClient);
    }

    protected abstract void a(Context context, o3g o3gVar);

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        lsf lsfVar = (lsf) anyClient;
        a(lsfVar.getContext(), (o3g) lsfVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((klf) obj);
    }
}
