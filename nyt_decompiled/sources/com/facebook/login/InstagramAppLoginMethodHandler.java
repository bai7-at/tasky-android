package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.login.LoginClient;
import defpackage.c25;
import defpackage.w92;
import defpackage.zq3;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {
    private final String nameForLogging;
    private final AccessTokenSource tokenSource;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InstagramAppLoginMethodHandler createFromParcel(Parcel parcel) {
            zq3.h(parcel, "source");
            return new InstagramAppLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InstagramAppLoginMethodHandler[] newArray(int i) {
            return new InstagramAppLoginMethodHandler[i];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        zq3.h(loginClient, "loginClient");
        this.nameForLogging = "instagram_login";
        this.tokenSource = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public String f() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int p(LoginClient.Request request) {
        zq3.h(request, "request");
        LoginClient.c cVar = LoginClient.Companion;
        String a2 = cVar.a();
        c25 c25Var = c25.a;
        Context i = d().i();
        if (i == null) {
            i = w92.l();
        }
        String a3 = request.a();
        Set o = request.o();
        boolean t = request.t();
        boolean q = request.q();
        DefaultAudience g = request.g();
        if (g == null) {
            g = DefaultAudience.NONE;
        }
        Intent j = c25.j(i, a3, o, a2, t, q, g, c(request.b()), request.c(), request.m(), request.p(), request.r(), request.v());
        a("e2e", a2);
        return B(j, cVar.b()) ? 1 : 0;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler
    public AccessTokenSource u() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "dest");
        super.writeToParcel(parcel, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        zq3.h(parcel, "source");
        this.nameForLogging = "instagram_login";
        this.tokenSource = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }
}
