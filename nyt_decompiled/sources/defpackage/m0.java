package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.nytimes.android.abra.AbraManager;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class m0 implements dd1 {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private final SharedPreferences a;
    private final AbraManager b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public m0(SharedPreferences sharedPreferences, AbraManager abraManager) {
        zq3.h(sharedPreferences, "preferences");
        zq3.h(abraManager, "abraManager");
        this.a = sharedPreferences;
        this.b = abraManager;
    }

    @Override // defpackage.dd1
    public Object a(Context context, Uri uri, String str, b65 b65Var, boolean z, by0 by0Var) {
        List F0;
        String query = uri.getQuery();
        if (query != null && (F0 = h.F0(query, new String[]{"&"}, false, 0, 6, null)) != null) {
            Iterator it2 = F0.iterator();
            while (it2.hasNext()) {
                List E0 = h.E0((String) it2.next(), new char[]{'='}, false, 2, 2, null);
                String a2 = v0.a((String) i.k0(E0));
                if (E0.size() == 1) {
                    SharedPreferences.Editor edit = this.a.edit();
                    edit.remove(a2);
                    edit.apply();
                } else {
                    String str2 = (String) E0.get(1);
                    if (zq3.c(str2, "CLEAR")) {
                        SharedPreferences.Editor edit2 = this.a.edit();
                        edit2.remove(a2);
                        edit2.apply();
                    } else {
                        SharedPreferences.Editor edit3 = this.a.edit();
                        edit3.putString(a2, str2);
                        edit3.apply();
                        this.b.initializeManager();
                    }
                }
            }
        }
        return new Intent();
    }

    @Override // defpackage.dd1
    public boolean b(Uri uri) {
        zq3.h(uri, "uri");
        String uri2 = uri.toString();
        zq3.g(uri2, "toString(...)");
        return h.K(uri2, "nytimes://abra", false, 2, null);
    }
}
