package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class YourPlacesGlobalUpdateInput {
    private final nk5 placeSelections;

    /* JADX WARN: Multi-variable type inference failed */
    public YourPlacesGlobalUpdateInput() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ YourPlacesGlobalUpdateInput copy$default(YourPlacesGlobalUpdateInput yourPlacesGlobalUpdateInput, nk5 nk5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = yourPlacesGlobalUpdateInput.placeSelections;
        }
        return yourPlacesGlobalUpdateInput.copy(nk5Var);
    }

    public final nk5 component1() {
        return this.placeSelections;
    }

    public final YourPlacesGlobalUpdateInput copy(nk5 nk5Var) {
        zq3.h(nk5Var, "placeSelections");
        return new YourPlacesGlobalUpdateInput(nk5Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof YourPlacesGlobalUpdateInput) && zq3.c(this.placeSelections, ((YourPlacesGlobalUpdateInput) obj).placeSelections);
    }

    public final nk5 getPlaceSelections() {
        return this.placeSelections;
    }

    public int hashCode() {
        return this.placeSelections.hashCode();
    }

    public String toString() {
        return "YourPlacesGlobalUpdateInput(placeSelections=" + this.placeSelections + ")";
    }

    public YourPlacesGlobalUpdateInput(nk5 nk5Var) {
        zq3.h(nk5Var, "placeSelections");
        this.placeSelections = nk5Var;
    }

    public /* synthetic */ YourPlacesGlobalUpdateInput(nk5 nk5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var);
    }
}
