package defpackage;

import com.nytimes.android.subauth.core.di.SubauthModule;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes4.dex */
public abstract class s78 implements ba2 {
    public static MutableSharedFlow a(SubauthModule subauthModule) {
        return (MutableSharedFlow) g16.e(subauthModule.d());
    }
}
