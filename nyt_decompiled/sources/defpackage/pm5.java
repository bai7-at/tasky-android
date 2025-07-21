package defpackage;

import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;

/* loaded from: classes2.dex */
public final class pm5 {
    public static final pm5 a = new pm5();

    private pm5() {
    }

    public static final GraphRequest a(String str, String str2, String str3) {
        zq3.h(str, "authorizationCode");
        zq3.h(str2, "redirectUri");
        zq3.h(str3, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", str);
        bundle.putString("client_id", w92.m());
        bundle.putString("redirect_uri", str2);
        bundle.putString("code_verifier", str3);
        GraphRequest x = GraphRequest.n.x(null, "oauth/access_token", null);
        x.G(HttpMethod.GET);
        x.H(bundle);
        return x;
    }
}
