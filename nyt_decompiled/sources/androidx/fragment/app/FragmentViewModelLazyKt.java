package androidx.fragment.app;

import androidx.lifecycle.t;
import defpackage.c04;
import defpackage.qs2;
import defpackage.sa9;
import defpackage.vu3;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class FragmentViewModelLazyKt {
    public static final c04 b(final Fragment fragment, vu3 vu3Var, qs2 qs2Var, qs2 qs2Var2, qs2 qs2Var3) {
        zq3.h(fragment, "<this>");
        zq3.h(vu3Var, "viewModelClass");
        zq3.h(qs2Var, "storeProducer");
        zq3.h(qs2Var2, "extrasProducer");
        if (qs2Var3 == null) {
            qs2Var3 = new qs2() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final t.b mo865invoke() {
                    t.b defaultViewModelProviderFactory = Fragment.this.getDefaultViewModelProviderFactory();
                    zq3.g(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory;
                }
            };
        }
        return new androidx.lifecycle.s(vu3Var, qs2Var, qs2Var3, qs2Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sa9 c(c04 c04Var) {
        return (sa9) c04Var.getValue();
    }
}
