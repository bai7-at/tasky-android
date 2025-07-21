package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.f;
import com.facebook.login.LoginClient;
import defpackage.c25;
import defpackage.e51;
import defpackage.w92;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    private final String nameForLogging;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            zq3.h(parcel, "source");
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler[] newArray(int i) {
            return new KatanaProxyLoginMethodHandler[i];
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
    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        zq3.h(loginClient, "loginClient");
        this.nameForLogging = "katana_proxy_auth";
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
    public boolean o() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int p(LoginClient.Request request) {
        zq3.h(request, "request");
        boolean z = w92.r && e51.a() != null && request.k().allowsCustomTabAuth();
        String a2 = LoginClient.Companion.a();
        c25 c25Var = c25.a;
        f i = d().i();
        String a3 = request.a();
        Set o = request.o();
        boolean t = request.t();
        boolean q = request.q();
        DefaultAudience g = request.g();
        if (g == null) {
            g = DefaultAudience.NONE;
        }
        DefaultAudience defaultAudience = g;
        String c = c(request.b());
        String c2 = request.c();
        String m = request.m();
        boolean p = request.p();
        boolean r = request.r();
        boolean v = request.v();
        String n = request.n();
        String d = request.d();
        CodeChallengeMethod e = request.e();
        List o2 = c25.o(i, a3, o, a2, t, q, defaultAudience, c, c2, z, m, p, r, v, n, d, e == null ? null : e.name());
        a("e2e", a2);
        Iterator it2 = o2.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            i2++;
            if (B((Intent) it2.next(), LoginClient.Companion.b())) {
                return i2;
            }
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
        zq3.h(parcel, "source");
        this.nameForLogging = "katana_proxy_auth";
    }
}
