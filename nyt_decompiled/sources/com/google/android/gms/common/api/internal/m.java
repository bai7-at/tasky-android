package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class m extends q {
    private final ArrayList b;
    final /* synthetic */ zaaw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zaaw zaawVar, ArrayList arrayList) {
        super(zaawVar, null);
        this.c = zaawVar;
        this.b = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void a() {
        zabi zabiVar;
        IAccountAccessor iAccountAccessor;
        zabi zabiVar2;
        zaaw zaawVar = this.c;
        zabiVar = zaawVar.zaa;
        zabiVar.zag.zad = zaaw.zao(zaawVar);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Api.Client client = (Api.Client) arrayList.get(i);
            zaaw zaawVar2 = this.c;
            iAccountAccessor = zaawVar2.zao;
            zabiVar2 = zaawVar2.zaa;
            client.getRemoteService(iAccountAccessor, zabiVar2.zag.zad);
        }
    }
}
