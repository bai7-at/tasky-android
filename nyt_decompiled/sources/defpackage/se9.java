package defpackage;

import defpackage.lj;
import defpackage.t08;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class se9 {
    public static final lj.b a = new lj.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
    public static final lj.b b = new lj.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
    public static final lj.e c = new lj.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
    public static final lj.c d = new lj.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
    public static final lj.f e = new lj.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
    public static final lj.f f = new lj.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
    public static final lj.f g = new lj.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
    public static final lj.f h = new lj.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
    public static final lj.f i = new lj.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
    public static final lj.f j = new lj.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
    public static final lj.c k = new lj.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
    public static final lj.c l = new lj.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
    public static final lj.c m = new lj.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
    public static final lj.c n = new lj.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
    public static final lj.c o = new lj.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
    public static final lj.c p = new lj.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
    public static final lj.b q = new lj.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
    public static final lj.b r = new lj.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
    public static final lj.c s = new lj.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
    public static final lj.f t = new lj.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
    public static final lj.c u = new lj.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
    public static final lj.b v = new lj.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
    public static final lj.b w = new lj.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
    public static final lj.f x = new lj.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
    public static final lj.f y = new lj.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
    public static final lj.f z = new lj.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
    public static final lj.b A = new lj.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final lj.b B = new lj.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final lj.d C = new lj.d("WEB_MESSAGE_GET_MESSAGE_PAYLOAD", "WEB_MESSAGE_GET_MESSAGE_PAYLOAD");
    public static final lj.b D = new lj.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final lj.b E = new lj.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    public static final lj.b F = new lj.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    public static final lj.b G = new lj.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    public static final lj.e H = new lj.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    public static final lj.e I = new lj.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final lj.h J = new lj.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final lj.h K = new lj.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    public static final lj.g L = new lj.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
    public static final t08.a M = new t08.a("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
    public static final lj.h N = new lj.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    public static final lj.i O = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
    public static final lj.d P = new lj.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
    public static final lj.d Q = new lj.d("SUPPRESS_ERROR_PAGE", "SUPPRESS_ERROR_PAGE");
    public static final lj.d R = new lj.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    public static final lj.h S = new lj.h("FORCE_DARK", "FORCE_DARK");
    public static final lj.d T = new lj.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    public static final lj.d U = new lj.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    public static final lj.d V = new lj.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    public static final lj.d W = new lj.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
    public static final lj.d X = new lj.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    public static final lj.d Y = new lj.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
    public static final lj.d Z = new lj.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");
    public static final lj.d a0 = new lj.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    class a extends lj.i {
        private final Pattern d;

        a(String str, String str2) {
            super(str, str2);
            this.d = Pattern.compile("\\A\\d+");
        }

        @Override // defpackage.lj
        public boolean c() {
            return super.c();
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        return c(str, lj.d());
    }

    public static boolean c(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            rt0 rt0Var = (rt0) it2.next();
            if (rt0Var.a().equals(str)) {
                hashSet.add(rt0Var);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            if (((rt0) it3.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
