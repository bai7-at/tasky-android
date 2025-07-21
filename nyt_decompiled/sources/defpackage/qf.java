package defpackage;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class qf implements pu5 {
    private LocaleList a;
    private l74 b;
    private final od8 c = nd8.a();

    @Override // defpackage.pu5
    public ou5 a(String str) {
        return new pf(Locale.forLanguageTag(str));
    }

    @Override // defpackage.pu5
    public l74 b() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.c) {
            l74 l74Var = this.b;
            if (l74Var != null && localeList == this.a) {
                return l74Var;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new i74(new pf(localeList.get(i))));
            }
            l74 l74Var2 = new l74(arrayList);
            this.a = localeList;
            this.b = l74Var2;
            return l74Var2;
        }
    }
}
