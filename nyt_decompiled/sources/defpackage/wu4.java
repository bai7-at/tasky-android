package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.appevents.ml.ModelManager;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class wu4 {
    public static final a m = new a(null);
    private static final Map n = t.k(du8.a("embedding.weight", "embed.weight"), du8.a("dense1.weight", "fc1.weight"), du8.a("dense2.weight", "fc2.weight"), du8.a("dense3.weight", "fc3.weight"), du8.a("dense1.bias", "fc1.bias"), du8.a("dense2.bias", "fc2.bias"), du8.a("dense3.bias", "fc3.bias"));
    private final ld4 a;
    private final ld4 b;
    private final ld4 c;
    private final ld4 d;
    private final ld4 e;
    private final ld4 f;
    private final ld4 g;
    private final ld4 h;
    private final ld4 i;
    private final ld4 j;
    private final ld4 k;
    private final Map l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map b(File file) {
            Map c = m29.c(file);
            if (c == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Map a = wu4.a();
            for (Map.Entry entry : c.entrySet()) {
                String str = (String) entry.getKey();
                if (a.containsKey(entry.getKey()) && (str = (String) a.get(entry.getKey())) == null) {
                    return null;
                }
                hashMap.put(str, entry.getValue());
            }
            return hashMap;
        }

        public final wu4 a(File file) {
            zq3.h(file, TransferTable.COLUMN_FILE);
            Map b = b(file);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (b == null) {
                return null;
            }
            try {
                return new wu4(b, defaultConstructorMarker);
            } catch (Exception unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ wu4(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public static final /* synthetic */ Map a() {
        if (c11.d(wu4.class)) {
            return null;
        }
        try {
            return n;
        } catch (Throwable th) {
            c11.b(th, wu4.class);
            return null;
        }
    }

    public final ld4 b(ld4 ld4Var, String[] strArr, String str) {
        if (c11.d(this)) {
            return null;
        }
        try {
            zq3.h(ld4Var, "dense");
            zq3.h(strArr, "texts");
            zq3.h(str, "task");
            ui5 ui5Var = ui5.a;
            ld4 c = ui5.c(ui5.e(strArr, 128, this.a), this.b);
            ui5.a(c, this.e);
            ui5.i(c);
            ld4 c2 = ui5.c(c, this.c);
            ui5.a(c2, this.f);
            ui5.i(c2);
            ld4 g = ui5.g(c2, 2);
            ld4 c3 = ui5.c(g, this.d);
            ui5.a(c3, this.g);
            ui5.i(c3);
            ld4 g2 = ui5.g(c, c.b(1));
            ld4 g3 = ui5.g(g, g.b(1));
            ld4 g4 = ui5.g(c3, c3.b(1));
            ui5.f(g2, 1);
            ui5.f(g3, 1);
            ui5.f(g4, 1);
            ld4 d = ui5.d(ui5.b(new ld4[]{g2, g3, g4, ld4Var}), this.h, this.j);
            ui5.i(d);
            ld4 d2 = ui5.d(d, this.i, this.k);
            ui5.i(d2);
            ld4 ld4Var2 = (ld4) this.l.get(zq3.q(str, ".weight"));
            ld4 ld4Var3 = (ld4) this.l.get(zq3.q(str, ".bias"));
            if (ld4Var2 != null && ld4Var3 != null) {
                ld4 d3 = ui5.d(d2, ld4Var2, ld4Var3);
                ui5.j(d3);
                return d3;
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private wu4(Map map) {
        Object obj = map.get("embed.weight");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.a = (ld4) obj;
        ui5 ui5Var = ui5.a;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.b = ui5.l((ld4) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.c = ui5.l((ld4) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.d = ui5.l((ld4) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.e = (ld4) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f = (ld4) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.g = (ld4) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.h = ui5.k((ld4) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.i = ui5.k((ld4) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.j = (ld4) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.k = (ld4) obj11;
        this.l = new HashMap();
        for (String str : b0.j(ModelManager.Task.MTML_INTEGRITY_DETECT.toKey(), ModelManager.Task.MTML_APP_EVENT_PREDICTION.toKey())) {
            String q = zq3.q(str, ".weight");
            String q2 = zq3.q(str, ".bias");
            ld4 ld4Var = (ld4) map.get(q);
            ld4 ld4Var2 = (ld4) map.get(q2);
            if (ld4Var != null) {
                this.l.put(q, ui5.k(ld4Var));
            }
            if (ld4Var2 != null) {
                this.l.put(q2, ld4Var2);
            }
        }
    }
}
