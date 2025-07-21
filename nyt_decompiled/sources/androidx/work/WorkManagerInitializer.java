package androidx.work;

import android.content.Context;
import androidx.work.a;
import defpackage.h94;
import defpackage.mj9;
import defpackage.uj3;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements uj3 {
    private static final String a = h94.i("WrkMgrInitializer");

    @Override // defpackage.uj3
    public List a() {
        return Collections.emptyList();
    }

    @Override // defpackage.uj3
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public mj9 b(Context context) {
        h94.e().a(a, "Initializing WorkManager with default configuration.");
        mj9.i(context, new a.C0120a().a());
        return mj9.g(context);
    }
}
