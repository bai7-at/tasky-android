package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class i implements DynamiteModule.a {
    i() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0200a interfaceC0200a) {
        int a;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int b = interfaceC0200a.b(context, str);
        bVar.a = b;
        int i = 0;
        if (b != 0) {
            a = interfaceC0200a.a(context, str, false);
            bVar.b = a;
        } else {
            a = interfaceC0200a.a(context, str, true);
            bVar.b = a;
        }
        int i2 = bVar.a;
        if (i2 != 0) {
            i = i2;
        } else if (a == 0) {
            bVar.c = 0;
            return bVar;
        }
        if (a >= i) {
            bVar.c = 1;
        } else {
            bVar.c = -1;
        }
        return bVar;
    }
}
