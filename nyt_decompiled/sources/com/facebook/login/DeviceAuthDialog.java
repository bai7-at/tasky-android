package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import defpackage.en6;
import defpackage.g29;
import defpackage.k23;
import defpackage.kq3;
import defpackage.m23;
import defpackage.pm6;
import defpackage.rd2;
import defpackage.ti6;
import defpackage.tp1;
import defpackage.v29;
import defpackage.w92;
import defpackage.xf6;
import defpackage.z38;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DeviceAuthDialog extends e {
    public static final a l = new a(null);
    private static final String m = "device/login";
    private static final String n = "device/login_status";
    private static final int r = 1349174;
    private View a;
    private TextView b;
    private TextView c;
    private DeviceAuthMethodHandler d;
    private final AtomicBoolean e = new AtomicBoolean();
    private volatile k23 f;
    private volatile ScheduledFuture g;
    private volatile RequestState h;
    private boolean i;
    private boolean j;
    private LoginClient.Request k;

    private static final class RequestState implements Parcelable {
        private String authorizationUri;
        private long interval;
        private long lastPoll;
        private String requestCode;
        private String userCode;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<RequestState> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RequestState createFromParcel(Parcel parcel) {
                zq3.h(parcel, "parcel");
                return new RequestState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public RequestState[] newArray(int i) {
                return new RequestState[i];
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public RequestState() {
        }

        public final String a() {
            return this.authorizationUri;
        }

        public final long b() {
            return this.interval;
        }

        public final String c() {
            return this.requestCode;
        }

        public final String d() {
            return this.userCode;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final void e(long j) {
            this.interval = j;
        }

        public final void f(long j) {
            this.lastPoll = j;
        }

        public final void g(String str) {
            this.requestCode = str;
        }

        public final void h(String str) {
            this.userCode = str;
            z38 z38Var = z38.a;
            String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            zq3.g(format, "java.lang.String.format(locale, format, *args)");
            this.authorizationUri = format;
        }

        public final boolean i() {
            return this.lastPoll != 0 && (new Date().getTime() - this.lastPoll) - (this.interval * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            zq3.h(parcel, "dest");
            parcel.writeString(this.authorizationUri);
            parcel.writeString(this.userCode);
            parcel.writeString(this.requestCode);
            parcel.writeLong(this.interval);
            parcel.writeLong(this.lastPoll);
        }

        protected RequestState(Parcel parcel) {
            zq3.h(parcel, "parcel");
            this.authorizationUri = parcel.readString();
            this.userCode = parcel.readString();
            this.requestCode = parcel.readString();
            this.interval = parcel.readLong();
            this.lastPoll = parcel.readLong();
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b b(JSONObject jSONObject) {
            String optString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    String optString2 = optJSONObject.optString("permission");
                    zq3.g(optString2, "permission");
                    if (optString2.length() != 0 && !zq3.c(optString2, "installed") && (optString = optJSONObject.optString("status")) != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1309235419) {
                            if (hashCode != 280295099) {
                                if (hashCode == 568196142 && optString.equals("declined")) {
                                    arrayList2.add(optString2);
                                }
                            } else if (optString.equals("granted")) {
                                arrayList.add(optString2);
                            }
                        } else if (optString.equals("expired")) {
                            arrayList3.add(optString2);
                        }
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return new b(arrayList, arrayList2, arrayList3);
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {
        private List a;
        private List b;
        private List c;

        public b(List list, List list2, List list3) {
            zq3.h(list, "grantedPermissions");
            zq3.h(list2, "declinedPermissions");
            zq3.h(list3, "expiredPermissions");
            this.a = list;
            this.b = list2;
            this.c = list3;
        }

        public final List a() {
            return this.b;
        }

        public final List b() {
            return this.c;
        }

        public final List c() {
            return this.a;
        }
    }

    public static final class c extends Dialog {
        c(f fVar, int i) {
            super(fVar, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (DeviceAuthDialog.this.s1()) {
                super.onBackPressed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A1(DeviceAuthDialog deviceAuthDialog, DialogInterface dialogInterface, int i) {
        zq3.h(deviceAuthDialog, "this$0");
        View q1 = deviceAuthDialog.q1(false);
        Dialog dialog = deviceAuthDialog.getDialog();
        if (dialog != null) {
            dialog.setContentView(q1);
        }
        LoginClient.Request request = deviceAuthDialog.k;
        if (request == null) {
            return;
        }
        deviceAuthDialog.E1(request);
    }

    private final void B1() {
        RequestState requestState = this.h;
        Long valueOf = requestState == null ? null : Long.valueOf(requestState.b());
        if (valueOf != null) {
            this.g = DeviceAuthMethodHandler.Companion.a().schedule(new Runnable() { // from class: no1
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceAuthDialog.C1(DeviceAuthDialog.this);
                }
            }, valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C1(DeviceAuthDialog deviceAuthDialog) {
        zq3.h(deviceAuthDialog, "this$0");
        deviceAuthDialog.x1();
    }

    private final void D1(RequestState requestState) {
        this.h = requestState;
        TextView textView = this.b;
        if (textView == null) {
            zq3.z("confirmationCode");
            throw null;
        }
        textView.setText(requestState.d());
        tp1 tp1Var = tp1.a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), tp1.c(requestState.a()));
        TextView textView2 = this.c;
        if (textView2 == null) {
            zq3.z("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.b;
        if (textView3 == null) {
            zq3.z("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.a;
        if (view == null) {
            zq3.z("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.j && tp1.f(requestState.d())) {
            new kq3(getContext()).f("fb_smart_login_service");
        }
        if (requestState.i()) {
            B1();
        } else {
            x1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(DeviceAuthDialog deviceAuthDialog, m23 m23Var) {
        zq3.h(deviceAuthDialog, "this$0");
        zq3.h(m23Var, "response");
        if (deviceAuthDialog.i) {
            return;
        }
        if (m23Var.b() != null) {
            FacebookRequestError b2 = m23Var.b();
            FacebookException e = b2 == null ? null : b2.e();
            if (e == null) {
                e = new FacebookException();
            }
            deviceAuthDialog.u1(e);
            return;
        }
        JSONObject c2 = m23Var.c();
        if (c2 == null) {
            c2 = new JSONObject();
        }
        RequestState requestState = new RequestState();
        try {
            requestState.h(c2.getString("user_code"));
            requestState.g(c2.getString("code"));
            requestState.e(c2.getLong("interval"));
            deviceAuthDialog.D1(requestState);
        } catch (JSONException e2) {
            deviceAuthDialog.u1(new FacebookException(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(DeviceAuthDialog deviceAuthDialog, m23 m23Var) {
        zq3.h(deviceAuthDialog, "this$0");
        zq3.h(m23Var, "response");
        if (deviceAuthDialog.e.get()) {
            return;
        }
        FacebookRequestError b2 = m23Var.b();
        if (b2 == null) {
            try {
                JSONObject c2 = m23Var.c();
                if (c2 == null) {
                    c2 = new JSONObject();
                }
                String string = c2.getString(AccessToken.ACCESS_TOKEN_KEY);
                zq3.g(string, "resultObject.getString(\"access_token\")");
                deviceAuthDialog.v1(string, c2.getLong(AccessToken.EXPIRES_IN_KEY), Long.valueOf(c2.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
                return;
            } catch (JSONException e) {
                deviceAuthDialog.u1(new FacebookException(e));
                return;
            }
        }
        int g = b2.g();
        if (g == r || g == 1349172) {
            deviceAuthDialog.B1();
            return;
        }
        if (g != 1349152) {
            if (g == 1349173) {
                deviceAuthDialog.t1();
                return;
            }
            FacebookRequestError b3 = m23Var.b();
            FacebookException e2 = b3 == null ? null : b3.e();
            if (e2 == null) {
                e2 = new FacebookException();
            }
            deviceAuthDialog.u1(e2);
            return;
        }
        RequestState requestState = deviceAuthDialog.h;
        if (requestState != null) {
            tp1 tp1Var = tp1.a;
            tp1.a(requestState.d());
        }
        LoginClient.Request request = deviceAuthDialog.k;
        if (request != null) {
            deviceAuthDialog.E1(request);
        } else {
            deviceAuthDialog.t1();
        }
    }

    private final void m1(String str, b bVar, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.d;
        if (deviceAuthMethodHandler != null) {
            deviceAuthMethodHandler.v(str2, w92.m(), str, bVar.c(), bVar.a(), bVar.b(), AccessTokenSource.DEVICE_AUTH, date, null, date2);
        }
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    private final GraphRequest p1() {
        Bundle bundle = new Bundle();
        RequestState requestState = this.h;
        bundle.putString("code", requestState == null ? null : requestState.c());
        bundle.putString(AccessToken.ACCESS_TOKEN_KEY, n1());
        return GraphRequest.n.B(null, n, bundle, new GraphRequest.b() { // from class: oo1
            @Override // com.facebook.GraphRequest.b
            public final void a(m23 m23Var) {
                DeviceAuthDialog.k1(DeviceAuthDialog.this, m23Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r1(DeviceAuthDialog deviceAuthDialog, View view) {
        zq3.h(deviceAuthDialog, "this$0");
        deviceAuthDialog.t1();
    }

    private final void v1(final String str, long j, Long l2) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        final Date date = null;
        final Date date2 = j != 0 ? new Date(new Date().getTime() + (j * 1000)) : null;
        if ((l2 == null || l2.longValue() != 0) && l2 != null) {
            date = new Date(l2.longValue() * 1000);
        }
        GraphRequest x = GraphRequest.n.x(new AccessToken(str, w92.m(), "0", null, null, null, null, date2, null, date, null, 1024, null), "me", new GraphRequest.b() { // from class: qo1
            @Override // com.facebook.GraphRequest.b
            public final void a(m23 m23Var) {
                DeviceAuthDialog.w1(DeviceAuthDialog.this, str, date2, date, m23Var);
            }
        });
        x.G(HttpMethod.GET);
        x.H(bundle);
        x.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w1(DeviceAuthDialog deviceAuthDialog, String str, Date date, Date date2, m23 m23Var) {
        EnumSet k;
        zq3.h(deviceAuthDialog, "this$0");
        zq3.h(str, "$accessToken");
        zq3.h(m23Var, "response");
        if (deviceAuthDialog.e.get()) {
            return;
        }
        FacebookRequestError b2 = m23Var.b();
        if (b2 != null) {
            FacebookException e = b2.e();
            if (e == null) {
                e = new FacebookException();
            }
            deviceAuthDialog.u1(e);
            return;
        }
        try {
            JSONObject c2 = m23Var.c();
            if (c2 == null) {
                c2 = new JSONObject();
            }
            String string = c2.getString("id");
            zq3.g(string, "jsonObject.getString(\"id\")");
            b b3 = l.b(c2);
            String string2 = c2.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.g(string2, "jsonObject.getString(\"name\")");
            RequestState requestState = deviceAuthDialog.h;
            if (requestState != null) {
                tp1 tp1Var = tp1.a;
                tp1.a(requestState.d());
            }
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.a;
            rd2 f = FetchedAppSettingsManager.f(w92.m());
            Boolean bool = null;
            if (f != null && (k = f.k()) != null) {
                bool = Boolean.valueOf(k.contains(SmartLoginOption.RequireConfirm));
            }
            if (!zq3.c(bool, Boolean.TRUE) || deviceAuthDialog.j) {
                deviceAuthDialog.m1(string, b3, str, date, date2);
            } else {
                deviceAuthDialog.j = true;
                deviceAuthDialog.y1(string, b3, str, string2, date, date2);
            }
        } catch (JSONException e2) {
            deviceAuthDialog.u1(new FacebookException(e2));
        }
    }

    private final void x1() {
        RequestState requestState = this.h;
        if (requestState != null) {
            requestState.f(new Date().getTime());
        }
        this.f = p1().l();
    }

    private final void y1(final String str, final b bVar, final String str2, String str3, final Date date, final Date date2) {
        String string = getResources().getString(pm6.com_facebook_smart_login_confirmation_title);
        zq3.g(string, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        String string2 = getResources().getString(pm6.com_facebook_smart_login_confirmation_continue_as);
        zq3.g(string2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        String string3 = getResources().getString(pm6.com_facebook_smart_login_confirmation_cancel);
        zq3.g(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        z38 z38Var = z38.a;
        String format = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        zq3.g(format, "java.lang.String.format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new DialogInterface.OnClickListener() { // from class: com.facebook.login.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceAuthDialog.z1(DeviceAuthDialog.this, str, bVar, str2, date, date2, dialogInterface, i);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: ro1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceAuthDialog.A1(DeviceAuthDialog.this, dialogInterface, i);
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z1(DeviceAuthDialog deviceAuthDialog, String str, b bVar, String str2, Date date, Date date2, DialogInterface dialogInterface, int i) {
        zq3.h(deviceAuthDialog, "this$0");
        zq3.h(str, "$userId");
        zq3.h(bVar, "$permissions");
        zq3.h(str2, "$accessToken");
        deviceAuthDialog.m1(str, bVar, str2, date, date2);
    }

    public void E1(LoginClient.Request request) {
        zq3.h(request, "request");
        this.k = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.o()));
        g29 g29Var = g29.a;
        g29.m0(bundle, "redirect_uri", request.i());
        g29.m0(bundle, "target_user_id", request.h());
        bundle.putString(AccessToken.ACCESS_TOKEN_KEY, n1());
        tp1 tp1Var = tp1.a;
        Map l1 = l1();
        bundle.putString("device_info", tp1.d(l1 == null ? null : t.x(l1)));
        GraphRequest.n.B(null, m, bundle, new GraphRequest.b() { // from class: po1
            @Override // com.facebook.GraphRequest.b
            public final void a(m23 m23Var) {
                DeviceAuthDialog.F1(DeviceAuthDialog.this, m23Var);
            }
        }).l();
    }

    public Map l1() {
        return null;
    }

    public String n1() {
        return v29.b() + '|' + v29.c();
    }

    protected int o1(boolean z) {
        return z ? ti6.com_facebook_smart_device_dialog_fragment : ti6.com_facebook_device_auth_dialog_fragment;
    }

    @Override // androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        c cVar = new c(requireActivity(), en6.com_facebook_auth_dialog);
        cVar.setContentView(q1(tp1.e() && !this.j));
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        LoginClient i1;
        zq3.h(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        LoginFragment loginFragment = (LoginFragment) ((FacebookActivity) requireActivity()).I();
        LoginMethodHandler loginMethodHandler = null;
        if (loginFragment != null && (i1 = loginFragment.i1()) != null) {
            loginMethodHandler = i1.k();
        }
        this.d = (DeviceAuthMethodHandler) loginMethodHandler;
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            D1(requestState);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.i = true;
        this.e.set(true);
        super.onDestroyView();
        k23 k23Var = this.f;
        if (k23Var != null) {
            k23Var.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        zq3.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (this.i) {
            return;
        }
        t1();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        zq3.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (this.h != null) {
            bundle.putParcelable("request_state", this.h);
        }
    }

    protected View q1(boolean z) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        zq3.g(layoutInflater, "requireActivity().layoutInflater");
        View inflate = layoutInflater.inflate(o1(z), (ViewGroup) null);
        zq3.g(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(xf6.progress_bar);
        zq3.g(findViewById, "view.findViewById(R.id.progress_bar)");
        this.a = findViewById;
        View findViewById2 = inflate.findViewById(xf6.confirmation_code);
        if (findViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.b = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(xf6.cancel_button);
        if (findViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        ((Button) findViewById3).setOnClickListener(new View.OnClickListener() { // from class: mo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceAuthDialog.r1(DeviceAuthDialog.this, view);
            }
        });
        View findViewById4 = inflate.findViewById(xf6.com_facebook_device_auth_instructions);
        if (findViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) findViewById4;
        this.c = textView;
        textView.setText(Html.fromHtml(getString(pm6.com_facebook_device_auth_instructions)));
        return inflate;
    }

    protected boolean s1() {
        return true;
    }

    protected void t1() {
        if (this.e.compareAndSet(false, true)) {
            RequestState requestState = this.h;
            if (requestState != null) {
                tp1 tp1Var = tp1.a;
                tp1.a(requestState.d());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.d;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.t();
            }
            Dialog dialog = getDialog();
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    protected void u1(FacebookException facebookException) {
        zq3.h(facebookException, "ex");
        if (this.e.compareAndSet(false, true)) {
            RequestState requestState = this.h;
            if (requestState != null) {
                tp1 tp1Var = tp1.a;
                tp1.a(requestState.d());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.d;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.u(facebookException);
            }
            Dialog dialog = getDialog();
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }
}
