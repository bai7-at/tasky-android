package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import defpackage.k13;
import defpackage.og8;
import defpackage.qz;
import defpackage.s6f;

/* loaded from: classes2.dex */
public class b extends GoogleApi {
    private static final C0199b a = new C0199b(null);
    private static int b = a.a;

    enum a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) e.clone();
        }
    }

    /* renamed from: com.google.android.gms.auth.api.signin.b$b, reason: collision with other inner class name */
    private static class C0199b implements PendingResultUtil.ResultConverter {
        private C0199b() {
        }

        @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
        public final /* synthetic */ Object convert(Result result) {
            return ((k13) result).b();
        }

        /* synthetic */ C0199b(f fVar) {
            this();
        }
    }

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, (Api<GoogleSignInOptions>) qz.g, googleSignInOptions, new ApiExceptionMapper());
    }

    private final synchronized int g() {
        try {
            if (b == a.a) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                if (isGooglePlayServicesAvailable == 0) {
                    b = a.d;
                } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, isGooglePlayServicesAvailable, null) != null || DynamiteModule.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    b = a.b;
                } else {
                    b = a.c;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public Intent d() {
        Context applicationContext = getApplicationContext();
        int i = f.a[g() - 1];
        return i != 1 ? i != 2 ? s6f.g(applicationContext, (GoogleSignInOptions) getApiOptions()) : s6f.b(applicationContext, (GoogleSignInOptions) getApiOptions()) : s6f.e(applicationContext, (GoogleSignInOptions) getApiOptions());
    }

    public og8 e() {
        return PendingResultUtil.toVoidTask(s6f.f(asGoogleApiClient(), getApplicationContext(), g() == a.c));
    }

    public og8 f() {
        return PendingResultUtil.toVoidTask(s6f.c(asGoogleApiClient(), getApplicationContext(), g() == a.c));
    }
}
