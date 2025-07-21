package com.nytimes.android.entitlements;

import android.content.Context;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.oa4;
import defpackage.qs2;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public interface b {

    public static final class a {
        public static /* synthetic */ Object a(b bVar, Context context, RegiInterface regiInterface, String str, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i & 2) != 0) {
                regiInterface = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return bVar.s(context, regiInterface, str, by0Var);
        }

        public static /* synthetic */ Object b(b bVar, Context context, RegiInterface regiInterface, qs2 qs2Var, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reAuth");
            }
            if ((i & 2) != 0) {
                regiInterface = null;
            }
            return bVar.j(context, regiInterface, qs2Var, by0Var);
        }
    }

    /* renamed from: com.nytimes.android.entitlements.b$b, reason: collision with other inner class name */
    public interface InterfaceC0262b {
        Observable r();

        Observable w(Context context, RegiInterface regiInterface, String str);
    }

    Flow e();

    boolean i();

    Object j(Context context, RegiInterface regiInterface, qs2 qs2Var, by0 by0Var);

    boolean q();

    Object s(Context context, RegiInterface regiInterface, String str, by0 by0Var);

    BehaviorSubject t();

    boolean v(oa4 oa4Var);
}
