package defpackage;

import com.nytimes.android.entitlements.di.SubauthBridgeModule;
import com.nytimes.android.entitlements.subauth.SubauthUserClientImpl;
import defpackage.n98;

/* loaded from: classes4.dex */
public abstract class w58 implements ba2 {
    public static n98.b a(SubauthUserClientImpl subauthUserClientImpl) {
        return (n98.b) g16.e(SubauthBridgeModule.a.k(subauthUserClientImpl));
    }
}
