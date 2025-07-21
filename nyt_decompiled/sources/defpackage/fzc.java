package defpackage;

import com.google.android.gms.common.api.Api;

/* loaded from: classes3.dex */
public abstract class fzc {
    public static final Api.ClientKey a;
    private static final Api.AbstractClientBuilder b;
    public static final Api c;
    public static final b8g d;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        a = clientKey;
        f5c f5cVar = new f5c();
        b = f5cVar;
        c = new Api("AppDataSearch.LIGHTWEIGHT_API", f5cVar, clientKey);
        d = new g5a();
    }
}
