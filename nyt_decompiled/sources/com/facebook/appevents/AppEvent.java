package com.facebook.appevents;

import android.os.Bundle;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import defpackage.g29;
import defpackage.k94;
import defpackage.qn3;
import defpackage.sl;
import defpackage.ww8;
import defpackage.x07;
import defpackage.x32;
import defpackage.z38;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AppEvent implements Serializable {
    public static final a a = new a(null);
    private static final HashSet b = new HashSet();
    private static final long serialVersionUID = 1;
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;

    public static final class SerializationProxyV2 implements Serializable {
        public static final a a = new a(null);
        private static final long serialVersionUID = 20160803001L;
        private final String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public SerializationProxyV2(String str, boolean z, boolean z2, String str2) {
            zq3.h(str, "jsonString");
            this.jsonString = str;
            this.isImplicit = z;
            this.inBackground = z2;
            this.checksum = str2;
        }

        private final Object readResolve() throws JSONException, ObjectStreamException {
            return new AppEvent(this.jsonString, this.isImplicit, this.inBackground, this.checksum, null);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName(Constants.DEFAULT_ENCODING);
                zq3.g(forName, "Charset.forName(charsetName)");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(forName);
                zq3.g(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] digest = messageDigest.digest();
                zq3.g(digest, "digest.digest()");
                return sl.c(digest);
            } catch (UnsupportedEncodingException e) {
                g29.e0("Failed to generate checksum: ", e);
                return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            } catch (NoSuchAlgorithmException e2) {
                g29.e0("Failed to generate checksum: ", e2);
                return "0";
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            boolean contains;
            if (str == null || str.length() == 0 || str.length() > 40) {
                if (str == null) {
                    str = "<None Provided>";
                }
                z38 z38Var = z38.a;
                String format = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
                zq3.g(format, "java.lang.String.format(locale, format, *args)");
                throw new FacebookException(format);
            }
            synchronized (AppEvent.b) {
                contains = AppEvent.b.contains(str);
                ww8 ww8Var = ww8.a;
            }
            if (contains) {
                return;
            }
            if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").d(str)) {
                synchronized (AppEvent.b) {
                    AppEvent.b.add(str);
                }
            } else {
                z38 z38Var2 = z38.a;
                String format2 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                zq3.g(format2, "java.lang.String.format(format, *args)");
                throw new FacebookException(format2);
            }
        }

        private a() {
        }
    }

    public /* synthetic */ AppEvent(String str, boolean z, boolean z2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, str2);
    }

    private final String b() {
        a aVar = a;
        String jSONObject = this.jsonObject.toString();
        zq3.g(jSONObject, "jsonObject.toString()");
        return aVar.c(jSONObject);
    }

    private final JSONObject d(String str, String str2, Double d, Bundle bundle, UUID uuid) {
        a aVar = a;
        aVar.d(str2);
        JSONObject jSONObject = new JSONObject();
        String e = x07.e(str2);
        jSONObject.put("_eventName", e);
        jSONObject.put("_eventName_md5", aVar.c(e));
        jSONObject.put("_logTime", System.currentTimeMillis() / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map i = i(bundle);
            for (String str3 : i.keySet()) {
                jSONObject.put(str3, i.get(str3));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        } else {
            k94.a aVar2 = k94.e;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            zq3.g(jSONObject2, "eventObject.toString()");
            aVar2.c(loggingBehavior, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    private final Map i(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            a aVar = a;
            zq3.g(str, TransferTable.COLUMN_KEY);
            aVar.d(str);
            Object obj = bundle.get(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                z38 z38Var = z38.a;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                zq3.g(format, "java.lang.String.format(format, *args)");
                throw new FacebookException(format);
            }
            hashMap.put(str, obj.toString());
        }
        qn3.c(hashMap);
        x07 x07Var = x07.a;
        x07.f(hashMap, this.name);
        x32 x32Var = x32.a;
        x32.c(hashMap, this.name);
        return hashMap;
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.jsonObject.toString();
        zq3.g(jSONObject, "jsonObject.toString()");
        return new SerializationProxyV2(jSONObject, this.isImplicit, this.inBackground, this.checksum);
    }

    public final boolean c() {
        return this.isImplicit;
    }

    public final JSONObject e() {
        return this.jsonObject;
    }

    public final String f() {
        return this.name;
    }

    public final boolean g() {
        if (this.checksum == null) {
            return true;
        }
        return zq3.c(b(), this.checksum);
    }

    public final boolean h() {
        return this.isImplicit;
    }

    public String toString() {
        z38 z38Var = z38.a;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.jsonObject.optString("_eventName"), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3));
        zq3.g(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) {
        zq3.h(str, "contextName");
        zq3.h(str2, "eventName");
        this.isImplicit = z;
        this.inBackground = z2;
        this.name = str2;
        this.jsonObject = d(str, str2, d, bundle, uuid);
        this.checksum = b();
    }

    private AppEvent(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.isImplicit = z;
        String optString = jSONObject.optString("_eventName");
        zq3.g(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.name = optString;
        this.checksum = str2;
        this.inBackground = z2;
    }
}
