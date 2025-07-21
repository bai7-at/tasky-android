package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.facebook.login.LoginClient;

/* loaded from: classes2.dex */
public final class xy2 extends wu5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy2(Context context, LoginClient.Request request) {
        super(context, 65536, 65537, 20121101, request.a(), request.n());
        zq3.h(context, "context");
        zq3.h(request, "request");
    }

    @Override // defpackage.wu5
    protected void e(Bundle bundle) {
        zq3.h(bundle, "data");
    }
}
