package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.k13;
import defpackage.og8;
import defpackage.s6f;
import defpackage.vg8;

/* loaded from: classes2.dex */
public abstract class a {
    public static b a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) Preconditions.checkNotNull(googleSignInOptions));
    }

    public static og8 b(Intent intent) {
        k13 a = s6f.a(intent);
        if (a == null) {
            return vg8.d(ApiExceptionUtil.fromStatus(Status.RESULT_INTERNAL_ERROR));
        }
        GoogleSignInAccount b = a.b();
        return (!a.getStatus().isSuccess() || b == null) ? vg8.d(ApiExceptionUtil.fromStatus(a.getStatus())) : vg8.e(b);
    }
}
