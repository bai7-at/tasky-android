package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.f;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.login.LoginClient;
import defpackage.zq3;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class DeviceAuthMethodHandler extends LoginMethodHandler {
    private static ScheduledThreadPoolExecutor backgroundExecutor;
    private final String nameForLogging;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
            zq3.h(parcel, "source");
            return new DeviceAuthMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized ScheduledThreadPoolExecutor a() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            try {
                if (DeviceAuthMethodHandler.backgroundExecutor == null) {
                    DeviceAuthMethodHandler.backgroundExecutor = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = DeviceAuthMethodHandler.backgroundExecutor;
                if (scheduledThreadPoolExecutor == null) {
                    zq3.z("backgroundExecutor");
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return scheduledThreadPoolExecutor;
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
        zq3.h(loginClient, "loginClient");
        this.nameForLogging = "device_auth";
    }

    private final void w(LoginClient.Request request) {
        f i = d().i();
        if (i == null || i.isFinishing()) {
            return;
        }
        DeviceAuthDialog s = s();
        s.show(i.getSupportFragmentManager(), "login_with_facebook");
        s.E1(request);
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
        w(request);
        return 1;
    }

    protected DeviceAuthDialog s() {
        return new DeviceAuthDialog();
    }

    public void t() {
        d().g(LoginClient.Result.Companion.a(d().p(), LoginMethodHandler.USER_CANCELED_LOG_IN_ERROR_MESSAGE));
    }

    public void u(Exception exc) {
        zq3.h(exc, "ex");
        d().g(LoginClient.Result.b.d(LoginClient.Result.Companion, d().p(), null, exc.getMessage(), null, 8, null));
    }

    public void v(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        zq3.h(str, "accessToken");
        zq3.h(str2, "applicationId");
        zq3.h(str3, "userId");
        d().g(LoginClient.Result.Companion.e(d().p(), new AccessToken(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, null, 1024, null)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
        zq3.h(parcel, "parcel");
        this.nameForLogging = "device_auth";
    }
}
