package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import androidx.room.RoomDatabase;
import defpackage.df6;
import defpackage.kl6;
import defpackage.qi6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends Preference {
    private long p0;

    b(Context context, List list, long j) {
        super(context);
        L0();
        M0(list);
        this.p0 = j + 1000000;
    }

    private void L0() {
        v0(qi6.expand_button);
        r0(df6.ic_arrow_down_24dp);
        E0(kl6.expand_button_title);
        z0(RoomDatabase.MAX_BIND_PARAMETER_CNT);
    }

    private void M0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        CharSequence charSequence = null;
        while (it2.hasNext()) {
            Preference preference = (Preference) it2.next();
            CharSequence E = preference.E();
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(E)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.u())) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(E)) {
                charSequence = charSequence == null ? E : j().getString(kl6.summary_collapsed_preference_list, charSequence, E);
            }
        }
        C0(charSequence);
    }

    @Override // androidx.preference.Preference
    public void S(h hVar) {
        super.S(hVar);
        hVar.a0(false);
    }

    @Override // androidx.preference.Preference
    long o() {
        return this.p0;
    }
}
