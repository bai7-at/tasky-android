package com.google.android.gms.internal.ads;

import defpackage.gge;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class s9 {
    public static ArrayList a(int i) {
        r8.a(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List b(List list, gge ggeVar) {
        return new zzgan(list, ggeVar);
    }
}
