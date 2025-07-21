package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

/* loaded from: classes.dex */
public final class zz6 implements we4 {
    private final boolean b(int i, Context context) {
        try {
            return context.getResources().getResourceEntryName(i) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.we4
    public /* bridge */ /* synthetic */ Object a(Object obj, uk5 uk5Var) {
        return c(((Number) obj).intValue(), uk5Var);
    }

    public Uri c(int i, uk5 uk5Var) {
        if (!b(i, uk5Var.g())) {
            return null;
        }
        Uri parse = Uri.parse("android.resource://" + uk5Var.g().getPackageName() + '/' + i);
        zq3.g(parse, "parse(this)");
        return parse;
    }
}
