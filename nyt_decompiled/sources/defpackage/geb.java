package defpackage;

import android.content.SharedPreferences;
import java.util.List;

/* loaded from: classes3.dex */
final class geb implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final String a;
    final /* synthetic */ heb b;

    public geb(heb hebVar, String str) {
        this.b = hebVar;
        this.a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<feb> list;
        synchronized (this.b) {
            try {
                list = this.b.b;
                for (feb febVar : list) {
                    febVar.a.b(febVar.b, sharedPreferences, this.a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
