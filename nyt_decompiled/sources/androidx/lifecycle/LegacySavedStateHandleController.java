package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.a;
import defpackage.aa7;
import defpackage.d44;
import defpackage.sa9;
import defpackage.zq3;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {
    public static final LegacySavedStateHandleController a = new LegacySavedStateHandleController();

    public static final class a implements a.InterfaceC0118a {
        @Override // androidx.savedstate.a.InterfaceC0118a
        public void a(aa7 aa7Var) {
            zq3.h(aa7Var, "owner");
            if (!(aa7Var instanceof sa9)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            u viewModelStore = ((sa9) aa7Var).getViewModelStore();
            androidx.savedstate.a savedStateRegistry = aa7Var.getSavedStateRegistry();
            Iterator it2 = viewModelStore.c().iterator();
            while (it2.hasNext()) {
                q b = viewModelStore.b((String) it2.next());
                zq3.e(b);
                LegacySavedStateHandleController.a(b, savedStateRegistry, aa7Var.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.i(a.class);
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(q qVar, androidx.savedstate.a aVar, Lifecycle lifecycle) {
        zq3.h(qVar, "viewModel");
        zq3.h(aVar, "registry");
        zq3.h(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) qVar.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.c()) {
            return;
        }
        savedStateHandleController.a(aVar, lifecycle);
        a.c(aVar, lifecycle);
    }

    public static final SavedStateHandleController b(androidx.savedstate.a aVar, Lifecycle lifecycle, String str, Bundle bundle) {
        zq3.h(aVar, "registry");
        zq3.h(lifecycle, "lifecycle");
        zq3.e(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, n.f.a(aVar.b(str), bundle));
        savedStateHandleController.a(aVar, lifecycle);
        a.c(aVar, lifecycle);
        return savedStateHandleController;
    }

    private final void c(final androidx.savedstate.a aVar, final Lifecycle lifecycle) {
        Lifecycle.State b = lifecycle.b();
        if (b == Lifecycle.State.INITIALIZED || b.isAtLeast(Lifecycle.State.STARTED)) {
            aVar.i(a.class);
        } else {
            lifecycle.a(new g() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.g
                public void h(d44 d44Var, Lifecycle.Event event) {
                    zq3.h(d44Var, "source");
                    zq3.h(event, "event");
                    if (event == Lifecycle.Event.ON_START) {
                        Lifecycle.this.d(this);
                        aVar.i(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
