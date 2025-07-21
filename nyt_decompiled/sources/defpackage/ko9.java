package defpackage;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes3.dex */
public abstract class ko9 {
    public static final Api.ClientKey a;
    public static final Api.ClientKey b;
    public static final Api.AbstractClientBuilder c;
    static final Api.AbstractClientBuilder d;
    public static final Scope e;
    public static final Scope f;
    public static final Api g;
    public static final Api h;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        a = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        b = clientKey2;
        do9 do9Var = new do9();
        c = do9Var;
        fo9 fo9Var = new fo9();
        d = fo9Var;
        e = new Scope(Scopes.PROFILE);
        f = new Scope("email");
        g = new Api("SignIn.API", do9Var, clientKey);
        h = new Api("SignIn.INTERNAL_API", fo9Var, clientKey2);
    }
}
