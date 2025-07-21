package com.nytimes.android.features.discovery.discoverytab.data;

import defpackage.lk7;
import defpackage.mk7;
import defpackage.qo;
import defpackage.wv5;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class CarouselBlock {
    public static final Companion Companion = new Companion(null);
    public static final int d = 8;
    private static final KSerializer[] e = {null, null, new qo(CarouselAsset$$serializer.INSTANCE)};
    private final String a;
    private final String b;
    private final List c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return CarouselBlock$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CarouselBlock(int i, String str, String str2, List list, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, CarouselBlock$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public static final /* synthetic */ void e(CarouselBlock carouselBlock, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = e;
        dVar.y(serialDescriptor, 0, carouselBlock.a);
        dVar.y(serialDescriptor, 1, carouselBlock.b);
        dVar.z(serialDescriptor, 2, kSerializerArr[2], carouselBlock.c);
    }

    public final List b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public CarouselBlock(String str, String str2, List list) {
        zq3.h(str, "dataId");
        zq3.h(str2, "title");
        zq3.h(list, "assets");
        this.a = str;
        this.b = str2;
        this.c = list;
    }
}
