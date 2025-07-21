package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class f implements DynamiteModule.a {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0200a interfaceC0200a) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        bVar.a = interfaceC0200a.b(context, str);
        int a = interfaceC0200a.a(context, str, true);
        bVar.b = a;
        int i = bVar.a;
        if (i == 0) {
            i = 0;
            if (a == 0) {
                bVar.c = 0;
                return bVar;
            }
        }
        if (i >= a) {
            bVar.c = -1;
        } else {
            bVar.c = 1;
        }
        return bVar;
    }
}
