package androidx.datastore.preferences;

import androidx.datastore.preferences.core.MutablePreferences;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.rq7;
import defpackage.s16;
import defpackage.u16;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    SharedPreferencesMigrationKt$getMigrationFunction$1(by0 by0Var) {
        super(3, by0Var);
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(rq7 rq7Var, s16 s16Var, by0 by0Var) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(by0Var);
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$0 = rq7Var;
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$1 = s16Var;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        rq7 rq7Var = (rq7) this.L$0;
        s16 s16Var = (s16) this.L$1;
        Set keySet = s16Var.a().keySet();
        ArrayList arrayList = new ArrayList(i.w(keySet, 10));
        Iterator it2 = keySet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((s16.a) it2.next()).a());
        }
        Map a = rq7Var.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a.entrySet()) {
            if (cc0.a(!arrayList.contains((String) entry.getKey())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        MutablePreferences d = s16Var.d();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Boolean) {
                d.j(u16.a(str), value);
            } else if (value instanceof Float) {
                d.j(u16.c(str), value);
            } else if (value instanceof Integer) {
                d.j(u16.d(str), value);
            } else if (value instanceof Long) {
                d.j(u16.e(str), value);
            } else if (value instanceof String) {
                d.j(u16.f(str), value);
            } else if (value instanceof Set) {
                s16.a g = u16.g(str);
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                }
                d.j(g, (Set) value);
            } else {
                continue;
            }
        }
        return d.e();
    }
}
