package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.AuthenticationTokenClaims;
import defpackage.by0;
import defpackage.c04;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.n91;
import defpackage.qq7;
import defpackage.qs2;
import defpackage.rq7;
import defpackage.ww8;
import defpackage.zq3;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.c;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class SharedPreferencesMigration implements n91 {
    private final gt2 a;
    private final it2 b;
    private final Context c;
    private final String d;
    private final c04 e;
    private final Set f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @fc1(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass3(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass3(by0Var);
        }

        @Override // defpackage.gt2
        public final Object invoke(Object obj, by0 by0Var) {
            return ((AnonymousClass3) create(obj, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return cc0.a(true);
        }
    }

    private static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final boolean a(Context context, String str) {
            zq3.h(context, "context");
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return context.deleteSharedPreferences(str);
        }
    }

    private SharedPreferencesMigration(qs2 qs2Var, Set set, gt2 gt2Var, it2 it2Var, Context context, String str) {
        this.a = gt2Var;
        this.b = it2Var;
        this.c = context;
        this.d = str;
        this.e = c.a(qs2Var);
        this.f = set == qq7.a() ? null : i.b1(set);
    }

    private final void d(Context context, String str) {
        if (!a.a(context, str)) {
            throw new IOException(zq3.q("Unable to delete SharedPreferences: ", str));
        }
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.e.getValue();
    }

    @Override // defpackage.n91
    public Object a(by0 by0Var) {
        ww8 ww8Var;
        Context context;
        String str;
        SharedPreferences.Editor edit = e().edit();
        Set set = this.f;
        if (set == null) {
            edit.clear();
        } else {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                edit.remove((String) it2.next());
            }
        }
        if (!edit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.c) != null && (str = this.d) != null) {
            d(context, str);
        }
        Set set2 = this.f;
        if (set2 == null) {
            ww8Var = null;
        } else {
            set2.clear();
            ww8Var = ww8.a;
        }
        return ww8Var == kotlin.coroutines.intrinsics.a.h() ? ww8Var : ww8.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r4.isEmpty() == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.n91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.Object r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = (androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = new androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            androidx.datastore.migrations.SharedPreferencesMigration r4 = (androidx.datastore.migrations.SharedPreferencesMigration) r4
            kotlin.f.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r6)
            gt2 r6 = r4.a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            r6 = 0
            if (r5 != 0) goto L53
            java.lang.Boolean r4 = defpackage.cc0.a(r6)
            return r4
        L53:
            java.util.Set r5 = r4.f
            if (r5 != 0) goto L6d
            android.content.SharedPreferences r4 = r4.e()
            java.util.Map r4 = r4.getAll()
            java.lang.String r5 = "sharedPrefs.all"
            defpackage.zq3.g(r4, r5)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L6b
            goto L9f
        L6b:
            r3 = r6
            goto L9f
        L6d:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            android.content.SharedPreferences r4 = r4.e()
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L81
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L81
            goto L6b
        L81:
            java.util.Iterator r5 = r5.iterator()
        L85:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r4.contains(r0)
            java.lang.Boolean r0 = defpackage.cc0.a(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L85
        L9f:
            java.lang.Boolean r4 = defpackage.cc0.a(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration.b(java.lang.Object, by0):java.lang.Object");
    }

    @Override // defpackage.n91
    public Object c(Object obj, by0 by0Var) {
        return this.b.invoke(new rq7(e(), this.f), obj, by0Var);
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, gt2 gt2Var, it2 it2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? qq7.a() : set, (i & 8) != 0 ? new AnonymousClass3(null) : gt2Var, it2Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(final Context context, final String str, Set set, gt2 gt2Var, it2 it2Var) {
        this(new qs2() { // from class: androidx.datastore.migrations.SharedPreferencesMigration.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final SharedPreferences mo865invoke() {
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                zq3.g(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
                return sharedPreferences;
            }
        }, set, gt2Var, it2Var, context, str);
        zq3.h(context, "context");
        zq3.h(str, "sharedPreferencesName");
        zq3.h(set, "keysToMigrate");
        zq3.h(gt2Var, "shouldRunMigration");
        zq3.h(it2Var, "migrate");
    }
}
