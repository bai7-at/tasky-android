package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class d implements DynamiteModule.a {
    d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0200a interfaceC0200a) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int b = interfaceC0200a.b(context, str);
        bVar.a = b;
        if (b != 0) {
            bVar.c = -1;
        } else {
            int a = interfaceC0200a.a(context, str, true);
            bVar.b = a;
            if (a != 0) {
                bVar.c = 1;
            }
        }
        return bVar;
    }
}
