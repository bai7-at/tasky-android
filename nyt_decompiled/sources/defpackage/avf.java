package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class avf {
    private final xaf a;
    private final apf b;

    private avf(apf apfVar, byte[] bArr) {
        x8f x8fVar = x8f.b;
        this.b = apfVar;
        this.a = x8fVar;
    }

    public static avf b(char c) {
        return new avf(new apf(new f1f(':')), null);
    }

    public final List c(CharSequence charSequence) {
        charSequence.getClass();
        jlf jlfVar = new jlf(this.b, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (jlfVar.hasNext()) {
            arrayList.add((String) jlfVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
