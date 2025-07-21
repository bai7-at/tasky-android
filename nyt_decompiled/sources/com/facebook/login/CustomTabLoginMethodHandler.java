package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.LoginClient;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import defpackage.c51;
import defpackage.e51;
import defpackage.g29;
import defpackage.nl3;
import defpackage.w92;
import defpackage.z41;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int CHALLENGE_LENGTH = 20;
    private static final int CUSTOM_TAB_REQUEST_CODE = 1;
    public static final String OAUTH_DIALOG = "oauth";
    public static boolean calledThroughLoggedOutAppSwitch;
    private String currentPackage;
    private String expectedChallenge;
    private final String nameForLogging;
    private final AccessTokenSource tokenSource;
    private String validRedirectURI;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            zq3.h(parcel, "source");
            return new CustomTabLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
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
    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        zq3.h(loginClient, "loginClient");
        this.nameForLogging = "custom_tab";
        this.tokenSource = AccessTokenSource.CHROME_CUSTOM_TAB;
        this.expectedChallenge = g29.s(20);
        calledThroughLoggedOutAppSwitch = false;
        e51 e51Var = e51.a;
        this.validRedirectURI = e51.c(z());
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A(java.lang.String r7, final com.facebook.login.LoginClient.Request r8) {
        /*
            r6 = this;
            if (r7 == 0) goto Ld1
            java.lang.String r0 = "fbconnect://cct."
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.h.K(r7, r0, r1, r2, r3)
            if (r0 != 0) goto L17
            java.lang.String r0 = super.g()
            boolean r0 = kotlin.text.h.K(r7, r0, r1, r2, r3)
            if (r0 == 0) goto Ld1
        L17:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            g29 r0 = defpackage.g29.a
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = defpackage.g29.k0(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = defpackage.g29.k0(r7)
            r0.putAll(r7)
            boolean r7 = r6.D(r0)
            if (r7 != 0) goto L41
            com.facebook.FacebookException r7 = new com.facebook.FacebookException
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>(r0)
            super.v(r8, r3, r7)
            return
        L41:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L4f
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L4f:
            java.lang.String r1 = "error_msg"
            java.lang.String r1 = r0.getString(r1)
            if (r1 != 0) goto L5d
            java.lang.String r1 = "error_message"
            java.lang.String r1 = r0.getString(r1)
        L5d:
            if (r1 != 0) goto L65
            java.lang.String r1 = "error_description"
            java.lang.String r1 = r0.getString(r1)
        L65:
            java.lang.String r2 = "error_code"
            java.lang.String r2 = r0.getString(r2)
            r4 = -1
            if (r2 != 0) goto L6f
            goto L74
        L6f:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L74
            goto L75
        L74:
            r2 = r4
        L75:
            boolean r5 = defpackage.g29.Y(r7)
            if (r5 == 0) goto L9c
            boolean r5 = defpackage.g29.Y(r1)
            if (r5 == 0) goto L9c
            if (r2 != r4) goto L9c
            java.lang.String r7 = "access_token"
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L8f
            super.v(r8, r0, r3)
            return
        L8f:
            java.util.concurrent.Executor r7 = defpackage.w92.t()
            b51 r1 = new b51
            r1.<init>()
            r7.execute(r1)
            goto Ld1
        L9c:
            if (r7 == 0) goto Lb7
            java.lang.String r0 = "access_denied"
            boolean r0 = defpackage.zq3.c(r7, r0)
            if (r0 != 0) goto Lae
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = defpackage.zq3.c(r7, r0)
            if (r0 == 0) goto Lb7
        Lae:
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.v(r8, r3, r7)
            goto Ld1
        Lb7:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r2 != r0) goto Lc4
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.v(r8, r3, r7)
            goto Ld1
        Lc4:
            com.facebook.FacebookRequestError r0 = new com.facebook.FacebookRequestError
            r0.<init>(r2, r7, r1)
            com.facebook.FacebookServiceException r7 = new com.facebook.FacebookServiceException
            r7.<init>(r0, r1)
            super.v(r8, r3, r7)
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.A(java.lang.String, com.facebook.login.LoginClient$Request):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(CustomTabLoginMethodHandler customTabLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        zq3.h(customTabLoginMethodHandler, "this$0");
        zq3.h(request, "$request");
        zq3.h(bundle, "$values");
        try {
            customTabLoginMethodHandler.v(request, customTabLoginMethodHandler.l(request, bundle), null);
        } catch (FacebookException e) {
            customTabLoginMethodHandler.v(request, null, e);
        }
    }

    private final boolean D(Bundle bundle) {
        try {
            String string = bundle.getString(TransferTable.COLUMN_STATE);
            if (string == null) {
                return false;
            }
            return zq3.c(new JSONObject(string).getString("7_challenge"), this.expectedChallenge);
        } catch (JSONException unused) {
            return false;
        }
    }

    private final String y() {
        String str = this.currentPackage;
        if (str != null) {
            return str;
        }
        String a2 = e51.a();
        this.currentPackage = a2;
        return a2;
    }

    private final String z() {
        return super.g();
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
    protected String g() {
        return this.validRedirectURI;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean k(int i, int i2, Intent intent) {
        if ((intent == null || !intent.getBooleanExtra(CustomTabMainActivity.j, false)) && i == 1) {
            LoginClient.Request p = d().p();
            if (p == null) {
                return false;
            }
            if (i2 == -1) {
                A(intent != null ? intent.getStringExtra(CustomTabMainActivity.g) : null, p);
                return true;
            }
            super.v(p, null, new FacebookOperationCanceledException());
            return false;
        }
        return super.k(i, i2, intent);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void m(JSONObject jSONObject) {
        zq3.h(jSONObject, "param");
        jSONObject.put("7_challenge", this.expectedChallenge);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int p(LoginClient.Request request) {
        zq3.h(request, "request");
        LoginClient d = d();
        if (g().length() == 0) {
            return 0;
        }
        Bundle q = q(r(request), request);
        if (calledThroughLoggedOutAppSwitch) {
            q.putString("cct_over_app_switch", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (w92.q) {
            if (request.s()) {
                c51.b.b(nl3.c.a(OAUTH_DIALOG, q));
            } else {
                c51.b.b(z41.b.a(OAUTH_DIALOG, q));
            }
        }
        f i = d.i();
        if (i == null) {
            return 0;
        }
        Intent intent = new Intent(i, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.d, OAUTH_DIALOG);
        intent.putExtra(CustomTabMainActivity.e, q);
        intent.putExtra(CustomTabMainActivity.f, y());
        intent.putExtra(CustomTabMainActivity.h, request.l().toString());
        Fragment l = d.l();
        if (l != null) {
            l.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    protected String s() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public AccessTokenSource t() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.expectedChallenge);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        zq3.h(parcel, "source");
        this.nameForLogging = "custom_tab";
        this.tokenSource = AccessTokenSource.CHROME_CUSTOM_TAB;
        this.expectedChallenge = parcel.readString();
        e51 e51Var = e51.a;
        this.validRedirectURI = e51.c(z());
    }
}
