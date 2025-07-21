package defpackage;

import android.app.Application;
import com.nytimes.android.entitlements.di.SubauthBridgeModule;
import com.nytimes.android.subauth.core.api.setup.Subauth;

/* loaded from: classes4.dex */
public abstract class y58 implements ba2 {
    public static r98 a(Subauth subauth, Application application) {
        return (r98) g16.e(SubauthBridgeModule.a.l(subauth, application));
    }
}
