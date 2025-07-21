package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt;
import androidx.savedstate.a;
import defpackage.aa7;
import defpackage.kg6;
import defpackage.lt2;
import defpackage.os1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sw7;
import defpackage.ww8;
import defpackage.zq3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class DisposableSaveableStateRegistry_androidKt {
    private static final Class[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final os1 b(View view, aa7 aa7Var) {
        Object parent = view.getParent();
        zq3.f(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(kg6.compose_view_saveable_id_tag);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return c(str, aa7Var);
    }

    public static final os1 c(String str, aa7 aa7Var) {
        final boolean z;
        final String str2 = androidx.compose.runtime.saveable.a.class.getSimpleName() + ':' + str;
        final androidx.savedstate.a savedStateRegistry = aa7Var.getSavedStateRegistry();
        Bundle b = savedStateRegistry.b(str2);
        final androidx.compose.runtime.saveable.a a2 = SaveableStateRegistryKt.a(b != null ? h(b) : null, new ss2() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                boolean f;
                f = DisposableSaveableStateRegistry_androidKt.f(obj);
                return Boolean.valueOf(f);
            }
        });
        try {
            savedStateRegistry.h(str2, new a.c() { // from class: ps1
                @Override // androidx.savedstate.a.c
                public final Bundle a() {
                    Bundle d;
                    d = DisposableSaveableStateRegistry_androidKt.d(androidx.compose.runtime.saveable.a.this);
                    return d;
                }
            });
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new os1(a2, new qs2() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m95invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m95invoke() {
                if (z) {
                    savedStateRegistry.j(str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(androidx.compose.runtime.saveable.a aVar) {
        return g(aVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof sw7) {
            sw7 sw7Var = (sw7) obj;
            if (sw7Var.c() != androidx.compose.runtime.y.k() && sw7Var.c() != androidx.compose.runtime.y.q() && sw7Var.c() != androidx.compose.runtime.y.n()) {
                return false;
            }
            Object value = sw7Var.getValue();
            if (value == null) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof lt2) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class cls : a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle g(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle;
    }

    private static final Map h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            zq3.f(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
