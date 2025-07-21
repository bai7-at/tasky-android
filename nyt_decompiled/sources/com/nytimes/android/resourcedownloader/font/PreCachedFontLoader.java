package com.nytimes.android.resourcedownloader.font;

import android.webkit.WebResourceResponse;
import com.nytimes.android.resourcedownloader.model.MimeType;
import defpackage.c07;
import defpackage.du8;
import defpackage.qs2;
import defpackage.ul8;
import defpackage.zq3;
import java.io.InputStream;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public class PreCachedFontLoader {
    public static final a Companion = new a(null);
    private static final Map b = t.f(du8.a("Access-Control-Allow-Origin", "*"));
    private final c07 a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map a() {
            return PreCachedFontLoader.b;
        }

        private a() {
        }
    }

    public PreCachedFontLoader(c07 c07Var) {
        zq3.h(c07Var, "resourceReader");
        this.a = c07Var;
    }

    private boolean b(String str) {
        return str.length() > 5;
    }

    public WebResourceResponse c(String str) {
        zq3.h(str, "fontUrl");
        if (!b(str)) {
            return null;
        }
        String substring = str.substring(h.h0(str, "/", 0, false, 6, null));
        zq3.g(substring, "substring(...)");
        return d("hybrid-assets/fonts" + substring);
    }

    public WebResourceResponse d(final String str) {
        zq3.h(str, "filename");
        return f(new qs2() { // from class: com.nytimes.android.resourcedownloader.font.PreCachedFontLoader$readFont$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WebResourceResponse mo865invoke() {
                return new WebResourceResponse(MimeType.FONT.contentType(), "utf-8", 200, "OK", PreCachedFontLoader.Companion.a(), PreCachedFontLoader.this.e(str));
            }
        });
    }

    public InputStream e(String str) {
        zq3.h(str, "resourcePath");
        return this.a.b(str);
    }

    public WebResourceResponse f(qs2 qs2Var) {
        zq3.h(qs2Var, "block");
        try {
            return (WebResourceResponse) qs2Var.mo865invoke();
        } catch (Exception e) {
            ul8.a.z("HYBRID").f(e, "fail to load local font resource", new Object[0]);
            return null;
        }
    }
}
