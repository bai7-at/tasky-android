package defpackage;

import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public abstract class sz {
    private static final Api.ClientKey a;
    private static final Api.AbstractClientBuilder b;
    public static final Api c;
    public static final r76 d;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        a = clientKey;
        mp9 mp9Var = new mp9();
        b = mp9Var;
        c = new Api("Auth.PROXY_API", mp9Var, clientKey);
        d = new yba();
    }
}
