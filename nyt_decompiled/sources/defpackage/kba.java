package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class kba implements Comparator {
    kba() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}
