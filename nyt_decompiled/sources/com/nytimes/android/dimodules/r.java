package com.nytimes.android.dimodules;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.messaging.postloginregioffers.PostLoginRegiOfferManager;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.ba2;
import defpackage.g16;
import defpackage.z58;

/* loaded from: classes4.dex */
public abstract class r implements ba2 {
    public static PostLoginRegiOfferManager a(NetworkStatus networkStatus, z58 z58Var, AbraManager abraManager) {
        return (PostLoginRegiOfferManager) g16.e(ApplicationModule.Companion.p(networkStatus, z58Var, abraManager));
    }
}
