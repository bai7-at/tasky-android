package com.nytimes.android.hybrid.bridge;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c04;
import defpackage.kf9;
import defpackage.qs2;
import defpackage.uo6;
import defpackage.zq3;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.c;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class WebViewStateInjector {
    public static final a Companion = new a(null);
    private static final c04 a = c.a(new qs2() { // from class: com.nytimes.android.hybrid.bridge.WebViewStateInjector$Companion$adapter$2
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JsonAdapter mo865invoke() {
            return new i.b().d().d(j.j(Map.class, String.class, WebViewBridgeFeature.class));
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JsonAdapter b() {
            Object value = WebViewStateInjector.a.getValue();
            zq3.g(value, "getValue(...)");
            return (JsonAdapter) value;
        }

        private a() {
        }
    }

    public final Map b(Collection collection) {
        zq3.h(collection, "names");
        Collection collection2 = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(kotlin.collections.i.w(collection2, 10)), 16));
        for (Object obj : collection2) {
            linkedHashMap.put(obj, new WebViewBridgeFeature(true));
        }
        return linkedHashMap;
    }

    public final kf9 c(String str, Collection collection) {
        zq3.h(str, "withName");
        zq3.h(collection, "features");
        return d(str, b(collection));
    }

    public final kf9 d(String str, Map map) {
        zq3.h(str, "withName");
        zq3.h(map, "fields");
        return new kf9(str, "(function(){" + str + " = " + Companion.b().toJson(map) + "})();");
    }
}
