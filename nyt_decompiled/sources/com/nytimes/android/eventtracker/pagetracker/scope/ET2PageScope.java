package com.nytimes.android.eventtracker.pagetracker.scope;

import defpackage.e52;
import defpackage.qs2;
import defpackage.ue4;

/* loaded from: classes4.dex */
public interface ET2PageScope {

    public static final class DefaultImpls {
        public static /* synthetic */ void a(ET2PageScope eT2PageScope, e52 e52Var, ue4 ue4Var, ue4 ue4Var2, qs2 qs2Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
            }
            if ((i & 2) != 0) {
                ue4Var = null;
            }
            if ((i & 4) != 0) {
                ue4Var2 = null;
            }
            if ((i & 8) != 0) {
                qs2Var = new qs2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope$sendEvent$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Void mo865invoke() {
                        return null;
                    }
                };
            }
            eT2PageScope.a(e52Var, ue4Var, ue4Var2, qs2Var);
        }
    }

    void a(e52 e52Var, ue4 ue4Var, ue4 ue4Var2, qs2 qs2Var);

    void b();
}
