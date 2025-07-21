package defpackage;

import android.view.View;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.skydoves.balloon.BalloonAlign;
import com.skydoves.balloon.PlacementType;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class h40 {
    private final View a;
    private final List b;
    private final BalloonAlign c;
    private final int d;
    private final int e;
    private final PlacementType f;

    public h40(View view, List list, BalloonAlign balloonAlign, int i, int i2, PlacementType placementType) {
        zq3.h(view, "anchor");
        zq3.h(list, "subAnchors");
        zq3.h(balloonAlign, "align");
        zq3.h(placementType, TransferTable.COLUMN_TYPE);
        this.a = view;
        this.b = list;
        this.c = balloonAlign;
        this.d = i;
        this.e = i2;
        this.f = placementType;
    }

    public final BalloonAlign a() {
        return this.c;
    }

    public final View b() {
        return this.a;
    }

    public final List c() {
        return this.b;
    }

    public final PlacementType d() {
        return this.f;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h40)) {
            return false;
        }
        h40 h40Var = (h40) obj;
        return zq3.c(this.a, h40Var.a) && zq3.c(this.b, h40Var.b) && this.c == h40Var.c && this.d == h40Var.d && this.e == h40Var.e && this.f == h40Var.f;
    }

    public final int f() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.e)) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "BalloonPlacement(anchor=" + this.a + ", subAnchors=" + this.b + ", align=" + this.c + ", xOff=" + this.d + ", yOff=" + this.e + ", type=" + this.f + ")";
    }

    public /* synthetic */ h40(View view, List list, BalloonAlign balloonAlign, int i, int i2, PlacementType placementType, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i3 & 2) != 0 ? i.l() : list, (i3 & 4) != 0 ? BalloonAlign.TOP : balloonAlign, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? PlacementType.ALIGNMENT : placementType);
    }
}
