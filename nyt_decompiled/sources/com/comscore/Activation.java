package com.comscore;

import com.amazonaws.services.s3.internal.Constants;
import com.comscore.Configuration;
import com.comscore.util.CrossPublisherIdUtil;
import com.comscore.util.setup.Setup;
import io.embrace.android.embracesdk.gating.SessionGatingKeys;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Activation {
    private static final String a = "https://segment-data-us-east.zqtk.net/%s?url=%s&c2=%s&c12=%s&ns_ap_bi=%s&ns_ap_sv=%s&ns_ap_an=%s&ns_ap_ver=%s&ns_ap_pn=android";
    private static final String b = "\\{\\s*\".*\"\\s*:\\s*[^\\}]*\\s*\\}";

    public interface ActivationListener {
        void onReceivedCategories(List<String> list);
    }

    static class a implements CrossPublisherIdUtil.Listener {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ ActivationListener e;

        /* renamed from: com.comscore.Activation$a$a, reason: collision with other inner class name */
        class RunnableC0156a implements Runnable {
            final /* synthetic */ String a;

            RunnableC0156a(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                a.this.e.onReceivedCategories(Activation.b(aVar.a, aVar.b, aVar.c, aVar.d, this.a));
            }
        }

        a(String str, String str2, String str3, String str4, ActivationListener activationListener) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = activationListener;
        }

        @Override // com.comscore.util.CrossPublisherIdUtil.Listener
        public void onCrossPublisherIdRequested(String str, boolean z) {
            new Thread(new RunnableC0156a(str)).start();
        }
    }

    static class b implements Configuration.ConfigurationListener {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ ActivationListener e;

        b(String str, String str2, String str3, String str4, ActivationListener activationListener) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = activationListener;
        }

        @Override // com.comscore.Configuration.ConfigurationListener
        public void onConfigurationChanged(int i) {
            if (i != 20307) {
                return;
            }
            Activation.a(this.a, this.b, this.c, this.d, this.e);
            Analytics.getConfiguration().b(this);
        }
    }

    private Activation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> b(String str, String str2, String str3, String str4, String str5) {
        int i;
        JSONArray jSONArray;
        if (!Setup.isSetUpFinished() || str3 == null || str4 == null) {
            return new ArrayList();
        }
        String applicationId = Setup.getJniComScoreHelper().getApplicationId();
        String version = Analytics.getVersion();
        String applicationName = Setup.getJniComScoreHelper().getApplicationName();
        String applicationVersion = Setup.getJniComScoreHelper().getApplicationVersion();
        if (applicationId == null || version == null || applicationName == null || applicationVersion == null || str3.isEmpty() || str4.isEmpty() || applicationId.isEmpty() || version.isEmpty() || applicationName.isEmpty() || applicationVersion.isEmpty()) {
            return new ArrayList();
        }
        try {
            String format = String.format(a, URLEncoder.encode(str, Constants.DEFAULT_ENCODING), URLEncoder.encode(str2, Constants.DEFAULT_ENCODING), URLEncoder.encode(str3, Constants.DEFAULT_ENCODING), URLEncoder.encode(str4, Constants.DEFAULT_ENCODING), URLEncoder.encode(applicationId, Constants.DEFAULT_ENCODING), URLEncoder.encode(version, Constants.DEFAULT_ENCODING), URLEncoder.encode(applicationName, Constants.DEFAULT_ENCODING), URLEncoder.encode(applicationVersion, Constants.DEFAULT_ENCODING));
            if (str5 != null && !str5.isEmpty()) {
                format = format + "&ns_ak=" + URLEncoder.encode(str5, Constants.DEFAULT_ENCODING);
            }
            try {
                InputStream openStream = new URL(format).openStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = openStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                Matcher matcher = Pattern.compile(b).matcher(byteArrayOutputStream.toString(Constants.DEFAULT_ENCODING));
                if (!matcher.find()) {
                    return new ArrayList();
                }
                try {
                    JSONObject jSONObject = new JSONObject(matcher.group(0));
                    try {
                        jSONArray = jSONObject.getJSONArray("data");
                    } catch (JSONException unused) {
                        jSONArray = jSONObject.getJSONArray(SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
                    }
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (i = 0; i < length; i++) {
                        arrayList.add(jSONArray.optString(i));
                    }
                    return arrayList;
                } catch (JSONException unused2) {
                    return new ArrayList();
                }
            } catch (IOException unused3) {
                return new ArrayList();
            }
        } catch (UnsupportedEncodingException unused4) {
            return new ArrayList();
        }
    }

    static void a(String str, String str2, String str3, String str4, ActivationListener activationListener) {
        if (Analytics.getConfiguration().d()) {
            CrossPublisherIdUtil.requestCrossPublisherId(new a(str, str2, str3, str4, activationListener));
        } else {
            Analytics.getConfiguration().a(new b(str, str2, str3, str4, activationListener));
        }
    }
}
