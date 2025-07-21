package com.nytimes.android.saved;

import androidx.fragment.app.Fragment;
import com.nytimes.android.utils.SaveOrigin;
import defpackage.jk;
import defpackage.s87;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.nytimes.android.saved.a$a, reason: collision with other inner class name */
    public static final class C0401a {
        public static /* synthetic */ void a(a aVar, SaveOrigin saveOrigin, boolean z, s87 s87Var, jk jkVar, Fragment fragment, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportSaveEvent");
            }
            aVar.a(saveOrigin, z, s87Var, jkVar, (i & 16) != 0 ? null : fragment, (i & 32) != 0 ? null : str);
        }
    }

    void a(SaveOrigin saveOrigin, boolean z, s87 s87Var, jk jkVar, Fragment fragment, String str);

    String b();
}
