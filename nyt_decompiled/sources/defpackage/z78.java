package defpackage;

import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.di.SubauthModule;
import com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager;
import com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront;
import com.squareup.moshi.i;

/* loaded from: classes4.dex */
public abstract class z78 implements ba2 {
    public static SubauthPurchaseManager a(SubauthModule subauthModule, t68 t68Var, NYTUser nYTUser, xz8 xz8Var, c05 c05Var, qz8 qz8Var, j86 j86Var, kl7 kl7Var, e98 e98Var, GoogleStoreFront googleStoreFront, i iVar, ba1 ba1Var, SubauthListenerManager subauthListenerManager, w88 w88Var) {
        return (SubauthPurchaseManager) g16.e(subauthModule.l(t68Var, nYTUser, xz8Var, c05Var, qz8Var, j86Var, kl7Var, e98Var, googleStoreFront, iVar, ba1Var, subauthListenerManager, w88Var));
    }
}
