package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ys4 {
    public static final a d = new a(null);
    private static final Set e = new CopyOnWriteArraySet();
    private final String a;
    private final String b;
    private final List c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(JSONObject jSONObject) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("k");
                    String optString2 = optJSONObject.optString(QueryKeys.INTERNAL_REFERRER);
                    zq3.g(optString, "k");
                    if (optString.length() != 0) {
                        Set a = ys4.a();
                        zq3.g(next, TransferTable.COLUMN_KEY);
                        List F0 = h.F0(optString, new String[]{","}, false, 0, 6, null);
                        zq3.g(optString2, QueryKeys.INTERNAL_REFERRER);
                        a.add(new ys4(next, F0, optString2, null));
                    }
                }
            }
        }

        public final Set b() {
            HashSet hashSet = new HashSet();
            Iterator it2 = ys4.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((ys4) it2.next()).c());
            }
            return hashSet;
        }

        public final Set c() {
            return new HashSet(ys4.a());
        }

        public final void d(String str) {
            zq3.h(str, "rulesFromServer");
            try {
                ys4.a().clear();
                a(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }

        private a() {
        }
    }

    public /* synthetic */ ys4(String str, List list, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set a() {
        if (c11.d(ys4.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            c11.b(th, ys4.class);
            return null;
        }
    }

    public final List b() {
        if (c11.d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.c);
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public final String c() {
        if (c11.d(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public final String d() {
        if (c11.d(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private ys4(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }
}
