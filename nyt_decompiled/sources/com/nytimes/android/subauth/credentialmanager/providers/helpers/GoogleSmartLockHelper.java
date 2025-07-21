package com.nytimes.android.subauth.credentialmanager.providers.helpers;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.nytimes.android.subauth.credentialmanager.providers.wrappers.GoogleSdkWrapper;
import defpackage.b31;
import defpackage.by0;
import defpackage.c31;
import defpackage.l13;
import defpackage.qv7;
import defpackage.rv7;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.NoSuchElementException;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class GoogleSmartLockHelper {
    private final GoogleSdkWrapper a;
    private final MutableSharedFlow b;
    private final MutableSharedFlow c;

    public GoogleSmartLockHelper(GoogleSdkWrapper googleSdkWrapper) {
        zq3.h(googleSdkWrapper, "sdkWrapper");
        this.a = googleSdkWrapper;
        this.b = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.c = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
    }

    private final CredentialRequest a(boolean z) {
        CredentialRequest a = new CredentialRequest.a().c(true).b(z ? "https://accounts.google.com" : null).a();
        zq3.g(a, "build(...)");
        return a;
    }

    private final b31 b(Context context) {
        c31 b = new c31.a().d().b();
        GoogleSdkWrapper googleSdkWrapper = this.a;
        zq3.e(b);
        b31 k = googleSdkWrapper.k(context, b);
        zq3.g(k, "getSmartLockClient(...)");
        return k;
    }

    public final Object c(int i, Intent intent, by0 by0Var) {
        qv7 a;
        Object emit;
        if (i == -1 && intent != null && intent.hasExtra(Credential.EXTRA_KEY)) {
            ul8.a.z("SUBAUTH").l("Credential Request was resolved & successful", new Object[0]);
            Credential credential = (Credential) intent.getParcelableExtra(Credential.EXTRA_KEY);
            return (credential == null || (a = l13.a(credential)) == null || (emit = this.b.emit(a, by0Var)) != a.h()) ? ww8.a : emit;
        }
        if (i == 0) {
            ul8.a.z("SUBAUTH").d("Credential Request cancelled", new Object[0]);
            Object emit2 = this.b.emit(new qv7.b(new Exception("Cancelled")), by0Var);
            return emit2 == a.h() ? emit2 : ww8.a;
        }
        ul8.a.z("SUBAUTH").d("Credential Request was not successful", new Object[0]);
        Object emit3 = this.b.emit(new qv7.a("Credential Request was not successful", new NoSuchElementException()), by0Var);
        return emit3 == a.h() ? emit3 : ww8.a;
    }

    public final Object d(int i, by0 by0Var) {
        if (i == -1) {
            ul8.a.z("SUBAUTH").l("Credential Save was resolved & successful", new Object[0]);
            Object emit = this.c.emit(rv7.b.a, by0Var);
            return emit == a.h() ? emit : ww8.a;
        }
        ul8.a.z("SUBAUTH").d("Credential Save was not successful", new Object[0]);
        Object emit2 = this.c.emit(new rv7.a("Credential Not saved", new RuntimeException("Credential Save was not successful. Credential Not saved")), by0Var);
        return emit2 == a.h() ? emit2 : ww8.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|(1:(1:(3:10|11|12)(2:14|15))(4:16|17|18|19))(10:37|38|39|40|41|42|43|44|45|(1:47)(1:48))|20|21|23))|58|6|(0)(0)|20|21|23) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.nytimes.android.subauth.credentialmanager.a r16, int r17, java.lang.String r18, java.lang.String r19, defpackage.by0 r20) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSmartLockHelper.e(com.nytimes.android.subauth.credentialmanager.a, int, java.lang.String, java.lang.String, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0096 A[Catch: Exception -> 0x009d, TryCatch #1 {Exception -> 0x009d, blocks: (B:20:0x0092, B:22:0x0096, B:25:0x00ac, B:37:0x00a0, B:49:0x0087), top: B:48:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(androidx.fragment.app.f r18, com.nytimes.android.subauth.credentialmanager.a r19, int r20, boolean r21, defpackage.by0 r22) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSmartLockHelper.f(androidx.fragment.app.f, com.nytimes.android.subauth.credentialmanager.a, int, boolean, by0):java.lang.Object");
    }

    public /* synthetic */ GoogleSmartLockHelper(GoogleSdkWrapper googleSdkWrapper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new GoogleSdkWrapper() : googleSdkWrapper);
    }
}
