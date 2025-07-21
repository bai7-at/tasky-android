package defpackage;

import android.webkit.WebResourceResponse;
import com.nytimes.android.resourcedownloader.font.PreCachedFontLoader;
import com.nytimes.android.resourcedownloader.model.MimeType;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class yd9 implements xd9 {
    private final h07 a;
    private final PreCachedFontLoader b;

    public yd9(h07 h07Var, PreCachedFontLoader preCachedFontLoader) {
        zq3.h(h07Var, "resourceRetriever");
        zq3.h(preCachedFontLoader, "fontLoader");
        this.a = h07Var;
        this.b = preCachedFontLoader;
    }

    @Override // defpackage.xd9
    public WebResourceResponse a(String str, Map map) {
        zq3.h(str, "url");
        zq3.h(map, "headers");
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = (String) map.get("Origin");
            if (str2 != null) {
                linkedHashMap.put("Access-Control-Allow-Origin", str2);
                linkedHashMap.put("Access-Control-Allow-Methods", "GET");
            }
            MimeType.Companion companion = MimeType.Companion;
            if (companion.isFont(str)) {
                return this.b.c(str);
            }
            if (companion.isImage(str) || companion.isCssOrJs(str)) {
                return new WebResourceResponse(companion.fromFilename(str).contentType(), "utf-8", 200, "OK", linkedHashMap, this.a.c(str));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
