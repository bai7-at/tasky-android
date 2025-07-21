package defpackage;

import android.content.Context;
import com.chartbeat.androidsdk.QueryKeys;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ni3 {
    private static ni3 u;
    private final Context a;
    private final Object b;
    private final Class c;
    private final Class d;
    private final Class e;
    private final Class f;
    private final Class g;
    private final Class h;
    private final Class i;
    private final Method j;
    private final Method k;
    private final Method l;
    private final Method m;
    private final Method n;
    private final Method o;
    private final Method p;
    private final ri3 q;
    private final Set r;
    public static final b s = new b(null);
    private static final AtomicBoolean t = new AtomicBoolean(false);
    private static final AtomicBoolean v = new AtomicBoolean(false);
    private static final Map w = new ConcurrentHashMap();
    private static final Map x = new ConcurrentHashMap();

    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (c11.d(this)) {
                return null;
            }
            try {
                zq3.h(obj, "proxy");
                zq3.h(method, QueryKeys.MAX_SCROLL_DEPTH);
                if (zq3.c(method.getName(), "onBillingSetupFinished")) {
                    ni3.s.f().set(true);
                } else {
                    String name = method.getName();
                    zq3.g(name, "m.name");
                    if (h.v(name, "onBillingServiceDisconnected", false, 2, null)) {
                        ni3.s.f().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                c11.b(th, this);
                return null;
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object a(Context context, Class cls) {
            Object e;
            Object e2;
            Class a = si3.a("com.android.billingclient.api.BillingClient$Builder");
            Class a2 = si3.a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (a == null || a2 == null) {
                return null;
            }
            Method d = si3.d(cls, "newBuilder", Context.class);
            Method d2 = si3.d(a, "enablePendingPurchases", new Class[0]);
            Method d3 = si3.d(a, "setListener", a2);
            Method d4 = si3.d(a, "build", new Class[0]);
            if (d == null || d2 == null || d3 == null || d4 == null || (e = si3.e(cls, d, null, context)) == null) {
                return null;
            }
            Object newProxyInstance = Proxy.newProxyInstance(a2.getClassLoader(), new Class[]{a2}, new d());
            zq3.g(newProxyInstance, "newProxyInstance(\n              listenerClazz.classLoader, arrayOf(listenerClazz), PurchasesUpdatedListenerWrapper())");
            Object e3 = si3.e(a, d3, e, newProxyInstance);
            if (e3 == null || (e2 = si3.e(a, d2, e3, new Object[0])) == null) {
                return null;
            }
            return si3.e(a, d4, e2, new Object[0]);
        }

        private final void b(Context context) {
            Object a;
            ri3 b = ri3.g.b();
            if (b == null) {
                return;
            }
            Class a2 = si3.a("com.android.billingclient.api.BillingClient");
            Class a3 = si3.a("com.android.billingclient.api.Purchase");
            Class a4 = si3.a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class a5 = si3.a("com.android.billingclient.api.SkuDetails");
            Class a6 = si3.a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class a7 = si3.a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class a8 = si3.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (a2 == null || a4 == null || a3 == null || a5 == null || a7 == null || a6 == null || a8 == null) {
                return;
            }
            Method d = si3.d(a2, "queryPurchases", String.class);
            Method d2 = si3.d(a4, "getPurchasesList", new Class[0]);
            Method d3 = si3.d(a3, "getOriginalJson", new Class[0]);
            Method d4 = si3.d(a5, "getOriginalJson", new Class[0]);
            Method d5 = si3.d(a6, "getOriginalJson", new Class[0]);
            Method d6 = si3.d(a2, "querySkuDetailsAsync", b.e(), a7);
            Method d7 = si3.d(a2, "queryPurchaseHistoryAsync", String.class, a8);
            if (d == null || d2 == null || d3 == null || d4 == null || d5 == null || d6 == null || d7 == null || (a = a(context, a2)) == null) {
                return;
            }
            ni3.m(new ni3(context, a, a2, a4, a3, a5, a6, a7, a8, d, d2, d3, d4, d5, d6, d7, b, null));
            ni3 g = ni3.g();
            if (g == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
            }
            ni3.n(g);
        }

        public final synchronized ni3 c(Context context) {
            zq3.h(context, "context");
            if (ni3.f().get()) {
                return ni3.g();
            }
            b(context);
            ni3.f().set(true);
            return ni3.g();
        }

        public final Map d() {
            return ni3.h();
        }

        public final Map e() {
            return ni3.k();
        }

        public final AtomicBoolean f() {
            return ni3.l();
        }

        private b() {
        }
    }

    public final class c implements InvocationHandler {
        private Runnable a;
        final /* synthetic */ ni3 b;

        public c(ni3 ni3Var, Runnable runnable) {
            zq3.h(ni3Var, "this$0");
            zq3.h(runnable, "runnable");
            this.b = ni3Var;
            this.a = runnable;
        }

        private final void a(List list) {
            if (c11.d(this)) {
                return;
            }
            try {
                for (Object obj : list) {
                    try {
                        si3 si3Var = si3.a;
                        Object e = si3.e(ni3.i(this.b), ni3.c(this.b), obj, new Object[0]);
                        String str = e instanceof String ? (String) e : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            jSONObject.put("packageName", ni3.b(this.b).getPackageName());
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                ni3.e(this.b).add(string);
                                Map d = ni3.s.d();
                                zq3.g(string, "skuID");
                                d.put(string, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.a.run();
            } catch (Throwable th) {
                c11.b(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (c11.d(this)) {
                return null;
            }
            try {
                zq3.h(obj, "proxy");
                zq3.h(method, "method");
                if (zq3.c(method.getName(), "onPurchaseHistoryResponse")) {
                    Object obj2 = objArr == null ? null : objArr[1];
                    if (obj2 != null && (obj2 instanceof List)) {
                        a((List) obj2);
                    }
                }
                return null;
            } catch (Throwable th) {
                c11.b(th, this);
                return null;
            }
        }
    }

    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (c11.d(this)) {
                return null;
            }
            try {
                zq3.h(obj, "proxy");
                zq3.h(method, QueryKeys.MAX_SCROLL_DEPTH);
                return null;
            } catch (Throwable th) {
                c11.b(th, this);
                return null;
            }
        }
    }

    public final class e implements InvocationHandler {
        private Runnable a;
        final /* synthetic */ ni3 b;

        public e(ni3 ni3Var, Runnable runnable) {
            zq3.h(ni3Var, "this$0");
            zq3.h(runnable, "runnable");
            this.b = ni3Var;
            this.a = runnable;
        }

        public final void a(List list) {
            if (c11.d(this)) {
                return;
            }
            try {
                zq3.h(list, "skuDetailsObjectList");
                for (Object obj : list) {
                    try {
                        si3 si3Var = si3.a;
                        Object e = si3.e(ni3.j(this.b), ni3.d(this.b), obj, new Object[0]);
                        String str = e instanceof String ? (String) e : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                Map e2 = ni3.s.e();
                                zq3.g(string, "skuID");
                                e2.put(string, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.a.run();
            } catch (Throwable th) {
                c11.b(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (c11.d(this)) {
                return null;
            }
            try {
                zq3.h(obj, "proxy");
                zq3.h(method, QueryKeys.MAX_SCROLL_DEPTH);
                if (zq3.c(method.getName(), "onSkuDetailsResponse")) {
                    Object obj2 = objArr == null ? null : objArr[1];
                    if (obj2 != null && (obj2 instanceof List)) {
                        a((List) obj2);
                    }
                }
                return null;
            } catch (Throwable th) {
                c11.b(th, this);
                return null;
            }
        }
    }

    public /* synthetic */ ni3(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, ri3 ri3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, ri3Var);
    }

    public static final /* synthetic */ Context b(ni3 ni3Var) {
        if (c11.d(ni3.class)) {
            return null;
        }
        try {
            return ni3Var.a;
        } catch (Throwable th) {
            c11.b(th, ni3.class);
            return null;
        }
    }

    public static final /* synthetic */ Method c(ni3 ni3Var) {
        if (c11.d(ni3.class)) {
            return null;
        }
        try {
            return ni3Var.n;
        } catch (Throwable th) {
            c11.b(th, ni3.class);
            return null;
        }
    }

    public static final /* synthetic */ Method d(ni3 ni3Var) {
        if (c11.d(ni3.class)) {
            return null;
        }
        try {
            return ni3Var.m;
        } catch (Throwable th) {
            c11.b(th, ni3.class);
            return null;
        }
    }

    public static final /* synthetic */ Set e(ni3 ni3Var) {
        if (c11.d(ni3.class)) {
            return null;
        }
        try {
            return ni3Var.r;
        } catch (Throwable th) {
            c11.b(th, ni3.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean f() {
        if (c11.d(ni3.class)) {
            return null;
        }
        try {
            return t;
        } catch (Throwable th) {
            c11.b(th, ni3.class);
            return null;
        }
    }

    public static final /* synthetic */ ni3 g() {
        if (c11.d(ni3.class)) {
            return null;
        }
        try {
            return u;
        } catch (Throwable th) {
            c11.b(th, ni3.class);
            return null;
        }
    }

    public static final /* synthetic */ Map h() {
        if (c11.d(ni3.class)) {
            return null;
        }
        try {
            return w;
        } catch (Throwable th) {
            c11.b(th, ni3.class);
            return null;
        }
    }

    public static final /* synthetic */ Class i(ni3 ni3Var) {
        if (c11.d(ni3.class)) {
            return null;
        }
        try {
            return ni3Var.g;
        } catch (Throwable th) {
            c11.b(th, ni3.class);
            return null;
        }
    }

    public static final /* synthetic */ Class j(ni3 ni3Var) {
        if (c11.d(ni3.class)) {
            return null;
        }
        try {
            return ni3Var.f;
        } catch (Throwable th) {
            c11.b(th, ni3.class);
            return null;
        }
    }

    public static final /* synthetic */ Map k() {
        if (c11.d(ni3.class)) {
            return null;
        }
        try {
            return x;
        } catch (Throwable th) {
            c11.b(th, ni3.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean l() {
        if (c11.d(ni3.class)) {
            return null;
        }
        try {
            return v;
        } catch (Throwable th) {
            c11.b(th, ni3.class);
            return null;
        }
    }

    public static final /* synthetic */ void m(ni3 ni3Var) {
        if (c11.d(ni3.class)) {
            return;
        }
        try {
            u = ni3Var;
        } catch (Throwable th) {
            c11.b(th, ni3.class);
        }
    }

    public static final /* synthetic */ void n(ni3 ni3Var) {
        if (c11.d(ni3.class)) {
            return;
        }
        try {
            ni3Var.t();
        } catch (Throwable th) {
            c11.b(th, ni3.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(ni3 ni3Var, Runnable runnable) {
        if (c11.d(ni3.class)) {
            return;
        }
        try {
            zq3.h(ni3Var, "this$0");
            zq3.h(runnable, "$queryPurchaseHistoryRunnable");
            ni3Var.s("inapp", new ArrayList(ni3Var.r), runnable);
        } catch (Throwable th) {
            c11.b(th, ni3.class);
        }
    }

    private final void r(String str, Runnable runnable) {
        if (c11.d(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.i.getClassLoader(), new Class[]{this.i}, new c(this, runnable));
            zq3.g(newProxyInstance, "newProxyInstance(\n            purchaseHistoryResponseListenerClazz.classLoader,\n            arrayOf(purchaseHistoryResponseListenerClazz),\n            PurchaseHistoryResponseListenerWrapper(runnable))");
            si3 si3Var = si3.a;
            si3.e(this.c, this.p, this.b, str, newProxyInstance);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void s(String str, List list, Runnable runnable) {
        if (c11.d(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.h.getClassLoader(), new Class[]{this.h}, new e(this, runnable));
            zq3.g(newProxyInstance, "newProxyInstance(\n            skuDetailsResponseListenerClazz.classLoader,\n            arrayOf(skuDetailsResponseListenerClazz),\n            SkuDetailsResponseListenerWrapper(runnable))");
            Object d2 = this.q.d(str, list);
            si3 si3Var = si3.a;
            si3.e(this.c, this.o, this.b, d2, newProxyInstance);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void t() {
        Method d2;
        if (c11.d(this)) {
            return;
        }
        try {
            Class a2 = si3.a("com.android.billingclient.api.BillingClientStateListener");
            if (a2 == null || (d2 = si3.d(this.c, "startConnection", a2)) == null) {
                return;
            }
            Object newProxyInstance = Proxy.newProxyInstance(a2.getClassLoader(), new Class[]{a2}, new a());
            zq3.g(newProxyInstance, "newProxyInstance(\n            listenerClazz.classLoader, arrayOf(listenerClazz), BillingClientStateListenerWrapper())");
            si3.e(this.c, d2, this.b, newProxyInstance);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void o(String str, Runnable runnable) {
        if (c11.d(this)) {
            return;
        }
        try {
            zq3.h(str, "skuType");
            zq3.h(runnable, "querySkuRunnable");
            si3 si3Var = si3.a;
            Object e2 = si3.e(this.d, this.k, si3.e(this.c, this.j, this.b, "inapp"), new Object[0]);
            List list = e2 instanceof List ? (List) e2 : null;
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    si3 si3Var2 = si3.a;
                    Object e3 = si3.e(this.e, this.l, obj, new Object[0]);
                    String str2 = e3 instanceof String ? (String) e3 : null;
                    if (str2 != null) {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            arrayList.add(string);
                            Map map = w;
                            zq3.g(string, "skuID");
                            map.put(string, jSONObject);
                        }
                    }
                }
                s(str, arrayList, runnable);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void p(String str, final Runnable runnable) {
        if (c11.d(this)) {
            return;
        }
        try {
            zq3.h(str, "skuType");
            zq3.h(runnable, "queryPurchaseHistoryRunnable");
            r(str, new Runnable() { // from class: mi3
                @Override // java.lang.Runnable
                public final void run() {
                    ni3.q(ni3.this, runnable);
                }
            });
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private ni3(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, ri3 ri3Var) {
        this.a = context;
        this.b = obj;
        this.c = cls;
        this.d = cls2;
        this.e = cls3;
        this.f = cls4;
        this.g = cls5;
        this.h = cls6;
        this.i = cls7;
        this.j = method;
        this.k = method2;
        this.l = method3;
        this.m = method4;
        this.n = method5;
        this.o = method6;
        this.p = method7;
        this.q = ri3Var;
        this.r = new CopyOnWriteArraySet();
    }
}
