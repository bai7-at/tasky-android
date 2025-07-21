package com.nytimes.android.unfear.nytdesignsystem.model;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.text.a;
import com.nytimes.android.designsystem.uicompose.ui.NytTextStyle;
import defpackage.d22;
import defpackage.kb5;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class StyledText {
    public static final int d = 0;
    private final String a;
    private final NytTextStyle b;
    private final boolean c;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer[] e = {null, d22.b("com.nytimes.android.designsystem.uicompose.ui.NytTextStyle", NytTextStyle.values()), null};

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return StyledText$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StyledText(int i, String str, NytTextStyle nytTextStyle, boolean z, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, StyledText$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = nytTextStyle;
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public static final /* synthetic */ void e(StyledText styledText, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = e;
        dVar.y(serialDescriptor, 0, styledText.a);
        dVar.z(serialDescriptor, 1, kSerializerArr[1], styledText.b);
        if (dVar.A(serialDescriptor, 2) || styledText.c) {
            dVar.x(serialDescriptor, 2, styledText.c);
        }
    }

    public final NytTextStyle b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final a d(Composer composer, int i) {
        composer.z(484143158);
        if (b.G()) {
            b.S(484143158, i, -1, "com.nytimes.android.unfear.nytdesignsystem.model.StyledText.toAnnotatedString (StyledText.kt:16)");
        }
        a a = kb5.a(this.a, this.b, this.c, composer, 0, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StyledText)) {
            return false;
        }
        StyledText styledText = (StyledText) obj;
        return zq3.c(this.a, styledText.a) && this.b == styledText.b && this.c == styledText.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        return "StyledText(text=" + this.a + ", style=" + this.b + ", useReadStyle=" + this.c + ")";
    }

    public StyledText(String str, NytTextStyle nytTextStyle, boolean z) {
        zq3.h(str, "text");
        zq3.h(nytTextStyle, "style");
        this.a = str;
        this.b = nytTextStyle;
        this.c = z;
    }

    public /* synthetic */ StyledText(String str, NytTextStyle nytTextStyle, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, nytTextStyle, (i & 4) != 0 ? false : z);
    }
}
