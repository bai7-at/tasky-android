package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.c04;
import defpackage.qs2;
import defpackage.sa9;
import defpackage.x97;
import defpackage.zq3;
import java.util.Map;

/* loaded from: classes.dex */
public final class SavedStateHandlesProvider implements a.c {
    private final androidx.savedstate.a a;
    private boolean b;
    private Bundle c;
    private final c04 d;

    public SavedStateHandlesProvider(androidx.savedstate.a aVar, final sa9 sa9Var) {
        zq3.h(aVar, "savedStateRegistry");
        zq3.h(sa9Var, "viewModelStoreOwner");
        this.a = aVar;
        this.d = kotlin.c.a(new qs2() { // from class: androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final x97 mo865invoke() {
                return SavedStateHandleSupport.e(sa9.this);
            }
        });
    }

    private final x97 c() {
        return (x97) this.d.getValue();
    }

    @Override // androidx.savedstate.a.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().e().entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((n) entry.getValue()).g().a();
            if (!zq3.c(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        d();
        Bundle bundle = this.c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.b) {
            return;
        }
        Bundle b = this.a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (b != null) {
            bundle.putAll(b);
        }
        this.c = bundle;
        this.b = true;
        c();
    }
}
