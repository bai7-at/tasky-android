package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class p74 implements o74 {
    private final LocaleList a;

    p74(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // defpackage.o74
    public String a() {
        return this.a.toLanguageTags();
    }

    @Override // defpackage.o74
    public Object b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((o74) obj).b());
    }

    @Override // defpackage.o74
    public Locale get(int i) {
        return this.a.get(i);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.o74
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.o74
    public int size() {
        return this.a.size();
    }

    public String toString() {
        return this.a.toString();
    }
}
