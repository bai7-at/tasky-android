package com.nytimes.android.subauth.core.purr;

import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceName;
import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceValue;
import com.nytimes.android.subauth.core.purr.directive.TCFInfo;
import defpackage.by0;
import defpackage.e96;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public interface a extends e96 {

    /* renamed from: com.nytimes.android.subauth.core.purr.a$a, reason: collision with other inner class name */
    public static final class C0419a {
        public static /* synthetic */ Object a(a aVar, String str, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyAcceptAllTCF");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return aVar.c(str, by0Var);
        }

        public static /* synthetic */ Object b(a aVar, String str, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyRejectAllTCF");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return aVar.k(str, by0Var);
        }

        public static /* synthetic */ Object c(a aVar, String str, boolean z, boolean z2, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyTCF");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return aVar.t(str, z, z2, by0Var);
        }
    }

    Object a(by0 by0Var);

    Object b(boolean z, by0 by0Var);

    Object c(String str, by0 by0Var);

    Object d(PurrPrivacyPreferenceName purrPrivacyPreferenceName, PurrPrivacyPreferenceValue purrPrivacyPreferenceValue, by0 by0Var);

    Object k(String str, by0 by0Var);

    Flow l();

    PrivacyConfiguration n();

    boolean p();

    boolean r();

    int s();

    Object t(String str, boolean z, boolean z2, by0 by0Var);

    void u(int i);

    TCFInfo v();

    Object y(Boolean bool, by0 by0Var);
}
