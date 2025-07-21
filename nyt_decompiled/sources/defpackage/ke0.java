package defpackage;

import android.os.Bundle;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ke0 {
    public static final ke0 a = new ke0();
    private static final Map b;

    public static final class a implements h {
        a() {
        }

        @Override // ke0.h
        public void a(Bundle bundle, String str, Object obj) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(obj, "value");
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    public static final class b implements h {
        b() {
        }

        @Override // ke0.h
        public void a(Bundle bundle, String str, Object obj) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(obj, "value");
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    public static final class c implements h {
        c() {
        }

        @Override // ke0.h
        public void a(Bundle bundle, String str, Object obj) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(obj, "value");
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    public static final class d implements h {
        d() {
        }

        @Override // ke0.h
        public void a(Bundle bundle, String str, Object obj) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(obj, "value");
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    public static final class e implements h {
        e() {
        }

        @Override // ke0.h
        public void a(Bundle bundle, String str, Object obj) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(obj, "value");
            bundle.putString(str, (String) obj);
        }
    }

    public static final class f implements h {
        f() {
        }

        @Override // ke0.h
        public void a(Bundle bundle, String str, Object obj) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(obj, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    public static final class g implements h {
        g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ke0.h
        public void a(Bundle bundle, String str, Object obj) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(obj, "value");
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Object obj2 = jSONArray.get(i);
                    if (!(obj2 instanceof String)) {
                        throw new IllegalArgumentException(zq3.q("Unexpected type in an array: ", obj2.getClass()));
                    }
                    arrayList.add(obj2);
                    if (i2 >= length) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    public interface h {
        void a(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(Boolean.class, new a());
        hashMap.put(Integer.class, new b());
        hashMap.put(Long.class, new c());
        hashMap.put(Double.class, new d());
        hashMap.put(String.class, new e());
        hashMap.put(String[].class, new f());
        hashMap.put(JSONArray.class, new g());
    }

    private ke0() {
    }

    public static final Bundle a(JSONObject jSONObject) {
        zq3.h(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj));
                } else {
                    h hVar = (h) b.get(obj.getClass());
                    if (hVar == null) {
                        throw new IllegalArgumentException(zq3.q("Unsupported type: ", obj.getClass()));
                    }
                    zq3.g(next, TransferTable.COLUMN_KEY);
                    zq3.g(obj, "value");
                    hVar.a(bundle, next, obj);
                }
            }
        }
        return bundle;
    }
}
