package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class n9 implements dd1 {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final SharedPreferences a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public n9(SharedPreferences sharedPreferences) {
        zq3.h(sharedPreferences, "preferences");
        this.a = sharedPreferences;
    }

    @Override // defpackage.dd1
    public Object a(Context context, Uri uri, String str, b65 b65Var, boolean z, by0 by0Var) {
        String string = context.getResources().getString(xl6.com_nytimes_android_phoenix_beta_AD_KEYWORD);
        zq3.g(string, "getString(...)");
        if (uri.getQueryParameterNames().contains("keyword")) {
            String queryParameter = uri.getQueryParameter("keyword");
            if (queryParameter == null || zq3.c(queryParameter, "CLEAR")) {
                SharedPreferences.Editor edit = this.a.edit();
                edit.remove(string);
                edit.apply();
            } else {
                SharedPreferences.Editor edit2 = this.a.edit();
                edit2.putString(string, queryParameter);
                edit2.apply();
            }
        }
        return new Intent();
    }

    @Override // defpackage.dd1
    public boolean b(Uri uri) {
        zq3.h(uri, "uri");
        String uri2 = uri.toString();
        zq3.g(uri2, "toString(...)");
        return h.K(uri2, "nytimes://advertising?keyword", false, 2, null);
    }
}
