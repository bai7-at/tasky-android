package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import androidx.savedstate.Recreator;
import androidx.savedstate.a;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.aa7;
import defpackage.d44;
import defpackage.l77;
import defpackage.zq3;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a {
    private static final b g = new b(null);
    private boolean b;
    private Bundle c;
    private boolean d;
    private Recreator.b e;
    private final l77 a = new l77();
    private boolean f = true;

    /* renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    public interface InterfaceC0118a {
        void a(aa7 aa7Var);
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a aVar, d44 d44Var, Lifecycle.Event event) {
        zq3.h(aVar, "this$0");
        zq3.h(d44Var, "<anonymous parameter 0>");
        zq3.h(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            aVar.f = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            aVar.f = false;
        }
    }

    public final Bundle b(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.c = null;
        }
        return bundle2;
    }

    public final c c(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            zq3.g(entry, "components");
            String str2 = (String) entry.getKey();
            c cVar = (c) entry.getValue();
            if (zq3.c(str2, str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(Lifecycle lifecycle) {
        zq3.h(lifecycle, "lifecycle");
        if (this.b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new g() { // from class: y97
            @Override // androidx.lifecycle.g
            public final void h(d44 d44Var, Lifecycle.Event event) {
                a.d(a.this, d44Var, event);
            }
        });
        this.b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.d = true;
    }

    public final void g(Bundle bundle) {
        zq3.h(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        l77.d e = this.a.e();
        zq3.g(e, "this.components.iteratorWithAdditions()");
        while (e.hasNext()) {
            Map.Entry entry = (Map.Entry) e.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void h(String str, c cVar) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(cVar, "provider");
        if (((c) this.a.j(str, cVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class cls) {
        zq3.h(cls, "clazz");
        if (!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.b bVar = this.e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.e = bVar;
        try {
            cls.getDeclaredConstructor(null);
            Recreator.b bVar2 = this.e;
            if (bVar2 != null) {
                String name = cls.getName();
                zq3.g(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final void j(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        this.a.k(str);
    }
}
