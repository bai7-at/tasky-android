package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.hybrid.HybridConfig;
import com.squareup.moshi.JsonAdapter;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class bc3 {
    public static final a Companion = new a(null);
    private static final Pattern b = Pattern.compile("\\/\\/\\[-NYTHYBRIDCONFIG-\\]");
    private final JsonAdapter a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public bc3(JsonAdapter jsonAdapter) {
        zq3.h(jsonAdapter, "moshiAdapter");
        this.a = jsonAdapter;
    }

    public final String a(String str, HybridConfig hybridConfig) {
        zq3.h(str, AssetConstants.HTML);
        zq3.h(hybridConfig, "config");
        String replaceAll = b.matcher(str).replaceAll("window.config = " + b(hybridConfig) + ";");
        zq3.g(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String b(HybridConfig hybridConfig) {
        zq3.h(hybridConfig, "config");
        String json = this.a.toJson(hybridConfig);
        zq3.g(json, "toJson(...)");
        return json;
    }
}
