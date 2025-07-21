package com.nytimes.android.eventtracker.validator.inflater;

import android.content.res.Resources;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yz6;
import defpackage.z38;
import defpackage.zj8;
import defpackage.zq3;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class RawResourceInflater implements yz6 {
    private final Resources a;

    public RawResourceInflater(Resources resources) {
        zq3.h(resources, "resources");
        this.a = resources;
    }

    private final String e(int i) {
        InputStream openRawResource = this.a.openRawResource(i);
        zq3.g(openRawResource, "openRawResource(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource));
        final StringBuilder sb = new StringBuilder();
        zj8.c(bufferedReader, new ss2() { // from class: com.nytimes.android.eventtracker.validator.inflater.RawResourceInflater$readScript$code$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str) {
                zq3.h(str, "it");
                sb.append(str + System.lineSeparator());
            }
        });
        bufferedReader.close();
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // defpackage.yz6
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String b(int i) {
        return e(i);
    }

    @Override // defpackage.yz6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String a(int i, String... strArr) {
        zq3.h(strArr, "scriptArgs");
        String b = b(i);
        z38 z38Var = z38.a;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(b, Arrays.copyOf(copyOf, copyOf.length));
        zq3.g(format, "format(...)");
        return format;
    }
}
