package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.amazonaws.services.s3.internal.Constants;
import defpackage.fn2;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
abstract class tm2 {
    static final hd4 a = new hd4(16);
    private static final ExecutorService b = jy6.a("fonts-androidx", 10, Constants.MAXIMUM_UPLOAD_PARTS);
    static final Object c = new Object();
    static final hs7 d = new hs7();

    class a implements Callable {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ sm2 c;
        final /* synthetic */ int d;

        a(String str, Context context, sm2 sm2Var, int i) {
            this.a = str;
            this.b = context;
            this.c = sm2Var;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return tm2.c(this.a, this.b, this.c, this.d);
        }
    }

    class b implements lv0 {
        final /* synthetic */ ah0 a;

        b(ah0 ah0Var) {
            this.a = ah0Var;
        }

        @Override // defpackage.lv0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.a.b(eVar);
        }
    }

    class c implements Callable {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ sm2 c;
        final /* synthetic */ int d;

        c(String str, Context context, sm2 sm2Var, int i) {
            this.a = str;
            this.b = context;
            this.c = sm2Var;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return tm2.c(this.a, this.b, this.c, this.d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements lv0 {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        @Override // defpackage.lv0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (tm2.c) {
                try {
                    hs7 hs7Var = tm2.d;
                    ArrayList arrayList = (ArrayList) hs7Var.get(this.a);
                    if (arrayList == null) {
                        return;
                    }
                    hs7Var.remove(this.a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((lv0) arrayList.get(i)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static String a(sm2 sm2Var, int i) {
        return sm2Var.d() + "-" + i;
    }

    private static int b(fn2.a aVar) {
        int i = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        fn2.b[] b2 = aVar.b();
        if (b2 != null && b2.length != 0) {
            i = 0;
            for (fn2.b bVar : b2) {
                int b3 = bVar.b();
                if (b3 != 0) {
                    if (b3 < 0) {
                        return -3;
                    }
                    return b3;
                }
            }
        }
        return i;
    }

    static e c(String str, Context context, sm2 sm2Var, int i) {
        hd4 hd4Var = a;
        Typeface typeface = (Typeface) hd4Var.d(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            fn2.a e2 = rm2.e(context, sm2Var, null);
            int b2 = b(e2);
            if (b2 != 0) {
                return new e(b2);
            }
            Typeface b3 = ou8.b(context, null, e2.b(), i);
            if (b3 == null) {
                return new e(-3);
            }
            hd4Var.f(str, b3);
            return new e(b3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(Context context, sm2 sm2Var, int i, Executor executor, ah0 ah0Var) {
        String a2 = a(sm2Var, i);
        Typeface typeface = (Typeface) a.d(a2);
        if (typeface != null) {
            ah0Var.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(ah0Var);
        synchronized (c) {
            try {
                hs7 hs7Var = d;
                ArrayList arrayList = (ArrayList) hs7Var.get(a2);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                hs7Var.put(a2, arrayList2);
                c cVar = new c(a2, context, sm2Var, i);
                if (executor == null) {
                    executor = b;
                }
                jy6.b(executor, cVar, new d(a2));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, sm2 sm2Var, ah0 ah0Var, int i, int i2) {
        String a2 = a(sm2Var, i);
        Typeface typeface = (Typeface) a.d(a2);
        if (typeface != null) {
            ah0Var.b(new e(typeface));
            return typeface;
        }
        if (i2 == -1) {
            e c2 = c(a2, context, sm2Var, i);
            ah0Var.b(c2);
            return c2.a;
        }
        try {
            e eVar = (e) jy6.c(b, new a(a2, context, sm2Var, i), i2);
            ah0Var.b(eVar);
            return eVar.a;
        } catch (InterruptedException unused) {
            ah0Var.b(new e(-3));
            return null;
        }
    }

    static final class e {
        final Typeface a;
        final int b;

        e(int i) {
            this.a = null;
            this.b = i;
        }

        boolean a() {
            return this.b == 0;
        }

        e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
