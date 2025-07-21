package defpackage;

import android.content.SharedPreferences;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class g74 implements gf8 {
    public static final a Companion = new a(null);
    public static final int d = 8;
    private final SharedPreferences a;
    private final JsonAdapter b;
    private final List c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g74(SharedPreferences sharedPreferences) {
        zq3.h(sharedPreferences, "preferences");
        this.a = sharedPreferences;
        i d2 = new i.b().d();
        zq3.g(d2, "build(...)");
        JsonAdapter d3 = d2.d(j.j(List.class, String.class));
        zq3.g(d3, "adapter(...)");
        this.b = d3;
        this.c = v93.a.a();
    }

    @Override // defpackage.gf8
    public List a() {
        List list = null;
        try {
            String string = this.a.getString("tab_configuration", null);
            if (string == null) {
                string = "";
            }
            list = (List) this.b.fromJson(string);
        } catch (Exception unused) {
        }
        if (list == null) {
            list = kotlin.collections.i.l();
        }
        List list2 = list;
        if (list2.isEmpty()) {
            list2 = v93.a.a();
        }
        return list2;
    }

    @Override // defpackage.gf8
    public List b() {
        return this.c;
    }
}
