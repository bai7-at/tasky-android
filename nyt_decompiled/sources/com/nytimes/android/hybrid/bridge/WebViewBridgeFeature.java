package com.nytimes.android.hybrid.bridge;

import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class WebViewBridgeFeature {
    public static final a Companion = new a(null);
    private final boolean a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public WebViewBridgeFeature(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebViewBridgeFeature) && this.a == ((WebViewBridgeFeature) obj).a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public String toString() {
        return "WebViewBridgeFeature(enabled=" + this.a + ")";
    }
}
