package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.android.gms.internal.pal.zzzr;
import java.util.Set;

/* loaded from: classes3.dex */
public final class i8g extends t7g {
    private final zzzr a = new zzzr();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof i8g) && ((i8g) obj).a.equals(this.a);
        }
        return true;
    }

    public final r7g f(String str) {
        return (r7g) this.a.get(TransferTable.COLUMN_KEY);
    }

    public final t7g g(String str) {
        return (t7g) this.a.get(str);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final i8g j(String str) {
        return (i8g) this.a.get("keyData");
    }

    public final Set k() {
        return this.a.entrySet();
    }

    public final void n(String str, t7g t7gVar) {
        this.a.put(str, t7gVar);
    }

    public final boolean o(String str) {
        return this.a.containsKey(str);
    }
}
