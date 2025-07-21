package defpackage;

/* loaded from: classes5.dex */
public interface iv {
    iv a(hv hvVar);

    /* renamed from: b */
    iv d(dv dvVar, Object obj);

    hv build();

    default iv put(String str, String str2) {
        return d(dv.a(str), str2);
    }
}
