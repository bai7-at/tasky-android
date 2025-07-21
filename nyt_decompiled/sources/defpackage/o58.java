package defpackage;

import com.nytimes.android.entitlements.di.SubauthBridgeModule;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes4.dex */
public abstract class o58 implements ba2 {
    public static MutableSharedFlow a() {
        return (MutableSharedFlow) g16.e(SubauthBridgeModule.a.c());
    }
}
