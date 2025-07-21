package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class k9a {
    public final int a;
    public final String b;
    public final List c;
    public final byte[] d;

    public k9a(int i, String str, List list, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.d = bArr;
    }
}
