package defpackage;

import android.webkit.WebView;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.AbraVariant;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import defpackage.e52;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class gn5 extends mc0 {
    private final AbraManager b;
    private final ET2Scope c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn5(AbraManager abraManager, ET2Scope eT2Scope) {
        super("pageLoadSendExpose");
        zq3.h(abraManager, "abraManager");
        zq3.h(eT2Scope, "et2Scope");
        this.b = abraManager;
        this.c = eT2Scope;
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        ET2Scope eT2Scope = this.c;
        e52.a aVar = new e52.a();
        Pair a = du8.a("test", "APP_push_columns");
        AbraVariant testType = this.b.getTestType("APP_push_columns");
        zq3.f(testType, "null cannot be cast to non-null type com.nytimes.android.abra.AbraVariant");
        ET2PageScope.DefaultImpls.a(eT2Scope, aVar, null, new ue4(a, du8.a("variant", testType.getVariantName())), null, 10, null);
        return BridgeCommandResult.a.d(BridgeCommandResult.Companion, i, null, 2, null);
    }
}
