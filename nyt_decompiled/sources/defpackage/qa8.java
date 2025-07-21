package defpackage;

import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.purr.a;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.subauth.ui.SubauthUserUIManager;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes4.dex */
public abstract class qa8 implements ba2 {
    public static SubauthUserUIManager a(x98 x98Var, NYTUser nYTUser, p78 p78Var, o98 o98Var, a aVar, PurrDirectiveOverrider purrDirectiveOverrider, MutableSharedFlow mutableSharedFlow, MutableSharedFlow mutableSharedFlow2, MutableSharedFlow mutableSharedFlow3) {
        return (SubauthUserUIManager) g16.e(x98Var.s(nYTUser, p78Var, o98Var, aVar, purrDirectiveOverrider, mutableSharedFlow, mutableSharedFlow2, mutableSharedFlow3));
    }
}
