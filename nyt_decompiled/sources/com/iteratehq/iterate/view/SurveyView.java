package com.iteratehq.iterate.view;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.util.Mimetypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iteratehq.iterate.model.EventMessageTypes;
import com.iteratehq.iterate.model.InteractionEventSource;
import com.iteratehq.iterate.model.ProgressEventMessageData;
import com.iteratehq.iterate.model.ResponseEventMessageData;
import com.iteratehq.iterate.model.StringToAnyMap;
import com.iteratehq.iterate.model.Survey;
import defpackage.ad8;
import defpackage.c04;
import defpackage.do3;
import defpackage.md6;
import defpackage.mx0;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes3.dex */
public final class SurveyView extends e {
    public static final a e = new a(null);
    private ad8 a;
    private final c04 b = kotlin.c.a(new qs2() { // from class: com.iteratehq.iterate.view.SurveyView$survey$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Survey mo865invoke() {
            Bundle arguments = SurveyView.this.getArguments();
            Survey survey = arguments != null ? (Survey) arguments.getParcelable("survey") : null;
            zq3.e(survey);
            return survey;
        }
    });
    private b c;
    private ProgressEventMessageData d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SurveyView a(Survey survey, String str, StringToAnyMap stringToAnyMap, String str2, String str3) {
            zq3.h(survey, "survey");
            Bundle bundle = new Bundle();
            bundle.putParcelable("survey", survey);
            bundle.putString("auth_token", str);
            bundle.putSerializable("event_traits", stringToAnyMap);
            bundle.putString("survey_text_font", str2);
            bundle.putString("button_font", str3);
            SurveyView surveyView = new SurveyView();
            surveyView.setArguments(bundle);
            return surveyView;
        }

        private a() {
        }
    }

    public interface b {
        void a(InteractionEventSource interactionEventSource, ProgressEventMessageData progressEventMessageData);
    }

    public static final class c extends WebViewClient {
        c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            ad8 ad8Var = SurveyView.this.a;
            if (ad8Var == null) {
                zq3.z("binding");
                ad8Var = null;
            }
            ProgressBar progressBar = ad8Var.b;
            zq3.g(progressBar, "binding.progressBar");
            progressBar.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Context context;
            Uri url;
            Uri url2;
            StringBuilder sb = new StringBuilder();
            sb.append((webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null) ? null : url2.getScheme());
            sb.append("://");
            sb.append((webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.getHost());
            if (zq3.c(sb.toString(), "https://iteratehq.com")) {
                return false;
            }
            if ((webResourceRequest != null ? webResourceRequest.getUrl() : null) == null) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW", webResourceRequest.getUrl());
            if (webView == null || (context = webView.getContext()) == null) {
                return true;
            }
            context.startActivity(intent);
            return true;
        }
    }

    public static final class d {
        d() {
        }

        @JavascriptInterface
        public final void postMessage(String str) {
            zq3.h(str, "message");
            SurveyView.this.h1(str);
        }
    }

    private final Survey f1() {
        return (Survey) this.b.getValue();
    }

    private final boolean g1() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h1(String str) {
        Gson gson = new Gson();
        Map map = (Map) gson.fromJson(str, new TypeToken<Map<String, ? extends Object>>() { // from class: com.iteratehq.iterate.view.SurveyView$onMessage$messageMap$1
        }.getType());
        Object obj = map.get(TransferTable.COLUMN_TYPE);
        if (zq3.c(obj, EventMessageTypes.CLOSE.getValue())) {
            dismiss();
            return;
        }
        if (zq3.c(obj, EventMessageTypes.PROGRESS.getValue())) {
            this.d = (ProgressEventMessageData) gson.fromJson(gson.toJson(map.get("data")), ProgressEventMessageData.class);
            return;
        }
        if (zq3.c(obj, EventMessageTypes.RESPONSE.getValue())) {
            ResponseEventMessageData responseEventMessageData = (ResponseEventMessageData) gson.fromJson(gson.toJson(map.get("data")), ResponseEventMessageData.class);
            do3 do3Var = do3.a;
            Survey f1 = f1();
            zq3.g(f1, "survey");
            do3Var.c(f1, responseEventMessageData.getResponse(), responseEventMessageData.getQuestion());
            return;
        }
        if (zq3.c(obj, EventMessageTypes.SURVEY_COMPLETE.getValue())) {
            do3 do3Var2 = do3.a;
            Survey f12 = f1();
            zq3.g(f12, "survey");
            do3Var2.d(f12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void j1() {
        ArrayList arrayList = new ArrayList();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("auth_token") : null;
        Bundle arguments2 = getArguments();
        StringToAnyMap stringToAnyMap = (StringToAnyMap) (arguments2 != null ? arguments2.getSerializable("event_traits") : null);
        Bundle arguments3 = getArguments();
        String string2 = arguments3 != null ? arguments3.getString("survey_text_font") : null;
        Bundle arguments4 = getArguments();
        String string3 = arguments4 != null ? arguments4.getString("button_font") : null;
        if (string != null) {
            arrayList.add("auth_token=" + string);
        }
        if (stringToAnyMap != null) {
            for (Map.Entry<String, Object> entry : stringToAnyMap.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    arrayList.add("response_boolean_" + key + '=' + value);
                } else if ((value instanceof Long) || (value instanceof Integer)) {
                    arrayList.add("response_number_" + key + '=' + value);
                } else {
                    arrayList.add("response_" + key + '=' + value);
                }
            }
        }
        arrayList.add("theme=" + (g1() ? "dark" : "light"));
        arrayList.add("absoluteURLs=true");
        if (string2 != null) {
            arrayList.add("surveyTextFontPath=file:///android_asset/" + string2);
        }
        if (string3 != null) {
            arrayList.add("buttonFontPath=file:///android_asset/" + string3);
        }
        String str = "https://iteratehq.com/" + f1().getCompanyId() + '/' + f1().getId() + "/mobile?" + i.u0(arrayList, "&", null, null, 0, null, null, 62, null);
        ad8 ad8Var = this.a;
        if (ad8Var == null) {
            zq3.z("binding");
            ad8Var = null;
        }
        WebView webView = ad8Var.c;
        webView.setBackgroundColor(mx0.c(requireContext(), g1() ? md6.blackLight : md6.white));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new c());
        webView.addJavascriptInterface(new d(), "ReactNativeWebView");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        BuildersKt__BuildersKt.runBlocking$default(null, new SurveyView$setupView$2$3(ref$ObjectRef2, ref$ObjectRef, str, null), 1, null);
        if (ref$ObjectRef2.element != 0) {
            dismiss();
            return;
        }
        webView.loadDataWithBaseURL("file:///?" + i.u0(arrayList, "&", null, null, 0, null, null, 62, null), (String) ref$ObjectRef.element, Mimetypes.MIMETYPE_HTML, "utf-8", "");
    }

    public final void i1(b bVar) {
        zq3.h(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.c = bVar;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.Theme.Material.NoActionBar);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        ad8 c2 = ad8.c(layoutInflater);
        zq3.g(c2, "inflate(inflater)");
        this.a = c2;
        if (c2 == null) {
            zq3.z("binding");
            c2 = null;
        }
        ConstraintLayout root = c2.getRoot();
        zq3.g(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        zq3.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(InteractionEventSource.SURVEY, this.d);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        zq3.h(view, "view");
        super.onViewCreated(view, bundle);
        j1();
    }
}
