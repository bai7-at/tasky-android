package defpackage;

import com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class ix1 implements ET2PageScope {
    private final ET2SinglePageClient a;

    public ix1(ET2SinglePageClient eT2SinglePageClient) {
        zq3.h(eT2SinglePageClient, "et2client");
        this.a = eT2SinglePageClient;
    }

    @Override // com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope
    public void a(e52 e52Var, ue4 ue4Var, ue4 ue4Var2, qs2 qs2Var) {
        zq3.h(e52Var, "eventSubject");
        zq3.h(qs2Var, "extraData");
        tx1 tx1Var = (tx1) i.y0((List) this.a.d().getValue());
        if (tx1Var != null) {
            tx1Var.a(e52Var, ue4Var, ue4Var2, qs2Var);
            ww8 ww8Var = ww8.a;
        }
    }

    @Override // com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope
    public void b() {
        tx1 tx1Var = (tx1) i.y0((List) this.a.d().getValue());
        if (tx1Var != null) {
            tx1Var.b();
            ww8 ww8Var = ww8.a;
        }
    }
}
