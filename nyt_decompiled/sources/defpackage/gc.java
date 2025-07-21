package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import defpackage.w52;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes2.dex */
public abstract class gc extends hj0 {
    private final CoroutineDispatcher d;
    private final List e;

    public static final class a implements w52 {
        final /* synthetic */ Bundle a;
        final /* synthetic */ boolean b;

        a(Bundle bundle, boolean z) {
            this.a = bundle;
            this.b = z;
        }

        @Override // defpackage.w52
        public void a(String str, String str2) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str2, "value");
            this.a.putString(str, str2);
        }

        @Override // defpackage.w52
        public void b(String str, int i) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a.putInt(str, i);
        }

        @Override // defpackage.w52
        public void c(String str, String str2) {
            w52.a.c(this, str, str2);
        }

        @Override // defpackage.w52
        public void d(String str, Integer num) {
            w52.a.a(this, str, num);
        }

        @Override // defpackage.w52
        public void e(String str, long j) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a.putLong(str, j);
        }

        @Override // defpackage.w52
        public void f(String str, Long l) {
            w52.a.b(this, str, l);
        }

        @Override // defpackage.w52
        public void g(String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            if (this.b) {
                this.a.putString(str, null);
            }
        }
    }

    public static final class b implements w52 {
        final /* synthetic */ Map a;

        b(Map map) {
            this.a = map;
        }

        @Override // defpackage.w52
        public void a(String str, String str2) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str2, "value");
            this.a.put(str, str2);
        }

        @Override // defpackage.w52
        public void b(String str, int i) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a.put(str, String.valueOf(i));
        }

        @Override // defpackage.w52
        public void c(String str, String str2) {
            w52.a.c(this, str, str2);
        }

        @Override // defpackage.w52
        public void d(String str, Integer num) {
            w52.a.a(this, str, num);
        }

        @Override // defpackage.w52
        public void e(String str, long j) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a.put(str, String.valueOf(j));
        }

        @Override // defpackage.w52
        public void f(String str, Long l) {
            w52.a.b(this, str, l);
        }

        @Override // defpackage.w52
        public void g(String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        this.d = coroutineDispatcher;
        this.e = new ArrayList();
    }

    public final void f(ic icVar) {
        zq3.h(icVar, "interceptor");
        this.e.add(icVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(hj0 hj0Var) {
        zq3.h(hj0Var, "other");
        return Boolean.compare(hj0Var.c(), c());
    }

    public final Bundle i(uc ucVar) {
        zq3.h(ucVar, "event");
        return j(ucVar, true);
    }

    protected final Bundle j(uc ucVar, boolean z) {
        zq3.h(ucVar, "event");
        Bundle bundle = new Bundle();
        ucVar.b(b(), new a(bundle, z));
        for (ic icVar : this.e) {
            if (icVar.c(ucVar)) {
                icVar.a(bundle);
            }
        }
        return bundle;
    }

    public final Map k(uc ucVar) {
        zq3.h(ucVar, "event");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ucVar.b(b(), new b(linkedHashMap));
        for (ic icVar : this.e) {
            if (icVar.c(ucVar)) {
                icVar.b(linkedHashMap);
            }
        }
        return linkedHashMap;
    }

    public void l(Activity activity) {
        zq3.h(activity, "activity");
    }

    public void n(Activity activity) {
        zq3.h(activity, "activity");
    }

    public void o(m98 m98Var) {
        zq3.h(m98Var, "user");
    }
}
