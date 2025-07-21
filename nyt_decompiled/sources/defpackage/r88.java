package defpackage;

import android.content.res.Resources;
import com.nytimes.android.subauth.core.di.SubauthNetworkModule;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;

/* loaded from: classes4.dex */
public abstract class r88 implements ba2 {
    public static SubauthEnvironment a(SubauthNetworkModule subauthNetworkModule, Resources resources, ba1 ba1Var) {
        return (SubauthEnvironment) g16.e(subauthNetworkModule.m(resources, ba1Var));
    }
}
