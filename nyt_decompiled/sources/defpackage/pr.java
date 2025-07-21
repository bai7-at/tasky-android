package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;

/* loaded from: classes4.dex */
public class pr {
    public void a(a1 a1Var, k57 k57Var, Boolean bool) {
        if (a1Var == null) {
            return;
        }
        if (!d(k57Var)) {
            a1Var.a();
        } else {
            a1Var.c();
            c(a1Var, k57Var, bool.booleanValue());
        }
    }

    public int b(Context context, k57 k57Var, boolean z) {
        return mx0.c(context, z ? bd6.summary_text_read : bd6.summary_text);
    }

    protected void c(a1 a1Var, k57 k57Var, boolean z) {
        a1Var.b();
        a1Var.setData(k57Var);
        a1Var.setTextColor(b(a1Var.getContext(), k57Var, z));
    }

    public boolean d(k57 k57Var) {
        return k57Var.d() && k57Var.e().d() && !((ImmutableList) k57Var.e().c()).isEmpty() && !TextUtils.isEmpty((CharSequence) ((ImmutableList) k57Var.e().c()).get(0));
    }
}
