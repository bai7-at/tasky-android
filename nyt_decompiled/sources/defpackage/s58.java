package defpackage;

import com.nytimes.android.entitlements.di.SubauthBridgeModule;
import com.nytimes.android.subauth.credentialmanager.SubauthSSO;

/* loaded from: classes4.dex */
public abstract class s58 implements ba2 {
    public static SubauthSSO a() {
        return (SubauthSSO) g16.e(SubauthBridgeModule.a.g());
    }
}
